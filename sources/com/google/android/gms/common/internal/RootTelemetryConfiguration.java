package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public class RootTelemetryConfiguration extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RootTelemetryConfiguration> CREATOR = new zzaj();

    /* renamed from: A  reason: collision with root package name */
    public final boolean f24907A;

    /* renamed from: B  reason: collision with root package name */
    public final boolean f24908B;
    public final int C;
    public final int D;

    /* renamed from: z  reason: collision with root package name */
    public final int f24909z;

    public RootTelemetryConfiguration(int i2, boolean z2, boolean z3, int i3, int i4) {
        this.f24909z = i2;
        this.f24907A = z2;
        this.f24908B = z3;
        this.C = i3;
        this.D = i4;
    }

    public int H() {
        return this.C;
    }

    public int Q() {
        return this.D;
    }

    public boolean S() {
        return this.f24907A;
    }

    public boolean X() {
        return this.f24908B;
    }

    public int f0() {
        return this.f24909z;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.n(parcel, 1, f0());
        SafeParcelWriter.c(parcel, 2, S());
        SafeParcelWriter.c(parcel, 3, X());
        SafeParcelWriter.n(parcel, 4, H());
        SafeParcelWriter.n(parcel, 5, Q());
        SafeParcelWriter.b(parcel, a2);
    }
}
