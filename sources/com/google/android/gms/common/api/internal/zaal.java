package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.ref.WeakReference;

final class zaal implements BaseGmsClient.ConnectionProgressReportCallbacks {

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference f24562a;

    /* renamed from: b  reason: collision with root package name */
    public final Api f24563b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f24564c;

    public zaal(zaaw zaaw, Api api, boolean z2) {
        this.f24562a = new WeakReference(zaaw);
        this.f24563b = api;
        this.f24564c = z2;
    }

    public final void a(ConnectionResult connectionResult) {
        zaaw zaaw = (zaaw) this.f24562a.get();
        if (zaaw != null) {
            Preconditions.r(Looper.myLooper() == zaaw.f24577a.f24648y.h(), "onReportServiceBinding must be called on the GoogleApiClient handler thread");
            zaaw.f24578b.lock();
            try {
                if (zaaw.n(0)) {
                    if (!connectionResult.f0()) {
                        zaaw.l(connectionResult, this.f24563b, this.f24564c);
                    }
                    if (zaaw.o()) {
                        zaaw.m();
                    }
                }
            } finally {
                zaaw.f24578b.unlock();
            }
        }
    }
}
