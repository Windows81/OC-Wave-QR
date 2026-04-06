package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzi implements Parcelable.Creator<MarkerOptions> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int N = SafeParcelReader.N(parcel);
        LatLng latLng = null;
        String str = null;
        String str2 = null;
        IBinder iBinder = null;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        float f7 = 0.5f;
        float f8 = 1.0f;
        while (parcel.dataPosition() < N) {
            int E = SafeParcelReader.E(parcel);
            switch (SafeParcelReader.w(E)) {
                case 2:
                    latLng = (LatLng) SafeParcelReader.p(parcel2, E, LatLng.CREATOR);
                    break;
                case 3:
                    str = SafeParcelReader.q(parcel2, E);
                    break;
                case 4:
                    str2 = SafeParcelReader.q(parcel2, E);
                    break;
                case 5:
                    iBinder = SafeParcelReader.F(parcel2, E);
                    break;
                case 6:
                    f2 = SafeParcelReader.C(parcel2, E);
                    break;
                case 7:
                    f3 = SafeParcelReader.C(parcel2, E);
                    break;
                case 8:
                    z2 = SafeParcelReader.x(parcel2, E);
                    break;
                case 9:
                    z3 = SafeParcelReader.x(parcel2, E);
                    break;
                case 10:
                    z4 = SafeParcelReader.x(parcel2, E);
                    break;
                case 11:
                    f4 = SafeParcelReader.C(parcel2, E);
                    break;
                case 12:
                    f7 = SafeParcelReader.C(parcel2, E);
                    break;
                case 13:
                    f5 = SafeParcelReader.C(parcel2, E);
                    break;
                case 14:
                    f8 = SafeParcelReader.C(parcel2, E);
                    break;
                case 15:
                    f6 = SafeParcelReader.C(parcel2, E);
                    break;
                default:
                    SafeParcelReader.M(parcel2, E);
                    break;
            }
        }
        SafeParcelReader.v(parcel2, N);
        return new MarkerOptions(latLng, str, str2, iBinder, f2, f3, z2, z3, z4, f4, f7, f5, f8, f6);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new MarkerOptions[i2];
    }
}
