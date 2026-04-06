package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.Parcel;

public final class zzab extends zza implements zzad {
    public zzab(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IPolylineDelegate");
    }

    public final int i() {
        Parcel J = J(16, N());
        int readInt = J.readInt();
        J.recycle();
        return readInt;
    }

    public final boolean i2(zzad zzad) {
        Parcel N = N();
        zzc.e(N, zzad);
        Parcel J = J(15, N);
        boolean f2 = zzc.f(J);
        J.recycle();
        return f2;
    }
}
