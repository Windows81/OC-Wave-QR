package kotlin.io.encoding;

import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class DecodeInputStream extends InputStream {

    /* renamed from: A  reason: collision with root package name */
    public final Base64 f40818A;

    /* renamed from: B  reason: collision with root package name */
    public boolean f40819B;
    public boolean C;
    public final byte[] D;
    public final byte[] E;
    public final byte[] F;
    public int G;
    public int H;

    /* renamed from: z  reason: collision with root package name */
    public final InputStream f40820z;

    public final void a(byte[] bArr, int i2, int i3) {
        byte[] bArr2 = this.F;
        int i4 = this.G;
        ArraysKt.g(bArr2, bArr, i2, i4, i4 + i3);
        this.G += i3;
        g();
    }

    public final int b(byte[] bArr, int i2, int i3, int i4) {
        int i5 = this.H;
        this.H = i5 + this.f40818A.f(this.E, this.F, i5, 0, i4);
        int min = Math.min(c(), i3 - i2);
        a(bArr, i2, min);
        j();
        return min;
    }

    public final int c() {
        return this.H - this.G;
    }

    public void close() {
        if (!this.f40819B) {
            this.f40819B = true;
            this.f40820z.close();
        }
    }

    public final int d(int i2) {
        this.E[i2] = 61;
        if ((i2 & 3) != 2) {
            return i2 + 1;
        }
        int f2 = f();
        if (f2 >= 0) {
            this.E[i2 + 1] = (byte) f2;
        }
        return i2 + 2;
    }

    public final int f() {
        int read;
        if (!this.f40818A.l()) {
            return this.f40820z.read();
        }
        do {
            read = this.f40820z.read();
            if (read == -1 || Base64Kt.e(read)) {
                return read;
            }
            read = this.f40820z.read();
            break;
        } while (Base64Kt.e(read));
        return read;
    }

    public final void g() {
        if (this.G == this.H) {
            this.G = 0;
            this.H = 0;
        }
    }

    public final void j() {
        byte[] bArr = this.F;
        int length = bArr.length;
        int i2 = this.H;
        if ((this.E.length / 4) * 3 > length - i2) {
            ArraysKt.g(bArr, bArr, 0, this.G, i2);
            this.H -= this.G;
            this.G = 0;
        }
    }

    public int read() {
        int i2 = this.G;
        if (i2 < this.H) {
            byte b2 = this.F[i2] & 255;
            this.G = i2 + 1;
            g();
            return b2;
        }
        int read = read(this.D, 0, 1);
        if (read == -1) {
            return -1;
        }
        if (read == 1) {
            return this.D[0] & 255;
        }
        throw new IllegalStateException("Unreachable");
    }

    public int read(byte[] bArr, int i2, int i3) {
        int i4;
        boolean z2;
        Intrinsics.i(bArr, "destination");
        if (i2 < 0 || i3 < 0 || (i4 = i2 + i3) > bArr.length) {
            throw new IndexOutOfBoundsException("offset: " + i2 + ", length: " + i3 + ", buffer size: " + bArr.length);
        } else if (this.f40819B) {
            throw new IOException("The input stream is closed.");
        } else if (this.C) {
            return -1;
        } else {
            if (i3 == 0) {
                return 0;
            }
            if (c() >= i3) {
                a(bArr, i2, i3);
                return i3;
            }
            int c2 = (((i3 - c()) + 2) / 3) * 4;
            int i5 = i2;
            while (true) {
                boolean z3 = this.C;
                if (!z3 && c2 > 0) {
                    int min = Math.min(this.E.length, c2);
                    int i6 = 0;
                    while (true) {
                        z2 = this.C;
                        if (!z2 && i6 < min) {
                            int f2 = f();
                            if (f2 == -1) {
                                this.C = true;
                            } else if (f2 != 61) {
                                this.E[i6] = (byte) f2;
                                i6++;
                            } else {
                                i6 = d(i6);
                                this.C = true;
                            }
                        } else if (!z2 || i6 == min) {
                            c2 -= i6;
                            i5 += b(bArr, i5, i4, i6);
                        } else {
                            throw new IllegalStateException("Check failed.");
                        }
                    }
                    if (!z2) {
                    }
                    c2 -= i6;
                    i5 += b(bArr, i5, i4, i6);
                } else if (i5 == i2 || !z3) {
                    return i5 - i2;
                } else {
                    return -1;
                }
            }
            if (i5 == i2) {
            }
            return i5 - i2;
        }
    }
}
