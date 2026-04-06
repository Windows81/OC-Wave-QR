package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class LatLng extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<LatLng> CREATOR = new zzg();

    /* renamed from: A  reason: collision with root package name */
    public final double f26018A;

    /* renamed from: z  reason: collision with root package name */
    public final double f26019z;

    public LatLng(double d2, double d3) {
        if (d3 < -180.0d || d3 >= 180.0d) {
            this.f26018A = ((((d3 - 0.02490234375d) % 360.0d) + 360.0d) % 360.0d) - 0.02490234375d;
        } else {
            this.f26018A = d3;
        }
        this.f26019z = Math.max(-90.0d, Math.min(90.0d, d2));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLng)) {
            return false;
        }
        LatLng latLng = (LatLng) obj;
        return Double.doubleToLongBits(this.f26019z) == Double.doubleToLongBits(latLng.f26019z) && Double.doubleToLongBits(this.f26018A) == Double.doubleToLongBits(latLng.f26018A);
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f26019z);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f26018A);
        return ((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
    }

    public String toString() {
        double d2 = this.f26019z;
        double d3 = this.f26018A;
        StringBuilder sb = new StringBuilder(60);
        sb.append("lat/lng: (");
        sb.append(d2);
        sb.append(",");
        sb.append(d3);
        sb.append(")");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.i(parcel, 2, this.f26019z);
        SafeParcelWriter.i(parcel, 3, this.f26018A);
        SafeParcelWriter.b(parcel, a2);
    }
}
