package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class LatLngBounds extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<LatLngBounds> CREATOR = new zzf();

    /* renamed from: A  reason: collision with root package name */
    public final LatLng f26020A;

    /* renamed from: z  reason: collision with root package name */
    public final LatLng f26021z;

    public static final class Builder {
    }

    public LatLngBounds(LatLng latLng, LatLng latLng2) {
        Preconditions.n(latLng, "southwest must not be null.");
        Preconditions.n(latLng2, "northeast must not be null.");
        double d2 = latLng2.f26019z;
        double d3 = latLng.f26019z;
        Preconditions.c(d2 >= d3, "southern latitude exceeds northern latitude (%s > %s)", Double.valueOf(d3), Double.valueOf(latLng2.f26019z));
        this.f26021z = latLng;
        this.f26020A = latLng2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLngBounds)) {
            return false;
        }
        LatLngBounds latLngBounds = (LatLngBounds) obj;
        return this.f26021z.equals(latLngBounds.f26021z) && this.f26020A.equals(latLngBounds.f26020A);
    }

    public int hashCode() {
        return Objects.b(this.f26021z, this.f26020A);
    }

    public String toString() {
        return Objects.c(this).a("southwest", this.f26021z).a("northeast", this.f26020A).toString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.v(parcel, 2, this.f26021z, i2, false);
        SafeParcelWriter.v(parcel, 3, this.f26020A, i2, false);
        SafeParcelWriter.b(parcel, a2);
    }
}
