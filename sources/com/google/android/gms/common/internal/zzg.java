package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

public final class zzg extends zza {

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ BaseGmsClient f24983g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzg(BaseGmsClient baseGmsClient, int i2, Bundle bundle) {
        super(baseGmsClient, i2, (Bundle) null);
        this.f24983g = baseGmsClient;
    }

    public final void f(ConnectionResult connectionResult) {
        if (!this.f24983g.y() || !BaseGmsClient.m0(this.f24983g)) {
            this.f24983g.f24850p.a(connectionResult);
            this.f24983g.Q(connectionResult);
            return;
        }
        BaseGmsClient.i0(this.f24983g, 16);
    }

    public final boolean g() {
        this.f24983g.f24850p.a(ConnectionResult.D);
        return true;
    }
}
