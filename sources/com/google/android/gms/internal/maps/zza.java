package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class zza implements IInterface {

    /* renamed from: l  reason: collision with root package name */
    public final IBinder f25308l;

    /* renamed from: m  reason: collision with root package name */
    public final String f25309m;

    public zza(IBinder iBinder, String str) {
        this.f25308l = iBinder;
        this.f25309m = str;
    }

    public final Parcel J(int i2, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f25308l.transact(i2, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e2) {
            throw e2;
        } finally {
            parcel.recycle();
        }
    }

    public final Parcel N() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f25309m);
        return obtain;
    }

    public final void P(int i2, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f25308l.transact(i2, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f25308l;
    }
}
