package com.google.android.gms.pay;

import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzbg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbg> CREATOR = new zzbh();

    /* renamed from: A  reason: collision with root package name */
    public String f27042A;

    /* renamed from: B  reason: collision with root package name */
    public String f27043B;
    public String C;
    public Bitmap D;
    public String E;
    public PendingIntent F;
    public String G;
    public Bitmap H;
    public final int I;

    /* renamed from: z  reason: collision with root package name */
    public zzbi f27044z;

    public zzbg(zzbi zzbi, String str, String str2, String str3, Bitmap bitmap, String str4, PendingIntent pendingIntent, String str5, Bitmap bitmap2, int i2) {
        this.f27044z = zzbi;
        this.f27042A = str;
        this.f27043B = str2;
        this.C = str3;
        this.D = bitmap;
        this.E = str4;
        this.F = pendingIntent;
        this.G = str5;
        this.H = bitmap2;
        this.I = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzbg) {
            zzbg zzbg = (zzbg) obj;
            return Objects.a(this.f27044z, zzbg.f27044z) && Objects.a(this.f27042A, zzbg.f27042A) && Objects.a(this.f27043B, zzbg.f27043B) && Objects.a(this.C, zzbg.C) && Objects.a(this.D, zzbg.D) && Objects.a(this.E, zzbg.E) && Objects.a(this.F, zzbg.F) && Objects.a(this.G, zzbg.G) && Objects.a(this.H, zzbg.H) && Objects.a(Integer.valueOf(this.I), Integer.valueOf(zzbg.I));
        }
    }

    public final int hashCode() {
        return Objects.b(this.f27044z, this.f27042A, this.f27043B, this.C, this.D, this.E, this.F, this.G, this.H, Integer.valueOf(this.I));
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.v(parcel, 1, this.f27044z, i2, false);
        SafeParcelWriter.w(parcel, 2, this.f27042A, false);
        SafeParcelWriter.w(parcel, 3, this.f27043B, false);
        SafeParcelWriter.w(parcel, 4, this.C, false);
        SafeParcelWriter.v(parcel, 5, this.D, i2, false);
        SafeParcelWriter.w(parcel, 6, this.E, false);
        SafeParcelWriter.v(parcel, 7, this.F, i2, false);
        SafeParcelWriter.w(parcel, 8, this.G, false);
        SafeParcelWriter.v(parcel, 9, this.H, i2, false);
        SafeParcelWriter.n(parcel, 10, this.I);
        SafeParcelWriter.b(parcel, a2);
    }
}
