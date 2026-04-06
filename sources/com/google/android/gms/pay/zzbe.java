package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzbe extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbe> CREATOR = new zzbf();

    /* renamed from: A  reason: collision with root package name */
    public String f27039A;

    /* renamed from: B  reason: collision with root package name */
    public String f27040B;
    public zzc C;

    /* renamed from: z  reason: collision with root package name */
    public String f27041z;

    public zzbe(String str, String str2, String str3, zzc zzc) {
        this.f27041z = str;
        this.f27039A = str2;
        this.f27040B = str3;
        this.C = zzc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzbe) {
            zzbe zzbe = (zzbe) obj;
            return Objects.a(this.f27041z, zzbe.f27041z) && Objects.a(this.f27039A, zzbe.f27039A) && Objects.a(this.f27040B, zzbe.f27040B) && Objects.a(this.C, zzbe.C);
        }
    }

    public final int hashCode() {
        return Objects.b(this.f27041z, this.f27039A, this.f27040B, this.C);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.w(parcel, 1, this.f27041z, false);
        SafeParcelWriter.w(parcel, 2, this.f27039A, false);
        SafeParcelWriter.w(parcel, 3, this.f27040B, false);
        SafeParcelWriter.v(parcel, 4, this.C, i2, false);
        SafeParcelWriter.b(parcel, a2);
    }
}
