package com.google.android.gms.signin.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.internal.base.zaa;
import com.google.android.gms.internal.base.zac;

public final class zaf extends zaa implements IInterface {
    public zaf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    public final void W2(int i2) {
        Parcel J = J();
        J.writeInt(i2);
        P(7, J);
    }

    public final void X2(IAccountAccessor iAccountAccessor, int i2, boolean z2) {
        Parcel J = J();
        zac.d(J, iAccountAccessor);
        J.writeInt(i2);
        J.writeInt(z2 ? 1 : 0);
        P(9, J);
    }

    public final void Y2(zai zai, zae zae) {
        Parcel J = J();
        zac.c(J, zai);
        zac.d(J, zae);
        P(12, J);
    }
}
