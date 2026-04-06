package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class LabelValue extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LabelValue> CREATOR = new zzd();

    /* renamed from: A  reason: collision with root package name */
    public String f27349A;

    /* renamed from: z  reason: collision with root package name */
    public String f27350z;

    public LabelValue(String str, String str2) {
        this.f27350z = str;
        this.f27349A = str2;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.w(parcel, 2, this.f27350z, false);
        SafeParcelWriter.w(parcel, 3, this.f27349A, false);
        SafeParcelWriter.b(parcel, a2);
    }
}
