package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzbc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbc> CREATOR = new zzbd();

    /* renamed from: z  reason: collision with root package name */
    public String f27038z;

    public /* synthetic */ zzbc(zzbb zzbb) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzbc) {
            return Objects.a(this.f27038z, ((zzbc) obj).f27038z);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.b(this.f27038z);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.w(parcel, 1, this.f27038z, false);
        SafeParcelWriter.b(parcel, a2);
    }

    public zzbc(String str) {
        this.f27038z = str;
    }
}
