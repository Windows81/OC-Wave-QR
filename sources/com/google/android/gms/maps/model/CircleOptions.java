package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.List;

public final class CircleOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CircleOptions> CREATOR = new zzc();

    /* renamed from: A  reason: collision with root package name */
    public double f26006A;

    /* renamed from: B  reason: collision with root package name */
    public float f26007B;
    public int C;
    public int D;
    public float E;
    public boolean F;
    public boolean G;
    public List H;

    /* renamed from: z  reason: collision with root package name */
    public LatLng f26008z;

    public CircleOptions(LatLng latLng, double d2, float f2, int i2, int i3, float f3, boolean z2, boolean z3, List list) {
        this.f26008z = latLng;
        this.f26006A = d2;
        this.f26007B = f2;
        this.C = i2;
        this.D = i3;
        this.E = f3;
        this.F = z2;
        this.G = z3;
        this.H = list;
    }

    public boolean A0() {
        return this.G;
    }

    public boolean G0() {
        return this.F;
    }

    public LatLng H() {
        return this.f26008z;
    }

    public int Q() {
        return this.D;
    }

    public double S() {
        return this.f26006A;
    }

    public int X() {
        return this.C;
    }

    public List f0() {
        return this.H;
    }

    public float m0() {
        return this.f26007B;
    }

    public float o0() {
        return this.E;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.v(parcel, 2, H(), i2, false);
        SafeParcelWriter.i(parcel, 3, S());
        SafeParcelWriter.k(parcel, 4, m0());
        SafeParcelWriter.n(parcel, 5, X());
        SafeParcelWriter.n(parcel, 6, Q());
        SafeParcelWriter.k(parcel, 7, o0());
        SafeParcelWriter.c(parcel, 8, G0());
        SafeParcelWriter.c(parcel, 9, A0());
        SafeParcelWriter.A(parcel, 10, f0(), false);
        SafeParcelWriter.b(parcel, a2);
    }
}
