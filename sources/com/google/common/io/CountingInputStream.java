package com.google.common.io;

import java.io.FilterInputStream;
import java.io.IOException;

@ElementTypesAreNonnullByDefault
public final class CountingInputStream extends FilterInputStream {

    /* renamed from: A  reason: collision with root package name */
    public long f29007A;

    /* renamed from: z  reason: collision with root package name */
    public long f29008z;

    public synchronized void mark(int i2) {
        this.in.mark(i2);
        this.f29007A = this.f29008z;
    }

    public int read() {
        int read = this.in.read();
        if (read != -1) {
            this.f29008z++;
        }
        return read;
    }

    public synchronized void reset() {
        if (!this.in.markSupported()) {
            throw new IOException("Mark not supported");
        } else if (this.f29007A != -1) {
            this.in.reset();
            this.f29008z = this.f29007A;
        } else {
            throw new IOException("Mark not set");
        }
    }

    public long skip(long j2) {
        long skip = this.in.skip(j2);
        this.f29008z += skip;
        return skip;
    }

    public int read(byte[] bArr, int i2, int i3) {
        int read = this.in.read(bArr, i2, i3);
        if (read != -1) {
            this.f29008z += (long) read;
        }
        return read;
    }
}
