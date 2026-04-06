package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;

final class zzad implements IGmsServiceBroker {

    /* renamed from: l  reason: collision with root package name */
    public final IBinder f24967l;

    public zzad(IBinder iBinder) {
        this.f24967l = iBinder;
    }

    public final void D0(IGmsCallbacks iGmsCallbacks, GetServiceRequest getServiceRequest) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(iGmsCallbacks != null ? iGmsCallbacks.asBinder() : null);
            if (getServiceRequest != null) {
                obtain.writeInt(1);
                zzn.a(getServiceRequest, obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f24967l.transact(46, obtain, obtain2, 0);
            obtain2.readException();
            obtain2.recycle();
            obtain.recycle();
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }

    public final IBinder asBinder() {
        return this.f24967l;
    }
}
