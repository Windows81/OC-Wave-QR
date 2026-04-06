package com.google.common.escape;

import com.google.common.base.Preconditions;
import java.util.Map;

@ElementTypesAreNonnullByDefault
public abstract class ArrayBasedCharEscaper extends CharEscaper {

    /* renamed from: b  reason: collision with root package name */
    public final char[][] f28684b;

    /* renamed from: c  reason: collision with root package name */
    public final int f28685c;

    /* renamed from: d  reason: collision with root package name */
    public final char f28686d;

    /* renamed from: e  reason: collision with root package name */
    public final char f28687e;

    public ArrayBasedCharEscaper(Map map, char c2, char c3) {
        this(ArrayBasedEscaperMap.a(map), c2, c3);
    }

    public final String a(String str) {
        Preconditions.q(str);
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if ((charAt < this.f28685c && this.f28684b[charAt] != null) || charAt > this.f28687e || charAt < this.f28686d) {
                return c(str, i2);
            }
        }
        return str;
    }

    public final char[] b(char c2) {
        char[] cArr;
        if (c2 < this.f28685c && (cArr = this.f28684b[c2]) != null) {
            return cArr;
        }
        if (c2 < this.f28686d || c2 > this.f28687e) {
            return e(c2);
        }
        return null;
    }

    public abstract char[] e(char c2);

    public ArrayBasedCharEscaper(ArrayBasedEscaperMap arrayBasedEscaperMap, char c2, char c3) {
        Preconditions.q(arrayBasedEscaperMap);
        char[][] c4 = arrayBasedEscaperMap.c();
        this.f28684b = c4;
        this.f28685c = c4.length;
        if (c3 < c2) {
            c3 = 0;
            c2 = 65535;
        }
        this.f28686d = c2;
        this.f28687e = c3;
    }
}
