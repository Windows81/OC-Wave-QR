package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

public final class zzl implements Parcelable.Creator<PolygonOptions> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N = SafeParcelReader.N(parcel);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = null;
        float f2 = 0.0f;
        int i2 = 0;
        int i3 = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        int i4 = 0;
        float f3 = 0.0f;
        ArrayList arrayList3 = null;
        while (parcel.dataPosition() < N) {
            int E = SafeParcelReader.E(parcel);
            switch (SafeParcelReader.w(E)) {
                case 2:
                    arrayList3 = SafeParcelReader.u(parcel, E, LatLng.CREATOR);
                    break;
                case 3:
                    SafeParcelReader.I(parcel, E, arrayList, zzl.class.getClassLoader());
                    break;
                case 4:
                    f3 = SafeParcelReader.C(parcel, E);
                    break;
                case 5:
                    i2 = SafeParcelReader.G(parcel, E);
                    break;
                case 6:
                    i3 = SafeParcelReader.G(parcel, E);
                    break;
                case 7:
                    f2 = SafeParcelReader.C(parcel, E);
                    break;
                case 8:
                    z2 = SafeParcelReader.x(parcel, E);
                    break;
                case 9:
                    z3 = SafeParcelReader.x(parcel, E);
                    break;
                case 10:
                    z4 = SafeParcelReader.x(parcel, E);
                    break;
                case 11:
                    i4 = SafeParcelReader.G(parcel, E);
                    break;
                case 12:
                    arrayList2 = SafeParcelReader.u(parcel, E, PatternItem.CREATOR);
                    break;
                default:
                    SafeParcelReader.M(parcel, E);
                    break;
            }
        }
        SafeParcelReader.v(parcel, N);
        return new PolygonOptions(arrayList3, arrayList, f3, i2, i3, f2, z2, z3, z4, i4, arrayList2);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new PolygonOptions[i2];
    }
}
