package com.google.zxing.pdf417.decoder.ec;

public final class ModulusGF {

    /* renamed from: f  reason: collision with root package name */
    public static final ModulusGF f32785f = new ModulusGF(929, 3);

    /* renamed from: a  reason: collision with root package name */
    public final int[] f32786a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f32787b;

    /* renamed from: c  reason: collision with root package name */
    public final ModulusPoly f32788c;

    /* renamed from: d  reason: collision with root package name */
    public final ModulusPoly f32789d;

    /* renamed from: e  reason: collision with root package name */
    public final int f32790e;

    public ModulusGF(int i2, int i3) {
        this.f32790e = i2;
        this.f32786a = new int[i2];
        this.f32787b = new int[i2];
        int i4 = 1;
        for (int i5 = 0; i5 < i2; i5++) {
            this.f32786a[i5] = i4;
            i4 = (i4 * i3) % i2;
        }
        for (int i6 = 0; i6 < i2 - 1; i6++) {
            this.f32787b[this.f32786a[i6]] = i6;
        }
        this.f32788c = new ModulusPoly(this, new int[]{0});
        this.f32789d = new ModulusPoly(this, new int[]{1});
    }
}
