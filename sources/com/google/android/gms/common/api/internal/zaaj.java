package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Set;

public final class zaaj implements zabf {

    /* renamed from: a  reason: collision with root package name */
    public final zabi f24559a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f24560b = false;

    public zaaj(zabi zabi) {
        this.f24559a = zabi;
    }

    public final void a(Bundle bundle) {
    }

    public final void b() {
        if (this.f24560b) {
            this.f24560b = false;
            this.f24559a.l(new zaai(this, this));
        }
    }

    public final void c(ConnectionResult connectionResult, Api api, boolean z2) {
    }

    public final void d(int i2) {
        this.f24559a.k((ConnectionResult) null);
        this.f24559a.f24649z.b(i2, this.f24560b);
    }

    public final void e() {
    }

    public final boolean f() {
        if (this.f24560b) {
            return false;
        }
        Set<zada> set = this.f24559a.f24648y.f24631w;
        if (set == null || set.isEmpty()) {
            this.f24559a.k((ConnectionResult) null);
            return true;
        }
        this.f24560b = true;
        for (zada i2 : set) {
            i2.i();
        }
        return false;
    }

    public final BaseImplementation.ApiMethodImpl g(BaseImplementation.ApiMethodImpl apiMethodImpl) {
        try {
            this.f24559a.f24648y.f24632x.a(apiMethodImpl);
            zabe zabe = this.f24559a.f24648y;
            Api.Client client = (Api.Client) zabe.f24623o.get(apiMethodImpl.t());
            Preconditions.n(client, "Appropriate Api was not requested.");
            if (client.a() || !this.f24559a.f24641r.containsKey(apiMethodImpl.t())) {
                apiMethodImpl.v(client);
            } else {
                apiMethodImpl.x(new Status(17));
            }
        } catch (DeadObjectException unused) {
            this.f24559a.l(new zaah(this, this));
        }
        return apiMethodImpl;
    }

    public final void i() {
        if (this.f24560b) {
            this.f24560b = false;
            this.f24559a.f24648y.f24632x.b();
            f();
        }
    }
}
