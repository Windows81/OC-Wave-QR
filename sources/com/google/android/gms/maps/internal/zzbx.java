package com.google.android.gms.maps.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.maps.zza;
import com.google.android.gms.internal.maps.zzc;

public final class zzbx extends zza implements IStreetViewPanoramaViewDelegate {
    public zzbx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
    }

    public final void O(zzbr zzbr) {
        Parcel N = N();
        zzc.e(N, zzbr);
        P(9, N);
    }

    public final void j() {
        P(3, N());
    }

    public final void l() {
        P(11, N());
    }

    public final void n() {
        P(10, N());
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
