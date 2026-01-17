package org.apache.bookkeeper.client;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.Map;
import java.util.stream.Stream;


import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.*;

class BookKeeperTest {

    static Stream<Arguments> getParameters() {
        return Stream.of(
                // Success is expected so a null exception is passed
                Arguments.of(3, 2, 2, BookKeeper.DigestType.CRC32, "TestPasswd".getBytes(StandardCharsets.UTF_8), null),

                // Simulate a failure using Qa > Qw
                Arguments.of(3, 2, 3, BookKeeper.DigestType.CRC32, "pwd".getBytes(StandardCharsets.UTF_8), BKException.BKIncorrectParameterException.class),

                // Simulate a failure using Qw > Qe
                Arguments.of(3, 4, 2, BookKeeper.DigestType.DUMMY, "pwd".getBytes(), BKException.BKIncorrectParameterException.class)
        );
    }


    @ParameterizedTest
    @MethodSource("getParameters")
    void testLedgerCreation(int ensembleSize,
                                   int writeQuorumSize,
                                   int ackQuorumSize,
                                   BookKeeper.DigestType digestType,
                                   byte[] passwd,
                                   Class<? extends Exception> expectedException) throws BKException, InterruptedException {
        // Create the mock
        LedgerHandle mockLedgerHandle = mock(LedgerHandle.class);

        // Create the spy
        BookKeeper bookKeeper = spy(BookKeeper.class);

        if (expectedException == null) {
            // Behavior mock
            doReturn(mockLedgerHandle).when(bookKeeper).createLedger(
                    anyInt(), anyInt(), anyInt(), any(BookKeeper.DigestType.class), any(byte[].class), any(Map.class)
            );

            LedgerHandle result = bookKeeper.createLedger(ensembleSize, writeQuorumSize,
                    ackQuorumSize, digestType, passwd);


            Assertions.assertEquals(mockLedgerHandle, result);

            verify(bookKeeper).createLedger(
                    ensembleSize,
                    ackQuorumSize,
                    ackQuorumSize,
                    digestType,
                    passwd,
                    Collections.emptyMap()
            );
        } else {
            doThrow(expectedException).when(bookKeeper).createLedger(
                    anyInt(), anyInt(), anyInt(), any(BookKeeper.DigestType.class), any(byte[].class), any(Map.class)
            );

            // Execute the code and check the exception thrown
            assertThrows(expectedException, () -> {
                bookKeeper.createLedger(ensembleSize, writeQuorumSize, ackQuorumSize, digestType, passwd);
            });
        }
    }
}
