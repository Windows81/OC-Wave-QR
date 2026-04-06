package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.util.ArrayUtils;
import java.util.ArrayList;

public class CommonWalletObject extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CommonWalletObject> CREATOR = new zzc();

    /* renamed from: A  reason: collision with root package name */
    public String f27346A;

    /* renamed from: B  reason: collision with root package name */
    public String f27347B;
    public String C;
    public String D;
    public String E;
    public String F;
    public String G;
    public int H;
    public final ArrayList I;
    public TimeInterval J;
    public final ArrayList K;
    public String L;
    public String M;
    public final ArrayList N;
    public boolean O;
    public final ArrayList P;
    public final ArrayList Q;
    public final ArrayList R;

    /* renamed from: z  reason: collision with root package name */
    public String f27348z;

    public CommonWalletObject() {
        this.I = ArrayUtils.c();
        this.K = ArrayUtils.c();
        this.N = ArrayUtils.c();
        this.P = ArrayUtils.c();
        this.Q = ArrayUtils.c();
        this.R = ArrayUtils.c();
    }

    public static zzb H() {
        return new zzb(new CommonWalletObject(), (zza) null);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.w(parcel, 2, this.f27348z, false);
        SafeParcelWriter.w(parcel, 3, this.f27346A, false);
        SafeParcelWriter.w(parcel, 4, this.f27347B, false);
        SafeParcelWriter.w(parcel, 5, this.C, false);
        SafeParcelWriter.w(parcel, 6, this.D, false);
        SafeParcelWriter.w(parcel, 7, this.E, false);
        SafeParcelWriter.w(parcel, 8, this.F, false);
        SafeParcelWriter.w(parcel, 9, this.G, false);
        SafeParcelWriter.n(parcel, 10, this.H);
        SafeParcelWriter.A(parcel, 11, this.I, false);
        SafeParcelWriter.v(parcel, 12, this.J, i2, false);
        SafeParcelWriter.A(parcel, 13, this.K, false);
        SafeParcelWriter.w(parcel, 14, this.L, false);
        SafeParcelWriter.w(parcel, 15, this.M, false);
        SafeParcelWriter.A(parcel, 16, this.N, false);
        SafeParcelWriter.c(parcel, 17, this.O);
        SafeParcelWriter.A(parcel, 18, this.P, false);
        SafeParcelWriter.A(parcel, 19, this.Q, false);
        SafeParcelWriter.A(parcel, 20, this.R, false);
        SafeParcelWriter.b(parcel, a2);
    }

    public CommonWalletObject(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i2, ArrayList arrayList, TimeInterval timeInterval, ArrayList arrayList2, String str9, String str10, ArrayList arrayList3, boolean z2, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6) {
        this.f27348z = str;
        this.f27346A = str2;
        this.f27347B = str3;
        this.C = str4;
        this.D = str5;
        this.E = str6;
        this.F = str7;
        this.G = str8;
        this.H = i2;
        this.I = arrayList;
        this.J = timeInterval;
        this.K = arrayList2;
        this.L = str9;
        this.M = str10;
        this.N = arrayList3;
        this.O = z2;
        this.P = arrayList4;
        this.Q = arrayList5;
        this.R = arrayList6;
    }
}
