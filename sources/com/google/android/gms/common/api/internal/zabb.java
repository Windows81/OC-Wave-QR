package com.google.android.gms.common.api.internal;

import com.google.android.gms.auth.api.signin.internal.Storage;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;

final class zabb implements ResultCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ StatusPendingResult f24604a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f24605b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ GoogleApiClient f24606c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ zabe f24607d;

    public zabb(zabe zabe, StatusPendingResult statusPendingResult, boolean z2, GoogleApiClient googleApiClient) {
        this.f24607d = zabe;
        this.f24604a = statusPendingResult;
        this.f24605b = z2;
        this.f24606c = googleApiClient;
    }

    public final /* bridge */ /* synthetic */ void a(Result result) {
        Status status = (Status) result;
        Storage.a(this.f24607d.f24614f).e();
        if (status.o0() && this.f24607d.l()) {
            zabe zabe = this.f24607d;
            zabe.e();
            zabe.d();
        }
        this.f24604a.j(status);
        if (this.f24605b) {
            this.f24606c.e();
        }
    }
}
