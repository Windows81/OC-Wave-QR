package com.google.android.gms.pay;

import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzbt extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbt> CREATOR = new zzbu();

    /* renamed from: A  reason: collision with root package name */
    public String f27054A;

    /* renamed from: B  reason: collision with root package name */
    public Bitmap f27055B;
    public String C;
    public String D;
    public String E;
    public Bitmap F;
    public PendingIntent G;
    public int H;

    /* renamed from: z  reason: collision with root package name */
    public int f27056z;

    public zzbt(int i2, String str, Bitmap bitmap, String str2, String str3, String str4, Bitmap bitmap2, PendingIntent pendingIntent, int i3) {
        this.f27056z = i2;
        this.f27054A = str;
        this.f27055B = bitmap;
        this.C = str2;
        this.D = str3;
        this.E = str4;
        this.F = bitmap2;
        this.G = pendingIntent;
        this.H = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzbt) {
            zzbt zzbt = (zzbt) obj;
            return Objects.a(Integer.valueOf(this.f27056z), Integer.valueOf(zzbt.f27056z)) && Objects.a(this.f27054A, zzbt.f27054A) && Objects.a(this.f27055B, zzbt.f27055B) && Objects.a(this.C, zzbt.C) && Objects.a(this.D, zzbt.D) && Objects.a(this.E, zzbt.E) && Objects.a(this.F, zzbt.F) && Objects.a(this.G, zzbt.G) && Objects.a(Integer.valueOf(this.H), Integer.valueOf(zzbt.H));
        }
    }

    public final int hashCode() {
        return Objects.b(Integer.valueOf(this.f27056z), this.f27054A, this.f27055B, this.C, this.D, this.E, this.F, this.G, Integer.valueOf(this.H));
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.n(parcel, 1, this.f27056z);
        SafeParcelWriter.w(parcel, 2, this.f27054A, false);
        SafeParcelWriter.v(parcel, 3, this.f27055B, i2, false);
        SafeParcelWriter.w(parcel, 4, this.C, false);
        SafeParcelWriter.w(parcel, 5, this.D, false);
        SafeParcelWriter.v(parcel, 6, this.F, i2, false);
        SafeParcelWriter.v(parcel, 7, this.G, i2, false);
        SafeParcelWriter.w(parcel, 8, this.E, false);
        SafeParcelWriter.n(parcel, 9, this.H);
        SafeParcelWriter.b(parcel, a2);
    }
}
