package com.google.android.gms.maps.internal;

import android.os.Parcel;
import com.google.android.gms.internal.maps.zzb;
import com.google.android.gms.internal.maps.zzc;
import com.google.android.gms.internal.maps.zzw;

public abstract class zzas extends zzb implements zzat {
    public final boolean J(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 != 1) {
            return false;
        }
        boolean f2 = f(zzw.N(parcel.readStrongBinder()));
        parcel2.writeNoException();
        zzc.b(parcel2, f2);
        return true;
    }
}
