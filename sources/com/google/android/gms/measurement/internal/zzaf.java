package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzaf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaf> CREATOR = new zzae();

    /* renamed from: A  reason: collision with root package name */
    public String f26174A;

    /* renamed from: B  reason: collision with root package name */
    public zzok f26175B;
    public long C;
    public boolean D;
    public String E;
    public zzbh F;
    public long G;
    public zzbh H;
    public long I;
    public zzbh J;

    /* renamed from: z  reason: collision with root package name */
    public String f26176z;

    public zzaf(zzaf zzaf) {
        Preconditions.m(zzaf);
        this.f26176z = zzaf.f26176z;
        this.f26174A = zzaf.f26174A;
        this.f26175B = zzaf.f26175B;
        this.C = zzaf.C;
        this.D = zzaf.D;
        this.E = zzaf.E;
        this.F = zzaf.F;
        this.G = zzaf.G;
        this.H = zzaf.H;
        this.I = zzaf.I;
        this.J = zzaf.J;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.w(parcel, 2, this.f26176z, false);
        SafeParcelWriter.w(parcel, 3, this.f26174A, false);
        SafeParcelWriter.v(parcel, 4, this.f26175B, i2, false);
        SafeParcelWriter.s(parcel, 5, this.C);
        SafeParcelWriter.c(parcel, 6, this.D);
        SafeParcelWriter.w(parcel, 7, this.E, false);
        SafeParcelWriter.v(parcel, 8, this.F, i2, false);
        SafeParcelWriter.s(parcel, 9, this.G);
        SafeParcelWriter.v(parcel, 10, this.H, i2, false);
        SafeParcelWriter.s(parcel, 11, this.I);
        SafeParcelWriter.v(parcel, 12, this.J, i2, false);
        SafeParcelWriter.b(parcel, a2);
    }

    public zzaf(String str, String str2, zzok zzok, long j2, boolean z2, String str3, zzbh zzbh, long j3, zzbh zzbh2, long j4, zzbh zzbh3) {
        this.f26176z = str;
        this.f26174A = str2;
        this.f26175B = zzok;
        this.C = j2;
        this.D = z2;
        this.E = str3;
        this.F = zzbh;
        this.G = j3;
        this.H = zzbh2;
        this.I = j4;
        this.J = zzbh3;
    }
}
