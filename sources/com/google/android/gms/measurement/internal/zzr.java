package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.measurement.zzrl;

public final class zzr extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public final zzhw f26979a;

    public zzr(zzhw zzhw) {
        this.f26979a = zzhw;
    }

    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            this.f26979a.m().L().a("App receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        if (action == null) {
            this.f26979a.m().L().a("App receiver called with null action");
        } else if (!action.equals("com.google.android.gms.measurement.TRIGGERS_AVAILABLE")) {
            this.f26979a.m().L().a("App receiver called with unknown action");
        } else {
            zzhw zzhw = this.f26979a;
            if (zzrl.a() && zzhw.z().J((String) null, zzbj.I0)) {
                zzhw.m().K().a("App receiver notified triggers are available");
                zzhw.f().D(new zzt(zzhw));
            }
        }
    }
}
