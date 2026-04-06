package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzi extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzi> CREATOR = new zzj();

    /* renamed from: A  reason: collision with root package name */
    public zzcl f27099A;

    /* renamed from: B  reason: collision with root package name */
    public zzcf f27100B;

    /* renamed from: z  reason: collision with root package name */
    public zzk f27101z;

    public zzi(zzk zzk, zzcl zzcl, zzcf zzcf) {
        this.f27101z = zzk;
        this.f27099A = zzcl;
        this.f27100B = zzcf;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzi) {
            zzi zzi = (zzi) obj;
            return Objects.a(this.f27101z, zzi.f27101z) && Objects.a(this.f27099A, zzi.f27099A) && Objects.a(this.f27100B, zzi.f27100B);
        }
    }

    public final int hashCode() {
        return Objects.b(this.f27101z, this.f27099A, this.f27100B);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.v(parcel, 1, this.f27101z, i2, false);
        SafeParcelWriter.v(parcel, 2, this.f27099A, i2, false);
        SafeParcelWriter.v(parcel, 3, this.f27100B, i2, false);
        SafeParcelWriter.b(parcel, a2);
    }
}
