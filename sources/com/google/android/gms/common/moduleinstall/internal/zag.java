package com.google.android.gms.common.moduleinstall.internal;

import android.os.Parcel;
import com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate;
import com.google.android.gms.internal.base.zab;
import com.google.android.gms.internal.base.zac;

public abstract class zag extends zab implements zah {
    public final boolean W2(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 != 1) {
            return false;
        }
        zac.b(parcel);
        w2((ModuleInstallStatusUpdate) zac.a(parcel, ModuleInstallStatusUpdate.CREATOR));
        return true;
    }
}
