package com.google.android.gms.common.moduleinstall.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.internal.base.zaa;
import com.google.android.gms.internal.base.zac;

public final class zaf extends zaa implements IInterface {
    public zaf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.moduleinstall.internal.IModuleInstallService");
    }

    public final void W2(zae zae, ApiFeatureRequest apiFeatureRequest) {
        Parcel J = J();
        zac.d(J, zae);
        zac.c(J, apiFeatureRequest);
        P(1, J);
    }

    public final void X2(zae zae, ApiFeatureRequest apiFeatureRequest) {
        Parcel J = J();
        zac.d(J, zae);
        zac.c(J, apiFeatureRequest);
        P(3, J);
    }

    public final void Y2(zae zae, ApiFeatureRequest apiFeatureRequest, zah zah) {
        Parcel J = J();
        zac.d(J, zae);
        zac.c(J, apiFeatureRequest);
        zac.d(J, zah);
        P(2, J);
    }

    public final void Z2(IStatusCallback iStatusCallback, ApiFeatureRequest apiFeatureRequest) {
        Parcel J = J();
        zac.d(J, iStatusCallback);
        zac.c(J, apiFeatureRequest);
        P(4, J);
    }

    public final void a3(IStatusCallback iStatusCallback, zah zah) {
        Parcel J = J();
        zac.d(J, iStatusCallback);
        zac.d(J, zah);
        P(6, J);
    }
}
