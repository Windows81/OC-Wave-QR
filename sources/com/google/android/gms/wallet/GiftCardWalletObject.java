package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.wallet.wobs.CommonWalletObject;

public final class GiftCardWalletObject extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GiftCardWalletObject> CREATOR = new zzn();

    /* renamed from: A  reason: collision with root package name */
    public String f27267A;

    /* renamed from: B  reason: collision with root package name */
    public String f27268B;
    public String C;
    public long D;
    public String E;
    public long F;
    public String G;

    /* renamed from: z  reason: collision with root package name */
    public CommonWalletObject f27269z;

    public final class Builder {
    }

    public GiftCardWalletObject(CommonWalletObject commonWalletObject, String str, String str2, String str3, long j2, String str4, long j3, String str5) {
        CommonWalletObject.H();
        this.f27269z = commonWalletObject;
        this.f27267A = str;
        this.f27268B = str2;
        this.D = j2;
        this.E = str4;
        this.F = j3;
        this.G = str5;
        this.C = str3;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.v(parcel, 2, this.f27269z, i2, false);
        SafeParcelWriter.w(parcel, 3, this.f27267A, false);
        SafeParcelWriter.w(parcel, 4, this.f27268B, false);
        SafeParcelWriter.w(parcel, 5, this.C, false);
        SafeParcelWriter.s(parcel, 6, this.D);
        SafeParcelWriter.w(parcel, 7, this.E, false);
        SafeParcelWriter.s(parcel, 8, this.F);
        SafeParcelWriter.w(parcel, 9, this.G, false);
        SafeParcelWriter.b(parcel, a2);
    }
}
