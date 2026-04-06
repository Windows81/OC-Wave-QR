package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;

public final class zzd extends zzac {

    /* renamed from: l  reason: collision with root package name */
    public BaseGmsClient f24977l;

    /* renamed from: m  reason: collision with root package name */
    public final int f24978m;

    public zzd(BaseGmsClient baseGmsClient, int i2) {
        this.f24977l = baseGmsClient;
        this.f24978m = i2;
    }

    public final void A1(int i2, IBinder iBinder, Bundle bundle) {
        Preconditions.n(this.f24977l, "onPostInitComplete can be called only once per call to getRemoteService");
        this.f24977l.S(i2, iBinder, bundle, this.f24978m);
        this.f24977l = null;
    }

    public final void H2(int i2, IBinder iBinder, zzk zzk) {
        BaseGmsClient baseGmsClient = this.f24977l;
        Preconditions.n(baseGmsClient, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        Preconditions.m(zzk);
        BaseGmsClient.h0(baseGmsClient, zzk);
        A1(i2, iBinder, zzk.f24987z);
    }

    public final void P0(int i2, Bundle bundle) {
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }
}
