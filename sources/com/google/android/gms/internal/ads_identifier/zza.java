package com.google.android.gms.internal.ads_identifier;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class zza implements IInterface {

    /* renamed from: l  reason: collision with root package name */
    public final IBinder f25255l;

    /* renamed from: m  reason: collision with root package name */
    public final String f25256m = "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService";

    public zza(IBinder iBinder, String str) {
        this.f25255l = iBinder;
    }

    public final Parcel J() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f25256m);
        return obtain;
    }

    public final Parcel N(int i2, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f25255l.transact(i2, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e2) {
            throw e2;
        } finally {
            parcel.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f25255l;
    }
}
