package com.google.common.io;

import java.io.FilterOutputStream;

@ElementTypesAreNonnullByDefault
public final class CountingOutputStream extends FilterOutputStream {

    /* renamed from: z  reason: collision with root package name */
    public long f29009z;

    public void close() {
        this.out.close();
    }

    public void write(byte[] bArr, int i2, int i3) {
        this.out.write(bArr, i2, i3);
        this.f29009z += (long) i3;
    }

    public void write(int i2) {
        this.out.write(i2);
        this.f29009z++;
    }
}
