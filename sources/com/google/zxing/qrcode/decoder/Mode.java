package com.google.zxing.qrcode.decoder;

public enum Mode {
    TERMINATOR(new int[]{0, 0, 0}, 0),
    NUMERIC(new int[]{10, 12, 14}, 1),
    ALPHANUMERIC(new int[]{9, 11, 13}, 2),
    STRUCTURED_APPEND(new int[]{0, 0, 0}, 3),
    BYTE(new int[]{8, 16, 16}, 4),
    ECI(new int[]{0, 0, 0}, 7),
    KANJI(new int[]{8, 10, 12}, 8),
    FNC1_FIRST_POSITION(new int[]{0, 0, 0}, 5),
    FNC1_SECOND_POSITION(new int[]{0, 0, 0}, 9),
    HANZI(new int[]{8, 10, 12}, 13);
    

    /* renamed from: A  reason: collision with root package name */
    public final int f32839A;

    /* renamed from: z  reason: collision with root package name */
    public final int[] f32840z;

    /* access modifiers changed from: public */
    Mode(int[] iArr, int i2) {
        this.f32840z = iArr;
        this.f32839A = i2;
    }

    public int d() {
        return this.f32839A;
    }

    public int f(Version version) {
        int f2 = version.f();
        return this.f32840z[f2 <= 9 ? 0 : f2 <= 26 ? (char) 1 : 2];
    }
}
