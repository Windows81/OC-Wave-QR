package com.google.android.play.core.appupdate.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

final class zzw implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ zzx f27442a;

    public /* synthetic */ zzw(zzx zzx, zzv zzv) {
        this.f27442a = zzx;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f27442a.f27445b.d("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        zzx zzx = this.f27442a;
        zzx.c().post(new zzt(this, iBinder));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.f27442a.f27445b.d("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        zzx zzx = this.f27442a;
        zzx.c().post(new zzu(this));
    }
}
