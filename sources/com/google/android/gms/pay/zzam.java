package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Arrays;

public final class zzam extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzam> CREATOR = new zzan();

    /* renamed from: z  reason: collision with root package name */
    public zzcx[] f27026z;

    public zzam(zzcx[] zzcxArr) {
        this.f27026z = zzcxArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzam) {
            return Arrays.equals(this.f27026z, ((zzam) obj).f27026z);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.b(Integer.valueOf(Arrays.hashCode(this.f27026z)));
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.z(parcel, 1, this.f27026z, i2, false);
        SafeParcelWriter.b(parcel, a2);
    }
}
