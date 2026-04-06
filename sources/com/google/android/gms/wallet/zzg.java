package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

public final class zzg implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N = SafeParcelReader.N(parcel);
        boolean z2 = false;
        boolean z3 = true;
        ArrayList arrayList = null;
        int i2 = 0;
        while (parcel.dataPosition() < N) {
            int E = SafeParcelReader.E(parcel);
            int w2 = SafeParcelReader.w(E);
            if (w2 == 1) {
                arrayList = SafeParcelReader.l(parcel, E);
            } else if (w2 == 2) {
                z3 = SafeParcelReader.x(parcel, E);
            } else if (w2 == 3) {
                z2 = SafeParcelReader.x(parcel, E);
            } else if (w2 != 4) {
                SafeParcelReader.M(parcel, E);
            } else {
                i2 = SafeParcelReader.G(parcel, E);
            }
        }
        SafeParcelReader.v(parcel, N);
        return new CardRequirements(arrayList, z3, z2, i2);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new CardRequirements[i2];
    }
}
