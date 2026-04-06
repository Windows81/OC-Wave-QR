package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzg implements Parcelable.Creator<LatLng> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N = SafeParcelReader.N(parcel);
        double d2 = 0.0d;
        double d3 = 0.0d;
        while (parcel.dataPosition() < N) {
            int E = SafeParcelReader.E(parcel);
            int w2 = SafeParcelReader.w(E);
            if (w2 == 2) {
                d2 = SafeParcelReader.A(parcel, E);
            } else if (w2 != 3) {
                SafeParcelReader.M(parcel, E);
            } else {
                d3 = SafeParcelReader.A(parcel, E);
            }
        }
        SafeParcelReader.v(parcel, N);
        return new LatLng(d2, d3);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new LatLng[i2];
    }
}
