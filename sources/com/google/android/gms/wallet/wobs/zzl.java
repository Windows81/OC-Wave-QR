package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzl implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N = SafeParcelReader.N(parcel);
        long j2 = 0;
        long j3 = 0;
        while (parcel.dataPosition() < N) {
            int E = SafeParcelReader.E(parcel);
            int w2 = SafeParcelReader.w(E);
            if (w2 == 2) {
                j2 = SafeParcelReader.J(parcel, E);
            } else if (w2 != 3) {
                SafeParcelReader.M(parcel, E);
            } else {
                j3 = SafeParcelReader.J(parcel, E);
            }
        }
        SafeParcelReader.v(parcel, N);
        return new TimeInterval(j2, j3);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new TimeInterval[i2];
    }
}
