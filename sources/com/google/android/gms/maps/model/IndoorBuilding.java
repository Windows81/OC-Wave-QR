package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.maps.zzr;

public final class IndoorBuilding {

    /* renamed from: a  reason: collision with root package name */
    public final zzr f26015a;

    /* renamed from: b  reason: collision with root package name */
    public final zze f26016b;

    public IndoorBuilding(zzr zzr) {
        zze zze = zze.f26068a;
        this.f26015a = (zzr) Preconditions.n(zzr, "delegate");
        this.f26016b = (zze) Preconditions.n(zze, "shim");
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof IndoorBuilding)) {
            return false;
        }
        try {
            return this.f26015a.e0(((IndoorBuilding) obj).f26015a);
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public int hashCode() {
        try {
            return this.f26015a.h();
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }
}
