package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.BaseImplementation;
import java.util.Collections;

public final class zaax implements zabf {

    /* renamed from: a  reason: collision with root package name */
    public final zabi f24598a;

    public zaax(zabi zabi) {
        this.f24598a = zabi;
    }

    public final void a(Bundle bundle) {
    }

    public final void b() {
        this.f24598a.j();
    }

    public final void c(ConnectionResult connectionResult, Api api, boolean z2) {
    }

    public final void d(int i2) {
    }

    public final void e() {
        for (Api.Client j2 : this.f24598a.f24640q.values()) {
            j2.j();
        }
        this.f24598a.f24648y.f24624p = Collections.emptySet();
    }

    public final boolean f() {
        return true;
    }

    public final BaseImplementation.ApiMethodImpl g(BaseImplementation.ApiMethodImpl apiMethodImpl) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }
}
