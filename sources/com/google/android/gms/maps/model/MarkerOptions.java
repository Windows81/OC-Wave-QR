package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class MarkerOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<MarkerOptions> CREATOR = new zzi();

    /* renamed from: A  reason: collision with root package name */
    public String f26024A;

    /* renamed from: B  reason: collision with root package name */
    public String f26025B;
    public BitmapDescriptor C;
    public float D = 0.5f;
    public float E = 1.0f;
    public boolean F;
    public boolean G = true;
    public boolean H = false;
    public float I = 0.0f;
    public float J = 0.5f;
    public float K = 0.0f;
    public float L = 1.0f;
    public float M;

    /* renamed from: z  reason: collision with root package name */
    public LatLng f26026z;

    public MarkerOptions(LatLng latLng, String str, String str2, IBinder iBinder, float f2, float f3, boolean z2, boolean z3, boolean z4, float f4, float f5, float f6, float f7, float f8) {
        this.f26026z = latLng;
        this.f26024A = str;
        this.f26025B = str2;
        if (iBinder == null) {
            this.C = null;
        } else {
            this.C = new BitmapDescriptor(IObjectWrapper.Stub.N(iBinder));
        }
        this.D = f2;
        this.E = f3;
        this.F = z2;
        this.G = z3;
        this.H = z4;
        this.I = f4;
        this.J = f5;
        this.K = f6;
        this.L = f7;
        this.M = f8;
    }

    public String A0() {
        return this.f26025B;
    }

    public String G0() {
        return this.f26024A;
    }

    public float H() {
        return this.L;
    }

    public float Q() {
        return this.D;
    }

    public float S() {
        return this.E;
    }

    public float U0() {
        return this.M;
    }

    public boolean W0() {
        return this.F;
    }

    public float X() {
        return this.J;
    }

    public boolean b1() {
        return this.H;
    }

    public float f0() {
        return this.K;
    }

    public LatLng m0() {
        return this.f26026z;
    }

    public float o0() {
        return this.I;
    }

    public boolean q1() {
        return this.G;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.v(parcel, 2, m0(), i2, false);
        SafeParcelWriter.w(parcel, 3, G0(), false);
        SafeParcelWriter.w(parcel, 4, A0(), false);
        BitmapDescriptor bitmapDescriptor = this.C;
        SafeParcelWriter.m(parcel, 5, bitmapDescriptor == null ? null : bitmapDescriptor.a().asBinder(), false);
        SafeParcelWriter.k(parcel, 6, Q());
        SafeParcelWriter.k(parcel, 7, S());
        SafeParcelWriter.c(parcel, 8, W0());
        SafeParcelWriter.c(parcel, 9, q1());
        SafeParcelWriter.c(parcel, 10, b1());
        SafeParcelWriter.k(parcel, 11, o0());
        SafeParcelWriter.k(parcel, 12, X());
        SafeParcelWriter.k(parcel, 13, f0());
        SafeParcelWriter.k(parcel, 14, H());
        SafeParcelWriter.k(parcel, 15, U0());
        SafeParcelWriter.b(parcel, a2);
    }
}
