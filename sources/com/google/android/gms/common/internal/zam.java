package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.base.zaa;
import com.google.android.gms.internal.base.zac;

public final class zam extends zaa implements IInterface {
    public zam(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ISignInButtonCreator");
    }

    public final IObjectWrapper W2(IObjectWrapper iObjectWrapper, zax zax) {
        Parcel J = J();
        zac.d(J, iObjectWrapper);
        zac.c(J, zax);
        Parcel N = N(2, J);
        IObjectWrapper N2 = IObjectWrapper.Stub.N(N.readStrongBinder());
        N.recycle();
        return N2;
    }
}
