package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzc;

public final class zzr extends zza implements IInterface {
    public zzr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    public final IObjectWrapper W2(IObjectWrapper iObjectWrapper, String str, int i2, IObjectWrapper iObjectWrapper2) {
        Parcel P = P();
        zzc.e(P, iObjectWrapper);
        P.writeString(str);
        P.writeInt(i2);
        zzc.e(P, iObjectWrapper2);
        Parcel J = J(3, P);
        IObjectWrapper N = IObjectWrapper.Stub.N(J.readStrongBinder());
        J.recycle();
        return N;
    }

    public final IObjectWrapper u1(IObjectWrapper iObjectWrapper, String str, int i2, IObjectWrapper iObjectWrapper2) {
        Parcel P = P();
        zzc.e(P, iObjectWrapper);
        P.writeString(str);
        P.writeInt(i2);
        zzc.e(P, iObjectWrapper2);
        Parcel J = J(2, P);
        IObjectWrapper N = IObjectWrapper.Stub.N(J.readStrongBinder());
        J.recycle();
        return N;
    }
}
