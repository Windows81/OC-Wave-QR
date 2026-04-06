package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class TransactionInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TransactionInfo> CREATOR = new zzao();

    /* renamed from: A  reason: collision with root package name */
    public String f27316A;

    /* renamed from: B  reason: collision with root package name */
    public String f27317B;

    /* renamed from: z  reason: collision with root package name */
    public int f27318z;

    public final class Builder {
    }

    public TransactionInfo(int i2, String str, String str2) {
        this.f27318z = i2;
        this.f27316A = str;
        this.f27317B = str2;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.n(parcel, 1, this.f27318z);
        SafeParcelWriter.w(parcel, 2, this.f27316A, false);
        SafeParcelWriter.w(parcel, 3, this.f27317B, false);
        SafeParcelWriter.b(parcel, a2);
    }
}
