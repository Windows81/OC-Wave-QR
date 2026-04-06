package com.google.common.io;

import com.google.common.base.Preconditions;
import java.io.IOException;
import java.io.Reader;
import java.nio.CharBuffer;
import java.util.Objects;

@ElementTypesAreNonnullByDefault
final class CharSequenceReader extends Reader {

    /* renamed from: A  reason: collision with root package name */
    public int f28990A;

    /* renamed from: B  reason: collision with root package name */
    public int f28991B;

    /* renamed from: z  reason: collision with root package name */
    public CharSequence f28992z;

    public CharSequenceReader(CharSequence charSequence) {
        this.f28992z = (CharSequence) Preconditions.q(charSequence);
    }

    public final void a() {
        if (this.f28992z == null) {
            throw new IOException("reader closed");
        }
    }

    public final boolean b() {
        return c() > 0;
    }

    public final int c() {
        Objects.requireNonNull(this.f28992z);
        return this.f28992z.length() - this.f28990A;
    }

    public synchronized void close() {
        this.f28992z = null;
    }

    public synchronized void mark(int i2) {
        Preconditions.g(i2 >= 0, "readAheadLimit (%s) may not be negative", i2);
        a();
        this.f28991B = this.f28990A;
    }

    public boolean markSupported() {
        return true;
    }

    public synchronized int read(CharBuffer charBuffer) {
        Preconditions.q(charBuffer);
        a();
        Objects.requireNonNull(this.f28992z);
        if (!b()) {
            return -1;
        }
        int min = Math.min(charBuffer.remaining(), c());
        for (int i2 = 0; i2 < min; i2++) {
            CharSequence charSequence = this.f28992z;
            int i3 = this.f28990A;
            this.f28990A = i3 + 1;
            charBuffer.put(charSequence.charAt(i3));
        }
        return min;
    }

    public synchronized boolean ready() {
        a();
        return true;
    }

    public synchronized void reset() {
        a();
        this.f28990A = this.f28991B;
    }

    public synchronized long skip(long j2) {
        int min;
        Preconditions.i(j2 >= 0, "n (%s) may not be negative", j2);
        a();
        min = (int) Math.min((long) c(), j2);
        this.f28990A += min;
        return (long) min;
    }

    public synchronized int read() {
        char c2;
        a();
        Objects.requireNonNull(this.f28992z);
        if (b()) {
            CharSequence charSequence = this.f28992z;
            int i2 = this.f28990A;
            this.f28990A = i2 + 1;
            c2 = charSequence.charAt(i2);
        } else {
            c2 = 65535;
        }
        return c2;
    }

    public synchronized int read(char[] cArr, int i2, int i3) {
        Preconditions.v(i2, i2 + i3, cArr.length);
        a();
        Objects.requireNonNull(this.f28992z);
        if (!b()) {
            return -1;
        }
        int min = Math.min(i3, c());
        for (int i4 = 0; i4 < min; i4++) {
            CharSequence charSequence = this.f28992z;
            int i5 = this.f28990A;
            this.f28990A = i5 + 1;
            cArr[i2 + i4] = charSequence.charAt(i5);
        }
        return min;
    }
}
