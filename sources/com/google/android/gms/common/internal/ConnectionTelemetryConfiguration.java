package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public class ConnectionTelemetryConfiguration extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ConnectionTelemetryConfiguration> CREATOR = new zzm();

    /* renamed from: A  reason: collision with root package name */
    public final boolean f24880A;

    /* renamed from: B  reason: collision with root package name */
    public final boolean f24881B;
    public final int[] C;
    public final int D;
    public final int[] E;

    /* renamed from: z  reason: collision with root package name */
    public final RootTelemetryConfiguration f24882z;

    public ConnectionTelemetryConfiguration(RootTelemetryConfiguration rootTelemetryConfiguration, boolean z2, boolean z3, int[] iArr, int i2, int[] iArr2) {
        this.f24882z = rootTelemetryConfiguration;
        this.f24880A = z2;
        this.f24881B = z3;
        this.C = iArr;
        this.D = i2;
        this.E = iArr2;
    }

    public int H() {
        return this.D;
    }

    public int[] Q() {
        return this.C;
    }

    public int[] S() {
        return this.E;
    }

    public boolean X() {
        return this.f24880A;
    }

    public boolean f0() {
        return this.f24881B;
    }

    public final RootTelemetryConfiguration m0() {
        return this.f24882z;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.v(parcel, 1, this.f24882z, i2, false);
        SafeParcelWriter.c(parcel, 2, X());
        SafeParcelWriter.c(parcel, 3, f0());
        SafeParcelWriter.o(parcel, 4, Q(), false);
        SafeParcelWriter.n(parcel, 5, H());
        SafeParcelWriter.o(parcel, 6, S(), false);
        SafeParcelWriter.b(parcel, a2);
    }
}
