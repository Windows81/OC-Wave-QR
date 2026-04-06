package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class PaymentMethodToken extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PaymentMethodToken> CREATOR = new zzad();

    /* renamed from: A  reason: collision with root package name */
    public String f27297A;

    /* renamed from: z  reason: collision with root package name */
    public int f27298z;

    public PaymentMethodToken(int i2, String str) {
        this.f27298z = i2;
        this.f27297A = str;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.n(parcel, 2, this.f27298z);
        SafeParcelWriter.w(parcel, 3, this.f27297A, false);
        SafeParcelWriter.b(parcel, a2);
    }
}
