package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.maps.zzl;

public final class Circle {

    /* renamed from: a  reason: collision with root package name */
    public final zzl f26005a;

    public Circle(zzl zzl) {
        this.f26005a = (zzl) Preconditions.m(zzl);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Circle)) {
            return false;
        }
        try {
            return this.f26005a.n1(((Circle) obj).f26005a);
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public final int hashCode() {
        try {
            return this.f26005a.d();
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }
}
