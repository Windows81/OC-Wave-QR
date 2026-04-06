package com.google.android.gms.internal.measurement;

final class zznb implements zzmj {

    /* renamed from: a  reason: collision with root package name */
    public final zzml f25692a;

    /* renamed from: b  reason: collision with root package name */
    public final String f25693b;

    /* renamed from: c  reason: collision with root package name */
    public final Object[] f25694c;

    /* renamed from: d  reason: collision with root package name */
    public final int f25695d;

    public zznb(zzml zzml, String str, Object[] objArr) {
        this.f25692a = zzml;
        this.f25693b = str;
        this.f25694c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f25695d = charAt;
            return;
        }
        char c2 = charAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char charAt2 = str.charAt(i3);
            if (charAt2 >= 55296) {
                c2 |= (charAt2 & 8191) << i2;
                i2 += 13;
                i3 = i4;
            } else {
                this.f25695d = c2 | (charAt2 << i2);
                return;
            }
        }
    }

    public final zzml a() {
        return this.f25692a;
    }

    public final zzmw b() {
        int i2 = this.f25695d;
        return (i2 & 1) != 0 ? zzmw.PROTO2 : (i2 & 4) == 4 ? zzmw.EDITIONS : zzmw.PROTO3;
    }

    public final boolean c() {
        return (this.f25695d & 2) == 2;
    }

    public final String d() {
        return this.f25693b;
    }

    public final Object[] e() {
        return this.f25694c;
    }
}
