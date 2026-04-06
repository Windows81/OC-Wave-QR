package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.common.zza;

public final class zzy extends zza implements zzaa {
    public zzy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    public final int c() {
        Parcel J = J(2, P());
        int readInt = J.readInt();
        J.recycle();
        return readInt;
    }

    public final IObjectWrapper e() {
        Parcel J = J(1, P());
        IObjectWrapper N = IObjectWrapper.Stub.N(J.readStrongBinder());
        J.recycle();
        return N;
    }
}
