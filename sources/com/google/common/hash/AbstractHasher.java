package com.google.common.hash;

import com.google.common.base.Preconditions;
import java.nio.charset.Charset;

@ElementTypesAreNonnullByDefault
abstract class AbstractHasher implements Hasher {
    public Hasher h(Object obj, Funnel funnel) {
        funnel.o0(obj, this);
        return this;
    }

    public Hasher j(char c2) {
        b((byte) c2);
        b((byte) (c2 >>> 8));
        return this;
    }

    public Hasher a(byte[] bArr) {
        return d(bArr, 0, bArr.length);
    }

    public Hasher c(CharSequence charSequence) {
        int length = charSequence.length();
        for (int i2 = 0; i2 < length; i2++) {
            j(charSequence.charAt(i2));
        }
        return this;
    }

    public Hasher d(byte[] bArr, int i2, int i3) {
        Preconditions.v(i2, i2 + i3, bArr.length);
        for (int i4 = 0; i4 < i3; i4++) {
            b(bArr[i2 + i4]);
        }
        return this;
    }

    public Hasher e(int i2) {
        b((byte) i2);
        b((byte) (i2 >>> 8));
        b((byte) (i2 >>> 16));
        b((byte) (i2 >>> 24));
        return this;
    }

    public Hasher f(CharSequence charSequence, Charset charset) {
        return a(charSequence.toString().getBytes(charset));
    }

    public Hasher g(long j2) {
        for (int i2 = 0; i2 < 64; i2 += 8) {
            b((byte) ((int) (j2 >>> i2)));
        }
        return this;
    }
}
