package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdt;

public final class zzhe {

    /* renamed from: a  reason: collision with root package name */
    public final zza f26436a;

    public interface zza {
        void a(Context context, Intent intent);
    }

    public zzhe(zza zza2) {
        Preconditions.m(zza2);
        this.f26436a = zza2;
    }

    public final void a(Context context, Intent intent) {
        zzgi m2 = zzhw.c(context, (zzdt) null, (Long) null).m();
        if (intent == null) {
            m2.L().a("Receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        m2.K().b("Local receiver got", action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            m2.K().a("Starting wakeful intent.");
            this.f26436a.a(context, className);
        } else if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
            m2.L().a("Install Referrer Broadcasts are deprecated");
        }
    }
}
