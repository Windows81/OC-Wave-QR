package com.google.android.play.core.appupdate.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class zza implements IInterface {

    /* renamed from: l  reason: collision with root package name */
    public final IBinder f27413l;

    /* renamed from: m  reason: collision with root package name */
    public final String f27414m = "com.google.android.play.core.appupdate.protocol.IAppUpdateService";

    public zza(IBinder iBinder, String str) {
        this.f27413l = iBinder;
    }

    public final Parcel J() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f27414m);
        return obtain;
    }

    public final void N(int i2, Parcel parcel) {
        try {
            this.f27413l.transact(i2, parcel, (Parcel) null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f27413l;
    }
}
