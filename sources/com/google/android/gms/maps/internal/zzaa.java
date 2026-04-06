package com.google.android.gms.maps.internal;

import android.os.Parcel;
import com.google.android.gms.internal.maps.zzb;
import com.google.android.gms.internal.maps.zzq;

public abstract class zzaa extends zzb implements zzab {
    public final boolean J(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 == 1) {
            b();
        } else if (i2 != 2) {
            return false;
        } else {
            J1(zzq.N(parcel.readStrongBinder()));
        }
        parcel2.writeNoException();
        return true;
    }
}
