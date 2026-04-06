package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzk> CREATOR = new zzl();

    /* renamed from: A  reason: collision with root package name */
    public Feature[] f24985A;

    /* renamed from: B  reason: collision with root package name */
    public int f24986B;
    public ConnectionTelemetryConfiguration C;

    /* renamed from: z  reason: collision with root package name */
    public Bundle f24987z;

    public zzk(Bundle bundle, Feature[] featureArr, int i2, ConnectionTelemetryConfiguration connectionTelemetryConfiguration) {
        this.f24987z = bundle;
        this.f24985A = featureArr;
        this.f24986B = i2;
        this.C = connectionTelemetryConfiguration;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.e(parcel, 1, this.f24987z, false);
        SafeParcelWriter.z(parcel, 2, this.f24985A, i2, false);
        SafeParcelWriter.n(parcel, 3, this.f24986B);
        SafeParcelWriter.v(parcel, 4, this.C, i2, false);
        SafeParcelWriter.b(parcel, a2);
    }
}
