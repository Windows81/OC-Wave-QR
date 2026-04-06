package com.google.android.gms.internal.identity;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class zza implements IInterface {

    /* renamed from: l  reason: collision with root package name */
    public final IBinder f25303l;

    /* renamed from: m  reason: collision with root package name */
    public final String f25304m = "com.google.android.gms.identity.intents.internal.IAddressService";

    public zza(IBinder iBinder, String str) {
        this.f25303l = iBinder;
    }

    public final Parcel J() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f25304m);
        return obtain;
    }

    public final void N(int i2, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f25303l.transact(2, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f25303l;
    }
}
