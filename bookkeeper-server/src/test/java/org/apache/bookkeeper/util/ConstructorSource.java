package org.apache.bookkeeper.util;


import java.util.Arrays;
import java.util.Collection;

public class ConstructorSource {

    public static Collection<Object[]> getConstructorConfiguration() {
        return Arrays.asList(new Object[][] {
                {true},
                {false},
                {null}
        });
    }


}
