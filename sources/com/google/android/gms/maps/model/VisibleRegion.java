package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class VisibleRegion extends AbstractSafeParcelable {
    public static final Parcelable.Creator<VisibleRegion> CREATOR = new zzw();

    /* renamed from: A  reason: collision with root package name */
    public final LatLng f26065A;

    /* renamed from: B  reason: collision with root package name */
    public final LatLng f26066B;
    public final LatLng C;
    public final LatLngBounds D;

    /* renamed from: z  reason: collision with root package name */
    public final LatLng f26067z;

    public VisibleRegion(LatLng latLng, LatLng latLng2, LatLng latLng3, LatLng latLng4, LatLngBounds latLngBounds) {
        this.f26067z = latLng;
        this.f26065A = latLng2;
        this.f26066B = latLng3;
        this.C = latLng4;
        this.D = latLngBounds;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VisibleRegion)) {
            return false;
        }
        VisibleRegion visibleRegion = (VisibleRegion) obj;
        return this.f26067z.equals(visibleRegion.f26067z) && this.f26065A.equals(visibleRegion.f26065A) && this.f26066B.equals(visibleRegion.f26066B) && this.C.equals(visibleRegion.C) && this.D.equals(visibleRegion.D);
    }

    public int hashCode() {
        return Objects.b(this.f26067z, this.f26065A, this.f26066B, this.C, this.D);
    }

    public String toString() {
        return Objects.c(this).a("nearLeft", this.f26067z).a("nearRight", this.f26065A).a("farLeft", this.f26066B).a("farRight", this.C).a("latLngBounds", this.D).toString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.v(parcel, 2, this.f26067z, i2, false);
        SafeParcelWriter.v(parcel, 3, this.f26065A, i2, false);
        SafeParcelWriter.v(parcel, 4, this.f26066B, i2, false);
        SafeParcelWriter.v(parcel, 5, this.C, i2, false);
        SafeParcelWriter.v(parcel, 6, this.D, i2, false);
        SafeParcelWriter.b(parcel, a2);
    }
}
