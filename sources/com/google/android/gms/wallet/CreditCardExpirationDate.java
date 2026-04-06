package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class CreditCardExpirationDate extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CreditCardExpirationDate> CREATOR = new zzj();

    /* renamed from: A  reason: collision with root package name */
    public int f27262A;

    /* renamed from: z  reason: collision with root package name */
    public int f27263z;

    public CreditCardExpirationDate(int i2, int i3) {
        this.f27263z = i2;
        this.f27262A = i3;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.n(parcel, 1, this.f27263z);
        SafeParcelWriter.n(parcel, 2, this.f27262A);
        SafeParcelWriter.b(parcel, a2);
    }
}
