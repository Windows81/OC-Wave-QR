package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;

public class StreetViewPanoramaCamera extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<StreetViewPanoramaCamera> CREATOR = new zzn();

    /* renamed from: A  reason: collision with root package name */
    public final float f26040A;

    /* renamed from: B  reason: collision with root package name */
    public final float f26041B;
    public final StreetViewPanoramaOrientation C;

    /* renamed from: z  reason: collision with root package name */
    public final float f26042z;

    public static final class Builder {
    }

    public StreetViewPanoramaCamera(float f2, float f3, float f4) {
        boolean z2 = false;
        if (f3 >= -90.0f && f3 <= 90.0f) {
            z2 = true;
        }
        StringBuilder sb = new StringBuilder(62);
        sb.append("Tilt needs to be between -90 and 90 inclusive: ");
        sb.append(f3);
        Preconditions.b(z2, sb.toString());
        this.f26042z = ((double) f2) <= 0.0d ? 0.0f : f2;
        this.f26040A = 0.0f + f3;
        this.f26041B = (((double) f4) <= 0.0d ? (f4 % 360.0f) + 360.0f : f4) % 360.0f;
        StreetViewPanoramaOrientation.Builder builder = new StreetViewPanoramaOrientation.Builder();
        builder.c(f3);
        builder.a(f4);
        this.C = builder.b();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewPanoramaCamera)) {
            return false;
        }
        StreetViewPanoramaCamera streetViewPanoramaCamera = (StreetViewPanoramaCamera) obj;
        return Float.floatToIntBits(this.f26042z) == Float.floatToIntBits(streetViewPanoramaCamera.f26042z) && Float.floatToIntBits(this.f26040A) == Float.floatToIntBits(streetViewPanoramaCamera.f26040A) && Float.floatToIntBits(this.f26041B) == Float.floatToIntBits(streetViewPanoramaCamera.f26041B);
    }

    public int hashCode() {
        return Objects.b(Float.valueOf(this.f26042z), Float.valueOf(this.f26040A), Float.valueOf(this.f26041B));
    }

    public String toString() {
        return Objects.c(this).a("zoom", Float.valueOf(this.f26042z)).a("tilt", Float.valueOf(this.f26040A)).a("bearing", Float.valueOf(this.f26041B)).toString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.k(parcel, 2, this.f26042z);
        SafeParcelWriter.k(parcel, 3, this.f26040A);
        SafeParcelWriter.k(parcel, 4, this.f26041B);
        SafeParcelWriter.b(parcel, a2);
    }
}
