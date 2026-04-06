package com.google.android.gms.common.api.internal;

import android.app.Activity;
import androidx.collection.ArraySet;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.internal.Preconditions;

public final class zaae extends zap {
    public final ArraySet E = new ArraySet();
    public final GoogleApiManager F;

    public zaae(LifecycleFragment lifecycleFragment, GoogleApiManager googleApiManager, GoogleApiAvailability googleApiAvailability) {
        super(lifecycleFragment, googleApiAvailability);
        this.F = googleApiManager;
        this.f24501z.b("ConnectionlessLifecycleHelper", this);
    }

    public static void u(Activity activity, GoogleApiManager googleApiManager, ApiKey apiKey) {
        LifecycleFragment c2 = LifecycleCallback.c(activity);
        zaae zaae = (zaae) c2.d("ConnectionlessLifecycleHelper", zaae.class);
        if (zaae == null) {
            zaae = new zaae(c2, googleApiManager, GoogleApiAvailability.q());
        }
        Preconditions.n(apiKey, "ApiKey cannot be null");
        zaae.E.add(apiKey);
        googleApiManager.a(zaae);
    }

    public final void h() {
        super.h();
        v();
    }

    public final void j() {
        super.j();
        v();
    }

    public final void k() {
        super.k();
        this.F.b(this);
    }

    public final void m(ConnectionResult connectionResult, int i2) {
        this.F.D(connectionResult, i2);
    }

    public final void n() {
        this.F.E();
    }

    public final ArraySet t() {
        return this.E;
    }

    public final void v() {
        if (!this.E.isEmpty()) {
            this.F.a(this);
        }
    }
}
