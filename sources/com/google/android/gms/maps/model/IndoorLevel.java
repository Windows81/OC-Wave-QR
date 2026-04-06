package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.internal.maps.zzu;

public final class IndoorLevel {

    /* renamed from: a  reason: collision with root package name */
    public final zzu f26017a;

    public boolean equals(Object obj) {
        if (!(obj instanceof IndoorLevel)) {
            return false;
        }
        try {
            return this.f26017a.x1(((IndoorLevel) obj).f26017a);
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public int hashCode() {
        try {
            return this.f26017a.e();
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }
}
