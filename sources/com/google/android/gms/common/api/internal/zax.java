package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

final class zax implements zabz {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ zaaa f24766a;

    public /* synthetic */ zax(zaaa zaaa, zaw zaw) {
        this.f24766a = zaaa;
    }

    public final void a(Bundle bundle) {
        this.f24766a.f24546x.lock();
        try {
            zaaa.u(this.f24766a, bundle);
            this.f24766a.f24543u = ConnectionResult.D;
            zaaa.v(this.f24766a);
        } finally {
            this.f24766a.f24546x.unlock();
        }
    }

    public final void b(int i2, boolean z2) {
        this.f24766a.f24546x.lock();
        try {
            zaaa zaaa = this.f24766a;
            if (!zaaa.f24545w && zaaa.f24544v != null) {
                if (zaaa.f24544v.f0()) {
                    this.f24766a.f24545w = true;
                    this.f24766a.f24538p.J(i2);
                }
            }
            this.f24766a.f24545w = false;
            zaaa.t(this.f24766a, i2, z2);
        } finally {
            this.f24766a.f24546x.unlock();
        }
    }

    public final void c(ConnectionResult connectionResult) {
        this.f24766a.f24546x.lock();
        try {
            this.f24766a.f24543u = connectionResult;
            zaaa.v(this.f24766a);
        } finally {
            this.f24766a.f24546x.unlock();
        }
    }
}
