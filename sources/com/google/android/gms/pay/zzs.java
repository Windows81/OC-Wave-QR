package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzs> CREATOR = new zzt();

    /* renamed from: z  reason: collision with root package name */
    public long f27133z;

    public zzs(long j2) {
        this.f27133z = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzs) {
            return Objects.a(Long.valueOf(this.f27133z), Long.valueOf(((zzs) obj).f27133z));
        }
        return false;
    }

    public final int hashCode() {
        return Objects.b(Long.valueOf(this.f27133z));
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.s(parcel, 1, this.f27133z);
        SafeParcelWriter.b(parcel, a2);
    }
}
