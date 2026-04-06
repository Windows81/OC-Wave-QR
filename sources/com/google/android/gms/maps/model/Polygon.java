package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.maps.zzaa;

public final class Polygon {

    /* renamed from: a  reason: collision with root package name */
    public final zzaa f26032a;

    public Polygon(zzaa zzaa) {
        this.f26032a = (zzaa) Preconditions.m(zzaa);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Polygon)) {
            return false;
        }
        try {
            return this.f26032a.U(((Polygon) obj).f26032a);
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public int hashCode() {
        try {
            return this.f26032a.d();
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }
}
