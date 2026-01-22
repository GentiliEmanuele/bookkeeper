package org.apache.bookkeeper.util;

import org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy;
import org.apache.bookkeeper.net.BookieId;
import org.apache.bookkeeper.net.BookieSocketAddress;
import org.apache.bookkeeper.net.DNSToSwitchMapping;
import org.apache.bookkeeper.proto.BookieAddressResolver;

import java.util.*;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyList;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class RackAwarePPTestUtils {

    private static final Map<Integer, BookieId> bookieIdMap = new HashMap<>();

    /**
     * Mock the DNSToSwitchMapping
     * @param numberOfRacks number of the racks
     * @param bookieIds id of the bookie
     * @return the mocked DNSToSwitchMapping
     */
    public static DNSToSwitchMapping mockDNSToSwitchMapping(int numberOfRacks, List<Integer> bookieIds) {
        DNSToSwitchMapping resolver = mock(DNSToSwitchMapping.class);

        Map<String, String> rackMapping = new HashMap<>();
        if (numberOfRacks <= 1) {
            for (Integer id : bookieIds) {
                rackMapping.put("127.0.0." + id, "/default-region/default-rack");
            }
        } else {
            int rackIndex = 0;
            for (Integer id : bookieIds) {
                String rackPath = String.format("/default-region/rack-%d", rackIndex);
                rackMapping.put("127.0.0." + id, rackPath);
                rackIndex = (rackIndex + 1) % numberOfRacks;
            }
        }

        when(resolver.resolve(anyList())).thenAnswer(invocation -> {
            List<String> names = invocation.getArgument(0);
            List<String> racks = new ArrayList<>();
            for (String name : names) {
                racks.add(rackMapping.getOrDefault(name, "/default-region/default-rack"));
            }
            return racks;
        });

        return resolver;
    }

    /**
     * Create a BookieSocketAddress and parse it in an BookieId
     * @param index : index correspondent to the bookie id
     * @param address : address for the bookie socket
     * @param port : port for the bookie socket
     * @return the created bookie id
     */
    public static BookieId createBookieId(int index, String address, int port) {
        if (bookieIdMap.containsKey(index)) {
            return bookieIdMap.get(index);
        } else {
            BookieSocketAddress bookieSocketAddress = new BookieSocketAddress(address, port);
            bookieIdMap.put(index, bookieSocketAddress.toBookieId());
            return bookieSocketAddress.toBookieId();
        }
    }

    /**
     * Create a BookieAddressResolver that return a correspondence for the specified BookieId
     * @param bookiesCanBeSolved : the number of the bookie that can be solved
     * @return the created bookieAddressResolver
     */
    public static BookieAddressResolver resolveSpecifiedAddress(Set<BookieId> bookiesCanBeSolved) {
        BookieAddressResolver resolver = mock(BookieAddressResolver.class);
        when(resolver.resolve(any(BookieId.class))).thenAnswer(invocation -> {
            BookieId bookieId = invocation.getArgument(0);
            if (bookiesCanBeSolved.contains(bookieId)) {
                String [] splitBookieId = bookieId.toString().split(":");
                return new BookieSocketAddress(splitBookieId[0], Integer.parseInt(splitBookieId[1]));
            } else throw new BookieAddressResolver.BookieIdNotResolvedException(bookieId, new Exception("Simulated resolution failure for testing"));
        });
        return resolver;
    }

    /**
     * Create a BookieAddressResolver that resolve @numBookiesCanBeSolved address
     * @param bookiesIdx : list of the bookies indices that can be solved
     * @return the created BookieAddressResolver
     */

    public static BookieAddressResolver wrapperCreationBookieAddressResolver(List<Integer> bookiesIdx) {
        Set<BookieId> bookiesCanBeSolved = toBookieIdSet(bookiesIdx);
        return resolveSpecifiedAddress(bookiesCanBeSolved);
    }

    /**
     * Used for construct the read-only and the writable bookie id set
     * @param bookieIdx indices used for construct the set of bookie
     * @return the created set
     */
    public static Set<BookieId> toBookieIdSet(List<Integer> bookieIdx) {
        if (bookieIdx == null) return null;
        Set<BookieId> bookies = new HashSet<>();
        for (Integer index : bookieIdx) {
            BookieId bookieId = createBookieId(index, String.format("127.0.0.%d", index), 3181);
            bookies.add(bookieId);
        }
        return bookies;
    }

    public static RackawareEnsemblePlacementPolicy rackAwareEnsemblePlacementPolicyCreation(Optional<Boolean> optEnforceDurability) {
        return optEnforceDurability.isPresent() ? new RackawareEnsemblePlacementPolicy(optEnforceDurability.get()) : new RackawareEnsemblePlacementPolicy();
    }
}
