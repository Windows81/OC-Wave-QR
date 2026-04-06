package com.google.common.hash;

import java.nio.charset.Charset;

@ElementTypesAreNonnullByDefault
public interface Hasher extends PrimitiveSink {
    Hasher a(byte[] bArr);

    Hasher b(byte b2);

    Hasher c(CharSequence charSequence);

    Hasher d(byte[] bArr, int i2, int i3);

    Hasher e(int i2);

    Hasher f(CharSequence charSequence, Charset charset);

    Hasher g(long j2);

    Hasher h(Object obj, Funnel funnel);

    HashCode i();
}
