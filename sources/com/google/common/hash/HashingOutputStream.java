package com.google.common.hash;

import java.io.FilterOutputStream;

@ElementTypesAreNonnullByDefault
public final class HashingOutputStream extends FilterOutputStream {

    /* renamed from: z  reason: collision with root package name */
    public final Hasher f28886z;

    public void close() {
        this.out.close();
    }

    public void write(int i2) {
        this.f28886z.b((byte) i2);
        this.out.write(i2);
    }

    public void write(byte[] bArr, int i2, int i3) {
        this.f28886z.d(bArr, i2, i3);
        this.out.write(bArr, i2, i3);
    }
}
