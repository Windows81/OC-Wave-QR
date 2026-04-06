package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzay extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzay> CREATOR = new zzaz();

    /* renamed from: z  reason: collision with root package name */
    public String f27036z;

    public /* synthetic */ zzay(zzax zzax) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzay) {
            return Objects.a(this.f27036z, ((zzay) obj).f27036z);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.b(this.f27036z);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.w(parcel, 1, this.f27036z, false);
        SafeParcelWriter.b(parcel, a2);
    }

    public zzay(String str) {
        this.f27036z = str;
    }
}
