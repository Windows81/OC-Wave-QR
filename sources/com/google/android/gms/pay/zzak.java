package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzak extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzak> CREATOR = new zzal();

    /* renamed from: z  reason: collision with root package name */
    public zzcp f27025z;

    public zzak(zzcp zzcp) {
        this.f27025z = zzcp;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzak) {
            return Objects.a(this.f27025z, ((zzak) obj).f27025z);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.b(this.f27025z);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.v(parcel, 1, this.f27025z, i2, false);
        SafeParcelWriter.b(parcel, a2);
    }
}
