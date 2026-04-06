package com.google.android.gms.internal.ads_identifier;

import android.os.IBinder;
import android.os.Parcel;

public final class zzd extends zza implements zzf {
    public zzd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    public final String c() {
        Parcel N = N(1, J());
        String readString = N.readString();
        N.recycle();
        return readString;
    }

    public final boolean v0(boolean z2) {
        Parcel J = J();
        zzc.a(J, true);
        Parcel N = N(2, J);
        boolean b2 = zzc.b(N);
        N.recycle();
        return b2;
    }
}
