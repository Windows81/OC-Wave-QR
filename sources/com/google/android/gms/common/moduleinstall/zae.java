package com.google.android.gms.common.moduleinstall;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zae implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N = SafeParcelReader.N(parcel);
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        Long l2 = null;
        Long l3 = null;
        while (parcel.dataPosition() < N) {
            int E = SafeParcelReader.E(parcel);
            int w2 = SafeParcelReader.w(E);
            if (w2 == 1) {
                i2 = SafeParcelReader.G(parcel, E);
            } else if (w2 == 2) {
                i3 = SafeParcelReader.G(parcel, E);
            } else if (w2 == 3) {
                l2 = SafeParcelReader.K(parcel, E);
            } else if (w2 == 4) {
                l3 = SafeParcelReader.K(parcel, E);
            } else if (w2 != 5) {
                SafeParcelReader.M(parcel, E);
            } else {
                i4 = SafeParcelReader.G(parcel, E);
            }
        }
        SafeParcelReader.v(parcel, N);
        return new ModuleInstallStatusUpdate(i2, i3, l2, l3, i4);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new ModuleInstallStatusUpdate[i2];
    }
}
