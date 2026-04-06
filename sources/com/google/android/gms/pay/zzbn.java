package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzbn implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N = SafeParcelReader.N(parcel);
        boolean z2 = false;
        int i2 = 0;
        String str = null;
        String str2 = null;
        byte[] bArr = null;
        while (parcel.dataPosition() < N) {
            int E = SafeParcelReader.E(parcel);
            int w2 = SafeParcelReader.w(E);
            if (w2 == 1) {
                str = SafeParcelReader.q(parcel, E);
            } else if (w2 == 2) {
                str2 = SafeParcelReader.q(parcel, E);
            } else if (w2 == 3) {
                z2 = SafeParcelReader.x(parcel, E);
            } else if (w2 == 4) {
                bArr = SafeParcelReader.g(parcel, E);
            } else if (w2 != 5) {
                SafeParcelReader.M(parcel, E);
            } else {
                i2 = SafeParcelReader.G(parcel, E);
            }
        }
        SafeParcelReader.v(parcel, N);
        return new zzbm(str, str2, z2, bArr, i2);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new zzbm[i2];
    }
}
