package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zza extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zza> CREATOR = new zzb();

    /* renamed from: A  reason: collision with root package name */
    public String f27014A;

    /* renamed from: B  reason: collision with root package name */
    public String f27015B;

    /* renamed from: z  reason: collision with root package name */
    public String f27016z;

    public zza(String str, String str2, String str3) {
        this.f27016z = str;
        this.f27014A = str2;
        this.f27015B = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zza) {
            zza zza = (zza) obj;
            return Objects.a(this.f27016z, zza.f27016z) && Objects.a(this.f27014A, zza.f27014A) && Objects.a(this.f27015B, zza.f27015B);
        }
    }

    public final int hashCode() {
        return Objects.b(this.f27016z, this.f27014A, this.f27015B);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.w(parcel, 1, this.f27016z, false);
        SafeParcelWriter.w(parcel, 2, this.f27014A, false);
        SafeParcelWriter.w(parcel, 3, this.f27015B, false);
        SafeParcelWriter.b(parcel, a2);
    }
}
