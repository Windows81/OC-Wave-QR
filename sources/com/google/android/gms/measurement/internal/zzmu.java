package com.google.android.gms.measurement.internal;

import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdt;
import com.google.android.gms.measurement.internal.zzmy;

public final class zzmu<T extends Context & zzmy> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f26842a;

    public zzmu(Context context) {
        Preconditions.m(context);
        this.f26842a = context;
    }

    public final int a(Intent intent, int i2, int i3) {
        zzgi m2 = zzhw.c(this.f26842a, (zzdt) null, (Long) null).m();
        if (intent == null) {
            m2.L().a("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        m2.K().c("Local AppMeasurementService called. startId, action", Integer.valueOf(i3), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            f(new zzmw(this, i3, m2, intent));
        }
        return 2;
    }

    public final IBinder b(Intent intent) {
        if (intent == null) {
            j().G().a("onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new zzia(zznv.l(this.f26842a));
        }
        j().L().b("onBind received unknown action", action);
        return null;
    }

    public final void c() {
        zzhw.c(this.f26842a, (zzdt) null, (Long) null).m().K().a("Local AppMeasurementService is starting up");
    }

    public final /* synthetic */ void d(int i2, zzgi zzgi, Intent intent) {
        if (((zzmy) this.f26842a).j(i2)) {
            zzgi.K().b("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i2));
            j().K().a("Completed wakeful intent.");
            ((zzmy) this.f26842a).a(intent);
        }
    }

    public final /* synthetic */ void e(zzgi zzgi, JobParameters jobParameters) {
        zzgi.K().a("AppMeasurementJobService processed last upload request.");
        ((zzmy) this.f26842a).b(jobParameters, false);
    }

    public final void f(Runnable runnable) {
        zznv l2 = zznv.l(this.f26842a);
        l2.f().D(new zzmz(this, l2, runnable));
    }

    public final boolean g(JobParameters jobParameters) {
        zzgi m2 = zzhw.c(this.f26842a, (zzdt) null, (Long) null).m();
        String string = jobParameters.getExtras().getString("action");
        m2.K().b("Local AppMeasurementJobService called. action", string);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(string)) {
            return true;
        }
        f(new zzmx(this, m2, jobParameters));
        return true;
    }

    public final void h() {
        zzhw.c(this.f26842a, (zzdt) null, (Long) null).m().K().a("Local AppMeasurementService is shutting down");
    }

    public final void i(Intent intent) {
        if (intent == null) {
            j().G().a("onRebind called with null intent");
            return;
        }
        j().K().b("onRebind called. action", intent.getAction());
    }

    public final zzgi j() {
        return zzhw.c(this.f26842a, (zzdt) null, (Long) null).m();
    }

    public final boolean k(Intent intent) {
        if (intent == null) {
            j().G().a("onUnbind called with null intent");
            return true;
        }
        j().K().b("onUnbind called for intent. action", intent.getAction());
        return true;
    }
}
