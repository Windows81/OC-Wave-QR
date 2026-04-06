package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zab implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N = SafeParcelReader.N(parcel);
        Intent intent = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < N) {
            int E = SafeParcelReader.E(parcel);
            int w2 = SafeParcelReader.w(E);
            if (w2 == 1) {
                i2 = SafeParcelReader.G(parcel, E);
            } else if (w2 == 2) {
                i3 = SafeParcelReader.G(parcel, E);
            } else if (w2 != 3) {
                SafeParcelReader.M(parcel, E);
            } else {
                intent = (Intent) SafeParcelReader.p(parcel, E, Intent.CREATOR);
            }
        }
        SafeParcelReader.v(parcel, N);
        return new zaa(i2, i3, intent);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new zaa[i2];
    }
}
