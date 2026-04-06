package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public class StreetViewPanoramaOrientation extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StreetViewPanoramaOrientation> CREATOR = new zzq();

    /* renamed from: A  reason: collision with root package name */
    public final float f26048A;

    /* renamed from: z  reason: collision with root package name */
    public final float f26049z;

    public static final class Builder {

        /* renamed from: a  reason: collision with root package name */
        public float f26050a;

        /* renamed from: b  reason: collision with root package name */
        public float f26051b;

        public Builder a(float f2) {
            this.f26050a = f2;
            return this;
        }

        public StreetViewPanoramaOrientation b() {
            return new StreetViewPanoramaOrientation(this.f26051b, this.f26050a);
        }

        public Builder c(float f2) {
            this.f26051b = f2;
            return this;
        }
    }

    public StreetViewPanoramaOrientation(float f2, float f3) {
        boolean z2 = false;
        if (f2 >= -90.0f && f2 <= 90.0f) {
            z2 = true;
        }
        StringBuilder sb = new StringBuilder(62);
        sb.append("Tilt needs to be between -90 and 90 inclusive: ");
        sb.append(f2);
        Preconditions.b(z2, sb.toString());
        this.f26049z = f2 + 0.0f;
        this.f26048A = (((double) f3) <= 0.0d ? (f3 % 360.0f) + 360.0f : f3) % 360.0f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewPanoramaOrientation)) {
            return false;
        }
        StreetViewPanoramaOrientation streetViewPanoramaOrientation = (StreetViewPanoramaOrientation) obj;
        return Float.floatToIntBits(this.f26049z) == Float.floatToIntBits(streetViewPanoramaOrientation.f26049z) && Float.floatToIntBits(this.f26048A) == Float.floatToIntBits(streetViewPanoramaOrientation.f26048A);
    }

    public int hashCode() {
        return Objects.b(Float.valueOf(this.f26049z), Float.valueOf(this.f26048A));
    }

    public String toString() {
        return Objects.c(this).a("tilt", Float.valueOf(this.f26049z)).a("bearing", Float.valueOf(this.f26048A)).toString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.k(parcel, 2, this.f26049z);
        SafeParcelWriter.k(parcel, 3, this.f26048A);
        SafeParcelWriter.b(parcel, a2);
    }
}
