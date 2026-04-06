package com.google.android.gms.pay;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Arrays;

public final class zzao extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzao> CREATOR = new zzap();

    /* renamed from: A  reason: collision with root package name */
    public Bitmap f27027A;

    /* renamed from: B  reason: collision with root package name */
    public Bitmap f27028B;
    public zzdd[] C;

    /* renamed from: z  reason: collision with root package name */
    public zzcz[] f27029z;

    public zzao(zzcz[] zzczArr, Bitmap bitmap, Bitmap bitmap2, zzdd[] zzddArr) {
        this.f27029z = zzczArr;
        this.f27027A = bitmap;
        this.f27028B = bitmap2;
        this.C = zzddArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzao) {
            zzao zzao = (zzao) obj;
            return Arrays.equals(this.f27029z, zzao.f27029z) && Objects.a(this.f27027A, zzao.f27027A) && Objects.a(this.f27028B, zzao.f27028B) && Arrays.equals(this.C, zzao.C);
        }
    }

    public final int hashCode() {
        return Objects.b(Integer.valueOf(Arrays.hashCode(this.f27029z)), this.f27027A, this.f27028B, Integer.valueOf(Arrays.hashCode(this.C)));
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.z(parcel, 1, this.f27029z, i2, false);
        SafeParcelWriter.v(parcel, 2, this.f27027A, i2, false);
        SafeParcelWriter.v(parcel, 3, this.f27028B, i2, false);
        SafeParcelWriter.z(parcel, 4, this.C, i2, false);
        SafeParcelWriter.b(parcel, a2);
    }
}
