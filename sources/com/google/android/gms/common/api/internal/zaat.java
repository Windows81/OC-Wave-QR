package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.signin.zae;

final class zaat implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ zaaw f24575l;

    public /* synthetic */ zaat(zaaw zaaw, zaas zaas) {
        this.f24575l = zaaw;
    }

    public final void J(int i2) {
    }

    public final void N(ConnectionResult connectionResult) {
        this.f24575l.f24578b.lock();
        try {
            if (this.f24575l.p(connectionResult)) {
                this.f24575l.h();
                this.f24575l.m();
            } else {
                this.f24575l.k(connectionResult);
            }
        } finally {
            this.f24575l.f24578b.unlock();
        }
    }

    public final void P(Bundle bundle) {
        ClientSettings clientSettings = (ClientSettings) Preconditions.m(this.f24575l.f24594r);
        ((zae) Preconditions.m(this.f24575l.f24587k)).n(new zaar(this.f24575l));
    }
}
