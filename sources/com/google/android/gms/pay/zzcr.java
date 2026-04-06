package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzcr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcr> CREATOR = new zzcs();

    /* renamed from: z  reason: collision with root package name */
    public boolean f27079z;

    public zzcr(boolean z2) {
        this.f27079z = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzcr) {
            return Objects.a(Boolean.valueOf(this.f27079z), Boolean.valueOf(((zzcr) obj).f27079z));
        }
        return false;
    }

    public final int hashCode() {
        return Objects.b(Boolean.valueOf(this.f27079z));
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.c(parcel, 1, this.f27079z);
        SafeParcelWriter.b(parcel, a2);
    }
}
