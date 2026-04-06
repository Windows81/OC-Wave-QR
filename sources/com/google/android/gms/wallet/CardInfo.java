package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.identity.intents.model.UserAddress;

public final class CardInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CardInfo> CREATOR = new zze();

    /* renamed from: A  reason: collision with root package name */
    public String f27253A;

    /* renamed from: B  reason: collision with root package name */
    public String f27254B;
    public int C;
    public UserAddress D;

    /* renamed from: z  reason: collision with root package name */
    public String f27255z;

    public CardInfo(String str, String str2, String str3, int i2, UserAddress userAddress) {
        this.f27255z = str;
        this.f27253A = str2;
        this.f27254B = str3;
        this.C = i2;
        this.D = userAddress;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.w(parcel, 1, this.f27255z, false);
        SafeParcelWriter.w(parcel, 2, this.f27253A, false);
        SafeParcelWriter.w(parcel, 3, this.f27254B, false);
        SafeParcelWriter.n(parcel, 4, this.C);
        SafeParcelWriter.v(parcel, 5, this.D, i2, false);
        SafeParcelWriter.b(parcel, a2);
    }
}
