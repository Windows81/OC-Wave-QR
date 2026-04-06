package com.google.android.gms.internal.maps;

import android.os.Parcel;

public final class zzs extends zza implements zzu {
    public final int e() {
        Parcel J = J(5, N());
        int readInt = J.readInt();
        J.recycle();
        return readInt;
    }

    public final boolean x1(zzu zzu) {
        Parcel N = N();
        zzc.e(N, zzu);
        Parcel J = J(4, N);
        boolean f2 = zzc.f(J);
        J.recycle();
        return f2;
    }
}
