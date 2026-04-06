package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzcy implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N = SafeParcelReader.N(parcel);
        long j2 = 0;
        byte[] bArr = null;
        while (parcel.dataPosition() < N) {
            int E = SafeParcelReader.E(parcel);
            int w2 = SafeParcelReader.w(E);
            if (w2 == 1) {
                bArr = SafeParcelReader.g(parcel, E);
            } else if (w2 != 2) {
                SafeParcelReader.M(parcel, E);
            } else {
                j2 = SafeParcelReader.J(parcel, E);
            }
        }
        SafeParcelReader.v(parcel, N);
        return new zzcx(bArr, j2);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new zzcx[i2];
    }
}
