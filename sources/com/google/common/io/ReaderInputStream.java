package com.google.common.io;

import com.google.common.base.Preconditions;
import com.google.common.primitives.UnsignedBytes;
import java.io.InputStream;
import java.io.Reader;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharsetEncoder;
import java.util.Arrays;

@ElementTypesAreNonnullByDefault
final class ReaderInputStream extends InputStream {

    /* renamed from: A  reason: collision with root package name */
    public final CharsetEncoder f29030A;

    /* renamed from: B  reason: collision with root package name */
    public final byte[] f29031B;
    public CharBuffer C;
    public ByteBuffer D;
    public boolean E;
    public boolean F;
    public boolean G;

    /* renamed from: z  reason: collision with root package name */
    public final Reader f29032z;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ReaderInputStream(java.io.Reader r2, java.nio.charset.Charset r3, int r4) {
        /*
            r1 = this;
            java.nio.charset.CharsetEncoder r3 = r3.newEncoder()
            java.nio.charset.CodingErrorAction r0 = java.nio.charset.CodingErrorAction.REPLACE
            java.nio.charset.CharsetEncoder r3 = r3.onMalformedInput(r0)
            java.nio.charset.CharsetEncoder r3 = r3.onUnmappableCharacter(r0)
            r1.<init>((java.io.Reader) r2, (java.nio.charset.CharsetEncoder) r3, (int) r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.io.ReaderInputStream.<init>(java.io.Reader, java.nio.charset.Charset, int):void");
    }

    public static int a(Buffer buffer) {
        return buffer.capacity() - buffer.limit();
    }

    public static CharBuffer c(CharBuffer charBuffer) {
        CharBuffer wrap = CharBuffer.wrap(Arrays.copyOf(charBuffer.array(), charBuffer.capacity() * 2));
        Java8Compatibility.d(wrap, charBuffer.position());
        Java8Compatibility.c(wrap, charBuffer.limit());
        return wrap;
    }

    public final int b(byte[] bArr, int i2, int i3) {
        int min = Math.min(i3, this.D.remaining());
        this.D.get(bArr, i2, min);
        return min;
    }

    public void close() {
        this.f29032z.close();
    }

    public final void d() {
        if (a(this.C) == 0) {
            if (this.C.position() > 0) {
                Java8Compatibility.b(this.C.compact());
            } else {
                this.C = c(this.C);
            }
        }
        int limit = this.C.limit();
        int read = this.f29032z.read(this.C.array(), limit, a(this.C));
        if (read == -1) {
            this.E = true;
        } else {
            Java8Compatibility.c(this.C, limit + read);
        }
    }

    public final void f(boolean z2) {
        Java8Compatibility.b(this.D);
        if (!z2 || this.D.remaining() != 0) {
            this.F = true;
        } else {
            this.D = ByteBuffer.allocate(this.D.capacity() * 2);
        }
    }

    public int read() {
        if (read(this.f29031B) == 1) {
            return UnsignedBytes.c(this.f29031B[0]);
        }
        return -1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002c A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int read(byte[] r8, int r9, int r10) {
        /*
            r7 = this;
            int r0 = r9 + r10
            int r1 = r8.length
            com.google.common.base.Preconditions.v(r9, r0, r1)
            r0 = 0
            if (r10 != 0) goto L_0x000a
            return r0
        L_0x000a:
            boolean r1 = r7.E
            r2 = r0
        L_0x000d:
            boolean r3 = r7.F
            if (r3 == 0) goto L_0x002e
            int r3 = r9 + r2
            int r4 = r10 - r2
            int r3 = r7.b(r8, r3, r4)
            int r2 = r2 + r3
            if (r2 == r10) goto L_0x0029
            boolean r3 = r7.G
            if (r3 == 0) goto L_0x0021
            goto L_0x0029
        L_0x0021:
            r7.F = r0
            java.nio.ByteBuffer r3 = r7.D
            com.google.common.io.Java8Compatibility.a(r3)
            goto L_0x002e
        L_0x0029:
            if (r2 <= 0) goto L_0x002c
            goto L_0x002d
        L_0x002c:
            r2 = -1
        L_0x002d:
            return r2
        L_0x002e:
            boolean r3 = r7.G
            if (r3 == 0) goto L_0x0035
            java.nio.charset.CoderResult r3 = java.nio.charset.CoderResult.UNDERFLOW
            goto L_0x004c
        L_0x0035:
            if (r1 == 0) goto L_0x0040
            java.nio.charset.CharsetEncoder r3 = r7.f29030A
            java.nio.ByteBuffer r4 = r7.D
            java.nio.charset.CoderResult r3 = r3.flush(r4)
            goto L_0x004c
        L_0x0040:
            java.nio.charset.CharsetEncoder r3 = r7.f29030A
            java.nio.CharBuffer r4 = r7.C
            java.nio.ByteBuffer r5 = r7.D
            boolean r6 = r7.E
            java.nio.charset.CoderResult r3 = r3.encode(r4, r5, r6)
        L_0x004c:
            boolean r4 = r3.isOverflow()
            r5 = 1
            if (r4 == 0) goto L_0x0057
            r7.f(r5)
            goto L_0x000d
        L_0x0057:
            boolean r4 = r3.isUnderflow()
            if (r4 == 0) goto L_0x006f
            if (r1 == 0) goto L_0x0065
            r7.G = r5
            r7.f(r0)
            goto L_0x000d
        L_0x0065:
            boolean r3 = r7.E
            if (r3 == 0) goto L_0x006b
            r1 = r5
            goto L_0x002e
        L_0x006b:
            r7.d()
            goto L_0x002e
        L_0x006f:
            boolean r4 = r3.isError()
            if (r4 == 0) goto L_0x002e
            r3.throwException()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.io.ReaderInputStream.read(byte[], int, int):int");
    }

    public ReaderInputStream(Reader reader, CharsetEncoder charsetEncoder, int i2) {
        boolean z2 = true;
        this.f29031B = new byte[1];
        this.f29032z = (Reader) Preconditions.q(reader);
        this.f29030A = (CharsetEncoder) Preconditions.q(charsetEncoder);
        Preconditions.g(i2 <= 0 ? false : z2, "bufferSize must be positive: %s", i2);
        charsetEncoder.reset();
        CharBuffer allocate = CharBuffer.allocate(i2);
        this.C = allocate;
        Java8Compatibility.b(allocate);
        this.D = ByteBuffer.allocate(i2);
    }
}
