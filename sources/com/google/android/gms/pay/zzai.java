package com.google.android.gms.pay;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Arrays;

public final class zzai extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzai> CREATOR = new zzaj();

    /* renamed from: A  reason: collision with root package name */
    public PendingIntent f27022A;

    /* renamed from: B  reason: collision with root package name */
    public byte[][] f27023B;

    /* renamed from: z  reason: collision with root package name */
    public int f27024z;

    public zzai(int i2, PendingIntent pendingIntent, byte[][] bArr) {
        this.f27024z = i2;
        this.f27022A = pendingIntent;
        this.f27023B = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzai) {
            zzai zzai = (zzai) obj;
            return Objects.a(Integer.valueOf(this.f27024z), Integer.valueOf(zzai.f27024z)) && Objects.a(this.f27022A, zzai.f27022A) && Arrays.equals(this.f27023B, zzai.f27023B);
        }
    }

    public final int hashCode() {
        return Objects.b(Integer.valueOf(this.f27024z), this.f27022A, Integer.valueOf(Arrays.hashCode(this.f27023B)));
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.n(parcel, 1, this.f27024z);
        SafeParcelWriter.v(parcel, 2, this.f27022A, i2, false);
        SafeParcelWriter.h(parcel, 4, this.f27023B, false);
        SafeParcelWriter.b(parcel, a2);
    }
}
