package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class CameraPosition extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<CameraPosition> CREATOR = new zza();

    /* renamed from: A  reason: collision with root package name */
    public final float f25995A;

    /* renamed from: B  reason: collision with root package name */
    public final float f25996B;
    public final float C;

    /* renamed from: z  reason: collision with root package name */
    public final LatLng f25997z;

    public static final class Builder {

        /* renamed from: a  reason: collision with root package name */
        public LatLng f25998a;

        /* renamed from: b  reason: collision with root package name */
        public float f25999b;

        /* renamed from: c  reason: collision with root package name */
        public float f26000c;

        /* renamed from: d  reason: collision with root package name */
        public float f26001d;

        public Builder a(float f2) {
            this.f26001d = f2;
            return this;
        }

        public CameraPosition b() {
            return new CameraPosition(this.f25998a, this.f25999b, this.f26000c, this.f26001d);
        }

        public Builder c(LatLng latLng) {
            this.f25998a = (LatLng) Preconditions.n(latLng, "location must not be null.");
            return this;
        }

        public Builder d(float f2) {
            this.f26000c = f2;
            return this;
        }

        public Builder e(float f2) {
            this.f25999b = f2;
            return this;
        }
    }

    public CameraPosition(LatLng latLng, float f2, float f3, float f4) {
        Preconditions.n(latLng, "camera target must not be null.");
        boolean z2 = false;
        if (f3 >= 0.0f && f3 <= 90.0f) {
            z2 = true;
        }
        Preconditions.c(z2, "Tilt needs to be between 0 and 90 inclusive: %s", Float.valueOf(f3));
        this.f25997z = latLng;
        this.f25995A = f2;
        this.f25996B = f3 + 0.0f;
        this.C = (((double) f4) <= 0.0d ? (f4 % 360.0f) + 360.0f : f4) % 360.0f;
    }

    public static Builder H() {
        return new Builder();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameraPosition)) {
            return false;
        }
        CameraPosition cameraPosition = (CameraPosition) obj;
        return this.f25997z.equals(cameraPosition.f25997z) && Float.floatToIntBits(this.f25995A) == Float.floatToIntBits(cameraPosition.f25995A) && Float.floatToIntBits(this.f25996B) == Float.floatToIntBits(cameraPosition.f25996B) && Float.floatToIntBits(this.C) == Float.floatToIntBits(cameraPosition.C);
    }

    public int hashCode() {
        return Objects.b(this.f25997z, Float.valueOf(this.f25995A), Float.valueOf(this.f25996B), Float.valueOf(this.C));
    }

    public String toString() {
        return Objects.c(this).a("target", this.f25997z).a("zoom", Float.valueOf(this.f25995A)).a("tilt", Float.valueOf(this.f25996B)).a("bearing", Float.valueOf(this.C)).toString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.v(parcel, 2, this.f25997z, i2, false);
        SafeParcelWriter.k(parcel, 3, this.f25995A);
        SafeParcelWriter.k(parcel, 4, this.f25996B);
        SafeParcelWriter.k(parcel, 5, this.C);
        SafeParcelWriter.b(parcel, a2);
    }
}
