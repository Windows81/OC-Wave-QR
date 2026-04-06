package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;

public abstract class zzdo extends zzbx implements zzdl {
    public zzdo() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    public final boolean J(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 != 1) {
            return false;
        }
        zzbw.f(parcel);
        u((Bundle) zzbw.a(parcel, Bundle.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
