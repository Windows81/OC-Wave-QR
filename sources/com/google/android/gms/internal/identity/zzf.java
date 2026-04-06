package com.google.android.gms.internal.identity;

import android.os.Bundle;
import android.os.Parcel;

public abstract class zzf extends zzb implements zzg {
    public zzf() {
        super("com.google.android.gms.identity.intents.internal.IAddressCallbacks");
    }

    public final boolean J(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 != 2) {
            return false;
        }
        t0(parcel.readInt(), (Bundle) zzc.a(parcel, Bundle.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
