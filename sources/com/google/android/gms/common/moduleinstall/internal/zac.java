package com.google.android.gms.common.moduleinstall.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

public final class zac implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N = SafeParcelReader.N(parcel);
        ArrayList arrayList = null;
        String str = null;
        boolean z2 = false;
        String str2 = null;
        while (parcel.dataPosition() < N) {
            int E = SafeParcelReader.E(parcel);
            int w2 = SafeParcelReader.w(E);
            if (w2 == 1) {
                arrayList = SafeParcelReader.u(parcel, E, Feature.CREATOR);
            } else if (w2 == 2) {
                z2 = SafeParcelReader.x(parcel, E);
            } else if (w2 == 3) {
                str2 = SafeParcelReader.q(parcel, E);
            } else if (w2 != 4) {
                SafeParcelReader.M(parcel, E);
            } else {
                str = SafeParcelReader.q(parcel, E);
            }
        }
        SafeParcelReader.v(parcel, N);
        return new ApiFeatureRequest(arrayList, z2, str2, str);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new ApiFeatureRequest[i2];
    }
}
