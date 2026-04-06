package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Arrays;

public final class zzcl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcl> CREATOR = new zzcm();

    /* renamed from: z  reason: collision with root package name */
    public String[] f27073z;

    public zzcl(String[] strArr) {
        this.f27073z = strArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzcl) {
            return Arrays.equals(this.f27073z, ((zzcl) obj).f27073z);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.b(Integer.valueOf(Arrays.hashCode(this.f27073z)));
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.x(parcel, 1, this.f27073z, false);
        SafeParcelWriter.b(parcel, a2);
    }
}
