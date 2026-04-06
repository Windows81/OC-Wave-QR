package com.google.android.gms.internal.maps;

import android.os.Parcel;

public final class zzae extends zza implements zzag {
    public final int h() {
        Parcel J = J(9, N());
        int readInt = J.readInt();
        J.recycle();
        return readInt;
    }

    public final boolean s0(zzag zzag) {
        Parcel N = N();
        zzc.e(N, zzag);
        Parcel J = J(8, N);
        boolean f2 = zzc.f(J);
        J.recycle();
        return f2;
    }
}
