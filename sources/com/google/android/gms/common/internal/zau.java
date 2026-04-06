package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zau implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N = SafeParcelReader.N(parcel);
        Account account = null;
        int i2 = 0;
        int i3 = 0;
        GoogleSignInAccount googleSignInAccount = null;
        while (parcel.dataPosition() < N) {
            int E = SafeParcelReader.E(parcel);
            int w2 = SafeParcelReader.w(E);
            if (w2 == 1) {
                i2 = SafeParcelReader.G(parcel, E);
            } else if (w2 == 2) {
                account = (Account) SafeParcelReader.p(parcel, E, Account.CREATOR);
            } else if (w2 == 3) {
                i3 = SafeParcelReader.G(parcel, E);
            } else if (w2 != 4) {
                SafeParcelReader.M(parcel, E);
            } else {
                googleSignInAccount = (GoogleSignInAccount) SafeParcelReader.p(parcel, E, GoogleSignInAccount.CREATOR);
            }
        }
        SafeParcelReader.v(parcel, N);
        return new zat(i2, account, i3, googleSignInAccount);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new zat[i2];
    }
}
