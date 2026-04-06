package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public class StreetViewPanoramaLink extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StreetViewPanoramaLink> CREATOR = new zzo();

    /* renamed from: A  reason: collision with root package name */
    public final float f26043A;

    /* renamed from: z  reason: collision with root package name */
    public final String f26044z;

    public StreetViewPanoramaLink(String str, float f2) {
        this.f26044z = str;
        this.f26043A = (((double) f2) <= 0.0d ? (f2 % 360.0f) + 360.0f : f2) % 360.0f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewPanoramaLink)) {
            return false;
        }
        StreetViewPanoramaLink streetViewPanoramaLink = (StreetViewPanoramaLink) obj;
        return this.f26044z.equals(streetViewPanoramaLink.f26044z) && Float.floatToIntBits(this.f26043A) == Float.floatToIntBits(streetViewPanoramaLink.f26043A);
    }

    public int hashCode() {
        return Objects.b(this.f26044z, Float.valueOf(this.f26043A));
    }

    public String toString() {
        return Objects.c(this).a("panoId", this.f26044z).a("bearing", Float.valueOf(this.f26043A)).toString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.w(parcel, 2, this.f26044z, false);
        SafeParcelWriter.k(parcel, 3, this.f26043A);
        SafeParcelWriter.b(parcel, a2);
    }
}
