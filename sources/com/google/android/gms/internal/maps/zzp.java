package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.Parcel;

public final class zzp extends zza implements zzr {
    public zzp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate");
    }

    public final boolean e0(zzr zzr) {
        Parcel N = N();
        zzc.e(N, zzr);
        Parcel J = J(5, N);
        boolean f2 = zzc.f(J);
        J.recycle();
        return f2;
    }

    public final int h() {
        Parcel J = J(6, N());
        int readInt = J.readInt();
        J.recycle();
        return readInt;
    }
}
