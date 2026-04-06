package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzag extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzag> CREATOR = new zzah();

    /* renamed from: A  reason: collision with root package name */
    public int f27020A;

    /* renamed from: z  reason: collision with root package name */
    public String f27021z;

    public zzag(String str, int i2) {
        this.f27021z = str;
        this.f27020A = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzag) {
            zzag zzag = (zzag) obj;
            return Objects.a(this.f27021z, zzag.f27021z) && Objects.a(Integer.valueOf(this.f27020A), Integer.valueOf(zzag.f27020A));
        }
    }

    public final int hashCode() {
        return Objects.b(this.f27021z, Integer.valueOf(this.f27020A));
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.w(parcel, 2, this.f27021z, false);
        SafeParcelWriter.n(parcel, 3, this.f27020A);
        SafeParcelWriter.b(parcel, a2);
    }
}
