package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzdd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdd> CREATOR = new zzde();

    /* renamed from: A  reason: collision with root package name */
    public boolean f27093A;

    /* renamed from: B  reason: collision with root package name */
    public String f27094B;
    public String C;
    public zzcv D;
    public zzbe E;

    /* renamed from: z  reason: collision with root package name */
    public int f27095z;

    public zzdd(int i2, boolean z2, String str, String str2, zzcv zzcv, zzbe zzbe) {
        this.f27095z = i2;
        this.f27093A = z2;
        this.f27094B = str;
        this.C = str2;
        this.D = zzcv;
        this.E = zzbe;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzdd) {
            zzdd zzdd = (zzdd) obj;
            return Objects.a(Integer.valueOf(this.f27095z), Integer.valueOf(zzdd.f27095z)) && Objects.a(Boolean.valueOf(this.f27093A), Boolean.valueOf(zzdd.f27093A)) && Objects.a(this.f27094B, zzdd.f27094B) && Objects.a(this.C, zzdd.C) && Objects.a(this.D, zzdd.D) && Objects.a(this.E, zzdd.E);
        }
    }

    public final int hashCode() {
        return Objects.b(Integer.valueOf(this.f27095z), Boolean.valueOf(this.f27093A), this.f27094B, this.C, this.D, this.E);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.n(parcel, 1, this.f27095z);
        SafeParcelWriter.c(parcel, 2, this.f27093A);
        SafeParcelWriter.w(parcel, 3, this.f27094B, false);
        SafeParcelWriter.w(parcel, 4, this.C, false);
        SafeParcelWriter.v(parcel, 5, this.D, i2, false);
        SafeParcelWriter.v(parcel, 6, this.E, i2, false);
        SafeParcelWriter.b(parcel, a2);
    }
}
