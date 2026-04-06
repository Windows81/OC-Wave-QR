package com.google.android.gms.pay;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzau extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzau> CREATOR = new zzav();

    /* renamed from: z  reason: collision with root package name */
    public Account f27034z;

    public zzau(Account account) {
        this.f27034z = account;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzau) {
            return Objects.a(this.f27034z, ((zzau) obj).f27034z);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.b(this.f27034z);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.v(parcel, 1, this.f27034z, i2, false);
        SafeParcelWriter.b(parcel, a2);
    }
}
