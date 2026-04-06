package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzw implements Parcelable.Creator<VisibleRegion> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N = SafeParcelReader.N(parcel);
        LatLng latLng = null;
        LatLng latLng2 = null;
        LatLng latLng3 = null;
        LatLng latLng4 = null;
        LatLngBounds latLngBounds = null;
        while (parcel.dataPosition() < N) {
            int E = SafeParcelReader.E(parcel);
            int w2 = SafeParcelReader.w(E);
            if (w2 == 2) {
                latLng = (LatLng) SafeParcelReader.p(parcel, E, LatLng.CREATOR);
            } else if (w2 == 3) {
                latLng2 = (LatLng) SafeParcelReader.p(parcel, E, LatLng.CREATOR);
            } else if (w2 == 4) {
                latLng3 = (LatLng) SafeParcelReader.p(parcel, E, LatLng.CREATOR);
            } else if (w2 == 5) {
                latLng4 = (LatLng) SafeParcelReader.p(parcel, E, LatLng.CREATOR);
            } else if (w2 != 6) {
                SafeParcelReader.M(parcel, E);
            } else {
                latLngBounds = (LatLngBounds) SafeParcelReader.p(parcel, E, LatLngBounds.CREATOR);
            }
        }
        SafeParcelReader.v(parcel, N);
        return new VisibleRegion(latLng, latLng2, latLng3, latLng4, latLngBounds);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new VisibleRegion[i2];
    }
}
