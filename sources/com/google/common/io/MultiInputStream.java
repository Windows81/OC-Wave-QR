package com.google.common.io;

import com.google.common.base.Preconditions;
import java.io.InputStream;
import java.util.Iterator;

@ElementTypesAreNonnullByDefault
final class MultiInputStream extends InputStream {

    /* renamed from: A  reason: collision with root package name */
    public InputStream f29025A;

    /* renamed from: z  reason: collision with root package name */
    public Iterator f29026z;

    public MultiInputStream(Iterator it) {
        this.f29026z = (Iterator) Preconditions.q(it);
        a();
    }

    public final void a() {
        close();
        if (this.f29026z.hasNext()) {
            this.f29025A = ((ByteSource) this.f29026z.next()).a();
        }
    }

    public int available() {
        InputStream inputStream = this.f29025A;
        if (inputStream == null) {
            return 0;
        }
        return inputStream.available();
    }

    public void close() {
        InputStream inputStream = this.f29025A;
        if (inputStream != null) {
            try {
                inputStream.close();
            } finally {
                this.f29025A = null;
            }
        }
    }

    public boolean markSupported() {
        return false;
    }

    public int read() {
        while (true) {
            InputStream inputStream = this.f29025A;
            if (inputStream == null) {
                return -1;
            }
            int read = inputStream.read();
            if (read != -1) {
                return read;
            }
            a();
        }
    }

    public long skip(long j2) {
        InputStream inputStream = this.f29025A;
        if (inputStream == null || j2 <= 0) {
            return 0;
        }
        long skip = inputStream.skip(j2);
        if (skip != 0) {
            return skip;
        }
        if (read() == -1) {
            return 0;
        }
        return this.f29025A.skip(j2 - 1) + 1;
    }

    public int read(byte[] bArr, int i2, int i3) {
        Preconditions.q(bArr);
        while (true) {
            InputStream inputStream = this.f29025A;
            if (inputStream == null) {
                return -1;
            }
            int read = inputStream.read(bArr, i2, i3);
            if (read != -1) {
                return read;
            }
            a();
        }
    }
}
