package com.google.android.gms.maps.internal;

import android.os.Parcel;
import com.google.android.gms.internal.maps.zzb;
import com.google.android.gms.internal.maps.zzw;

public abstract class zzau extends zzb implements zzav {
    public final boolean J(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 == 1) {
            Y0(zzw.N(parcel.readStrongBinder()));
        } else if (i2 == 2) {
            f(zzw.N(parcel.readStrongBinder()));
        } else if (i2 != 3) {
            return false;
        } else {
            B(zzw.N(parcel.readStrongBinder()));
        }
        parcel2.writeNoException();
        return true;
    }
}
