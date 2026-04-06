package com.google.android.gms.internal.common;

import java.util.List;

final class zzaf extends zzag {

    /* renamed from: B  reason: collision with root package name */
    public final transient int f25281B;
    public final transient int C;
    public final /* synthetic */ zzag D;

    public zzaf(zzag zzag, int i2, int i3) {
        this.D = zzag;
        this.f25281B = i2;
        this.C = i3;
    }

    public final int g() {
        return this.D.h() + this.f25281B + this.C;
    }

    public final Object get(int i2) {
        zzs.a(i2, this.C, "index");
        return this.D.get(i2 + this.f25281B);
    }

    public final int h() {
        return this.D.h() + this.f25281B;
    }

    public final boolean n() {
        return true;
    }

    public final Object[] o() {
        return this.D.o();
    }

    public final zzag p(int i2, int i3) {
        zzs.c(i2, i3, this.C);
        int i4 = this.f25281B;
        return this.D.subList(i2 + i4, i3 + i4);
    }

    public final int size() {
        return this.C;
    }

    public final /* bridge */ /* synthetic */ List subList(int i2, int i3) {
        return subList(i2, i3);
    }
}
