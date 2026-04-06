package com.google.android.gms.internal.measurement;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class zzbx extends Binder implements IInterface {
    public zzbx(String str) {
        attachInterface(this, str);
    }

    public boolean J(int i2, Parcel parcel, Parcel parcel2, int i3) {
        return false;
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
        boolean z2;
        if (i2 > 16777215) {
            z2 = super.onTransact(i2, parcel, parcel2, i3);
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
            z2 = false;
        }
        if (z2) {
            return true;
        }
        return J(i2, parcel, parcel2, i3);
    }
}
