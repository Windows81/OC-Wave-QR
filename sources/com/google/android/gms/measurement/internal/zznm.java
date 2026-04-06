package com.google.android.gms.measurement.internal;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PersistableBundle;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.measurement.zzct;
import com.google.android.gms.internal.measurement.zzcw;

public final class zznm extends zznr {

    /* renamed from: d  reason: collision with root package name */
    public final AlarmManager f26885d = ((AlarmManager) a().getSystemService("alarm"));

    /* renamed from: e  reason: collision with root package name */
    public zzax f26886e;

    /* renamed from: f  reason: collision with root package name */
    public Integer f26887f;

    public zznm(zznv zznv) {
        super(zznv);
    }

    private final void D() {
        JobScheduler jobScheduler = (JobScheduler) a().getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(A());
        }
    }

    public final int A() {
        if (this.f26887f == null) {
            String packageName = a().getPackageName();
            this.f26887f = Integer.valueOf(("measurement" + packageName).hashCode());
        }
        return this.f26887f.intValue();
    }

    public final PendingIntent B() {
        Context a2 = a();
        return zzct.a(a2, 0, new Intent().setClassName(a2, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), zzct.f25407a);
    }

    public final zzax C() {
        if (this.f26886e == null) {
            this.f26886e = new zznp(this, this.f26888b.t0());
        }
        return this.f26886e;
    }

    public final /* bridge */ /* synthetic */ Context a() {
        return super.a();
    }

    public final /* bridge */ /* synthetic */ Clock b() {
        return super.b();
    }

    public final /* bridge */ /* synthetic */ zzah d() {
        return super.d();
    }

    public final /* bridge */ /* synthetic */ zzac e() {
        return super.e();
    }

    public final /* bridge */ /* synthetic */ zzhp f() {
        return super.f();
    }

    public final /* bridge */ /* synthetic */ zzbb g() {
        return super.g();
    }

    public final /* bridge */ /* synthetic */ zzgh h() {
        return super.h();
    }

    public final /* bridge */ /* synthetic */ zzgu i() {
        return super.i();
    }

    public final /* bridge */ /* synthetic */ zzop j() {
        return super.j();
    }

    public final /* bridge */ /* synthetic */ void k() {
        super.k();
    }

    public final /* bridge */ /* synthetic */ void l() {
        super.l();
    }

    public final /* bridge */ /* synthetic */ zzgi m() {
        return super.m();
    }

    public final /* bridge */ /* synthetic */ void n() {
        super.n();
    }

    public final /* bridge */ /* synthetic */ zzol o() {
        return super.o();
    }

    public final /* bridge */ /* synthetic */ zzv p() {
        return super.p();
    }

    public final /* bridge */ /* synthetic */ zzam q() {
        return super.q();
    }

    public final /* bridge */ /* synthetic */ zzhg r() {
        return super.r();
    }

    public final /* bridge */ /* synthetic */ zzms s() {
        return super.s();
    }

    public final /* bridge */ /* synthetic */ zznq t() {
        return super.t();
    }

    public final boolean x() {
        AlarmManager alarmManager = this.f26885d;
        if (alarmManager != null) {
            alarmManager.cancel(B());
        }
        D();
        return false;
    }

    public final void y(long j2) {
        u();
        Context a2 = a();
        if (!zzop.d0(a2)) {
            m().F().a("Receiver not registered/enabled");
        }
        if (!zzop.e0(a2, false)) {
            m().F().a("Service not registered/enabled");
        }
        z();
        m().K().b("Scheduling upload, millis", Long.valueOf(j2));
        b().c();
        if (j2 < Math.max(0, ((Long) zzbj.f26284z.a((Object) null)).longValue()) && !C().e()) {
            C().b(j2);
        }
        Context a3 = a();
        ComponentName componentName = new ComponentName(a3, "com.google.android.gms.measurement.AppMeasurementJobService");
        int A2 = A();
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
        zzcw.c(a3, new JobInfo.Builder(A2, componentName).setMinimumLatency(j2).setOverrideDeadline(j2 << 1).setExtras(persistableBundle).build(), "com.google.android.gms", "UploadAlarm");
    }

    public final void z() {
        u();
        m().K().a("Unscheduling upload");
        AlarmManager alarmManager = this.f26885d;
        if (alarmManager != null) {
            alarmManager.cancel(B());
        }
        C().a();
        D();
    }
}
