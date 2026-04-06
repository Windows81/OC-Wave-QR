package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class GroundOverlayOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GroundOverlayOptions> CREATOR = new zzd();

    /* renamed from: A  reason: collision with root package name */
    public LatLng f26012A;

    /* renamed from: B  reason: collision with root package name */
    public float f26013B;
    public float C;
    public LatLngBounds D;
    public float E;
    public float F;
    public boolean G = true;
    public float H = 0.0f;
    public float I = 0.5f;
    public float J = 0.5f;
    public boolean K = false;

    /* renamed from: z  reason: collision with root package name */
    public BitmapDescriptor f26014z;

    public GroundOverlayOptions(IBinder iBinder, LatLng latLng, float f2, float f3, LatLngBounds latLngBounds, float f4, float f5, boolean z2, float f6, float f7, float f8, boolean z3) {
        this.f26014z = new BitmapDescriptor(IObjectWrapper.Stub.N(iBinder));
        this.f26012A = latLng;
        this.f26013B = f2;
        this.C = f3;
        this.D = latLngBounds;
        this.E = f4;
        this.F = f5;
        this.G = z2;
        this.H = f6;
        this.I = f7;
        this.J = f8;
        this.K = z3;
    }

    public float A0() {
        return this.f26013B;
    }

    public float G0() {
        return this.F;
    }

    public float H() {
        return this.I;
    }

    public float Q() {
        return this.J;
    }

    public float S() {
        return this.E;
    }

    public boolean U0() {
        return this.K;
    }

    public boolean W0() {
        return this.G;
    }

    public LatLngBounds X() {
        return this.D;
    }

    public float f0() {
        return this.C;
    }

    public LatLng m0() {
        return this.f26012A;
    }

    public float o0() {
        return this.H;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.m(parcel, 2, this.f26014z.a().asBinder(), false);
        SafeParcelWriter.v(parcel, 3, m0(), i2, false);
        SafeParcelWriter.k(parcel, 4, A0());
        SafeParcelWriter.k(parcel, 5, f0());
        SafeParcelWriter.v(parcel, 6, X(), i2, false);
        SafeParcelWriter.k(parcel, 7, S());
        SafeParcelWriter.k(parcel, 8, G0());
        SafeParcelWriter.c(parcel, 9, W0());
        SafeParcelWriter.k(parcel, 10, o0());
        SafeParcelWriter.k(parcel, 11, H());
        SafeParcelWriter.k(parcel, 12, Q());
        SafeParcelWriter.c(parcel, 13, U0());
        SafeParcelWriter.b(parcel, a2);
    }
}
