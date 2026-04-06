package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.Parcel;

public final class zzv extends zza implements zzx {
    public zzv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IMarkerDelegate");
    }

    public final int k() {
        Parcel J = J(17, N());
        int readInt = J.readInt();
        J.recycle();
        return readInt;
    }

    public final boolean v1(zzx zzx) {
        Parcel N = N();
        zzc.e(N, zzx);
        Parcel J = J(16, N);
        boolean f2 = zzc.f(J);
        J.recycle();
        return f2;
    }
}
