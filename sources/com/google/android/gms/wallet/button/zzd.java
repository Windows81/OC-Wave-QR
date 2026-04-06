package com.google.android.gms.wallet.button;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzd implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N = SafeParcelReader.N(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        int i2 = 0;
        boolean z2 = false;
        while (parcel.dataPosition() < N) {
            int E = SafeParcelReader.E(parcel);
            switch (SafeParcelReader.w(E)) {
                case 1:
                    str = SafeParcelReader.q(parcel, E);
                    break;
                case 2:
                    i2 = SafeParcelReader.G(parcel, E);
                    break;
                case 3:
                    z2 = SafeParcelReader.x(parcel, E);
                    break;
                case 4:
                    str2 = SafeParcelReader.q(parcel, E);
                    break;
                case 5:
                    str3 = SafeParcelReader.q(parcel, E);
                    break;
                case 6:
                    str4 = SafeParcelReader.q(parcel, E);
                    break;
                case 7:
                    str5 = SafeParcelReader.q(parcel, E);
                    break;
                case 8:
                    str6 = SafeParcelReader.q(parcel, E);
                    break;
                case 9:
                    str7 = SafeParcelReader.q(parcel, E);
                    break;
                default:
                    SafeParcelReader.M(parcel, E);
                    break;
            }
        }
        SafeParcelReader.v(parcel, N);
        return new zzc(str, i2, z2, str2, str3, str4, str5, str6, str7);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new zzc[i2];
    }
}
