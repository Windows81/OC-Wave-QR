package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.wallet.wobs.LoyaltyPoints;
import com.google.android.gms.wallet.wobs.TimeInterval;
import java.util.ArrayList;

public final class LoyaltyWalletObject extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LoyaltyWalletObject> CREATOR = new zzs();

    /* renamed from: A  reason: collision with root package name */
    public String f27277A;

    /* renamed from: B  reason: collision with root package name */
    public String f27278B;
    public String C;
    public String D;
    public String E;
    public String F;
    public String G;
    public String H;
    public String I;
    public int J;
    public final ArrayList K;
    public TimeInterval L;
    public final ArrayList M;
    public String N;
    public String O;
    public final ArrayList P;
    public boolean Q;
    public final ArrayList R;
    public final ArrayList S;
    public final ArrayList T;
    public LoyaltyPoints U;

    /* renamed from: z  reason: collision with root package name */
    public String f27279z;

    public final class Builder {
    }

    public LoyaltyWalletObject(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i2, ArrayList arrayList, TimeInterval timeInterval, ArrayList arrayList2, String str11, String str12, ArrayList arrayList3, boolean z2, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, LoyaltyPoints loyaltyPoints) {
        this.f27279z = str;
        this.f27277A = str2;
        this.f27278B = str3;
        this.C = str4;
        this.D = str5;
        this.E = str6;
        this.F = str7;
        this.G = str8;
        this.H = str9;
        this.I = str10;
        this.J = i2;
        this.K = arrayList;
        this.L = timeInterval;
        this.M = arrayList2;
        this.N = str11;
        this.O = str12;
        this.P = arrayList3;
        this.Q = z2;
        this.R = arrayList4;
        this.S = arrayList5;
        this.T = arrayList6;
        this.U = loyaltyPoints;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.w(parcel, 2, this.f27279z, false);
        SafeParcelWriter.w(parcel, 3, this.f27277A, false);
        SafeParcelWriter.w(parcel, 4, this.f27278B, false);
        SafeParcelWriter.w(parcel, 5, this.C, false);
        SafeParcelWriter.w(parcel, 6, this.D, false);
        SafeParcelWriter.w(parcel, 7, this.E, false);
        SafeParcelWriter.w(parcel, 8, this.F, false);
        SafeParcelWriter.w(parcel, 9, this.G, false);
        SafeParcelWriter.w(parcel, 10, this.H, false);
        SafeParcelWriter.w(parcel, 11, this.I, false);
        SafeParcelWriter.n(parcel, 12, this.J);
        SafeParcelWriter.A(parcel, 13, this.K, false);
        SafeParcelWriter.v(parcel, 14, this.L, i2, false);
        SafeParcelWriter.A(parcel, 15, this.M, false);
        SafeParcelWriter.w(parcel, 16, this.N, false);
        SafeParcelWriter.w(parcel, 17, this.O, false);
        SafeParcelWriter.A(parcel, 18, this.P, false);
        SafeParcelWriter.c(parcel, 19, this.Q);
        SafeParcelWriter.A(parcel, 20, this.R, false);
        SafeParcelWriter.A(parcel, 21, this.S, false);
        SafeParcelWriter.A(parcel, 22, this.T, false);
        SafeParcelWriter.v(parcel, 23, this.U, i2, false);
        SafeParcelWriter.b(parcel, a2);
    }
}
