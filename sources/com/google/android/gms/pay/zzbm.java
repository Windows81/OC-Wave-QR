package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Arrays;

public final class zzbm extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbm> CREATOR = new zzbn();

    /* renamed from: A  reason: collision with root package name */
    public String f27046A;

    /* renamed from: B  reason: collision with root package name */
    public boolean f27047B;
    public byte[] C;
    public int D;

    /* renamed from: z  reason: collision with root package name */
    public String f27048z;

    public zzbm(String str, String str2, boolean z2, byte[] bArr, int i2) {
        this.f27048z = str;
        this.f27046A = str2;
        this.f27047B = z2;
        this.C = bArr;
        this.D = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzbm) {
            zzbm zzbm = (zzbm) obj;
            return Objects.a(this.f27048z, zzbm.f27048z) && Objects.a(this.f27046A, zzbm.f27046A) && Objects.a(Boolean.valueOf(this.f27047B), Boolean.valueOf(zzbm.f27047B)) && Arrays.equals(this.C, zzbm.C) && Objects.a(Integer.valueOf(this.D), Integer.valueOf(zzbm.D));
        }
    }

    public final int hashCode() {
        return Objects.b(this.f27048z, this.f27046A, Boolean.valueOf(this.f27047B), Integer.valueOf(Arrays.hashCode(this.C)), Integer.valueOf(this.D));
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.w(parcel, 1, this.f27048z, false);
        SafeParcelWriter.w(parcel, 2, this.f27046A, false);
        SafeParcelWriter.c(parcel, 3, this.f27047B);
        SafeParcelWriter.g(parcel, 4, this.C, false);
        SafeParcelWriter.n(parcel, 5, this.D);
        SafeParcelWriter.b(parcel, a2);
    }
}
