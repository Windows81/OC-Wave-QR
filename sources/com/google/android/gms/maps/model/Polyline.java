package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.maps.zzad;

public final class Polyline {

    /* renamed from: a  reason: collision with root package name */
    public final zzad f26036a;

    public Polyline(zzad zzad) {
        this.f26036a = (zzad) Preconditions.m(zzad);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Polyline)) {
            return false;
        }
        try {
            return this.f26036a.i2(((Polyline) obj).f26036a);
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public int hashCode() {
        try {
            return this.f26036a.i();
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }
}
