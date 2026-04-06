package com.google.common.hash;

import java.nio.charset.Charset;

@ElementTypesAreNonnullByDefault
public interface PrimitiveSink {
    PrimitiveSink a(byte[] bArr);

    PrimitiveSink b(byte b2);

    PrimitiveSink c(CharSequence charSequence);

    PrimitiveSink d(byte[] bArr, int i2, int i3);

    PrimitiveSink e(int i2);

    PrimitiveSink f(CharSequence charSequence, Charset charset);

    PrimitiveSink g(long j2);
}
