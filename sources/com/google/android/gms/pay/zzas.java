package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzas extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzas> CREATOR = new zzat();

    /* renamed from: A  reason: collision with root package name */
    public String f27032A;

    /* renamed from: z  reason: collision with root package name */
    public String f27033z;

    public zzas(String str, String str2) {
        this.f27033z = str;
        this.f27032A = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzas) {
            zzas zzas = (zzas) obj;
            return Objects.a(this.f27033z, zzas.f27033z) && Objects.a(this.f27032A, zzas.f27032A);
        }
    }

    public final int hashCode() {
        return Objects.b(this.f27033z, this.f27032A);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.w(parcel, 1, this.f27033z, false);
        SafeParcelWriter.w(parcel, 2, this.f27032A, false);
        SafeParcelWriter.b(parcel, a2);
    }
}
