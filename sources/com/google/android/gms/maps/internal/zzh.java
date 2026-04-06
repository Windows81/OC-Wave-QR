package com.google.android.gms.maps.internal;

import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.maps.zzb;
import com.google.android.gms.internal.maps.zzc;
import com.google.android.gms.internal.maps.zzw;

public abstract class zzh extends zzb implements zzi {
    public final boolean J(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 == 1) {
            IObjectWrapper B2 = B(zzw.N(parcel.readStrongBinder()));
            parcel2.writeNoException();
            zzc.e(parcel2, B2);
        } else if (i2 != 2) {
            return false;
        } else {
            IObjectWrapper f2 = f(zzw.N(parcel.readStrongBinder()));
            parcel2.writeNoException();
            zzc.e(parcel2, f2);
        }
        return true;
    }
}
