package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zznk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zznk> CREATOR = new zznn();

    /* renamed from: A  reason: collision with root package name */
    public final long f26880A;

    /* renamed from: B  reason: collision with root package name */
    public final int f26881B;

    /* renamed from: z  reason: collision with root package name */
    public final String f26882z;

    public zznk(String str, long j2, int i2) {
        this.f26882z = str;
        this.f26880A = j2;
        this.f26881B = i2;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.w(parcel, 1, this.f26882z, false);
        SafeParcelWriter.s(parcel, 2, this.f26880A);
        SafeParcelWriter.n(parcel, 3, this.f26881B);
        SafeParcelWriter.b(parcel, a2);
    }
}
