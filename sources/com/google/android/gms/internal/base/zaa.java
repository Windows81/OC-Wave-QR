package com.google.android.gms.internal.base;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class zaa implements IInterface {

    /* renamed from: l  reason: collision with root package name */
    public final IBinder f25259l;

    /* renamed from: m  reason: collision with root package name */
    public final String f25260m;

    public zaa(IBinder iBinder, String str) {
        this.f25259l = iBinder;
        this.f25260m = str;
    }

    public final Parcel J() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f25260m);
        return obtain;
    }

    public final Parcel N(int i2, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f25259l.transact(2, parcel, parcel, 0);
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
            this.f25259l.transact(i2, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f25259l;
    }

    public final void u1(int i2, Parcel parcel) {
        try {
            this.f25259l.transact(1, parcel, (Parcel) null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
