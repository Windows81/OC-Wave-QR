package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;

final class zaj implements GoogleApiClient.OnConnectionFailedListener {

    /* renamed from: l  reason: collision with root package name */
    public final int f24744l;

    /* renamed from: m  reason: collision with root package name */
    public final GoogleApiClient f24745m;

    /* renamed from: n  reason: collision with root package name */
    public final GoogleApiClient.OnConnectionFailedListener f24746n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ zak f24747o;

    public final void N(ConnectionResult connectionResult) {
        Log.d("AutoManageHelper", "beginFailureResolution for ".concat(String.valueOf(connectionResult)));
        this.f24747o.s(connectionResult, this.f24744l);
    }
}
