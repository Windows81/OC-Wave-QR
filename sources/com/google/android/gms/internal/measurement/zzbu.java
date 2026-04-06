package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class zzbu implements IInterface {

    /* renamed from: l  reason: collision with root package name */
    public final IBinder f25374l;

    /* renamed from: m  reason: collision with root package name */
    public final String f25375m;

    public zzbu(IBinder iBinder, String str) {
        this.f25374l = iBinder;
        this.f25375m = str;
    }

    public final Parcel J() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f25375m);
        return obtain;
    }

    public final Parcel N(int i2, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f25374l.transact(i2, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e2) {
            throw e2;
        } finally {
            parcel.recycle();
        }
    }

    public final void P(int i2, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f25374l.transact(i2, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f25374l;
    }
}
