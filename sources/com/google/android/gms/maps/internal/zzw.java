package com.google.android.gms.maps.internal;

import android.os.Parcel;
import com.google.android.gms.internal.maps.zzb;
import com.google.android.gms.internal.maps.zzk;

public abstract class zzw extends zzb implements zzx {
    public final boolean J(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 != 1) {
            return false;
        }
        q2(zzk.N(parcel.readStrongBinder()));
        parcel2.writeNoException();
        return true;
    }
}
