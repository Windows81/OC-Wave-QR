package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzar implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N = SafeParcelReader.N(parcel);
        int[] iArr = null;
        boolean z2 = false;
        while (parcel.dataPosition() < N) {
            int E = SafeParcelReader.E(parcel);
            int w2 = SafeParcelReader.w(E);
            if (w2 == 1) {
                z2 = SafeParcelReader.x(parcel, E);
            } else if (w2 != 2) {
                SafeParcelReader.M(parcel, E);
            } else {
                iArr = SafeParcelReader.k(parcel, E);
            }
        }
        SafeParcelReader.v(parcel, N);
        return new zzaq(z2, iArr);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new zzaq[i2];
    }
}
