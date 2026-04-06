package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.atomic.AtomicReference;

final class zaaz implements GoogleApiClient.ConnectionCallbacks {

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ AtomicReference f24600l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ StatusPendingResult f24601m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ zabe f24602n;

    public final void J(int i2) {
    }

    public final void P(Bundle bundle) {
        StatusPendingResult statusPendingResult = this.f24601m;
        this.f24602n.v((GoogleApiClient) Preconditions.m((GoogleApiClient) this.f24600l.get()), statusPendingResult, true);
    }
}
