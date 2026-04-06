package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Arrays;

public final class zzct extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzct> CREATOR = new zzcu();

    /* renamed from: A  reason: collision with root package name */
    public byte[] f27080A;

    /* renamed from: z  reason: collision with root package name */
    public boolean f27081z;

    public zzct(boolean z2, byte[] bArr) {
        this.f27081z = z2;
        this.f27080A = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzct) {
            zzct zzct = (zzct) obj;
            return Objects.a(Boolean.valueOf(this.f27081z), Boolean.valueOf(zzct.f27081z)) && Arrays.equals(this.f27080A, zzct.f27080A);
        }
    }

    public final int hashCode() {
        return Objects.b(Boolean.valueOf(this.f27081z), Integer.valueOf(Arrays.hashCode(this.f27080A)));
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.c(parcel, 1, this.f27081z);
        SafeParcelWriter.g(parcel, 2, this.f27080A, false);
        SafeParcelWriter.b(parcel, a2);
    }
}
