package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.Parcel;

public final class zzm extends zza implements zzo {
    public zzm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
    }

    public final boolean A2(zzo zzo) {
        Parcel N = N();
        zzc.e(N, zzo);
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
