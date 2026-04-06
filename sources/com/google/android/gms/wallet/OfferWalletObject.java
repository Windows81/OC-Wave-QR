package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.wallet.wobs.CommonWalletObject;
import com.google.android.gms.wallet.wobs.zzb;

public final class OfferWalletObject extends AbstractSafeParcelable {
    public static final Parcelable.Creator<OfferWalletObject> CREATOR = new zzv();

    /* renamed from: A  reason: collision with root package name */
    public String f27283A;

    /* renamed from: B  reason: collision with root package name */
    public String f27284B;
    public CommonWalletObject C;

    /* renamed from: z  reason: collision with root package name */
    public final int f27285z;

    public final class Builder {
    }

    public OfferWalletObject(int i2, String str, String str2, CommonWalletObject commonWalletObject) {
        this.f27285z = i2;
        this.f27284B = str2;
        if (i2 < 3) {
            zzb H = CommonWalletObject.H();
            H.a(str);
            this.C = H.b();
            return;
        }
        this.C = commonWalletObject;
    }

    public int H() {
        return this.f27285z;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.n(parcel, 1, H());
        SafeParcelWriter.w(parcel, 2, this.f27283A, false);
        SafeParcelWriter.w(parcel, 3, this.f27284B, false);
        SafeParcelWriter.v(parcel, 4, this.C, i2, false);
        SafeParcelWriter.b(parcel, a2);
    }
}
