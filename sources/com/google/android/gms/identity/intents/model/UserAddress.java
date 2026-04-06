package com.google.android.gms.identity.intents.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class UserAddress extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<UserAddress> CREATOR = new zzb();

    /* renamed from: A  reason: collision with root package name */
    public String f25250A;

    /* renamed from: B  reason: collision with root package name */
    public String f25251B;
    public String C;
    public String D;
    public String E;
    public String F;
    public String G;
    public String H;
    public String I;
    public String J;
    public String K;
    public boolean L;
    public String M;
    public String N;

    /* renamed from: z  reason: collision with root package name */
    public String f25252z;

    public UserAddress(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, boolean z2, String str13, String str14) {
        this.f25252z = str;
        this.f25250A = str2;
        this.f25251B = str3;
        this.C = str4;
        this.D = str5;
        this.E = str6;
        this.F = str7;
        this.G = str8;
        this.H = str9;
        this.I = str10;
        this.J = str11;
        this.K = str12;
        this.L = z2;
        this.M = str13;
        this.N = str14;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.w(parcel, 2, this.f25252z, false);
        SafeParcelWriter.w(parcel, 3, this.f25250A, false);
        SafeParcelWriter.w(parcel, 4, this.f25251B, false);
        SafeParcelWriter.w(parcel, 5, this.C, false);
        SafeParcelWriter.w(parcel, 6, this.D, false);
        SafeParcelWriter.w(parcel, 7, this.E, false);
        SafeParcelWriter.w(parcel, 8, this.F, false);
        SafeParcelWriter.w(parcel, 9, this.G, false);
        SafeParcelWriter.w(parcel, 10, this.H, false);
        SafeParcelWriter.w(parcel, 11, this.I, false);
        SafeParcelWriter.w(parcel, 12, this.J, false);
        SafeParcelWriter.w(parcel, 13, this.K, false);
        SafeParcelWriter.c(parcel, 14, this.L);
        SafeParcelWriter.w(parcel, 15, this.M, false);
        SafeParcelWriter.w(parcel, 16, this.N, false);
        SafeParcelWriter.b(parcel, a2);
    }
}
