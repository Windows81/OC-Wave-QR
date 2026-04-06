package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.wallet.wobs.CommonWalletObject;

public final class zzn implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int N = SafeParcelReader.N(parcel);
        CommonWalletObject commonWalletObject = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        long j2 = 0;
        long j3 = 0;
        while (parcel.dataPosition() < N) {
            int E = SafeParcelReader.E(parcel);
            switch (SafeParcelReader.w(E)) {
                case 2:
                    commonWalletObject = (CommonWalletObject) SafeParcelReader.p(parcel2, E, CommonWalletObject.CREATOR);
                    break;
                case 3:
                    str = SafeParcelReader.q(parcel2, E);
                    break;
                case 4:
                    str2 = SafeParcelReader.q(parcel2, E);
                    break;
                case 5:
                    str3 = SafeParcelReader.q(parcel2, E);
                    break;
                case 6:
                    j2 = SafeParcelReader.J(parcel2, E);
                    break;
                case 7:
                    str4 = SafeParcelReader.q(parcel2, E);
                    break;
                case 8:
                    j3 = SafeParcelReader.J(parcel2, E);
                    break;
                case 9:
                    str5 = SafeParcelReader.q(parcel2, E);
                    break;
                default:
                    SafeParcelReader.M(parcel2, E);
                    break;
            }
        }
        SafeParcelReader.v(parcel2, N);
        return new GiftCardWalletObject(commonWalletObject, str, str2, str3, j2, str4, j3, str5);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new GiftCardWalletObject[i2];
    }
}
