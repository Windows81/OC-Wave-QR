package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultTransform;
import com.google.android.gms.common.internal.Preconditions;

final class zacy implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ zada f24720A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Result f24721z;

    public zacy(zada zada, Result result) {
        this.f24720A = zada;
        this.f24721z = result;
    }

    public final void run() {
        GoogleApiClient googleApiClient;
        try {
            ThreadLocal threadLocal = BasePendingResult.f24461p;
            threadLocal.set(Boolean.TRUE);
            PendingResult b2 = ((ResultTransform) Preconditions.m(this.f24720A.f24724a)).b(this.f24721z);
            zada zada = this.f24720A;
            zada.f24731h.sendMessage(zada.f24731h.obtainMessage(0, b2));
            threadLocal.set(Boolean.FALSE);
            zada.o(this.f24721z);
            googleApiClient = (GoogleApiClient) this.f24720A.f24730g.get();
            if (googleApiClient == null) {
                return;
            }
        } catch (RuntimeException e2) {
            zada zada2 = this.f24720A;
            zada2.f24731h.sendMessage(zada2.f24731h.obtainMessage(1, e2));
            BasePendingResult.f24461p.set(Boolean.FALSE);
            zada.o(this.f24721z);
            googleApiClient = (GoogleApiClient) this.f24720A.f24730g.get();
            if (googleApiClient == null) {
                return;
            }
        } catch (Throwable th) {
            BasePendingResult.f24461p.set(Boolean.FALSE);
            zada.o(this.f24721z);
            GoogleApiClient googleApiClient2 = (GoogleApiClient) this.f24720A.f24730g.get();
            if (googleApiClient2 != null) {
                googleApiClient2.k(this.f24720A);
            }
            throw th;
        }
        googleApiClient.k(this.f24720A);
    }
}
