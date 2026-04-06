package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.internal.common.zzb;
import com.google.android.gms.internal.common.zzc;

public abstract class zzac extends zzb implements IGmsCallbacks {
    public zzac() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    public final boolean J(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 == 1) {
            zzc.b(parcel);
            A1(parcel.readInt(), parcel.readStrongBinder(), (Bundle) zzc.a(parcel, Bundle.CREATOR));
        } else if (i2 == 2) {
            zzc.b(parcel);
            P0(parcel.readInt(), (Bundle) zzc.a(parcel, Bundle.CREATOR));
        } else if (i2 != 3) {
            return false;
        } else {
            zzc.b(parcel);
            H2(parcel.readInt(), parcel.readStrongBinder(), (zzk) zzc.a(parcel, zzk.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
