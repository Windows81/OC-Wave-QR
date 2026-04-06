package com.google.android.gms.wallet;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class PaymentMethodTokenizationParameters extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PaymentMethodTokenizationParameters> CREATOR = new zzaf();

    /* renamed from: A  reason: collision with root package name */
    public final Bundle f27299A;

    /* renamed from: z  reason: collision with root package name */
    public int f27300z;

    public final class Builder {
    }

    public PaymentMethodTokenizationParameters(int i2, Bundle bundle) {
        new Bundle();
        this.f27300z = i2;
        this.f27299A = bundle;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.n(parcel, 2, this.f27300z);
        SafeParcelWriter.e(parcel, 3, this.f27299A, false);
        SafeParcelWriter.b(parcel, a2);
    }
}
