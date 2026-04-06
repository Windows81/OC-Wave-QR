package com.google.android.gms.pay;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzav implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N = SafeParcelReader.N(parcel);
        Account account = null;
        while (parcel.dataPosition() < N) {
            int E = SafeParcelReader.E(parcel);
            if (SafeParcelReader.w(E) != 1) {
                SafeParcelReader.M(parcel, E);
            } else {
                account = (Account) SafeParcelReader.p(parcel, E, Account.CREATOR);
            }
        }
        SafeParcelReader.v(parcel, N);
        return new zzau(account);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new zzau[i2];
    }
}
