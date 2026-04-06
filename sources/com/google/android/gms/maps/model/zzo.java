package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzo implements Parcelable.Creator<StreetViewPanoramaLink> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N = SafeParcelReader.N(parcel);
        String str = null;
        float f2 = 0.0f;
        while (parcel.dataPosition() < N) {
            int E = SafeParcelReader.E(parcel);
            int w2 = SafeParcelReader.w(E);
            if (w2 == 2) {
                str = SafeParcelReader.q(parcel, E);
            } else if (w2 != 3) {
                SafeParcelReader.M(parcel, E);
            } else {
                f2 = SafeParcelReader.C(parcel, E);
            }
        }
        SafeParcelReader.v(parcel, N);
        return new StreetViewPanoramaLink(str, f2);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new StreetViewPanoramaLink[i2];
    }
}
