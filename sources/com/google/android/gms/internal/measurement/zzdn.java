package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

public final class zzdn extends zzbu implements zzdl {
    public zzdn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    public final void u(Bundle bundle) {
        Parcel J = J();
        zzbw.d(J, bundle);
        P(1, J);
    }
}
