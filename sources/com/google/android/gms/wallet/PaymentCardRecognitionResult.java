package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class PaymentCardRecognitionResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PaymentCardRecognitionResult> CREATOR = new zzw();

    /* renamed from: A  reason: collision with root package name */
    public CreditCardExpirationDate f27288A;

    /* renamed from: z  reason: collision with root package name */
    public String f27289z;

    public PaymentCardRecognitionResult(String str, CreditCardExpirationDate creditCardExpirationDate) {
        this.f27289z = str;
        this.f27288A = creditCardExpirationDate;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.w(parcel, 1, this.f27289z, false);
        SafeParcelWriter.v(parcel, 2, this.f27288A, i2, false);
        SafeParcelWriter.b(parcel, a2);
    }
}
