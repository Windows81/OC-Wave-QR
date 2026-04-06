package com.google.common.collect;

@ElementTypesAreNonnullByDefault
final class NullnessCasts {
    public static Object a(Object obj) {
        return obj;
    }

    public static Object b() {
        return null;
    }
}
