package com.google.zxing.common;

import java.util.Arrays;

public final class BitMatrix implements Cloneable {

    /* renamed from: A  reason: collision with root package name */
    public final int f32606A;

    /* renamed from: B  reason: collision with root package name */
    public final int f32607B;
    public final int[] C;

    /* renamed from: z  reason: collision with root package name */
    public final int f32608z;

    public BitMatrix(int i2) {
        this(i2, i2);
    }

    public final String b(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(this.f32606A * (this.f32608z + 1));
        for (int i2 = 0; i2 < this.f32606A; i2++) {
            for (int i3 = 0; i3 < this.f32608z; i3++) {
                sb.append(f(i3, i2) ? str : str2);
            }
            sb.append(str3);
        }
        return sb.toString();
    }

    public void c() {
        int length = this.C.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.C[i2] = 0;
        }
    }

    /* renamed from: e */
    public BitMatrix clone() {
        return new BitMatrix(this.f32608z, this.f32606A, this.f32607B, (int[]) this.C.clone());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BitMatrix)) {
            return false;
        }
        BitMatrix bitMatrix = (BitMatrix) obj;
        return this.f32608z == bitMatrix.f32608z && this.f32606A == bitMatrix.f32606A && this.f32607B == bitMatrix.f32607B && Arrays.equals(this.C, bitMatrix.C);
    }

    public boolean f(int i2, int i3) {
        return ((this.C[(i3 * this.f32607B) + (i2 / 32)] >>> (i2 & 31)) & 1) != 0;
    }

    public int g() {
        return this.f32606A;
    }

    public int h() {
        return this.f32608z;
    }

    public int hashCode() {
        int i2 = this.f32608z;
        return (((((((i2 * 31) + i2) * 31) + this.f32606A) * 31) + this.f32607B) * 31) + Arrays.hashCode(this.C);
    }

    public void i(int i2, int i3) {
        int i4 = (i3 * this.f32607B) + (i2 / 32);
        int[] iArr = this.C;
        iArr[i4] = (1 << (i2 & 31)) | iArr[i4];
    }

    public void j(int i2, int i3, int i4, int i5) {
        if (i3 < 0 || i2 < 0) {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        } else if (i5 <= 0 || i4 <= 0) {
            throw new IllegalArgumentException("Height and width must be at least 1");
        } else {
            int i6 = i4 + i2;
            int i7 = i5 + i3;
            if (i7 > this.f32606A || i6 > this.f32608z) {
                throw new IllegalArgumentException("The region must fit inside the matrix");
            }
            while (i3 < i7) {
                int i8 = this.f32607B * i3;
                for (int i9 = i2; i9 < i6; i9++) {
                    int[] iArr = this.C;
                    int i10 = (i9 / 32) + i8;
                    iArr[i10] = iArr[i10] | (1 << (i9 & 31));
                }
                i3++;
            }
        }
    }

    public String k(String str, String str2) {
        return b(str, str2, "\n");
    }

    public String toString() {
        return k("X ", "  ");
    }

    public BitMatrix(int i2, int i3) {
        if (i2 <= 0 || i3 <= 0) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.f32608z = i2;
        this.f32606A = i3;
        int i4 = (i2 + 31) / 32;
        this.f32607B = i4;
        this.C = new int[(i4 * i3)];
    }

    public BitMatrix(int i2, int i3, int i4, int[] iArr) {
        this.f32608z = i2;
        this.f32606A = i3;
        this.f32607B = i4;
        this.C = iArr;
    }
}
