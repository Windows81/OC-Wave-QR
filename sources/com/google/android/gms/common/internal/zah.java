package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.internal.BaseGmsClient;

final class zah implements BaseGmsClient.BaseConnectionCallbacks {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ConnectionCallbacks f24937a;

    public zah(ConnectionCallbacks connectionCallbacks) {
        this.f24937a = connectionCallbacks;
    }

    public final void J(int i2) {
        this.f24937a.J(i2);
    }

    public final void P(Bundle bundle) {
        this.f24937a.P(bundle);
    }
}
