package com.google.common.escape;

import com.google.common.base.Preconditions;
import java.lang.reflect.Array;
import java.util.Collections;
import java.util.Map;

@ElementTypesAreNonnullByDefault
public final class ArrayBasedEscaperMap {

    /* renamed from: b  reason: collision with root package name */
    public static final char[][] f28688b;

    /* renamed from: a  reason: collision with root package name */
    public final char[][] f28689a;

    static {
        int[] iArr = new int[2];
        iArr[1] = 0;
        iArr[0] = 0;
        f28688b = (char[][]) Array.newInstance(Character.TYPE, iArr);
    }

    public ArrayBasedEscaperMap(char[][] cArr) {
        this.f28689a = cArr;
    }

    public static ArrayBasedEscaperMap a(Map map) {
        return new ArrayBasedEscaperMap(b(map));
    }

    public static char[][] b(Map map) {
        Preconditions.q(map);
        if (map.isEmpty()) {
            return f28688b;
        }
        char[][] cArr = new char[(((Character) Collections.max(map.keySet())).charValue() + 1)][];
        for (Character ch : map.keySet()) {
            cArr[ch.charValue()] = ((String) map.get(ch)).toCharArray();
        }
        return cArr;
    }

    public char[][] c() {
        return this.f28689a;
    }
}
