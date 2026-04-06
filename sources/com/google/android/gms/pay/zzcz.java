package com.google.android.gms.pay;

import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzcz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcz> CREATOR = new zzda();

    /* renamed from: A  reason: collision with root package name */
    public String f27087A;

    /* renamed from: B  reason: collision with root package name */
    public Bitmap f27088B;
    public Bitmap C;
    public String D;
    public String E;
    public PendingIntent F;
    public zzdb G;

    /* renamed from: z  reason: collision with root package name */
    public int f27089z;

    public zzcz(int i2, String str, Bitmap bitmap, Bitmap bitmap2, String str2, String str3, PendingIntent pendingIntent, zzdb zzdb) {
        this.f27089z = i2;
        this.f27087A = str;
        this.f27088B = bitmap;
        this.C = bitmap2;
        this.D = str2;
        this.E = str3;
        this.F = pendingIntent;
        this.G = zzdb;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzcz) {
            zzcz zzcz = (zzcz) obj;
            return Objects.a(Integer.valueOf(this.f27089z), Integer.valueOf(zzcz.f27089z)) && Objects.a(this.f27087A, zzcz.f27087A) && Objects.a(this.f27088B, zzcz.f27088B) && Objects.a(this.C, zzcz.C) && Objects.a(this.D, zzcz.D) && Objects.a(this.E, zzcz.E) && Objects.a(this.F, zzcz.F) && Objects.a(this.G, zzcz.G);
        }
    }

    public final int hashCode() {
        return Objects.b(Integer.valueOf(this.f27089z), this.f27087A, this.f27088B, this.C, this.D, this.E, this.F, this.G);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.n(parcel, 1, this.f27089z);
        SafeParcelWriter.w(parcel, 2, this.f27087A, false);
        SafeParcelWriter.v(parcel, 3, this.f27088B, i2, false);
        SafeParcelWriter.v(parcel, 4, this.C, i2, false);
        SafeParcelWriter.w(parcel, 5, this.D, false);
        SafeParcelWriter.w(parcel, 6, this.E, false);
        SafeParcelWriter.v(parcel, 7, this.F, i2, false);
        SafeParcelWriter.v(parcel, 8, this.G, i2, false);
        SafeParcelWriter.b(parcel, a2);
    }
}
