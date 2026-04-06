package com.google.zxing.oned;

public final class CodaBarReader extends OneDReader {

    /* renamed from: a  reason: collision with root package name */
    public static final char[] f32700a = "0123456789-$:/.+ABCD".toCharArray();

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f32701b = {3, 6, 9, 96, 18, 66, 33, 36, 48, 72, 12, 24, 69, 81, 84, 21, 26, 41, 11, 14};

    /* renamed from: c  reason: collision with root package name */
    public static final char[] f32702c = {'A', 'B', 'C', 'D'};

    public static boolean a(char[] cArr, char c2) {
        if (cArr != null) {
            for (char c3 : cArr) {
                if (c3 == c2) {
                    return true;
                }
            }
        }
        return false;
    }
}
