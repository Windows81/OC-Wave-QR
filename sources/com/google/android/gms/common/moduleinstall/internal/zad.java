package com.google.android.gms.common.moduleinstall.internal;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;
import com.google.android.gms.internal.base.zab;
import com.google.android.gms.internal.base.zac;

public abstract class zad extends zab implements zae {
    public zad() {
        super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallCallbacks");
    }

    public final boolean W2(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 == 1) {
            zac.b(parcel);
            E1((Status) zac.a(parcel, Status.CREATOR), (ModuleAvailabilityResponse) zac.a(parcel, ModuleAvailabilityResponse.CREATOR));
        } else if (i2 == 2) {
            zac.b(parcel);
            B1((Status) zac.a(parcel, Status.CREATOR), (ModuleInstallResponse) zac.a(parcel, ModuleInstallResponse.CREATOR));
        } else if (i2 == 3) {
            zac.b(parcel);
            L0((Status) zac.a(parcel, Status.CREATOR), (ModuleInstallIntentResponse) zac.a(parcel, ModuleInstallIntentResponse.CREATOR));
        } else if (i2 != 4) {
            return false;
        } else {
            zac.b(parcel);
            y2((Status) zac.a(parcel, Status.CREATOR));
        }
        return true;
    }
}
