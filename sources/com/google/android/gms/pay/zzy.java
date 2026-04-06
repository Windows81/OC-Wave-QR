package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzy extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzy> CREATOR = new zzz();

    /* renamed from: z  reason: collision with root package name */
    public int f27136z;

    public zzy(int i2) {
        this.f27136z = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzy) {
            return Objects.a(Integer.valueOf(this.f27136z), Integer.valueOf(((zzy) obj).f27136z));
        }
        return false;
    }

    public final int hashCode() {
        return Objects.b(Integer.valueOf(this.f27136z));
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.n(parcel, 1, this.f27136z);
        SafeParcelWriter.b(parcel, a2);
    }

    public /* synthetic */ zzy(zzx zzx) {
    }
}
