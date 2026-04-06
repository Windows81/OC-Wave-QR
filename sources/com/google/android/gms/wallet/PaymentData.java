package com.google.android.gms.wallet;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.identity.intents.model.UserAddress;

public final class PaymentData extends AbstractSafeParcelable implements AutoResolvableResult {
    public static final Parcelable.Creator<PaymentData> CREATOR = new zzaa();

    /* renamed from: A  reason: collision with root package name */
    public CardInfo f27290A;

    /* renamed from: B  reason: collision with root package name */
    public UserAddress f27291B;
    public PaymentMethodToken C;
    public String D;
    public Bundle E;
    public String F;
    public Bundle G;

    /* renamed from: z  reason: collision with root package name */
    public String f27292z;

    public PaymentData(String str, CardInfo cardInfo, UserAddress userAddress, PaymentMethodToken paymentMethodToken, String str2, Bundle bundle, String str3, Bundle bundle2) {
        this.f27292z = str;
        this.f27290A = cardInfo;
        this.f27291B = userAddress;
        this.C = paymentMethodToken;
        this.D = str2;
        this.E = bundle;
        this.F = str3;
        this.G = bundle2;
    }

    public static PaymentData H(Intent intent) {
        return (PaymentData) SafeParcelableSerializer.b(intent, "com.google.android.gms.wallet.PaymentData", CREATOR);
    }

    public void C(Intent intent) {
        SafeParcelableSerializer.d(this, intent, "com.google.android.gms.wallet.PaymentData");
    }

    public String Q() {
        return this.F;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.w(parcel, 1, this.f27292z, false);
        SafeParcelWriter.v(parcel, 2, this.f27290A, i2, false);
        SafeParcelWriter.v(parcel, 3, this.f27291B, i2, false);
        SafeParcelWriter.v(parcel, 4, this.C, i2, false);
        SafeParcelWriter.w(parcel, 5, this.D, false);
        SafeParcelWriter.e(parcel, 6, this.E, false);
        SafeParcelWriter.w(parcel, 7, this.F, false);
        SafeParcelWriter.e(parcel, 8, this.G, false);
        SafeParcelWriter.b(parcel, a2);
    }
}
