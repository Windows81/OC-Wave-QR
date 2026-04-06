package dagger.internal;

import java.util.HashSet;
import java.util.LinkedHashMap;

public final class DaggerCollections {
    public static int a(int i2) {
        if (i2 < 3) {
            return i2 + 1;
        }
        if (i2 < 1073741824) {
            return (int) ((((float) i2) / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static HashSet b(int i2) {
        return new HashSet(a(i2));
    }

    public static LinkedHashMap c(int i2) {
        return new LinkedHashMap(a(i2));
    }
}
