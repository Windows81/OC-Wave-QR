package com.google.android.gms.internal.pay;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class zza implements IInterface {

    /* renamed from: l  reason: collision with root package name */
    public final IBinder f25894l;

    /* renamed from: m  reason: collision with root package name */
    public final String f25895m;

    public zza(IBinder iBinder, String str) {
        this.f25894l = iBinder;
        this.f25895m = str;
    }

    public final Parcel J() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f25895m);
        return obtain;
    }

    public final void N(int i2, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f25894l.transact(i2, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f25894l;
    }
}
