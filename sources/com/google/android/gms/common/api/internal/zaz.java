package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

final class zaz implements zabz {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ zaaa f24767a;

    public /* synthetic */ zaz(zaaa zaaa, zay zay) {
        this.f24767a = zaaa;
    }

    public final void a(Bundle bundle) {
        this.f24767a.f24546x.lock();
        try {
            this.f24767a.f24544v = ConnectionResult.D;
            zaaa.v(this.f24767a);
        } finally {
            this.f24767a.f24546x.unlock();
        }
    }

    public final void b(int i2, boolean z2) {
        this.f24767a.f24546x.lock();
        try {
            zaaa zaaa = this.f24767a;
            if (zaaa.f24545w) {
                zaaa.f24545w = false;
                zaaa.t(this.f24767a, i2, z2);
            } else {
                zaaa.f24545w = true;
                this.f24767a.f24537o.J(i2);
            }
        } finally {
            this.f24767a.f24546x.unlock();
        }
    }

    public final void c(ConnectionResult connectionResult) {
        this.f24767a.f24546x.lock();
        try {
            this.f24767a.f24544v = connectionResult;
            zaaa.v(this.f24767a);
        } finally {
            this.f24767a.f24546x.unlock();
        }
    }
}
