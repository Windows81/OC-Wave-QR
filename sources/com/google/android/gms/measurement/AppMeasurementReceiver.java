package com.google.android.gms.measurement;

import android.content.Context;
import android.content.Intent;
import androidx.legacy.content.WakefulBroadcastReceiver;
import com.google.android.gms.measurement.internal.zzhe;

public final class AppMeasurementReceiver extends WakefulBroadcastReceiver implements zzhe.zza {

    /* renamed from: c  reason: collision with root package name */
    public zzhe f26152c;

    public final void a(Context context, Intent intent) {
        WakefulBroadcastReceiver.c(context, intent);
    }

    public final void onReceive(Context context, Intent intent) {
        if (this.f26152c == null) {
            this.f26152c = new zzhe(this);
        }
        this.f26152c.a(context, intent);
    }
}
