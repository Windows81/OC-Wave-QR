package com.google.android.gms.internal.common;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class zza implements IInterface {

    /* renamed from: l  reason: collision with root package name */
    public final IBinder f25277l;

    /* renamed from: m  reason: collision with root package name */
    public final String f25278m;

    public zza(IBinder iBinder, String str) {
        this.f25277l = iBinder;
        this.f25278m = str;
    }

    public final Parcel J(int i2, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f25277l.transact(i2, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e2) {
            throw e2;
        } finally {
            parcel.recycle();
        }
    }

    public final void N(int i2, Parcel parcel) {
        try {
            this.f25277l.transact(2, parcel, (Parcel) null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public final Parcel P() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f25278m);
        return obtain;
    }

    public final IBinder asBinder() {
        return this.f25277l;
    }
}
