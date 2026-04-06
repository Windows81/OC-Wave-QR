package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.identity.intents.model.UserAddress;

public final class FullWallet extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<FullWallet> CREATOR = new zzl();

    /* renamed from: A  reason: collision with root package name */
    public String f27264A;

    /* renamed from: B  reason: collision with root package name */
    public zzaj f27265B;
    public String C;
    public zza D;
    public zza E;
    public String[] F;
    public UserAddress G;
    public UserAddress H;
    public InstrumentInfo[] I;
    public PaymentMethodToken J;

    /* renamed from: z  reason: collision with root package name */
    public String f27266z;

    public FullWallet(String str, String str2, zzaj zzaj, String str3, zza zza, zza zza2, String[] strArr, UserAddress userAddress, UserAddress userAddress2, InstrumentInfo[] instrumentInfoArr, PaymentMethodToken paymentMethodToken) {
        this.f27266z = str;
        this.f27264A = str2;
        this.f27265B = zzaj;
        this.C = str3;
        this.D = zza;
        this.E = zza2;
        this.F = strArr;
        this.G = userAddress;
        this.H = userAddress2;
        this.I = instrumentInfoArr;
        this.J = paymentMethodToken;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.w(parcel, 2, this.f27266z, false);
        SafeParcelWriter.w(parcel, 3, this.f27264A, false);
        SafeParcelWriter.v(parcel, 4, this.f27265B, i2, false);
        SafeParcelWriter.w(parcel, 5, this.C, false);
        SafeParcelWriter.v(parcel, 6, this.D, i2, false);
        SafeParcelWriter.v(parcel, 7, this.E, i2, false);
        SafeParcelWriter.x(parcel, 8, this.F, false);
        SafeParcelWriter.v(parcel, 9, this.G, i2, false);
        SafeParcelWriter.v(parcel, 10, this.H, i2, false);
        SafeParcelWriter.z(parcel, 11, this.I, i2, false);
        SafeParcelWriter.v(parcel, 12, this.J, i2, false);
        SafeParcelWriter.b(parcel, a2);
    }
}
