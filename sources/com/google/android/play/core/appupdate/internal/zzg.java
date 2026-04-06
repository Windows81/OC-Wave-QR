package com.google.android.play.core.appupdate.internal;

import android.os.Bundle;
import android.os.Parcel;

public abstract class zzg extends zzb implements zzh {
    public zzg() {
        super("com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback");
    }

    public final boolean J(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 == 2) {
            zzc.b(parcel);
            C1((Bundle) zzc.a(parcel, Bundle.CREATOR));
            return true;
        } else if (i2 != 3) {
            return false;
        } else {
            zzc.b(parcel);
            b2((Bundle) zzc.a(parcel, Bundle.CREATOR));
            return true;
        }
    }
}
