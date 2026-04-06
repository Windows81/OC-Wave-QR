package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.identity.intents.model.UserAddress;

public final class MaskedWallet extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<MaskedWallet> CREATOR = new zzt();

    /* renamed from: A  reason: collision with root package name */
    public String f27280A;

    /* renamed from: B  reason: collision with root package name */
    public String[] f27281B;
    public String C;
    public zza D;
    public zza E;
    public LoyaltyWalletObject[] F;
    public OfferWalletObject[] G;
    public UserAddress H;
    public UserAddress I;
    public InstrumentInfo[] J;

    /* renamed from: z  reason: collision with root package name */
    public String f27282z;

    public MaskedWallet(String str, String str2, String[] strArr, String str3, zza zza, zza zza2, LoyaltyWalletObject[] loyaltyWalletObjectArr, OfferWalletObject[] offerWalletObjectArr, UserAddress userAddress, UserAddress userAddress2, InstrumentInfo[] instrumentInfoArr) {
        this.f27282z = str;
        this.f27280A = str2;
        this.f27281B = strArr;
        this.C = str3;
        this.D = zza;
        this.E = zza2;
        this.F = loyaltyWalletObjectArr;
        this.G = offerWalletObjectArr;
        this.H = userAddress;
        this.I = userAddress2;
        this.J = instrumentInfoArr;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.w(parcel, 2, this.f27282z, false);
        SafeParcelWriter.w(parcel, 3, this.f27280A, false);
        SafeParcelWriter.x(parcel, 4, this.f27281B, false);
        SafeParcelWriter.w(parcel, 5, this.C, false);
        SafeParcelWriter.v(parcel, 6, this.D, i2, false);
        SafeParcelWriter.v(parcel, 7, this.E, i2, false);
        SafeParcelWriter.z(parcel, 8, this.F, i2, false);
        SafeParcelWriter.z(parcel, 9, this.G, i2, false);
        SafeParcelWriter.v(parcel, 10, this.H, i2, false);
        SafeParcelWriter.v(parcel, 11, this.I, i2, false);
        SafeParcelWriter.z(parcel, 12, this.J, i2, false);
        SafeParcelWriter.b(parcel, a2);
    }
}
