package com.google.android.gms.internal.common;

abstract class zzw extends zzj {

    /* renamed from: B  reason: collision with root package name */
    public final CharSequence f25297B;
    public final zzo C;
    public final boolean D;
    public int E = 0;
    public int F;

    public zzw(zzx zzx, CharSequence charSequence) {
        this.C = zzx.f25298a;
        this.D = zzx.f25299b;
        this.F = Integer.MAX_VALUE;
        this.f25297B = charSequence;
    }

    public final /* bridge */ /* synthetic */ Object b() {
        int e2;
        int i2;
        int i3 = this.E;
        while (true) {
            int i4 = this.E;
            if (i4 != -1) {
                e2 = e(i4);
                if (e2 == -1) {
                    e2 = this.f25297B.length();
                    this.E = -1;
                    i2 = -1;
                } else {
                    i2 = d(e2);
                    this.E = i2;
                }
                if (i2 == i3) {
                    int i5 = i2 + 1;
                    this.E = i5;
                    if (i5 > this.f25297B.length()) {
                        this.E = -1;
                    }
                } else {
                    if (i3 < e2) {
                        this.f25297B.charAt(i3);
                    }
                    if (i3 < e2) {
                        this.f25297B.charAt(e2 - 1);
                    }
                    if (!this.D || i3 != e2) {
                        int i6 = this.F;
                    } else {
                        i3 = this.E;
                    }
                }
            } else {
                c();
                return null;
            }
        }
        int i62 = this.F;
        if (i62 == 1) {
            e2 = this.f25297B.length();
            this.E = -1;
            if (e2 > i3) {
                this.f25297B.charAt(e2 - 1);
            }
        } else {
            this.F = i62 - 1;
        }
        return this.f25297B.subSequence(i3, e2).toString();
    }

    public abstract int d(int i2);

    public abstract int e(int i2);
}
