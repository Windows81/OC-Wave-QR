package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzj implements Parcelable.Creator<PatternItem> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N = SafeParcelReader.N(parcel);
        int i2 = 0;
        Float f2 = null;
        while (parcel.dataPosition() < N) {
            int E = SafeParcelReader.E(parcel);
            int w2 = SafeParcelReader.w(E);
            if (w2 == 2) {
                i2 = SafeParcelReader.G(parcel, E);
            } else if (w2 != 3) {
                SafeParcelReader.M(parcel, E);
            } else {
                f2 = SafeParcelReader.D(parcel, E);
            }
        }
        SafeParcelReader.v(parcel, N);
        return new PatternItem(i2, f2);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new PatternItem[i2];
    }
}
