package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzc;

public final class zzq extends zza implements IInterface {
    public zzq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final int W2(IObjectWrapper iObjectWrapper, String str, boolean z2) {
        Parcel P = P();
        zzc.e(P, iObjectWrapper);
        P.writeString(str);
        P.writeInt(z2 ? 1 : 0);
        Parcel J = J(3, P);
        int readInt = J.readInt();
        J.recycle();
        return readInt;
    }

    public final int X2(IObjectWrapper iObjectWrapper, String str, boolean z2) {
        Parcel P = P();
        zzc.e(P, iObjectWrapper);
        P.writeString(str);
        P.writeInt(z2 ? 1 : 0);
        Parcel J = J(5, P);
        int readInt = J.readInt();
        J.recycle();
        return readInt;
    }

    public final IObjectWrapper Y2(IObjectWrapper iObjectWrapper, String str, int i2) {
        Parcel P = P();
        zzc.e(P, iObjectWrapper);
        P.writeString(str);
        P.writeInt(i2);
        Parcel J = J(2, P);
        IObjectWrapper N = IObjectWrapper.Stub.N(J.readStrongBinder());
        J.recycle();
        return N;
    }

    public final IObjectWrapper Z2(IObjectWrapper iObjectWrapper, String str, int i2, IObjectWrapper iObjectWrapper2) {
        Parcel P = P();
        zzc.e(P, iObjectWrapper);
        P.writeString(str);
        P.writeInt(i2);
        zzc.e(P, iObjectWrapper2);
        Parcel J = J(8, P);
        IObjectWrapper N = IObjectWrapper.Stub.N(J.readStrongBinder());
        J.recycle();
        return N;
    }

    public final IObjectWrapper a3(IObjectWrapper iObjectWrapper, String str, int i2) {
        Parcel P = P();
        zzc.e(P, iObjectWrapper);
        P.writeString(str);
        P.writeInt(i2);
        Parcel J = J(4, P);
        IObjectWrapper N = IObjectWrapper.Stub.N(J.readStrongBinder());
        J.recycle();
        return N;
    }

    public final IObjectWrapper b3(IObjectWrapper iObjectWrapper, String str, boolean z2, long j2) {
        Parcel P = P();
        zzc.e(P, iObjectWrapper);
        P.writeString(str);
        P.writeInt(z2 ? 1 : 0);
        P.writeLong(j2);
        Parcel J = J(7, P);
        IObjectWrapper N = IObjectWrapper.Stub.N(J.readStrongBinder());
        J.recycle();
        return N;
    }

    public final int u1() {
        Parcel J = J(6, P());
        int readInt = J.readInt();
        J.recycle();
        return readInt;
    }
}
