package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

@Deprecated
public final class zza extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zza> CREATOR = new zzb();

    /* renamed from: A  reason: collision with root package name */
    public String f27370A;

    /* renamed from: B  reason: collision with root package name */
    public String f27371B;
    public String C;
    public String D;
    public String E;
    public String F;
    public String G;
    public String H;
    public boolean I;
    public String J;

    /* renamed from: z  reason: collision with root package name */
    public String f27372z;

    public zza(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z2, String str10) {
        this.f27372z = str;
        this.f27370A = str2;
        this.f27371B = str3;
        this.C = str4;
        this.D = str5;
        this.E = str6;
        this.F = str7;
        this.G = str8;
        this.H = str9;
        this.I = z2;
        this.J = str10;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.w(parcel, 2, this.f27372z, false);
        SafeParcelWriter.w(parcel, 3, this.f27370A, false);
        SafeParcelWriter.w(parcel, 4, this.f27371B, false);
        SafeParcelWriter.w(parcel, 5, this.C, false);
        SafeParcelWriter.w(parcel, 6, this.D, false);
        SafeParcelWriter.w(parcel, 7, this.E, false);
        SafeParcelWriter.w(parcel, 8, this.F, false);
        SafeParcelWriter.w(parcel, 9, this.G, false);
        SafeParcelWriter.w(parcel, 10, this.H, false);
        SafeParcelWriter.c(parcel, 11, this.I);
        SafeParcelWriter.w(parcel, 12, this.J, false);
        SafeParcelWriter.b(parcel, a2);
    }
}
