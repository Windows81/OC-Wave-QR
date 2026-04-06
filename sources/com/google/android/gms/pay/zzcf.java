package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzcf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcf> CREATOR = new zzcg();

    /* renamed from: A  reason: collision with root package name */
    public zzas f27066A;

    /* renamed from: B  reason: collision with root package name */
    public zzch f27067B;

    /* renamed from: z  reason: collision with root package name */
    public int f27068z;

    public zzcf(int i2, zzas zzas, zzch zzch) {
        this.f27068z = i2;
        this.f27066A = zzas;
        this.f27067B = zzch;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzcf) {
            zzcf zzcf = (zzcf) obj;
            return Objects.a(Integer.valueOf(this.f27068z), Integer.valueOf(zzcf.f27068z)) && Objects.a(this.f27066A, zzcf.f27066A) && Objects.a(this.f27067B, zzcf.f27067B);
        }
    }

    public final int hashCode() {
        return Objects.b(Integer.valueOf(this.f27068z), this.f27066A, this.f27067B);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.n(parcel, 1, this.f27068z);
        SafeParcelWriter.v(parcel, 2, this.f27066A, i2, false);
        SafeParcelWriter.v(parcel, 3, this.f27067B, i2, false);
        SafeParcelWriter.b(parcel, a2);
    }
}
