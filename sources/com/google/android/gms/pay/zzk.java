package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzk> CREATOR = new zzl();

    /* renamed from: z  reason: collision with root package name */
    public int f27102z;

    public zzk(int i2) {
        this.f27102z = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzk) {
            return Objects.a(Integer.valueOf(this.f27102z), Integer.valueOf(((zzk) obj).f27102z));
        }
        return false;
    }

    public final int hashCode() {
        return Objects.b(Integer.valueOf(this.f27102z));
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.n(parcel, 1, this.f27102z);
        SafeParcelWriter.b(parcel, a2);
    }
}
