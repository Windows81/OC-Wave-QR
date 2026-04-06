package com.google.zxing.common;

import java.util.Arrays;

public final class BitArray implements Cloneable {

    /* renamed from: A  reason: collision with root package name */
    public int f32604A;

    /* renamed from: z  reason: collision with root package name */
    public int[] f32605z;

    public BitArray() {
        this.f32604A = 0;
        this.f32605z = new int[1];
    }

    public static int[] k(int i2) {
        return new int[((i2 + 31) / 32)];
    }

    public void b(boolean z2) {
        g(this.f32604A + 1);
        if (z2) {
            int[] iArr = this.f32605z;
            int i2 = this.f32604A;
            int i3 = i2 / 32;
            iArr[i3] = (1 << (i2 & 31)) | iArr[i3];
        }
        this.f32604A++;
    }

    public void c(BitArray bitArray) {
        int i2 = bitArray.f32604A;
        g(this.f32604A + i2);
        for (int i3 = 0; i3 < i2; i3++) {
            b(bitArray.h(i3));
        }
    }

    public void e(int i2, int i3) {
        if (i3 < 0 || i3 > 32) {
            throw new IllegalArgumentException("Num bits must be between 0 and 32");
        }
        g(this.f32604A + i3);
        while (i3 > 0) {
            boolean z2 = true;
            if (((i2 >> (i3 - 1)) & 1) != 1) {
                z2 = false;
            }
            b(z2);
            i3--;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BitArray)) {
            return false;
        }
        BitArray bitArray = (BitArray) obj;
        return this.f32604A == bitArray.f32604A && Arrays.equals(this.f32605z, bitArray.f32605z);
    }

    /* renamed from: f */
    public BitArray clone() {
        return new BitArray((int[]) this.f32605z.clone(), this.f32604A);
    }

    public final void g(int i2) {
        if (i2 > (this.f32605z.length << 5)) {
            int[] k2 = k(i2);
            int[] iArr = this.f32605z;
            System.arraycopy(iArr, 0, k2, 0, iArr.length);
            this.f32605z = k2;
        }
    }

    public boolean h(int i2) {
        return ((1 << (i2 & 31)) & this.f32605z[i2 / 32]) != 0;
    }

    public int hashCode() {
        return (this.f32604A * 31) + Arrays.hashCode(this.f32605z);
    }

    public int i() {
        return this.f32604A;
    }

    public int j() {
        return (this.f32604A + 7) / 8;
    }

    public void l(int i2, byte[] bArr, int i3, int i4) {
        for (int i5 = 0; i5 < i4; i5++) {
            int i6 = 0;
            for (int i7 = 0; i7 < 8; i7++) {
                if (h(i2)) {
                    i6 |= 1 << (7 - i7);
                }
                i2++;
            }
            bArr[i3 + i5] = (byte) i6;
        }
    }

    public void n(BitArray bitArray) {
        if (this.f32604A == bitArray.f32604A) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.f32605z;
                if (i2 < iArr.length) {
                    iArr[i2] = iArr[i2] ^ bitArray.f32605z[i2];
                    i2++;
                } else {
                    return;
                }
            }
        } else {
            throw new IllegalArgumentException("Sizes don't match");
        }
    }

    public String toString() {
        int i2 = this.f32604A;
        StringBuilder sb = new StringBuilder(i2 + (i2 / 8) + 1);
        for (int i3 = 0; i3 < this.f32604A; i3++) {
            if ((i3 & 7) == 0) {
                sb.append(' ');
            }
            sb.append(h(i3) ? 'X' : '.');
        }
        return sb.toString();
    }

    public BitArray(int[] iArr, int i2) {
        this.f32605z = iArr;
        this.f32604A = i2;
    }
}
