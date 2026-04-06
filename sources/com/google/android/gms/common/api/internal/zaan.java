package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

final class zaan extends zabg {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ BaseGmsClient.ConnectionProgressReportCallbacks f24567b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zaan(zaao zaao, zabf zabf, BaseGmsClient.ConnectionProgressReportCallbacks connectionProgressReportCallbacks) {
        super(zabf);
        this.f24567b = connectionProgressReportCallbacks;
    }

    public final void a() {
        this.f24567b.a(new ConnectionResult(16, (PendingIntent) null));
    }
}
