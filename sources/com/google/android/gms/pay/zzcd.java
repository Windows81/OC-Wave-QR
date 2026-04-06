package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzcd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcd> CREATOR = new zzce();

    /* renamed from: A  reason: collision with root package name */
    public String f27064A;

    /* renamed from: z  reason: collision with root package name */
    public String f27065z;

    public /* synthetic */ zzcd(zzcc zzcc) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzcd) {
            zzcd zzcd = (zzcd) obj;
            return Objects.a(this.f27065z, zzcd.f27065z) && Objects.a(this.f27064A, zzcd.f27064A);
        }
    }

    public final int hashCode() {
        return Objects.b(this.f27065z, this.f27064A);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.w(parcel, 1, this.f27065z, false);
        SafeParcelWriter.w(parcel, 2, this.f27064A, false);
        SafeParcelWriter.b(parcel, a2);
    }

    public zzcd(String str, String str2) {
        this.f27065z = str;
        this.f27064A = str2;
    }
}
