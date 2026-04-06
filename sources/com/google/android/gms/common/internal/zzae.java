package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.zzo;
import com.google.android.gms.common.zzq;
import com.google.android.gms.common.zzs;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzc;

public final class zzae extends zza implements zzag {
    public zzae(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    public final zzq G1(zzo zzo) {
        Parcel P = P();
        zzc.c(P, zzo);
        Parcel J = J(8, P);
        zzq zzq = (zzq) zzc.a(J, zzq.CREATOR);
        J.recycle();
        return zzq;
    }

    public final boolean d() {
        Parcel J = J(7, P());
        boolean f2 = zzc.f(J);
        J.recycle();
        return f2;
    }

    public final zzq j1(zzo zzo) {
        Parcel P = P();
        zzc.c(P, zzo);
        Parcel J = J(6, P);
        zzq zzq = (zzq) zzc.a(J, zzq.CREATOR);
        J.recycle();
        return zzq;
    }

    public final boolean o0(zzs zzs, IObjectWrapper iObjectWrapper) {
        Parcel P = P();
        zzc.c(P, zzs);
        zzc.e(P, iObjectWrapper);
        Parcel J = J(5, P);
        boolean f2 = zzc.f(J);
        J.recycle();
        return f2;
    }
}
