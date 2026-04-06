package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.List;

public final class PolylineOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PolylineOptions> CREATOR = new zzm();

    /* renamed from: A  reason: collision with root package name */
    public float f26037A = 10.0f;

    /* renamed from: B  reason: collision with root package name */
    public int f26038B = -16777216;
    public float C = 0.0f;
    public boolean D = true;
    public boolean E = false;
    public boolean F = false;
    public Cap G = new ButtCap();
    public Cap H = new ButtCap();
    public int I;
    public List J;

    /* renamed from: z  reason: collision with root package name */
    public final List f26039z;

    public PolylineOptions(List list, float f2, int i2, float f3, boolean z2, boolean z3, boolean z4, Cap cap, Cap cap2, int i3, List list2) {
        this.f26039z = list;
        this.f26037A = f2;
        this.f26038B = i2;
        this.C = f3;
        this.D = z2;
        this.E = z3;
        this.F = z4;
        if (cap != null) {
            this.G = cap;
        }
        if (cap2 != null) {
            this.H = cap2;
        }
        this.I = i3;
        this.J = list2;
    }

    public float A0() {
        return this.C;
    }

    public boolean G0() {
        return this.F;
    }

    public int H() {
        return this.f26038B;
    }

    public Cap Q() {
        return this.H;
    }

    public int S() {
        return this.I;
    }

    public boolean U0() {
        return this.E;
    }

    public boolean W0() {
        return this.D;
    }

    public List X() {
        return this.J;
    }

    public List f0() {
        return this.f26039z;
    }

    public Cap m0() {
        return this.G;
    }

    public float o0() {
        return this.f26037A;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.A(parcel, 2, f0(), false);
        SafeParcelWriter.k(parcel, 3, o0());
        SafeParcelWriter.n(parcel, 4, H());
        SafeParcelWriter.k(parcel, 5, A0());
        SafeParcelWriter.c(parcel, 6, W0());
        SafeParcelWriter.c(parcel, 7, U0());
        SafeParcelWriter.c(parcel, 8, G0());
        SafeParcelWriter.v(parcel, 9, m0(), i2, false);
        SafeParcelWriter.v(parcel, 10, Q(), i2, false);
        SafeParcelWriter.n(parcel, 11, S());
        SafeParcelWriter.A(parcel, 12, X(), false);
        SafeParcelWriter.b(parcel, a2);
    }
}
