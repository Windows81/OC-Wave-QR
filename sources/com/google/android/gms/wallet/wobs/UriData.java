package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class UriData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<UriData> CREATOR = new zzm();

    /* renamed from: A  reason: collision with root package name */
    public String f27364A;

    /* renamed from: z  reason: collision with root package name */
    public String f27365z;

    public UriData(String str, String str2) {
        this.f27365z = str;
        this.f27364A = str2;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.w(parcel, 2, this.f27365z, false);
        SafeParcelWriter.w(parcel, 3, this.f27364A, false);
        SafeParcelWriter.b(parcel, a2);
    }
}
