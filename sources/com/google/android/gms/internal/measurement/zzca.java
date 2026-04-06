package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

public final class zzca extends zzbu implements zzbz {
    public zzca(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    public final Bundle u(Bundle bundle) {
        Parcel J = J();
        zzbw.d(J, bundle);
        Parcel N = N(1, J);
        Bundle bundle2 = (Bundle) zzbw.a(N, Bundle.CREATOR);
        N.recycle();
        return bundle2;
    }
}
