package com.google.zxing.oned;

public final class Code93Reader extends OneDReader {

    /* renamed from: a  reason: collision with root package name */
    public static final char[] f32712a = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".toCharArray();

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f32713b;

    /* renamed from: c  reason: collision with root package name */
    public static final int f32714c;

    static {
        int[] iArr = {276, 328, 324, 322, 296, 292, 290, 336, 274, 266, 424, 420, 418, 404, 402, 394, 360, 356, 354, 308, 282, 344, 332, 326, 300, 278, 436, 434, 428, 422, 406, 410, 364, 358, 310, 314, 302, 468, 466, 458, 366, 374, 430, 294, 474, 470, 306, 350};
        f32713b = iArr;
        f32714c = iArr[47];
    }
}
