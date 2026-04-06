package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzd implements Parcelable.Creator<GroundOverlayOptions> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int N = SafeParcelReader.N(parcel);
        IBinder iBinder = null;
        LatLng latLng = null;
        LatLngBounds latLngBounds = null;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        float f7 = 0.0f;
        float f8 = 0.0f;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < N) {
            int E = SafeParcelReader.E(parcel);
            switch (SafeParcelReader.w(E)) {
                case 2:
                    iBinder = SafeParcelReader.F(parcel2, E);
                    break;
                case 3:
                    latLng = (LatLng) SafeParcelReader.p(parcel2, E, LatLng.CREATOR);
                    break;
                case 4:
                    f2 = SafeParcelReader.C(parcel2, E);
                    break;
                case 5:
                    f3 = SafeParcelReader.C(parcel2, E);
                    break;
                case 6:
                    latLngBounds = (LatLngBounds) SafeParcelReader.p(parcel2, E, LatLngBounds.CREATOR);
                    break;
                case 7:
                    f4 = SafeParcelReader.C(parcel2, E);
                    break;
                case 8:
                    f5 = SafeParcelReader.C(parcel2, E);
                    break;
                case 9:
                    z2 = SafeParcelReader.x(parcel2, E);
                    break;
                case 10:
                    f6 = SafeParcelReader.C(parcel2, E);
                    break;
                case 11:
                    f7 = SafeParcelReader.C(parcel2, E);
                    break;
                case 12:
                    f8 = SafeParcelReader.C(parcel2, E);
                    break;
                case 13:
                    z3 = SafeParcelReader.x(parcel2, E);
                    break;
                default:
                    SafeParcelReader.M(parcel2, E);
                    break;
            }
        }
        SafeParcelReader.v(parcel2, N);
        return new GroundOverlayOptions(iBinder, latLng, f2, f3, latLngBounds, f4, f5, z2, f6, f7, f8, z3);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new GroundOverlayOptions[i2];
    }
}
