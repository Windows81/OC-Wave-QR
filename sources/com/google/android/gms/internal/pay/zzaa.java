package com.google.android.gms.internal.pay;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.pay.zzn;

public final class zzaa extends GmsClient {
    public zzaa(Context context, Looper looper, ClientSettings clientSettings, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 198, clientSettings, connectionCallbacks, onConnectionFailedListener);
    }

    public final Feature[] A() {
        return new Feature[]{zzn.f27105a, zzn.f27106b, zzn.S, zzn.f27108d, zzn.f27109e, zzn.f27110f, zzn.f27111g, zzn.f27112h, zzn.f27113i, zzn.f27114j, zzn.f27115k, zzn.f27116l, zzn.f27117m, zzn.f27118n, zzn.f27120p, zzn.f27119o, zzn.f27121q, zzn.f27125u, zzn.f27124t, zzn.f27107c, zzn.f27126v, zzn.f27127w, zzn.f27128x, zzn.f27130z, zzn.f27103A, zzn.D, zzn.f27104B, zzn.C, zzn.F, zzn.E, zzn.I, zzn.J, zzn.K, zzn.L, zzn.N, zzn.O, zzn.P, zzn.R, zzn.T, zzn.U, zzn.V, zzn.W, zzn.X, zzn.G, zzn.Y, zzn.Z, zzn.a0, zzn.b0, zzn.c0, zzn.e0, zzn.f0, zzn.g0, zzn.f27129y, zzn.f27122r, zzn.h0, zzn.H, zzn.Q, zzn.i0, zzn.j0, zzn.k0, zzn.l0, zzn.n0, zzn.m0, zzn.o0, zzn.p0, zzn.f27123s, zzn.q0, zzn.r0, zzn.s0, zzn.t0, zzn.u0, zzn.v0, zzn.x0, zzn.w0, zzn.d0, zzn.y0, zzn.z0, zzn.A0, zzn.B0};
    }

    public final String J() {
        return "com.google.android.gms.pay.internal.IPayService";
    }

    public final String K() {
        return "com.google.android.gms.pay.service.BIND";
    }

    public final boolean N() {
        return true;
    }

    public final boolean X() {
        return true;
    }

    public final int o() {
        return 17895000;
    }

    public final /* synthetic */ IInterface x(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.pay.internal.IPayService");
        return queryLocalInterface instanceof zzd ? (zzd) queryLocalInterface : new zzd(iBinder);
    }
}
