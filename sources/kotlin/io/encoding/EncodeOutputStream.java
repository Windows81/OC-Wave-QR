package kotlin.io.encoding;

import java.io.IOException;
import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class EncodeOutputStream extends OutputStream {

    /* renamed from: A  reason: collision with root package name */
    public final Base64 f40821A;

    /* renamed from: B  reason: collision with root package name */
    public boolean f40822B;
    public int C;
    public final byte[] D;
    public final byte[] E;
    public int F;

    /* renamed from: z  reason: collision with root package name */
    public final OutputStream f40823z;

    public final void a() {
        if (this.f40822B) {
            throw new IOException("The output stream is closed.");
        }
    }

    public final int b(byte[] bArr, int i2, int i3) {
        int min = Math.min(3 - this.F, i3 - i2);
        ArraysKt.g(bArr, this.E, this.F, i2, i2 + min);
        int i4 = this.F + min;
        this.F = i4;
        if (i4 == 3) {
            c();
        }
        return min;
    }

    public final void c() {
        if (d(this.E, 0, this.F) == 4) {
            this.F = 0;
            return;
        }
        throw new IllegalStateException("Check failed.");
    }

    public void close() {
        if (!this.f40822B) {
            this.f40822B = true;
            if (this.F != 0) {
                c();
            }
            this.f40823z.close();
        }
    }

    public final int d(byte[] bArr, int i2, int i3) {
        int h2 = this.f40821A.h(bArr, this.D, 0, i2, i3);
        if (this.C == 0) {
            this.f40823z.write(Base64.f40804d.o());
            this.C = 76;
            if (h2 > 76) {
                throw new IllegalStateException("Check failed.");
            }
        }
        this.f40823z.write(this.D, 0, h2);
        this.C -= h2;
        return h2;
    }

    public void flush() {
        a();
        this.f40823z.flush();
    }

    public void write(int i2) {
        a();
        byte[] bArr = this.E;
        int i3 = this.F;
        int i4 = i3 + 1;
        this.F = i4;
        bArr[i3] = (byte) i2;
        if (i4 == 3) {
            c();
        }
    }

    public void write(byte[] bArr, int i2, int i3) {
        int i4;
        Intrinsics.i(bArr, "source");
        a();
        if (i2 < 0 || i3 < 0 || (i4 = i2 + i3) > bArr.length) {
            throw new IndexOutOfBoundsException("offset: " + i2 + ", length: " + i3 + ", source size: " + bArr.length);
        } else if (i3 != 0) {
            int i5 = this.F;
            if (i5 < 3) {
                if (i5 != 0) {
                    i2 += b(bArr, i2, i4);
                    if (this.F != 0) {
                        return;
                    }
                }
                while (i2 + 3 <= i4) {
                    int min = Math.min((this.f40821A.l() ? this.C : this.D.length) / 4, (i4 - i2) / 3);
                    int i6 = (min * 3) + i2;
                    if (d(bArr, i2, i6) == min * 4) {
                        i2 = i6;
                    } else {
                        throw new IllegalStateException("Check failed.");
                    }
                }
                ArraysKt.g(bArr, this.E, 0, i2, i4);
                this.F = i4 - i2;
                return;
            }
            throw new IllegalStateException("Check failed.");
        }
    }
}
