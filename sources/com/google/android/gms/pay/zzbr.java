package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzbr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbr> CREATOR = new zzbs();

    /* renamed from: A  reason: collision with root package name */
    public String f27052A;

    /* renamed from: z  reason: collision with root package name */
    public int f27053z;

    public zzbr(int i2, String str) {
        this.f27053z = i2;
        this.f27052A = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzbr) {
            zzbr zzbr = (zzbr) obj;
            return Objects.a(Integer.valueOf(this.f27053z), Integer.valueOf(zzbr.f27053z)) && Objects.a(this.f27052A, zzbr.f27052A);
        }
    }

    public final int hashCode() {
        return Objects.b(Integer.valueOf(this.f27053z), this.f27052A);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.n(parcel, 1, this.f27053z);
        SafeParcelWriter.w(parcel, 2, this.f27052A, false);
        SafeParcelWriter.b(parcel, a2);
    }
}
