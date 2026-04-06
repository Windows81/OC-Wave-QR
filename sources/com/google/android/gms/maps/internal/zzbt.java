package com.google.android.gms.maps.internal;

import android.graphics.Bitmap;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.maps.zzb;
import com.google.android.gms.internal.maps.zzc;

public abstract class zzbt extends zzb implements zzbu {
    public final boolean J(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 == 1) {
            O0((Bitmap) zzc.a(parcel, Bitmap.CREATOR));
        } else if (i2 != 2) {
            return false;
        } else {
            I2(IObjectWrapper.Stub.N(parcel.readStrongBinder()));
        }
        parcel2.writeNoException();
        return true;
    }
}
