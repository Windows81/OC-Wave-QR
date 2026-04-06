package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class CreateWalletObjectsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CreateWalletObjectsRequest> CREATOR = new zzi();

    /* renamed from: A  reason: collision with root package name */
    public OfferWalletObject f27259A;

    /* renamed from: B  reason: collision with root package name */
    public GiftCardWalletObject f27260B;
    public int C;

    /* renamed from: z  reason: collision with root package name */
    public LoyaltyWalletObject f27261z;

    public final class Builder {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface CreateMode {
    }

    public CreateWalletObjectsRequest(LoyaltyWalletObject loyaltyWalletObject, OfferWalletObject offerWalletObject, GiftCardWalletObject giftCardWalletObject, int i2) {
        this.f27261z = loyaltyWalletObject;
        this.f27259A = offerWalletObject;
        this.f27260B = giftCardWalletObject;
        this.C = i2;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.v(parcel, 2, this.f27261z, i2, false);
        SafeParcelWriter.v(parcel, 3, this.f27259A, i2, false);
        SafeParcelWriter.v(parcel, 4, this.f27260B, i2, false);
        SafeParcelWriter.n(parcel, 5, this.C);
        SafeParcelWriter.b(parcel, a2);
    }
}
