package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Arrays;

public final class zzcx extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcx> CREATOR = new zzcy();

    /* renamed from: A  reason: collision with root package name */
    public long f27085A;

    /* renamed from: z  reason: collision with root package name */
    public byte[] f27086z;

    public zzcx(byte[] bArr, long j2) {
        this.f27086z = bArr;
        this.f27085A = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzcx) {
            zzcx zzcx = (zzcx) obj;
            return Arrays.equals(this.f27086z, zzcx.f27086z) && Objects.a(Long.valueOf(this.f27085A), Long.valueOf(zzcx.f27085A));
        }
    }

    public final int hashCode() {
        return Objects.b(Integer.valueOf(Arrays.hashCode(this.f27086z)), Long.valueOf(this.f27085A));
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.g(parcel, 1, this.f27086z, false);
        SafeParcelWriter.s(parcel, 2, this.f27085A);
        SafeParcelWriter.b(parcel, a2);
    }
}
