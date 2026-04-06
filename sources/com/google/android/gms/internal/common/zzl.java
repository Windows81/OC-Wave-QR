package com.google.android.gms.internal.common;

final class zzl extends zzk {

    /* renamed from: a  reason: collision with root package name */
    public final char f25291a;

    public final boolean a(char c2) {
        return c2 == this.f25291a;
    }

    public final String toString() {
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        int i2 = this.f25291a;
        for (int i3 = 0; i3 < 4; i3++) {
            cArr[5 - i3] = "0123456789ABCDEF".charAt(i2 & 15);
            i2 >>= 4;
        }
        String copyValueOf = String.copyValueOf(cArr);
        return "CharMatcher.is('" + copyValueOf + "')";
    }
}
