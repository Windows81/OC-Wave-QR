package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzc> CREATOR = new zzd();

    /* renamed from: A  reason: collision with root package name */
    public String f27060A;

    /* renamed from: B  reason: collision with root package name */
    public boolean f27061B;
    public String C;

    /* renamed from: z  reason: collision with root package name */
    public int f27062z;

    public zzc(int i2, String str, boolean z2, String str2) {
        this.f27062z = i2;
        this.f27060A = str;
        this.f27061B = z2;
        this.C = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzc) {
            zzc zzc = (zzc) obj;
            return Objects.a(Integer.valueOf(this.f27062z), Integer.valueOf(zzc.f27062z)) && Objects.a(this.f27060A, zzc.f27060A) && Objects.a(Boolean.valueOf(this.f27061B), Boolean.valueOf(zzc.f27061B)) && Objects.a(this.C, zzc.C);
        }
    }

    public final int hashCode() {
        return Objects.b(Integer.valueOf(this.f27062z), this.f27060A, Boolean.valueOf(this.f27061B), this.C);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.n(parcel, 1, this.f27062z);
        SafeParcelWriter.w(parcel, 2, this.f27060A, false);
        SafeParcelWriter.c(parcel, 3, this.f27061B);
        SafeParcelWriter.w(parcel, 4, this.C, false);
        SafeParcelWriter.b(parcel, a2);
    }
}
