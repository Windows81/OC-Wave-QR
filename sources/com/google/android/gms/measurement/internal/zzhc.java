package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.internal.measurement.zzby;
import com.google.android.gms.internal.measurement.zzbz;

public final class zzhc implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    public final String f26433a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ zzhd f26434b;

    public zzhc(zzhd zzhd, String str) {
        this.f26434b = zzhd;
        this.f26433a = str;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            this.f26434b.f26435a.m().L().a("Install Referrer connection returned with null binder");
            return;
        }
        try {
            zzbz N = zzby.N(iBinder);
            if (N == null) {
                this.f26434b.f26435a.m().L().a("Install Referrer Service implementation was not found");
                return;
            }
            this.f26434b.f26435a.m().K().a("Install Referrer Service connected");
            this.f26434b.f26435a.f().D(new zzhf(this, N, this));
        } catch (RuntimeException e2) {
            this.f26434b.f26435a.m().L().b("Exception occurred while calling Install Referrer API", e2);
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.f26434b.f26435a.m().K().a("Install Referrer Service disconnected");
    }
}
