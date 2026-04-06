package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Arrays;

public final class zzaa extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaa> CREATOR = new zzab();

    /* renamed from: z  reason: collision with root package name */
    public zzbp[] f27017z;

    public zzaa(zzbp[] zzbpArr) {
        this.f27017z = zzbpArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzaa) {
            return Arrays.equals(this.f27017z, ((zzaa) obj).f27017z);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.b(Integer.valueOf(Arrays.hashCode(this.f27017z)));
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.z(parcel, 2, this.f27017z, i2, false);
        SafeParcelWriter.b(parcel, a2);
    }
}
