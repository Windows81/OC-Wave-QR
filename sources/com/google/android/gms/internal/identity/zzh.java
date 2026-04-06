package com.google.android.gms.internal.identity;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.identity.intents.UserAddressRequest;

public final class zzh extends zza implements IInterface {
    public zzh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.identity.intents.internal.IAddressService");
    }

    public final void P(zzg zzg, UserAddressRequest userAddressRequest, Bundle bundle) {
        Parcel J = J();
        zzc.c(J, zzg);
        zzc.b(J, userAddressRequest);
        zzc.b(J, bundle);
        N(2, J);
    }
}
