package com.google.android.gms.maps.internal;

import android.os.Parcel;
import com.google.android.gms.internal.maps.zzb;
import com.google.android.gms.internal.maps.zzc;
import com.google.android.gms.maps.model.PointOfInterest;

public abstract class zzbc extends zzb implements zzbd {
    public final boolean J(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 != 1) {
            return false;
        }
        f0((PointOfInterest) zzc.a(parcel, PointOfInterest.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
