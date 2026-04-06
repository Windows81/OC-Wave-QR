package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzch extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzch> CREATOR = new zzci();

    /* renamed from: A  reason: collision with root package name */
    public String f27069A;

    /* renamed from: B  reason: collision with root package name */
    public String f27070B;

    /* renamed from: z  reason: collision with root package name */
    public zzcj f27071z;

    public zzch(zzcj zzcj, String str, String str2) {
        this.f27071z = zzcj;
        this.f27069A = str;
        this.f27070B = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzch) {
            zzch zzch = (zzch) obj;
            return Objects.a(this.f27071z, zzch.f27071z) && Objects.a(this.f27069A, zzch.f27069A) && Objects.a(this.f27070B, zzch.f27070B);
        }
    }

    public final int hashCode() {
        return Objects.b(this.f27071z, this.f27069A, this.f27070B);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.v(parcel, 1, this.f27071z, i2, false);
        SafeParcelWriter.w(parcel, 2, this.f27069A, false);
        SafeParcelWriter.w(parcel, 3, this.f27070B, false);
        SafeParcelWriter.b(parcel, a2);
    }
}
