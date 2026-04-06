package com.google.android.gms.wallet;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzau extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzau> CREATOR = new zzav();

    /* renamed from: A  reason: collision with root package name */
    public Bundle f27380A;

    /* renamed from: z  reason: collision with root package name */
    public String f27381z;

    public zzau(String str, Bundle bundle) {
        this.f27381z = str;
        this.f27380A = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.w(parcel, 2, this.f27381z, false);
        SafeParcelWriter.e(parcel, 3, this.f27380A, false);
        SafeParcelWriter.b(parcel, a2);
    }
}
