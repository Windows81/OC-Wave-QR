package com.google.common.hash;

import java.io.FilterInputStream;
import java.io.IOException;

@ElementTypesAreNonnullByDefault
public final class HashingInputStream extends FilterInputStream {

    /* renamed from: z  reason: collision with root package name */
    public final Hasher f28885z;

    public void mark(int i2) {
    }

    public boolean markSupported() {
        return false;
    }

    public int read() {
        int read = this.in.read();
        if (read != -1) {
            this.f28885z.b((byte) read);
        }
        return read;
    }

    public void reset() {
        throw new IOException("reset not supported");
    }

    public int read(byte[] bArr, int i2, int i3) {
        int read = this.in.read(bArr, i2, i3);
        if (read != -1) {
            this.f28885z.d(bArr, i2, read);
        }
        return read;
    }
}
