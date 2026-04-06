package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzok extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzok> CREATOR = new zzon();

    /* renamed from: A  reason: collision with root package name */
    public final String f26959A;

    /* renamed from: B  reason: collision with root package name */
    public final long f26960B;
    public final Long C;
    public final String D;
    public final String E;
    public final Double F;

    /* renamed from: z  reason: collision with root package name */
    public final int f26961z;

    public zzok(zzom zzom) {
        this(zzom.f26964c, zzom.f26965d, zzom.f26966e, zzom.f26963b);
    }

    public final Object H() {
        Long l2 = this.C;
        if (l2 != null) {
            return l2;
        }
        Double d2 = this.F;
        if (d2 != null) {
            return d2;
        }
        String str = this.D;
        if (str != null) {
            return str;
        }
        return null;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.n(parcel, 1, this.f26961z);
        SafeParcelWriter.w(parcel, 2, this.f26959A, false);
        SafeParcelWriter.s(parcel, 3, this.f26960B);
        SafeParcelWriter.t(parcel, 4, this.C, false);
        SafeParcelWriter.l(parcel, 5, (Float) null, false);
        SafeParcelWriter.w(parcel, 6, this.D, false);
        SafeParcelWriter.w(parcel, 7, this.E, false);
        SafeParcelWriter.j(parcel, 8, this.F, false);
        SafeParcelWriter.b(parcel, a2);
    }

    public zzok(String str, long j2, Object obj, String str2) {
        Preconditions.g(str);
        this.f26961z = 2;
        this.f26959A = str;
        this.f26960B = j2;
        this.E = str2;
        if (obj == null) {
            this.C = null;
            this.F = null;
            this.D = null;
        } else if (obj instanceof Long) {
            this.C = (Long) obj;
            this.F = null;
            this.D = null;
        } else if (obj instanceof String) {
            this.C = null;
            this.F = null;
            this.D = (String) obj;
        } else if (obj instanceof Double) {
            this.C = null;
            this.F = (Double) obj;
            this.D = null;
        } else {
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }

    public zzok(int i2, String str, long j2, Long l2, Float f2, String str2, String str3, Double d2) {
        this.f26961z = i2;
        this.f26959A = str;
        this.f26960B = j2;
        this.C = l2;
        if (i2 == 1) {
            this.F = f2 != null ? Double.valueOf(f2.doubleValue()) : null;
        } else {
            this.F = d2;
        }
        this.D = str2;
        this.E = str3;
    }
}
