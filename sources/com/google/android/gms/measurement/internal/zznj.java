package com.google.android.gms.measurement.internal;

import android.app.ActivityManager;
import android.os.Bundle;
import android.text.TextUtils;

final class zznj {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ zznb f26879a;

    public zznj(zznb zznb) {
        this.f26879a = zznb;
    }

    public final void a() {
        this.f26879a.n();
        if (this.f26879a.i().z(this.f26879a.b().a())) {
            this.f26879a.i().f26367n.a(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                this.f26879a.m().K().a("Detected application was in foreground");
                c(this.f26879a.b().a(), false);
            }
        }
    }

    public final void b(long j2, boolean z2) {
        this.f26879a.n();
        this.f26879a.G();
        if (this.f26879a.i().z(j2)) {
            this.f26879a.i().f26367n.a(true);
            this.f26879a.p().I();
        }
        this.f26879a.i().f26371r.b(j2);
        if (this.f26879a.i().f26367n.b()) {
            c(j2, z2);
        }
    }

    public final void c(long j2, boolean z2) {
        this.f26879a.n();
        if (this.f26879a.f26587a.p()) {
            this.f26879a.i().f26371r.b(j2);
            this.f26879a.m().K().b("Session started, time", Long.valueOf(this.f26879a.b().c()));
            long j3 = j2 / 1000;
            long j4 = j2;
            this.f26879a.r().k0("auto", "_sid", Long.valueOf(j3), j4);
            this.f26879a.i().f26372s.b(j3);
            this.f26879a.i().f26367n.a(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", j3);
            this.f26879a.r().e0("auto", "_s", j4, bundle);
            String a2 = this.f26879a.i().f26377x.a();
            if (!TextUtils.isEmpty(a2)) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("_ffr", a2);
                this.f26879a.r().e0("auto", "_ssr", j2, bundle2);
            }
        }
    }
}
