package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.zat;

public final class zai extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zai> CREATOR = new zaj();

    /* renamed from: A  reason: collision with root package name */
    public final zat f27151A;

    /* renamed from: z  reason: collision with root package name */
    public final int f27152z;

    public zai(int i2, zat zat) {
        this.f27152z = i2;
        this.f27151A = zat;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.n(parcel, 1, this.f27152z);
        SafeParcelWriter.v(parcel, 2, this.f27151A, i2, false);
        SafeParcelWriter.b(parcel, a2);
    }
}
