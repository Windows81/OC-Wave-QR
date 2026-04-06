package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzd implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N = SafeParcelReader.N(parcel);
        String str = null;
        int i2 = 0;
        boolean z2 = false;
        String str2 = null;
        while (parcel.dataPosition() < N) {
            int E = SafeParcelReader.E(parcel);
            int w2 = SafeParcelReader.w(E);
            if (w2 == 1) {
                i2 = SafeParcelReader.G(parcel, E);
            } else if (w2 == 2) {
                str = SafeParcelReader.q(parcel, E);
            } else if (w2 == 3) {
                z2 = SafeParcelReader.x(parcel, E);
            } else if (w2 != 4) {
                SafeParcelReader.M(parcel, E);
            } else {
                str2 = SafeParcelReader.q(parcel, E);
            }
        }
        SafeParcelReader.v(parcel, N);
        return new zzc(i2, str, z2, str2);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new zzc[i2];
    }
}
