package com.google.zxing.pdf417.decoder.ec;

final class ModulusPoly {

    /* renamed from: a  reason: collision with root package name */
    public final ModulusGF f32791a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f32792b;

    public ModulusPoly(ModulusGF modulusGF, int[] iArr) {
        if (iArr.length != 0) {
            this.f32791a = modulusGF;
            int length = iArr.length;
            int i2 = 1;
            if (length <= 1 || iArr[0] != 0) {
                this.f32792b = iArr;
                return;
            }
            while (i2 < length && iArr[i2] == 0) {
                i2++;
            }
            if (i2 == length) {
                this.f32792b = new int[]{0};
                return;
            }
            int[] iArr2 = new int[(length - i2)];
            this.f32792b = iArr2;
            System.arraycopy(iArr, i2, iArr2, 0, iArr2.length);
            return;
        }
        throw new IllegalArgumentException();
    }

    public int a(int i2) {
        int[] iArr = this.f32792b;
        return iArr[(iArr.length - 1) - i2];
    }

    public int b() {
        return this.f32792b.length - 1;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(b() * 8);
        for (int b2 = b(); b2 >= 0; b2--) {
            int a2 = a(b2);
            if (a2 != 0) {
                if (a2 < 0) {
                    sb.append(" - ");
                    a2 = -a2;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (b2 == 0 || a2 != 1) {
                    sb.append(a2);
                }
                if (b2 != 0) {
                    if (b2 == 1) {
                        sb.append('x');
                    } else {
                        sb.append("x^");
                        sb.append(b2);
                    }
                }
            }
        }
        return sb.toString();
    }
}
