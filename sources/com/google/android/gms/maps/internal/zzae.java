package com.google.android.gms.maps.internal;

import android.os.Parcel;
import com.google.android.gms.internal.maps.zzb;
import com.google.android.gms.internal.maps.zzw;

public abstract class zzae extends zzb implements zzaf {
    public final boolean J(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 != 1) {
            return false;
        }
        f(zzw.N(parcel.readStrongBinder()));
        parcel2.writeNoException();
        return true;
    }
}
