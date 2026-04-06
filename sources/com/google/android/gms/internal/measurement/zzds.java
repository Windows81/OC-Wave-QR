package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

public final class zzds extends zzbu implements zzdq {
    public zzds(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    public final void O1(String str, String str2, Bundle bundle, long j2) {
        Parcel J = J();
        J.writeString(str);
        J.writeString(str2);
        zzbw.d(J, bundle);
        J.writeLong(j2);
        P(1, J);
    }

    public final int a() {
        Parcel N = N(2, J());
        int readInt = N.readInt();
        N.recycle();
        return readInt;
    }
}
