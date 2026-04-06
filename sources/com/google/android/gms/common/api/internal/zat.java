package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.Preconditions;

public final class zat implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {

    /* renamed from: l  reason: collision with root package name */
    public final Api f24762l;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f24763m;

    /* renamed from: n  reason: collision with root package name */
    public zau f24764n;

    public final void J(int i2) {
        b().J(i2);
    }

    public final void N(ConnectionResult connectionResult) {
        b().u1(connectionResult, this.f24762l, this.f24763m);
    }

    public final void P(Bundle bundle) {
        b().P(bundle);
    }

    public final void a(zau zau) {
        this.f24764n = zau;
    }

    public final zau b() {
        Preconditions.n(this.f24764n, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        return this.f24764n;
    }
}
