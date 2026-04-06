package com.google.android.gms.wallet.button;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzc> CREATOR = new zzd();

    /* renamed from: A  reason: collision with root package name */
    public int f27339A;

    /* renamed from: B  reason: collision with root package name */
    public boolean f27340B;
    public String C;
    public String D;
    public String E;
    public String F;
    public String G;
    public String H;

    /* renamed from: z  reason: collision with root package name */
    public String f27341z;

    public zzc(String str, int i2, boolean z2, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f27341z = str;
        this.f27339A = i2;
        this.f27340B = z2;
        this.C = str2;
        this.D = str3;
        this.E = str4;
        this.F = str5;
        this.G = str6;
        this.H = str7;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.w(parcel, 1, this.f27341z, false);
        SafeParcelWriter.n(parcel, 2, this.f27339A);
        SafeParcelWriter.c(parcel, 3, this.f27340B);
        SafeParcelWriter.w(parcel, 4, this.C, false);
        SafeParcelWriter.w(parcel, 5, this.D, false);
        SafeParcelWriter.w(parcel, 6, this.E, false);
        SafeParcelWriter.w(parcel, 7, this.F, false);
        SafeParcelWriter.w(parcel, 8, this.G, false);
        SafeParcelWriter.w(parcel, 9, this.H, false);
        SafeParcelWriter.b(parcel, a2);
    }
}
