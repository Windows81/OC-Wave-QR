package com.google.android.gms.pay;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzbp extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbp> CREATOR = new zzbq();

    /* renamed from: A  reason: collision with root package name */
    public Bitmap f27050A;

    /* renamed from: z  reason: collision with root package name */
    public zzbr f27051z;

    public zzbp(zzbr zzbr, Bitmap bitmap) {
        this.f27051z = zzbr;
        this.f27050A = bitmap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzbp) {
            zzbp zzbp = (zzbp) obj;
            return Objects.a(this.f27051z, zzbp.f27051z) && Objects.a(this.f27050A, zzbp.f27050A);
        }
    }

    public final int hashCode() {
        return Objects.b(this.f27051z, this.f27050A);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.v(parcel, 1, this.f27051z, i2, false);
        SafeParcelWriter.v(parcel, 2, this.f27050A, i2, false);
        SafeParcelWriter.b(parcel, a2);
    }
}
