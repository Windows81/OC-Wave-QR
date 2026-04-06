package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzg> CREATOR = new zzh();

    /* renamed from: A  reason: collision with root package name */
    public String f27097A;

    /* renamed from: z  reason: collision with root package name */
    public String f27098z;

    public /* synthetic */ zzg(zzf zzf) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzg) {
            zzg zzg = (zzg) obj;
            return Objects.a(this.f27098z, zzg.f27098z) && Objects.a(this.f27097A, zzg.f27097A);
        }
    }

    public final int hashCode() {
        return Objects.b(this.f27098z, this.f27097A);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.w(parcel, 1, this.f27098z, false);
        SafeParcelWriter.w(parcel, 2, this.f27097A, false);
        SafeParcelWriter.b(parcel, a2);
    }

    public zzg(String str, String str2) {
        this.f27098z = str;
        this.f27097A = str2;
    }
}
