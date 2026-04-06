package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

public final class zzc implements Parcelable.Creator<CircleOptions> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int N = SafeParcelReader.N(parcel);
        LatLng latLng = null;
        ArrayList arrayList = null;
        double d2 = 0.0d;
        float f2 = 0.0f;
        float f3 = 0.0f;
        int i2 = 0;
        int i3 = 0;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < N) {
            int E = SafeParcelReader.E(parcel);
            switch (SafeParcelReader.w(E)) {
                case 2:
                    latLng = (LatLng) SafeParcelReader.p(parcel2, E, LatLng.CREATOR);
                    break;
                case 3:
                    d2 = SafeParcelReader.A(parcel2, E);
                    break;
                case 4:
                    f2 = SafeParcelReader.C(parcel2, E);
                    break;
                case 5:
                    i2 = SafeParcelReader.G(parcel2, E);
                    break;
                case 6:
                    i3 = SafeParcelReader.G(parcel2, E);
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
                    arrayList = SafeParcelReader.u(parcel2, E, PatternItem.CREATOR);
                    break;
                default:
                    SafeParcelReader.M(parcel2, E);
                    break;
            }
        }
        SafeParcelReader.v(parcel2, N);
        return new CircleOptions(latLng, d2, f2, i2, i3, f3, z2, z3, arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new CircleOptions[i2];
    }
}
