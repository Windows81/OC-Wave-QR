package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public class StreetViewPanoramaLocation extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StreetViewPanoramaLocation> CREATOR = new zzp();

    /* renamed from: A  reason: collision with root package name */
    public final LatLng f26045A;

    /* renamed from: B  reason: collision with root package name */
    public final String f26046B;

    /* renamed from: z  reason: collision with root package name */
    public final StreetViewPanoramaLink[] f26047z;

    public StreetViewPanoramaLocation(StreetViewPanoramaLink[] streetViewPanoramaLinkArr, LatLng latLng, String str) {
        this.f26047z = streetViewPanoramaLinkArr;
        this.f26045A = latLng;
        this.f26046B = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewPanoramaLocation)) {
            return false;
        }
        StreetViewPanoramaLocation streetViewPanoramaLocation = (StreetViewPanoramaLocation) obj;
        return this.f26046B.equals(streetViewPanoramaLocation.f26046B) && this.f26045A.equals(streetViewPanoramaLocation.f26045A);
    }

    public int hashCode() {
        return Objects.b(this.f26045A, this.f26046B);
    }

    public String toString() {
        return Objects.c(this).a("panoId", this.f26046B).a("position", this.f26045A.toString()).toString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.z(parcel, 2, this.f26047z, i2, false);
        SafeParcelWriter.v(parcel, 3, this.f26045A, i2, false);
        SafeParcelWriter.w(parcel, 4, this.f26046B, false);
        SafeParcelWriter.b(parcel, a2);
    }
}
