package com.google.common.collect;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

@ElementTypesAreNonnullByDefault
final class Platform {
    public static Object[] a(Object[] objArr, int i2, int i3, Object[] objArr2) {
        return Arrays.copyOfRange(objArr, i2, i3, objArr2.getClass());
    }

    public static Object[] b(Object[] objArr, int i2) {
        return (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i2);
    }

    public static Set c(int i2) {
        return CompactHashSet.p(i2);
    }

    public static Set d(int i2) {
        return CompactLinkedHashSet.S(i2);
    }

    public static Set e() {
        return CompactHashSet.n();
    }

    public static Map f() {
        return CompactHashMap.t();
    }

    public static MapMaker g(MapMaker mapMaker) {
        return mapMaker.h();
    }
}
