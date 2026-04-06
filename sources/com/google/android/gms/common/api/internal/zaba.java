package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;

final class zaba implements GoogleApiClient.OnConnectionFailedListener {

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ StatusPendingResult f24603l;

    public final void N(ConnectionResult connectionResult) {
        this.f24603l.j(new Status(8));
    }
}
