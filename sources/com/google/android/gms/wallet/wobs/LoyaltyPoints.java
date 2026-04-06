package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class LoyaltyPoints extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LoyaltyPoints> CREATOR = new zzj();

    /* renamed from: A  reason: collision with root package name */
    public LoyaltyPointsBalance f27354A;

    /* renamed from: B  reason: collision with root package name */
    public TimeInterval f27355B;

    /* renamed from: z  reason: collision with root package name */
    public String f27356z;

    public final class Builder {
    }

    public LoyaltyPoints(String str, LoyaltyPointsBalance loyaltyPointsBalance, TimeInterval timeInterval) {
        this.f27356z = str;
        this.f27354A = loyaltyPointsBalance;
        this.f27355B = timeInterval;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.w(parcel, 2, this.f27356z, false);
        SafeParcelWriter.v(parcel, 3, this.f27354A, i2, false);
        SafeParcelWriter.v(parcel, 5, this.f27355B, i2, false);
        SafeParcelWriter.b(parcel, a2);
    }
}
