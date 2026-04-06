package com.google.android.gms.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.internal.zzhw;
import com.google.android.gms.measurement.internal.zzjk;
import java.util.List;
import java.util.Map;

final class zza extends AppMeasurement.zza {

    /* renamed from: a  reason: collision with root package name */
    public final zzhw f27001a;

    /* renamed from: b  reason: collision with root package name */
    public final zzjk f27002b;

    public zza(zzhw zzhw) {
        super();
        Preconditions.m(zzhw);
        this.f27001a = zzhw;
        this.f27002b = zzhw.H();
    }

    public final long a() {
        return this.f27001a.L().R0();
    }

    public final void b(String str, String str2, Bundle bundle) {
        this.f27001a.H().h0(str, str2, bundle);
    }

    public final List c(String str, String str2) {
        return this.f27002b.G(str, str2);
    }

    public final String d() {
        return this.f27002b.v0();
    }

    public final void e(String str) {
        this.f27001a.y().z(str, this.f27001a.b().c());
    }

    public final Map f(String str, String str2, boolean z2) {
        return this.f27002b.H(str, str2, z2);
    }

    public final void g(String str, String str2, Bundle bundle) {
        this.f27002b.U0(str, str2, bundle);
    }

    public final String h() {
        return this.f27002b.v0();
    }

    public final String i() {
        return this.f27002b.x0();
    }

    public final String k() {
        return this.f27002b.w0();
    }

    public final int m(String str) {
        return zzjk.E(str);
    }

    public final void n(String str) {
        this.f27001a.y().D(str, this.f27001a.b().c());
    }

    public final void u(Bundle bundle) {
        this.f27002b.X0(bundle);
    }
}
