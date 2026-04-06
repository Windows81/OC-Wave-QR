package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.Parcel;

public final class zzy extends zza implements zzaa {
    public zzy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IPolygonDelegate");
    }

    public final boolean U(zzaa zzaa) {
        Parcel N = N();
        zzc.e(N, zzaa);
        Parcel J = J(19, N);
        boolean f2 = zzc.f(J);
        J.recycle();
        return f2;
    }

    public final int d() {
        Parcel J = J(20, N());
        int readInt = J.readInt();
        J.recycle();
        return readInt;
    }
}
