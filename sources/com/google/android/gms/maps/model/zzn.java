package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzn implements Parcelable.Creator<StreetViewPanoramaCamera> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N = SafeParcelReader.N(parcel);
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        while (parcel.dataPosition() < N) {
            int E = SafeParcelReader.E(parcel);
            int w2 = SafeParcelReader.w(E);
            if (w2 == 2) {
                f2 = SafeParcelReader.C(parcel, E);
            } else if (w2 == 3) {
                f3 = SafeParcelReader.C(parcel, E);
            } else if (w2 != 4) {
                SafeParcelReader.M(parcel, E);
            } else {
                f4 = SafeParcelReader.C(parcel, E);
            }
        }
        SafeParcelReader.v(parcel, N);
        return new StreetViewPanoramaCamera(f2, f3, f4);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new StreetViewPanoramaCamera[i2];
    }
}
