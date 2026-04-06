package com.google.protobuf;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;

class IterableByteBufferInputStream extends InputStream {

    /* renamed from: A  reason: collision with root package name */
    public ByteBuffer f32187A;

    /* renamed from: B  reason: collision with root package name */
    public int f32188B = 0;
    public int C;
    public int D;
    public boolean E;
    public byte[] F;
    public int G;
    public long H;

    /* renamed from: z  reason: collision with root package name */
    public Iterator f32189z;

    public IterableByteBufferInputStream(Iterable iterable) {
        this.f32189z = iterable.iterator();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            ByteBuffer byteBuffer = (ByteBuffer) it.next();
            this.f32188B++;
        }
        this.C = -1;
        if (!a()) {
            this.f32187A = Internal.f32171e;
            this.C = 0;
            this.D = 0;
            this.H = 0;
        }
    }

    public final boolean a() {
        this.C++;
        if (!this.f32189z.hasNext()) {
            return false;
        }
        ByteBuffer byteBuffer = (ByteBuffer) this.f32189z.next();
        this.f32187A = byteBuffer;
        this.D = byteBuffer.position();
        if (this.f32187A.hasArray()) {
            this.E = true;
            this.F = this.f32187A.array();
            this.G = this.f32187A.arrayOffset();
        } else {
            this.E = false;
            this.H = UnsafeUtil.k(this.f32187A);
            this.F = null;
        }
        return true;
    }

    public final void b(int i2) {
        int i3 = this.D + i2;
        this.D = i3;
        if (i3 == this.f32187A.limit()) {
            a();
        }
    }

    public int read() {
        if (this.C == this.f32188B) {
            return -1;
        }
        if (this.E) {
            byte b2 = this.F[this.D + this.G] & 255;
            b(1);
            return b2;
        }
        byte x2 = UnsafeUtil.x(((long) this.D) + this.H) & 255;
        b(1);
        return x2;
    }

    public int read(byte[] bArr, int i2, int i3) {
        if (this.C == this.f32188B) {
            return -1;
        }
        int limit = this.f32187A.limit();
        int i4 = this.D;
        int i5 = limit - i4;
        if (i3 > i5) {
            i3 = i5;
        }
        if (this.E) {
            System.arraycopy(this.F, i4 + this.G, bArr, i2, i3);
            b(i3);
        } else {
            int position = this.f32187A.position();
            ByteBuffer byteBuffer = (ByteBuffer) this.f32187A.position(this.D);
            this.f32187A.get(bArr, i2, i3);
            ByteBuffer byteBuffer2 = (ByteBuffer) this.f32187A.position(position);
            b(i3);
        }
        return i3;
    }
}
