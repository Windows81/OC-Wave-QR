package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzcs implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N = SafeParcelReader.N(parcel);
        boolean z2 = false;
        while (parcel.dataPosition() < N) {
            int E = SafeParcelReader.E(parcel);
            if (SafeParcelReader.w(E) != 1) {
                SafeParcelReader.M(parcel, E);
            } else {
                z2 = SafeParcelReader.x(parcel, E);
            }
        }
        SafeParcelReader.v(parcel, N);
        return new zzcr(z2);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new zzcr[i2];
    }
}
