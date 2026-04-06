package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzon implements Parcelable.Creator<zzok> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int N = SafeParcelReader.N(parcel);
        int i2 = 0;
        String str = null;
        Long l2 = null;
        Float f2 = null;
        String str2 = null;
        String str3 = null;
        Double d2 = null;
        long j2 = 0;
        while (parcel.dataPosition() < N) {
            int E = SafeParcelReader.E(parcel);
            switch (SafeParcelReader.w(E)) {
                case 1:
                    i2 = SafeParcelReader.G(parcel2, E);
                    break;
                case 2:
                    str = SafeParcelReader.q(parcel2, E);
                    break;
                case 3:
                    j2 = SafeParcelReader.J(parcel2, E);
                    break;
                case 4:
                    l2 = SafeParcelReader.K(parcel2, E);
                    break;
                case 5:
                    f2 = SafeParcelReader.D(parcel2, E);
                    break;
                case 6:
                    str2 = SafeParcelReader.q(parcel2, E);
                    break;
                case 7:
                    str3 = SafeParcelReader.q(parcel2, E);
                    break;
                case 8:
                    d2 = SafeParcelReader.B(parcel2, E);
                    break;
                default:
                    SafeParcelReader.M(parcel2, E);
                    break;
            }
        }
        SafeParcelReader.v(parcel2, N);
        return new zzok(i2, str, j2, l2, f2, str2, str3, d2);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new zzok[i2];
    }
}
