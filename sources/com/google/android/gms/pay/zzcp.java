package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Arrays;

public final class zzcp extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcp> CREATOR = new zzcq();

    /* renamed from: A  reason: collision with root package name */
    public zzcn[] f27077A;

    /* renamed from: z  reason: collision with root package name */
    public int f27078z;

    public zzcp(int i2, zzcn[] zzcnArr) {
        this.f27078z = i2;
        this.f27077A = zzcnArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzcp) {
            zzcp zzcp = (zzcp) obj;
            return Objects.a(Integer.valueOf(this.f27078z), Integer.valueOf(zzcp.f27078z)) && Arrays.equals(this.f27077A, zzcp.f27077A);
        }
    }

    public final int hashCode() {
        return Objects.b(Integer.valueOf(this.f27078z), Integer.valueOf(Arrays.hashCode(this.f27077A)));
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.n(parcel, 1, this.f27078z);
        SafeParcelWriter.z(parcel, 2, this.f27077A, i2, false);
        SafeParcelWriter.b(parcel, a2);
    }
}
