package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zay implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N = SafeParcelReader.N(parcel);
        Scope[] scopeArr = null;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (parcel.dataPosition() < N) {
            int E = SafeParcelReader.E(parcel);
            int w2 = SafeParcelReader.w(E);
            if (w2 == 1) {
                i2 = SafeParcelReader.G(parcel, E);
            } else if (w2 == 2) {
                i3 = SafeParcelReader.G(parcel, E);
            } else if (w2 == 3) {
                i4 = SafeParcelReader.G(parcel, E);
            } else if (w2 != 4) {
                SafeParcelReader.M(parcel, E);
            } else {
                scopeArr = (Scope[]) SafeParcelReader.t(parcel, E, Scope.CREATOR);
            }
        }
        SafeParcelReader.v(parcel, N);
        return new zax(i2, i3, i4, scopeArr);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new zax[i2];
    }
}
