package com.google.android.gms.internal.wallet;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class zza implements IInterface {

    /* renamed from: l  reason: collision with root package name */
    public final IBinder f25929l;

    /* renamed from: m  reason: collision with root package name */
    public final String f25930m;

    public zza(IBinder iBinder, String str) {
        this.f25929l = iBinder;
        this.f25930m = str;
    }

    public final Parcel J() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f25930m);
        return obtain;
    }

    public final Parcel N(int i2, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f25929l.transact(1, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e2) {
            throw e2;
        } finally {
            parcel.recycle();
        }
    }

    public final void P(int i2, Parcel parcel) {
        try {
            this.f25929l.transact(i2, parcel, (Parcel) null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f25929l;
    }
}
