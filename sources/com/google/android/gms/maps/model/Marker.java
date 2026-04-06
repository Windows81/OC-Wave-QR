package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.maps.zzx;

public final class Marker {

    /* renamed from: a  reason: collision with root package name */
    public final zzx f26023a;

    public Marker(zzx zzx) {
        this.f26023a = (zzx) Preconditions.m(zzx);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Marker)) {
            return false;
        }
        try {
            return this.f26023a.v1(((Marker) obj).f26023a);
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public int hashCode() {
        try {
            return this.f26023a.k();
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }
}
