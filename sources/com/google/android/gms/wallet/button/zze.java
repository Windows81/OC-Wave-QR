package com.google.android.gms.wallet.button;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.wallet.zza;
import com.google.android.gms.internal.wallet.zzc;

public final class zze extends zza implements IInterface {
    public zze(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.wallet.button.IPayButtonCreator");
    }

    public final IObjectWrapper u1(IObjectWrapper iObjectWrapper, ButtonOptions buttonOptions) {
        Parcel J = J();
        zzc.d(J, iObjectWrapper);
        zzc.c(J, buttonOptions);
        Parcel N = N(1, J);
        IObjectWrapper N2 = IObjectWrapper.Stub.N(N.readStrongBinder());
        N.recycle();
        return N2;
    }
}
