package com.google.android.gms.maps.internal;

import android.os.Parcel;
import com.google.android.gms.internal.maps.zzb;

public abstract class zzc extends zzb implements zzd {
    public final boolean J(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 == 1) {
            c();
        } else if (i2 != 2) {
            return false;
        } else {
            b();
        }
        parcel2.writeNoException();
        return true;
    }
}
