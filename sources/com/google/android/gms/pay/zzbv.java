package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Arrays;

public final class zzbv extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbv> CREATOR = new zzbw();

    /* renamed from: z  reason: collision with root package name */
    public byte[] f27057z;

    public zzbv(byte[] bArr) {
        this.f27057z = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzbv) {
            return Arrays.equals(this.f27057z, ((zzbv) obj).f27057z);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.b(Integer.valueOf(Arrays.hashCode(this.f27057z)));
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.g(parcel, 1, this.f27057z, false);
        SafeParcelWriter.b(parcel, a2);
    }
}
