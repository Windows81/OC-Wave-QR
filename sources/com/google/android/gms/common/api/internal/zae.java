package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.Preconditions;

public final class zae extends zai {

    /* renamed from: b  reason: collision with root package name */
    public final BaseImplementation.ApiMethodImpl f24737b;

    public zae(int i2, BaseImplementation.ApiMethodImpl apiMethodImpl) {
        super(i2);
        this.f24737b = (BaseImplementation.ApiMethodImpl) Preconditions.n(apiMethodImpl, "Null methods are not runnable.");
    }

    public final void a(Status status) {
        try {
            this.f24737b.x(status);
        } catch (IllegalStateException e2) {
            Log.w("ApiCallRunner", "Exception reporting failure", e2);
        }
    }

    public final void b(Exception exc) {
        String simpleName = exc.getClass().getSimpleName();
        String localizedMessage = exc.getLocalizedMessage();
        try {
            this.f24737b.x(new Status(10, simpleName + ": " + localizedMessage));
        } catch (IllegalStateException e2) {
            Log.w("ApiCallRunner", "Exception reporting failure", e2);
        }
    }

    public final void c(zabq zabq) {
        try {
            this.f24737b.v(zabq.t());
        } catch (RuntimeException e2) {
            b(e2);
        }
    }

    public final void d(zaad zaad, boolean z2) {
        zaad.c(this.f24737b, z2);
    }
}
