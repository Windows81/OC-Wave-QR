package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.internal.maps.zzag;

public final class TileOverlay {

    /* renamed from: a  reason: collision with root package name */
    public final zzag f26058a;

    public boolean equals(Object obj) {
        if (!(obj instanceof TileOverlay)) {
            return false;
        }
        try {
            return this.f26058a.s0(((TileOverlay) obj).f26058a);
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public int hashCode() {
        try {
            return this.f26058a.h();
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }
}
