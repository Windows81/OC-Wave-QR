package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.Preconditions;

final class zam {

    /* renamed from: a  reason: collision with root package name */
    public final int f24753a;

    /* renamed from: b  reason: collision with root package name */
    public final ConnectionResult f24754b;

    public zam(ConnectionResult connectionResult, int i2) {
        Preconditions.m(connectionResult);
        this.f24754b = connectionResult;
        this.f24753a = i2;
    }

    public final int a() {
        return this.f24753a;
    }

    public final ConnectionResult b() {
        return this.f24754b;
    }
}
