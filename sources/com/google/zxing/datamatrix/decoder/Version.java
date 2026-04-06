package com.google.zxing.datamatrix.decoder;

public final class Version {

    /* renamed from: h  reason: collision with root package name */
    public static final Version[] f32648h = a();

    /* renamed from: a  reason: collision with root package name */
    public final int f32649a;

    /* renamed from: b  reason: collision with root package name */
    public final int f32650b;

    /* renamed from: c  reason: collision with root package name */
    public final int f32651c;

    /* renamed from: d  reason: collision with root package name */
    public final int f32652d;

    /* renamed from: e  reason: collision with root package name */
    public final int f32653e;

    /* renamed from: f  reason: collision with root package name */
    public final ECBlocks f32654f;

    /* renamed from: g  reason: collision with root package name */
    public final int f32655g;

    public static final class ECB {

        /* renamed from: a  reason: collision with root package name */
        public final int f32656a;

        /* renamed from: b  reason: collision with root package name */
        public final int f32657b;

        public int a() {
            return this.f32656a;
        }

        public int b() {
            return this.f32657b;
        }

        public ECB(int i2, int i3) {
            this.f32656a = i2;
            this.f32657b = i3;
        }
    }

    public Version(int i2, int i3, int i4, int i5, int i6, ECBlocks eCBlocks) {
        this.f32649a = i2;
        this.f32650b = i3;
        this.f32651c = i4;
        this.f32652d = i5;
        this.f32653e = i6;
        this.f32654f = eCBlocks;
        int b2 = eCBlocks.b();
        int i7 = 0;
        for (ECB ecb : eCBlocks.a()) {
            i7 += ecb.a() * (ecb.b() + b2);
        }
        this.f32655g = i7;
    }

    public static Version[] a() {
        Version version = r0;
        Version version2 = new Version(1, 10, 10, 8, 8, new ECBlocks(5, new ECB(1, 3)));
        Version version3 = r16;
        Version version4 = new Version(2, 12, 12, 10, 10, new ECBlocks(7, new ECB(1, 5)));
        Version version5 = r22;
        Version version6 = new Version(3, 14, 14, 12, 12, new ECBlocks(10, new ECB(1, 8)));
        Version version7 = r28;
        Version version8 = new Version(4, 16, 16, 14, 14, new ECBlocks(12, new ECB(1, 12)));
        Version version9 = r16;
        Version version10 = new Version(5, 18, 18, 16, 16, new ECBlocks(14, new ECB(1, 18)));
        Version version11 = r22;
        Version version12 = new Version(6, 20, 20, 18, 18, new ECBlocks(18, new ECB(1, 22)));
        Version version13 = r35;
        Version version14 = new Version(7, 22, 22, 20, 20, new ECBlocks(20, new ECB(1, 30)));
        Version version15 = r16;
        Version version16 = new Version(8, 24, 24, 22, 22, new ECBlocks(24, new ECB(1, 36)));
        Version version17 = r22;
        Version version18 = new Version(9, 26, 26, 24, 24, new ECBlocks(28, new ECB(1, 44)));
        Version version19 = r44;
        Version version20 = new Version(10, 32, 32, 14, 14, new ECBlocks(36, new ECB(1, 62)));
        Version version21 = r18;
        Version version22 = new Version(11, 36, 36, 16, 16, new ECBlocks(42, new ECB(1, 86)));
        Version version23 = r24;
        Version version24 = new Version(12, 40, 40, 18, 18, new ECBlocks(48, new ECB(1, 114)));
        Version version25 = r44;
        Version version26 = new Version(13, 44, 44, 20, 20, new ECBlocks(56, new ECB(1, 144)));
        Version version27 = r50;
        Version version28 = new Version(14, 48, 48, 22, 22, new ECBlocks(68, new ECB(1, 174)));
        Version version29 = r56;
        Version version30 = new Version(15, 52, 52, 24, 24, new ECBlocks(42, new ECB(2, 102)));
        Version version31 = r44;
        Version version32 = new Version(16, 64, 64, 14, 14, new ECBlocks(56, new ECB(2, 140)));
        Version version33 = r50;
        Version version34 = new Version(17, 72, 72, 16, 16, new ECBlocks(36, new ECB(4, 92)));
        Version version35 = r56;
        Version version36 = new Version(18, 80, 80, 18, 18, new ECBlocks(48, new ECB(4, 114)));
        Version version37 = r44;
        Version version38 = new Version(19, 88, 88, 20, 20, new ECBlocks(56, new ECB(4, 144)));
        Version version39 = r50;
        Version version40 = new Version(20, 96, 96, 22, 22, new ECBlocks(68, new ECB(4, 174)));
        Version version41 = r56;
        Version version42 = new Version(21, 104, 104, 24, 24, new ECBlocks(56, new ECB(6, 136)));
        Version version43 = r44;
        Version version44 = new Version(22, 120, 120, 18, 18, new ECBlocks(68, new ECB(6, 175)));
        Version version45 = r50;
        Version version46 = new Version(23, 132, 132, 20, 20, new ECBlocks(62, new ECB(8, 163)));
        Version version47 = r56;
        Version version48 = new Version(24, 144, 144, 22, 22, new ECBlocks(62, new ECB(8, 156), new ECB(2, 155)));
        Version version49 = r44;
        Version version50 = new Version(25, 8, 18, 6, 16, new ECBlocks(7, new ECB(1, 5)));
        Version version51 = r50;
        Version version52 = new Version(26, 8, 32, 6, 14, new ECBlocks(11, new ECB(1, 10)));
        Version version53 = r56;
        Version version54 = new Version(27, 12, 26, 10, 24, new ECBlocks(14, new ECB(1, 16)));
        Version version55 = r44;
        Version version56 = new Version(28, 12, 36, 10, 16, new ECBlocks(18, new ECB(1, 22)));
        Version version57 = r50;
        Version version58 = new Version(29, 16, 36, 14, 16, new ECBlocks(24, new ECB(1, 32)));
        Version version59 = r41;
        Version version60 = new Version(30, 16, 48, 14, 22, new ECBlocks(28, new ECB(1, 49)));
        return new Version[]{version, version3, version5, version7, version9, version11, version13, version15, version17, version19, version21, version23, version25, version27, version29, version31, version33, version35, version37, version39, version41, version43, version45, version47, version49, version51, version53, version55, version57, version59};
    }

    public String toString() {
        return String.valueOf(this.f32649a);
    }

    public static final class ECBlocks {

        /* renamed from: a  reason: collision with root package name */
        public final int f32658a;

        /* renamed from: b  reason: collision with root package name */
        public final ECB[] f32659b;

        public ECB[] a() {
            return this.f32659b;
        }

        public int b() {
            return this.f32658a;
        }

        public ECBlocks(int i2, ECB ecb) {
            this.f32658a = i2;
            this.f32659b = new ECB[]{ecb};
        }

        public ECBlocks(int i2, ECB ecb, ECB ecb2) {
            this.f32658a = i2;
            this.f32659b = new ECB[]{ecb, ecb2};
        }
    }
}
