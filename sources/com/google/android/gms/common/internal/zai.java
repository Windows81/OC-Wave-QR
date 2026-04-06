package com.google.android.gms.common.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import com.google.android.gms.common.internal.BaseGmsClient;

final class zai implements BaseGmsClient.BaseOnConnectionFailedListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ OnConnectionFailedListener f24938a;

    public zai(OnConnectionFailedListener onConnectionFailedListener) {
        this.f24938a = onConnectionFailedListener;
    }

    public final void N(ConnectionResult connectionResult) {
        this.f24938a.N(connectionResult);
    }
}
