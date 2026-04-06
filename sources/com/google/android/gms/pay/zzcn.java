package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzcn extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcn> CREATOR = new zzco();

    /* renamed from: A  reason: collision with root package name */
    public long f27074A;

    /* renamed from: B  reason: collision with root package name */
    public String f27075B;

    /* renamed from: z  reason: collision with root package name */
    public String f27076z;

    public zzcn(String str, long j2, String str2) {
        this.f27076z = str;
        this.f27074A = j2;
        this.f27075B = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzcn) {
            zzcn zzcn = (zzcn) obj;
            return Objects.a(this.f27076z, zzcn.f27076z) && Objects.a(Long.valueOf(this.f27074A), Long.valueOf(zzcn.f27074A)) && Objects.a(this.f27075B, zzcn.f27075B);
        }
    }

    public final int hashCode() {
        return Objects.b(this.f27076z, Long.valueOf(this.f27074A), this.f27075B);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.w(parcel, 1, this.f27076z, false);
        SafeParcelWriter.s(parcel, 2, this.f27074A);
        SafeParcelWriter.w(parcel, 3, this.f27075B, false);
        SafeParcelWriter.b(parcel, a2);
    }
}
