package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import androidx.legacy.content.WakefulBroadcastReceiver;
import com.google.android.gms.measurement.internal.zzmu;
import com.google.android.gms.measurement.internal.zzmy;

public final class AppMeasurementService extends Service implements zzmy {

    /* renamed from: z  reason: collision with root package name */
    public zzmu f26153z;

    private final zzmu c() {
        if (this.f26153z == null) {
            this.f26153z = new zzmu(this);
        }
        return this.f26153z;
    }

    public final void a(Intent intent) {
        WakefulBroadcastReceiver.b(intent);
    }

    public final void b(JobParameters jobParameters, boolean z2) {
        throw new UnsupportedOperationException();
    }

    public final boolean j(int i2) {
        return stopSelfResult(i2);
    }

    public final IBinder onBind(Intent intent) {
        return c().b(intent);
    }

    public final void onCreate() {
        super.onCreate();
        c().c();
    }

    public final void onDestroy() {
        c().h();
        super.onDestroy();
    }

    public final void onRebind(Intent intent) {
        c().i(intent);
    }

    public final int onStartCommand(Intent intent, int i2, int i3) {
        return c().a(intent, i2, i3);
    }

    public final boolean onUnbind(Intent intent) {
        return c().k(intent);
    }
}
