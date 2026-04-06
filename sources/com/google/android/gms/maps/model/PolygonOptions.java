package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.List;

public final class PolygonOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PolygonOptions> CREATOR = new zzl();

    /* renamed from: A  reason: collision with root package name */
    public final List f26033A;

    /* renamed from: B  reason: collision with root package name */
    public float f26034B;
    public int C;
    public int D;
    public float E;
    public boolean F;
    public boolean G;
    public boolean H;
    public int I;
    public List J;

    /* renamed from: z  reason: collision with root package name */
    public final List f26035z;

    public PolygonOptions(List list, List list2, float f2, int i2, int i3, float f3, boolean z2, boolean z3, boolean z4, int i4, List list3) {
        this.f26035z = list;
        this.f26033A = list2;
        this.f26034B = f2;
        this.C = i2;
        this.D = i3;
        this.E = f3;
        this.F = z2;
        this.G = z3;
        this.H = z4;
        this.I = i4;
        this.J = list3;
    }

    public boolean A0() {
        return this.H;
    }

    public boolean G0() {
        return this.G;
    }

    public int H() {
        return this.D;
    }

    public List Q() {
        return this.f26035z;
    }

    public int S() {
        return this.C;
    }

    public boolean U0() {
        return this.F;
    }

    public int X() {
        return this.I;
    }

    public List f0() {
        return this.J;
    }

    public float m0() {
        return this.f26034B;
    }

    public float o0() {
        return this.E;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.A(parcel, 2, Q(), false);
        SafeParcelWriter.r(parcel, 3, this.f26033A, false);
        SafeParcelWriter.k(parcel, 4, m0());
        SafeParcelWriter.n(parcel, 5, S());
        SafeParcelWriter.n(parcel, 6, H());
        SafeParcelWriter.k(parcel, 7, o0());
        SafeParcelWriter.c(parcel, 8, U0());
        SafeParcelWriter.c(parcel, 9, G0());
        SafeParcelWriter.c(parcel, 10, A0());
        SafeParcelWriter.n(parcel, 11, X());
        SafeParcelWriter.A(parcel, 12, f0(), false);
        SafeParcelWriter.b(parcel, a2);
    }
}
