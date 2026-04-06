package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Arrays;

public final class zzaq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaq> CREATOR = new zzar();

    /* renamed from: A  reason: collision with root package name */
    public int[] f27030A;

    /* renamed from: z  reason: collision with root package name */
    public boolean f27031z;

    public zzaq(boolean z2, int[] iArr) {
        this.f27031z = z2;
        this.f27030A = iArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzaq) {
            zzaq zzaq = (zzaq) obj;
            return Objects.a(Boolean.valueOf(this.f27031z), Boolean.valueOf(zzaq.f27031z)) && Arrays.equals(this.f27030A, zzaq.f27030A);
        }
    }

    public final int hashCode() {
        return Objects.b(Boolean.valueOf(this.f27031z), Integer.valueOf(Arrays.hashCode(this.f27030A)));
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.c(parcel, 1, this.f27031z);
        SafeParcelWriter.o(parcel, 2, this.f27030A, false);
        SafeParcelWriter.b(parcel, a2);
    }
}
