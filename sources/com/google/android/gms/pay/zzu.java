package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Arrays;

public final class zzu extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzu> CREATOR = new zzv();

    /* renamed from: z  reason: collision with root package name */
    public zzbg[] f27134z;

    public zzu(zzbg[] zzbgArr) {
        this.f27134z = zzbgArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzu) {
            return Arrays.equals(this.f27134z, ((zzu) obj).f27134z);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.b(Integer.valueOf(Arrays.hashCode(this.f27134z)));
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.z(parcel, 1, this.f27134z, i2, false);
        SafeParcelWriter.b(parcel, a2);
    }
}
