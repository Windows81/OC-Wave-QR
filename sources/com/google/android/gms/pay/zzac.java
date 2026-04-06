package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Arrays;

public final class zzac extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzac> CREATOR = new zzad();

    /* renamed from: A  reason: collision with root package name */
    public int f27018A;

    /* renamed from: z  reason: collision with root package name */
    public zzbt[] f27019z;

    public zzac(zzbt[] zzbtArr, int i2) {
        this.f27019z = zzbtArr;
        this.f27018A = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzac) {
            zzac zzac = (zzac) obj;
            return Arrays.equals(this.f27019z, zzac.f27019z) && Objects.a(Integer.valueOf(this.f27018A), Integer.valueOf(zzac.f27018A));
        }
    }

    public final int hashCode() {
        return Objects.b(Integer.valueOf(Arrays.hashCode(this.f27019z)), Integer.valueOf(this.f27018A));
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.z(parcel, 1, this.f27019z, i2, false);
        SafeParcelWriter.n(parcel, 2, this.f27018A);
        SafeParcelWriter.b(parcel, a2);
    }
}
