package com.google.android.gms.maps.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.maps.zza;
import com.google.android.gms.internal.maps.zzc;

public final class zzl extends zza implements IMapViewDelegate {
    public zzl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IMapViewDelegate");
    }

    public final void H(zzar zzar) {
        Parcel N = N();
        zzc.e(N, zzar);
        P(9, N);
    }

    public final void j() {
        P(3, N());
    }

    public final void l() {
        P(13, N());
    }

    public final void n() {
        P(12, N());
    }

    public final void o() {
        P(4, N());
    }

    public final void onLowMemory() {
        P(6, N());
    }

    public final void p(Bundle bundle) {
        Parcel N = N();
        zzc.c(N, bundle);
        Parcel J = J(7, N);
        if (J.readInt() != 0) {
            bundle.readFromParcel(J);
        }
        J.recycle();
    }

    public final void q() {
        P(5, N());
    }

    public final IObjectWrapper r() {
        Parcel J = J(8, N());
        IObjectWrapper N = IObjectWrapper.Stub.N(J.readStrongBinder());
        J.recycle();
        return N;
    }

    public final void s(Bundle bundle) {
        Parcel N = N();
        zzc.c(N, bundle);
        P(2, N);
    }
}
