package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzbz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbz> CREATOR = new zzca();

    /* renamed from: z  reason: collision with root package name */
    public String f27059z;

    public /* synthetic */ zzbz(zzby zzby) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzbz) {
            return Objects.a(this.f27059z, ((zzbz) obj).f27059z);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.b(this.f27059z);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.w(parcel, 1, this.f27059z, false);
        SafeParcelWriter.b(parcel, a2);
    }

    public zzbz(String str) {
        this.f27059z = str;
    }
}
