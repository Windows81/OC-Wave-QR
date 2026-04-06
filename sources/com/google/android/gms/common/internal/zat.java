package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zat extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zat> CREATOR = new zau();

    /* renamed from: A  reason: collision with root package name */
    public final Account f24954A;

    /* renamed from: B  reason: collision with root package name */
    public final int f24955B;
    public final GoogleSignInAccount C;

    /* renamed from: z  reason: collision with root package name */
    public final int f24956z;

    public zat(int i2, Account account, int i3, GoogleSignInAccount googleSignInAccount) {
        this.f24956z = i2;
        this.f24954A = account;
        this.f24955B = i3;
        this.C = googleSignInAccount;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int i3 = this.f24956z;
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.n(parcel, 1, i3);
        SafeParcelWriter.v(parcel, 2, this.f24954A, i2, false);
        SafeParcelWriter.n(parcel, 3, this.f24955B);
        SafeParcelWriter.v(parcel, 4, this.C, i2, false);
        SafeParcelWriter.b(parcel, a2);
    }

    public zat(Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i2, googleSignInAccount);
    }
}
