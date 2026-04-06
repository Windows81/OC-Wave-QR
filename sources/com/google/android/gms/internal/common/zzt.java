package com.google.android.gms.internal.common;

final class zzt extends zzw {
    public final /* synthetic */ zzu G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzt(zzu zzu, zzx zzx, CharSequence charSequence) {
        super(zzx, charSequence);
        this.G = zzu;
    }

    public final int d(int i2) {
        return i2 + 1;
    }

    public final int e(int i2) {
        CharSequence charSequence = this.f25297B;
        int length = charSequence.length();
        zzs.b(i2, length, "index");
        while (i2 < length) {
            zzu zzu = this.G;
            if (zzu.f25294a.a(charSequence.charAt(i2))) {
                return i2;
            }
            i2++;
        }
        return -1;
    }
}
