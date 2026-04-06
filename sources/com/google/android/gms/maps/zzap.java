package com.google.android.gms.maps;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.android.gms.maps.model.StreetViewSource;

public final class zzap implements Parcelable.Creator<StreetViewPanoramaOptions> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N = SafeParcelReader.N(parcel);
        StreetViewPanoramaCamera streetViewPanoramaCamera = null;
        String str = null;
        LatLng latLng = null;
        Integer num = null;
        StreetViewSource streetViewSource = null;
        byte b2 = 0;
        byte b3 = 0;
        byte b4 = 0;
        byte b5 = 0;
        byte b6 = 0;
        while (parcel.dataPosition() < N) {
            int E = SafeParcelReader.E(parcel);
            switch (SafeParcelReader.w(E)) {
                case 2:
                    streetViewPanoramaCamera = (StreetViewPanoramaCamera) SafeParcelReader.p(parcel, E, StreetViewPanoramaCamera.CREATOR);
                    break;
                case 3:
                    str = SafeParcelReader.q(parcel, E);
                    break;
                case 4:
                    latLng = (LatLng) SafeParcelReader.p(parcel, E, LatLng.CREATOR);
                    break;
                case 5:
                    num = SafeParcelReader.H(parcel, E);
                    break;
                case 6:
                    b2 = SafeParcelReader.z(parcel, E);
                    break;
                case 7:
                    b3 = SafeParcelReader.z(parcel, E);
                    break;
                case 8:
                    b4 = SafeParcelReader.z(parcel, E);
                    break;
                case 9:
                    b5 = SafeParcelReader.z(parcel, E);
                    break;
                case 10:
                    b6 = SafeParcelReader.z(parcel, E);
                    break;
                case 11:
                    streetViewSource = (StreetViewSource) SafeParcelReader.p(parcel, E, StreetViewSource.CREATOR);
                    break;
                default:
                    SafeParcelReader.M(parcel, E);
                    break;
            }
        }
        SafeParcelReader.v(parcel, N);
        return new StreetViewPanoramaOptions(streetViewPanoramaCamera, str, latLng, num, b2, b3, b4, b5, b6, streetViewSource);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new StreetViewPanoramaOptions[i2];
    }
}
