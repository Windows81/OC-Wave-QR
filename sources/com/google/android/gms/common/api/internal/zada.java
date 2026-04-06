package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.ResultCallbacks;
import com.google.android.gms.common.api.ResultTransform;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.TransformedResult;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.ref.WeakReference;

public final class zada<R extends Result> extends TransformedResult<R> implements ResultCallback<R> {

    /* renamed from: a  reason: collision with root package name */
    public ResultTransform f24724a;

    /* renamed from: b  reason: collision with root package name */
    public zada f24725b;

    /* renamed from: c  reason: collision with root package name */
    public volatile ResultCallbacks f24726c;

    /* renamed from: d  reason: collision with root package name */
    public PendingResult f24727d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f24728e;

    /* renamed from: f  reason: collision with root package name */
    public Status f24729f;

    /* renamed from: g  reason: collision with root package name */
    public final WeakReference f24730g;

    /* renamed from: h  reason: collision with root package name */
    public final zacz f24731h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f24732i;

    public static final void o(Result result) {
        if (result instanceof Releasable) {
            try {
                ((Releasable) result).g();
            } catch (RuntimeException e2) {
                Log.w("TransformedResultImpl", "Unable to release ".concat(String.valueOf(result)), e2);
            }
        }
    }

    public final void a(Result result) {
        synchronized (this.f24728e) {
            try {
                if (!result.A().o0()) {
                    k(result.A());
                    o(result);
                } else if (this.f24724a != null) {
                    zaco.a().submit(new zacy(this, result));
                } else if (n()) {
                    ((ResultCallbacks) Preconditions.m(this.f24726c)).c(result);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i() {
        this.f24726c = null;
    }

    public final void j(PendingResult pendingResult) {
        synchronized (this.f24728e) {
            this.f24727d = pendingResult;
            l();
        }
    }

    public final void k(Status status) {
        synchronized (this.f24728e) {
            this.f24729f = status;
            m(status);
        }
    }

    public final void l() {
        if (this.f24724a != null || this.f24726c != null) {
            GoogleApiClient googleApiClient = (GoogleApiClient) this.f24730g.get();
            if (!(this.f24732i || this.f24724a == null || googleApiClient == null)) {
                googleApiClient.j(this);
                this.f24732i = true;
            }
            Status status = this.f24729f;
            if (status != null) {
                m(status);
                return;
            }
            PendingResult pendingResult = this.f24727d;
            if (pendingResult != null) {
                pendingResult.e(this);
            }
        }
    }

    public final void m(Status status) {
        synchronized (this.f24728e) {
            try {
                ResultTransform resultTransform = this.f24724a;
                if (resultTransform != null) {
                    ((zada) Preconditions.m(this.f24725b)).k((Status) Preconditions.n(resultTransform.a(status), "onFailure must not return null"));
                } else if (n()) {
                    ((ResultCallbacks) Preconditions.m(this.f24726c)).b(status);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean n() {
        return (this.f24726c == null || ((GoogleApiClient) this.f24730g.get()) == null) ? false : true;
    }
}
