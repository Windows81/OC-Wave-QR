package com.google.android.gms.maps.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.maps.zza;
import com.google.android.gms.internal.maps.zzc;
import com.google.android.gms.maps.GoogleMapOptions;

public final class zzk extends zza implements IMapFragmentDelegate {
    public zzk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IMapFragmentDelegate");
    }

    public final IObjectWrapper D(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, Bundle bundle) {
        Parcel N = N();
        zzc.e(N, iObjectWrapper);
        zzc.e(N, iObjectWrapper2);
        zzc.c(N, bundle);
        Parcel J = J(4, N);
        IObjectWrapper N2 = IObjectWrapper.Stub.N(J.readStrongBinder());
        J.recycle();
        return N2;
    }

    public final void H(zzar zzar) {
        Parcel N = N();
        zzc.e(N, zzar);
        P(12, N);
    }

    public final void U0(IObjectWrapper iObjectWrapper, GoogleMapOptions googleMapOptions, Bundle bundle) {
        Parcel N = N();
        zzc.e(N, iObjectWrapper);
        zzc.c(N, googleMapOptions);
        zzc.c(N, bundle);
        P(2, N);
    }

    public final void j() {
        P(5, N());
    }

    public final void l() {
        P(16, N());
    }

    public final void n() {
        P(15, N());
    }

    public final void o() {
        P(6, N());
    }

    public final void onLowMemory() {
        P(9, N());
    }

    public final void p(Bundle bundle) {
        Parcel N = N();
        zzc.c(N, bundle);
        Parcel J = J(10, N);
        if (J.readInt() != 0) {
            bundle.readFromParcel(J);
        }
        J.recycle();
    }

    public final void q() {
        P(8, N());
    }

    public final void s(Bundle bundle) {
        Parcel N = N();
        zzc.c(N, bundle);
        P(3, N);
    }

    public final void w() {
        P(7, N());
    }
}
