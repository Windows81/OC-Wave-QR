package androidx.datastore.preferences.protobuf;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;

class IterableByteBufferInputStream extends InputStream {

    /* renamed from: A  reason: collision with root package name */
    public ByteBuffer f21024A;

    /* renamed from: B  reason: collision with root package name */
    public int f21025B = 0;
    public int C;
    public int D;
    public boolean E;
    public byte[] F;
    public int G;
    public long H;

    /* renamed from: z  reason: collision with root package name */
    public Iterator f21026z;

    public IterableByteBufferInputStream(Iterable iterable) {
        this.f21026z = iterable.iterator();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            ByteBuffer byteBuffer = (ByteBuffer) it.next();
            this.f21025B++;
        }
        this.C = -1;
        if (!a()) {
            this.f21024A = Internal.f21006e;
            this.C = 0;
            this.D = 0;
            this.H = 0;
        }
    }

    public final boolean a() {
        this.C++;
        if (!this.f21026z.hasNext()) {
            return false;
        }
        ByteBuffer byteBuffer = (ByteBuffer) this.f21026z.next();
        this.f21024A = byteBuffer;
        this.D = byteBuffer.position();
        if (this.f21024A.hasArray()) {
            this.E = true;
            this.F = this.f21024A.array();
            this.G = this.f21024A.arrayOffset();
        } else {
            this.E = false;
            this.H = UnsafeUtil.k(this.f21024A);
            this.F = null;
        }
        return true;
    }

    public final void b(int i2) {
        int i3 = this.D + i2;
        this.D = i3;
        if (i3 == this.f21024A.limit()) {
            a();
        }
    }

    public int read() {
        if (this.C == this.f21025B) {
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
        if (this.C == this.f21025B) {
            return -1;
        }
        int limit = this.f21024A.limit();
        int i4 = this.D;
        int i5 = limit - i4;
        if (i3 > i5) {
            i3 = i5;
        }
        if (this.E) {
            System.arraycopy(this.F, i4 + this.G, bArr, i2, i3);
            b(i3);
        } else {
            int position = this.f21024A.position();
            Java8Compatibility.c(this.f21024A, this.D);
            this.f21024A.get(bArr, i2, i3);
            Java8Compatibility.c(this.f21024A, position);
            b(i3);
        }
        return i3;
    }
}
