package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;

public abstract class zzdp extends zzbx implements zzdq {
    public zzdp() {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    public final boolean J(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 == 1) {
            long readLong = parcel.readLong();
            zzbw.f(parcel);
            O1(parcel.readString(), parcel.readString(), (Bundle) zzbw.a(parcel, Bundle.CREATOR), readLong);
            parcel2.writeNoException();
        } else if (i2 != 2) {
            return false;
        } else {
            int a2 = a();
            parcel2.writeNoException();
            parcel2.writeInt(a2);
        }
        return true;
    }
}
