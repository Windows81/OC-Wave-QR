package com.google.zxing.datamatrix.encoder;

import java.util.Arrays;

public class DefaultPlacement {

    /* renamed from: a  reason: collision with root package name */
    public final CharSequence f32660a;

    /* renamed from: b  reason: collision with root package name */
    public final int f32661b;

    /* renamed from: c  reason: collision with root package name */
    public final int f32662c;

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f32663d;

    public DefaultPlacement(CharSequence charSequence, int i2, int i3) {
        this.f32660a = charSequence;
        this.f32662c = i2;
        this.f32661b = i3;
        byte[] bArr = new byte[(i2 * i3)];
        this.f32663d = bArr;
        Arrays.fill(bArr, (byte) -1);
    }

    public final void a(int i2) {
        f(this.f32661b - 1, 0, i2, 1);
        f(this.f32661b - 1, 1, i2, 2);
        f(this.f32661b - 1, 2, i2, 3);
        f(0, this.f32662c - 2, i2, 4);
        f(0, this.f32662c - 1, i2, 5);
        f(1, this.f32662c - 1, i2, 6);
        f(2, this.f32662c - 1, i2, 7);
        f(3, this.f32662c - 1, i2, 8);
    }

    public final void b(int i2) {
        f(this.f32661b - 3, 0, i2, 1);
        f(this.f32661b - 2, 0, i2, 2);
        f(this.f32661b - 1, 0, i2, 3);
        f(0, this.f32662c - 4, i2, 4);
        f(0, this.f32662c - 3, i2, 5);
        f(0, this.f32662c - 2, i2, 6);
        f(0, this.f32662c - 1, i2, 7);
        f(1, this.f32662c - 1, i2, 8);
    }

    public final void c(int i2) {
        f(this.f32661b - 3, 0, i2, 1);
        f(this.f32661b - 2, 0, i2, 2);
        f(this.f32661b - 1, 0, i2, 3);
        f(0, this.f32662c - 2, i2, 4);
        f(0, this.f32662c - 1, i2, 5);
        f(1, this.f32662c - 1, i2, 6);
        f(2, this.f32662c - 1, i2, 7);
        f(3, this.f32662c - 1, i2, 8);
    }

    public final void d(int i2) {
        f(this.f32661b - 1, 0, i2, 1);
        f(this.f32661b - 1, this.f32662c - 1, i2, 2);
        f(0, this.f32662c - 3, i2, 3);
        f(0, this.f32662c - 2, i2, 4);
        f(0, this.f32662c - 1, i2, 5);
        f(1, this.f32662c - 3, i2, 6);
        f(1, this.f32662c - 2, i2, 7);
        f(1, this.f32662c - 1, i2, 8);
    }

    public final boolean e(int i2, int i3) {
        return this.f32663d[(i3 * this.f32662c) + i2] == 1;
    }

    public final void f(int i2, int i3, int i4, int i5) {
        if (i2 < 0) {
            int i6 = this.f32661b;
            i2 += i6;
            i3 += 4 - ((i6 + 4) % 8);
        }
        if (i3 < 0) {
            int i7 = this.f32662c;
            i3 += i7;
            i2 += 4 - ((i7 + 4) % 8);
        }
        boolean z2 = true;
        if ((this.f32660a.charAt(i4) & (1 << (8 - i5))) == 0) {
            z2 = false;
        }
        i(i3, i2, z2);
    }

    public final boolean g(int i2, int i3) {
        return this.f32663d[(i3 * this.f32662c) + i2] < 0;
    }

    public final void h() {
        int i2;
        int i3;
        int i4 = 0;
        int i5 = 0;
        int i6 = 4;
        while (true) {
            if (i6 == this.f32661b && i4 == 0) {
                a(i5);
                i5++;
            }
            if (i6 == this.f32661b - 2 && i4 == 0 && this.f32662c % 4 != 0) {
                b(i5);
                i5++;
            }
            if (i6 == this.f32661b - 2 && i4 == 0 && this.f32662c % 8 == 4) {
                c(i5);
                i5++;
            }
            if (i6 == this.f32661b + 4 && i4 == 2 && this.f32662c % 8 == 0) {
                d(i5);
                i5++;
            }
            while (true) {
                if (i6 < this.f32661b && i4 >= 0 && g(i4, i6)) {
                    j(i6, i4, i5);
                    i5++;
                }
                int i7 = i6 - 2;
                int i8 = i4 + 2;
                if (i7 < 0 || i8 >= this.f32662c) {
                    int i9 = i6 - 1;
                    int i10 = i4 + 5;
                } else {
                    i6 = i7;
                    i4 = i8;
                }
            }
            int i92 = i6 - 1;
            int i102 = i4 + 5;
            while (true) {
                if (i92 >= 0 && i102 < this.f32662c && g(i102, i92)) {
                    j(i92, i102, i5);
                    i5++;
                }
                int i11 = i92 + 2;
                int i12 = i102 - 2;
                i2 = this.f32661b;
                if (i11 >= i2 || i12 < 0) {
                    i6 = i92 + 5;
                    i4 = i102 - 1;
                } else {
                    i92 = i11;
                    i102 = i12;
                }
            }
            i6 = i92 + 5;
            i4 = i102 - 1;
            if (i6 >= i2 && i4 >= (i3 = this.f32662c)) {
                break;
            }
        }
        if (g(i3 - 1, i2 - 1)) {
            i(this.f32662c - 1, this.f32661b - 1, true);
            i(this.f32662c - 2, this.f32661b - 2, true);
        }
    }

    public final void i(int i2, int i3, boolean z2) {
        this.f32663d[(i3 * this.f32662c) + i2] = z2 ? (byte) 1 : 0;
    }

    public final void j(int i2, int i3, int i4) {
        int i5 = i2 - 2;
        int i6 = i3 - 2;
        f(i5, i6, i4, 1);
        int i7 = i3 - 1;
        f(i5, i7, i4, 2);
        int i8 = i2 - 1;
        f(i8, i6, i4, 3);
        f(i8, i7, i4, 4);
        f(i8, i3, i4, 5);
        f(i2, i6, i4, 6);
        f(i2, i7, i4, 7);
        f(i2, i3, i4, 8);
    }
}
