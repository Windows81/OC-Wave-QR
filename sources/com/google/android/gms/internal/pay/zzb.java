package com.google.android.gms.internal.pay;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class zzb extends Binder implements IInterface {
    public zzb(String str) {
        attachInterface(this, "com.google.android.gms.pay.internal.IPayServiceCallbacks");
    }

    public boolean J(int i2, Parcel parcel, Parcel parcel2, int i3) {
        throw null;
    }

    public final IBinder asBinder() {
        return this;
    }

    public final boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i2, parcel, parcel2, i3)) {
            return true;
        }
        return J(i2, parcel, parcel2, i3);
    }
}
