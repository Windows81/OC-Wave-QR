package com.google.common.base;

import com.google.common.base.CharMatcher;

@ElementTypesAreNonnullByDefault
final class SmallCharMatcher extends CharMatcher.NamedFastMatcher {

    /* renamed from: A  reason: collision with root package name */
    public final char[] f27764A;

    /* renamed from: B  reason: collision with root package name */
    public final boolean f27765B;
    public final long C;

    public static int y(int i2) {
        return Integer.rotateLeft(i2 * -862048943, 15) * 461845907;
    }

    public boolean o(char c2) {
        if (c2 == 0) {
            return this.f27765B;
        }
        if (!x(c2)) {
            return false;
        }
        int length = this.f27764A.length - 1;
        int y2 = y(c2) & length;
        int i2 = y2;
        do {
            char c3 = this.f27764A[i2];
            if (c3 == 0) {
                return false;
            }
            if (c3 == c2) {
                return true;
            }
            i2 = (i2 + 1) & length;
        } while (i2 != y2);
        return false;
    }

    public final boolean x(int i2) {
        return 1 == ((this.C >> i2) & 1);
    }
}
