package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.List;

public final class zzp extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzp> CREATOR = new zzo();

    /* renamed from: A  reason: collision with root package name */
    public final String f26975A;

    /* renamed from: B  reason: collision with root package name */
    public final String f26976B;
    public final String C;
    public final long D;
    public final long E;
    public final String F;
    public final boolean G;
    public final boolean H;
    public final long I;
    public final String J;
    public final long K;
    public final long L;
    public final int M;
    public final boolean N;
    public final boolean O;
    public final String P;
    public final Boolean Q;
    public final long R;
    public final List S;
    public final String T;
    public final String U;
    public final String V;
    public final String W;
    public final boolean X;
    public final long Y;
    public final int Z;
    public final String a0;
    public final int b0;
    public final long c0;
    public final String d0;
    public final String e0;

    /* renamed from: z  reason: collision with root package name */
    public final String f26977z;

    public zzp(String str, String str2, String str3, long j2, String str4, long j3, long j4, String str5, boolean z2, boolean z3, String str6, long j5, long j6, int i2, boolean z4, boolean z5, String str7, Boolean bool, long j7, List list, String str8, String str9, String str10, String str11, boolean z6, long j8, int i3, String str12, int i4, long j9, String str13, String str14) {
        Preconditions.g(str);
        this.f26977z = str;
        this.f26975A = TextUtils.isEmpty(str2) ? null : str2;
        this.f26976B = str3;
        this.I = j2;
        this.C = str4;
        this.D = j3;
        this.E = j4;
        this.F = str5;
        this.G = z2;
        this.H = z3;
        this.J = str6;
        this.K = j5;
        this.L = j6;
        this.M = i2;
        this.N = z4;
        this.O = z5;
        this.P = str7;
        this.Q = bool;
        this.R = j7;
        this.S = list;
        this.T = null;
        this.U = str9;
        this.V = str10;
        this.W = str11;
        this.X = z6;
        this.Y = j8;
        this.Z = i3;
        this.a0 = str12;
        this.b0 = i4;
        this.c0 = j9;
        this.d0 = str13;
        this.e0 = str14;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.w(parcel, 2, this.f26977z, false);
        SafeParcelWriter.w(parcel, 3, this.f26975A, false);
        SafeParcelWriter.w(parcel, 4, this.f26976B, false);
        SafeParcelWriter.w(parcel, 5, this.C, false);
        SafeParcelWriter.s(parcel, 6, this.D);
        SafeParcelWriter.s(parcel, 7, this.E);
        SafeParcelWriter.w(parcel, 8, this.F, false);
        SafeParcelWriter.c(parcel, 9, this.G);
        SafeParcelWriter.c(parcel, 10, this.H);
        SafeParcelWriter.s(parcel, 11, this.I);
        SafeParcelWriter.w(parcel, 12, this.J, false);
        SafeParcelWriter.s(parcel, 13, this.K);
        SafeParcelWriter.s(parcel, 14, this.L);
        SafeParcelWriter.n(parcel, 15, this.M);
        SafeParcelWriter.c(parcel, 16, this.N);
        SafeParcelWriter.c(parcel, 18, this.O);
        SafeParcelWriter.w(parcel, 19, this.P, false);
        SafeParcelWriter.d(parcel, 21, this.Q, false);
        SafeParcelWriter.s(parcel, 22, this.R);
        SafeParcelWriter.y(parcel, 23, this.S, false);
        SafeParcelWriter.w(parcel, 24, this.T, false);
        SafeParcelWriter.w(parcel, 25, this.U, false);
        SafeParcelWriter.w(parcel, 26, this.V, false);
        SafeParcelWriter.w(parcel, 27, this.W, false);
        SafeParcelWriter.c(parcel, 28, this.X);
        SafeParcelWriter.s(parcel, 29, this.Y);
        SafeParcelWriter.n(parcel, 30, this.Z);
        SafeParcelWriter.w(parcel, 31, this.a0, false);
        SafeParcelWriter.n(parcel, 32, this.b0);
        SafeParcelWriter.s(parcel, 34, this.c0);
        SafeParcelWriter.w(parcel, 35, this.d0, false);
        SafeParcelWriter.w(parcel, 36, this.e0, false);
        SafeParcelWriter.b(parcel, a2);
    }

    public zzp(String str, String str2, String str3, String str4, long j2, long j3, String str5, boolean z2, boolean z3, long j4, String str6, long j5, long j6, int i2, boolean z4, boolean z5, String str7, Boolean bool, long j7, List list, String str8, String str9, String str10, String str11, boolean z6, long j8, int i3, String str12, int i4, long j9, String str13, String str14) {
        this.f26977z = str;
        this.f26975A = str2;
        this.f26976B = str3;
        this.I = j4;
        this.C = str4;
        this.D = j2;
        this.E = j3;
        this.F = str5;
        this.G = z2;
        this.H = z3;
        this.J = str6;
        this.K = j5;
        this.L = j6;
        this.M = i2;
        this.N = z4;
        this.O = z5;
        this.P = str7;
        this.Q = bool;
        this.R = j7;
        this.S = list;
        this.T = str8;
        this.U = str9;
        this.V = str10;
        this.W = str11;
        this.X = z6;
        this.Y = j8;
        this.Z = i3;
        this.a0 = str12;
        this.b0 = i4;
        this.c0 = j9;
        this.d0 = str13;
        this.e0 = str14;
    }
}
