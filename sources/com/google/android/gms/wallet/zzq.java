package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

public final class zzq implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N = SafeParcelReader.N(parcel);
        ArrayList arrayList = null;
        String str = null;
        String str2 = null;
        ArrayList arrayList2 = null;
        String str3 = null;
        boolean z2 = false;
        while (parcel.dataPosition() < N) {
            int E = SafeParcelReader.E(parcel);
            switch (SafeParcelReader.w(E)) {
                case 2:
                    arrayList = SafeParcelReader.l(parcel, E);
                    break;
                case 4:
                    str = SafeParcelReader.q(parcel, E);
                    break;
                case 5:
                    str2 = SafeParcelReader.q(parcel, E);
                    break;
                case 6:
                    arrayList2 = SafeParcelReader.l(parcel, E);
                    break;
                case 7:
                    z2 = SafeParcelReader.x(parcel, E);
                    break;
                case 8:
                    str3 = SafeParcelReader.q(parcel, E);
                    break;
                default:
                    SafeParcelReader.M(parcel, E);
                    break;
            }
        }
        SafeParcelReader.v(parcel, N);
        return new IsReadyToPayRequest(arrayList, str, str2, arrayList2, z2, str3);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new IsReadyToPayRequest[i2];
    }
}
