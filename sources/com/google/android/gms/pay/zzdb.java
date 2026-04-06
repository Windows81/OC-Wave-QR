package com.google.android.gms.pay;

import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Arrays;

public final class zzdb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdb> CREATOR = new zzdc();

    /* renamed from: A  reason: collision with root package name */
    public String f27090A;

    /* renamed from: B  reason: collision with root package name */
    public String f27091B;
    public PendingIntent C;
    public String D;
    public PendingIntent E;
    public Bitmap F;
    public Bitmap[] G;
    public zzc H;

    /* renamed from: z  reason: collision with root package name */
    public String f27092z;

    public zzdb(String str, String str2, String str3, PendingIntent pendingIntent, String str4, PendingIntent pendingIntent2, Bitmap bitmap, Bitmap[] bitmapArr, zzc zzc) {
        this.f27092z = str;
        this.f27090A = str2;
        this.f27091B = str3;
        this.C = pendingIntent;
        this.D = str4;
        this.E = pendingIntent2;
        this.F = bitmap;
        this.G = bitmapArr;
        this.H = zzc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzdb) {
            zzdb zzdb = (zzdb) obj;
            return Objects.a(this.f27092z, zzdb.f27092z) && Objects.a(this.f27090A, zzdb.f27090A) && Objects.a(this.f27091B, zzdb.f27091B) && Objects.a(this.C, zzdb.C) && Objects.a(this.D, zzdb.D) && Objects.a(this.E, zzdb.E) && Objects.a(this.F, zzdb.F) && Arrays.equals(this.G, zzdb.G) && Objects.a(this.H, zzdb.H);
        }
    }

    public final int hashCode() {
        return Objects.b(this.f27092z, this.f27090A, this.f27091B, this.C, this.D, this.E, this.F, Integer.valueOf(Arrays.hashCode(this.G)), this.H);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.w(parcel, 1, this.f27092z, false);
        SafeParcelWriter.w(parcel, 2, this.f27090A, false);
        SafeParcelWriter.w(parcel, 3, this.f27091B, false);
        SafeParcelWriter.v(parcel, 4, this.C, i2, false);
        SafeParcelWriter.w(parcel, 5, this.D, false);
        SafeParcelWriter.v(parcel, 6, this.E, i2, false);
        SafeParcelWriter.v(parcel, 7, this.F, i2, false);
        SafeParcelWriter.z(parcel, 8, this.G, i2, false);
        SafeParcelWriter.v(parcel, 9, this.H, i2, false);
        SafeParcelWriter.b(parcel, a2);
    }
}
