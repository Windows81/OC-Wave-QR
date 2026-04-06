package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public class Feature extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Feature> CREATOR = new zzc();

    /* renamed from: A  reason: collision with root package name */
    public final int f24382A;

    /* renamed from: B  reason: collision with root package name */
    public final long f24383B;

    /* renamed from: z  reason: collision with root package name */
    public final String f24384z;

    public Feature(String str, int i2, long j2) {
        this.f24384z = str;
        this.f24382A = i2;
        this.f24383B = j2;
    }

    public String H() {
        return this.f24384z;
    }

    public long Q() {
        long j2 = this.f24383B;
        return j2 == -1 ? (long) this.f24382A : j2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Feature) {
            Feature feature = (Feature) obj;
            return ((H() != null && H().equals(feature.H())) || (H() == null && feature.H() == null)) && Q() == feature.Q();
        }
    }

    public final int hashCode() {
        return Objects.b(H(), Long.valueOf(Q()));
    }

    public final String toString() {
        Objects.ToStringHelper c2 = Objects.c(this);
        c2.a("name", H());
        c2.a("version", Long.valueOf(Q()));
        return c2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.w(parcel, 1, H(), false);
        SafeParcelWriter.n(parcel, 2, this.f24382A);
        SafeParcelWriter.s(parcel, 3, Q());
        SafeParcelWriter.b(parcel, a2);
    }

    public Feature(String str, long j2) {
        this.f24384z = str;
        this.f24383B = j2;
        this.f24382A = -1;
    }
}
