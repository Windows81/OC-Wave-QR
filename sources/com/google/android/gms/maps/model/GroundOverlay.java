package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.maps.zzo;

public final class GroundOverlay {

    /* renamed from: a  reason: collision with root package name */
    public final zzo f26011a;

    public GroundOverlay(zzo zzo) {
        this.f26011a = (zzo) Preconditions.m(zzo);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof GroundOverlay)) {
            return false;
        }
        try {
            return this.f26011a.A2(((GroundOverlay) obj).f26011a);
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public int hashCode() {
        try {
            return this.f26011a.d();
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }
}
