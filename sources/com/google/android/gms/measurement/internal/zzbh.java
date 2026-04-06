package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzbh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbh> CREATOR = new zzbg();

    /* renamed from: A  reason: collision with root package name */
    public final zzbc f26254A;

    /* renamed from: B  reason: collision with root package name */
    public final String f26255B;
    public final long C;

    /* renamed from: z  reason: collision with root package name */
    public final String f26256z;

    public zzbh(zzbh zzbh, long j2) {
        Preconditions.m(zzbh);
        this.f26256z = zzbh.f26256z;
        this.f26254A = zzbh.f26254A;
        this.f26255B = zzbh.f26255B;
        this.C = j2;
    }

    public final String toString() {
        String str = this.f26255B;
        String str2 = this.f26256z;
        String valueOf = String.valueOf(this.f26254A);
        return "origin=" + str + ",name=" + str2 + ",params=" + valueOf;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.w(parcel, 2, this.f26256z, false);
        SafeParcelWriter.v(parcel, 3, this.f26254A, i2, false);
        SafeParcelWriter.w(parcel, 4, this.f26255B, false);
        SafeParcelWriter.s(parcel, 5, this.C);
        SafeParcelWriter.b(parcel, a2);
    }

    public zzbh(String str, zzbc zzbc, String str2, long j2) {
        this.f26256z = str;
        this.f26254A = zzbc;
        this.f26255B = str2;
        this.C = j2;
    }
}
