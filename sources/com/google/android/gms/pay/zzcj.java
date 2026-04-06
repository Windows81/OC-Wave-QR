package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzcj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcj> CREATOR = new zzck();

    /* renamed from: z  reason: collision with root package name */
    public int f27072z;

    public zzcj(int i2) {
        this.f27072z = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzcj) {
            return Objects.a(Integer.valueOf(this.f27072z), Integer.valueOf(((zzcj) obj).f27072z));
        }
        return false;
    }

    public final int hashCode() {
        return Objects.b(Integer.valueOf(this.f27072z));
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.n(parcel, 1, this.f27072z);
        SafeParcelWriter.b(parcel, a2);
    }
}
