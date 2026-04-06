package com.google.zxing.common.reedsolomon;

public final class GenericGF {

    /* renamed from: h  reason: collision with root package name */
    public static final GenericGF f32619h = new GenericGF(4201, 4096, 1);

    /* renamed from: i  reason: collision with root package name */
    public static final GenericGF f32620i = new GenericGF(1033, 1024, 1);

    /* renamed from: j  reason: collision with root package name */
    public static final GenericGF f32621j;

    /* renamed from: k  reason: collision with root package name */
    public static final GenericGF f32622k = new GenericGF(19, 16, 1);

    /* renamed from: l  reason: collision with root package name */
    public static final GenericGF f32623l = new GenericGF(285, 256, 0);

    /* renamed from: m  reason: collision with root package name */
    public static final GenericGF f32624m;

    /* renamed from: n  reason: collision with root package name */
    public static final GenericGF f32625n;

    /* renamed from: o  reason: collision with root package name */
    public static final GenericGF f32626o;

    /* renamed from: a  reason: collision with root package name */
    public final int[] f32627a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f32628b;

    /* renamed from: c  reason: collision with root package name */
    public final GenericGFPoly f32629c;

    /* renamed from: d  reason: collision with root package name */
    public final GenericGFPoly f32630d;

    /* renamed from: e  reason: collision with root package name */
    public final int f32631e;

    /* renamed from: f  reason: collision with root package name */
    public final int f32632f;

    /* renamed from: g  reason: collision with root package name */
    public final int f32633g;

    static {
        GenericGF genericGF = new GenericGF(67, 64, 1);
        f32621j = genericGF;
        GenericGF genericGF2 = new GenericGF(301, 256, 1);
        f32624m = genericGF2;
        f32625n = genericGF2;
        f32626o = genericGF;
    }

    public GenericGF(int i2, int i3, int i4) {
        this.f32632f = i2;
        this.f32631e = i3;
        this.f32633g = i4;
        this.f32627a = new int[i3];
        this.f32628b = new int[i3];
        int i5 = 1;
        for (int i6 = 0; i6 < i3; i6++) {
            this.f32627a[i6] = i5;
            i5 <<= 1;
            if (i5 >= i3) {
                i5 = (i5 ^ i2) & (i3 - 1);
            }
        }
        for (int i7 = 0; i7 < i3 - 1; i7++) {
            this.f32628b[this.f32627a[i7]] = i7;
        }
        this.f32629c = new GenericGFPoly(this, new int[]{0});
        this.f32630d = new GenericGFPoly(this, new int[]{1});
    }

    public static int a(int i2, int i3) {
        return i2 ^ i3;
    }

    public GenericGFPoly b(int i2, int i3) {
        if (i2 < 0) {
            throw new IllegalArgumentException();
        } else if (i3 == 0) {
            return this.f32629c;
        } else {
            int[] iArr = new int[(i2 + 1)];
            iArr[0] = i3;
            return new GenericGFPoly(this, iArr);
        }
    }

    public int c(int i2) {
        return this.f32627a[i2];
    }

    public int d() {
        return this.f32633g;
    }

    public GenericGFPoly e() {
        return this.f32629c;
    }

    public int f(int i2) {
        if (i2 != 0) {
            return this.f32627a[(this.f32631e - this.f32628b[i2]) - 1];
        }
        throw new ArithmeticException();
    }

    public int g(int i2) {
        if (i2 != 0) {
            return this.f32628b[i2];
        }
        throw new IllegalArgumentException();
    }

    public int h(int i2, int i3) {
        if (i2 == 0 || i3 == 0) {
            return 0;
        }
        int[] iArr = this.f32627a;
        int[] iArr2 = this.f32628b;
        return iArr[(iArr2[i2] + iArr2[i3]) % (this.f32631e - 1)];
    }

    public String toString() {
        return "GF(0x" + Integer.toHexString(this.f32632f) + ',' + this.f32631e + ')';
    }
}
