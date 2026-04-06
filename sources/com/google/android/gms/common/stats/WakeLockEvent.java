package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.List;

@Deprecated
public final class WakeLockEvent extends StatsEvent {
    public static final Parcelable.Creator<WakeLockEvent> CREATOR = new zza();

    /* renamed from: A  reason: collision with root package name */
    public final long f25107A;

    /* renamed from: B  reason: collision with root package name */
    public final int f25108B;
    public final String C;
    public final String D;
    public final String E;
    public final int F;
    public final List G;
    public final String H;
    public final long I;
    public final int J;
    public final String K;
    public final float L;
    public final long M;
    public final boolean N;

    /* renamed from: z  reason: collision with root package name */
    public final int f25109z;

    public WakeLockEvent(int i2, long j2, int i3, String str, int i4, List list, String str2, long j3, int i5, String str3, String str4, float f2, long j4, String str5, boolean z2) {
        this.f25109z = i2;
        this.f25107A = j2;
        this.f25108B = i3;
        this.C = str;
        this.D = str3;
        this.E = str5;
        this.F = i4;
        this.G = list;
        this.H = str2;
        this.I = j3;
        this.J = i5;
        this.K = str4;
        this.L = f2;
        this.M = j4;
        this.N = z2;
    }

    public final int H() {
        return this.f25108B;
    }

    public final long Q() {
        return this.f25107A;
    }

    public final String S() {
        List list = this.G;
        String str = "";
        String join = list == null ? str : TextUtils.join(",", list);
        int i2 = this.J;
        String str2 = this.D;
        String str3 = this.K;
        float f2 = this.L;
        String str4 = this.E;
        int i3 = this.F;
        String str5 = this.C;
        boolean z2 = this.N;
        StringBuilder sb = new StringBuilder();
        sb.append("\t");
        sb.append(str5);
        sb.append("\t");
        sb.append(i3);
        sb.append("\t");
        sb.append(join);
        sb.append("\t");
        sb.append(i2);
        sb.append("\t");
        if (str2 == null) {
            str2 = str;
        }
        sb.append(str2);
        sb.append("\t");
        if (str3 == null) {
            str3 = str;
        }
        sb.append(str3);
        sb.append("\t");
        sb.append(f2);
        sb.append("\t");
        if (str4 != null) {
            str = str4;
        }
        sb.append(str);
        sb.append("\t");
        sb.append(z2);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.n(parcel, 1, this.f25109z);
        SafeParcelWriter.s(parcel, 2, this.f25107A);
        SafeParcelWriter.w(parcel, 4, this.C, false);
        SafeParcelWriter.n(parcel, 5, this.F);
        SafeParcelWriter.y(parcel, 6, this.G, false);
        SafeParcelWriter.s(parcel, 8, this.I);
        SafeParcelWriter.w(parcel, 10, this.D, false);
        SafeParcelWriter.n(parcel, 11, this.f25108B);
        SafeParcelWriter.w(parcel, 12, this.H, false);
        SafeParcelWriter.w(parcel, 13, this.K, false);
        SafeParcelWriter.n(parcel, 14, this.J);
        SafeParcelWriter.k(parcel, 15, this.L);
        SafeParcelWriter.s(parcel, 16, this.M);
        SafeParcelWriter.w(parcel, 17, this.E, false);
        SafeParcelWriter.c(parcel, 18, this.N);
        SafeParcelWriter.b(parcel, a2);
    }
}
