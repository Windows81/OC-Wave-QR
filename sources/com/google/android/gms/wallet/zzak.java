package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzak implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N = SafeParcelReader.N(parcel);
        int i2 = 0;
        String str = null;
        String str2 = null;
        int i3 = 0;
        while (parcel.dataPosition() < N) {
            int E = SafeParcelReader.E(parcel);
            int w2 = SafeParcelReader.w(E);
            if (w2 == 2) {
                str = SafeParcelReader.q(parcel, E);
            } else if (w2 == 3) {
                str2 = SafeParcelReader.q(parcel, E);
            } else if (w2 == 4) {
                i2 = SafeParcelReader.G(parcel, E);
            } else if (w2 != 5) {
                SafeParcelReader.M(parcel, E);
            } else {
                i3 = SafeParcelReader.G(parcel, E);
            }
        }
        SafeParcelReader.v(parcel, N);
        return new zzaj(str, str2, i2, i3);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new zzaj[i2];
    }
}
