package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.Parcel;

public final class zzj extends zza implements zzl {
    public zzj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.ICircleDelegate");
    }

    public final int d() {
        Parcel J = J(18, N());
        int readInt = J.readInt();
        J.recycle();
        return readInt;
    }

    public final boolean n1(zzl zzl) {
        Parcel N = N();
        zzc.e(N, zzl);
        Parcel J = J(17, N);
        boolean f2 = zzc.f(J);
        J.recycle();
        return f2;
    }
}
