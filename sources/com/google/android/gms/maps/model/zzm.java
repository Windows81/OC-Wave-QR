package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

public final class zzm implements Parcelable.Creator<PolylineOptions> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int N = SafeParcelReader.N(parcel);
        ArrayList arrayList = null;
        Cap cap = null;
        Cap cap2 = null;
        ArrayList arrayList2 = null;
        float f2 = 0.0f;
        float f3 = 0.0f;
        int i2 = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        int i3 = 0;
        while (parcel.dataPosition() < N) {
            int E = SafeParcelReader.E(parcel);
            switch (SafeParcelReader.w(E)) {
                case 2:
                    arrayList = SafeParcelReader.u(parcel2, E, LatLng.CREATOR);
                    break;
                case 3:
                    f2 = SafeParcelReader.C(parcel2, E);
                    break;
                case 4:
                    i2 = SafeParcelReader.G(parcel2, E);
                    break;
                case 5:
                    f3 = SafeParcelReader.C(parcel2, E);
                    break;
                case 6:
                    z2 = SafeParcelReader.x(parcel2, E);
                    break;
                case 7:
                    z3 = SafeParcelReader.x(parcel2, E);
                    break;
                case 8:
                    z4 = SafeParcelReader.x(parcel2, E);
                    break;
                case 9:
                    cap = (Cap) SafeParcelReader.p(parcel2, E, Cap.CREATOR);
                    break;
                case 10:
                    cap2 = (Cap) SafeParcelReader.p(parcel2, E, Cap.CREATOR);
                    break;
                case 11:
                    i3 = SafeParcelReader.G(parcel2, E);
                    break;
                case 12:
                    arrayList2 = SafeParcelReader.u(parcel2, E, PatternItem.CREATOR);
                    break;
                default:
                    SafeParcelReader.M(parcel2, E);
                    break;
            }
        }
        SafeParcelReader.v(parcel2, N);
        return new PolylineOptions(arrayList, f2, i2, f3, z2, z3, z4, cap, cap2, i3, arrayList2);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new PolylineOptions[i2];
    }
}
