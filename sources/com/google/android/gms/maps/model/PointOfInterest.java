package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class PointOfInterest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PointOfInterest> CREATOR = new zzk();

    /* renamed from: A  reason: collision with root package name */
    public final String f26029A;

    /* renamed from: B  reason: collision with root package name */
    public final String f26030B;

    /* renamed from: z  reason: collision with root package name */
    public final LatLng f26031z;

    public PointOfInterest(LatLng latLng, String str, String str2) {
        this.f26031z = latLng;
        this.f26029A = str;
        this.f26030B = str2;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.v(parcel, 2, this.f26031z, i2, false);
        SafeParcelWriter.w(parcel, 3, this.f26029A, false);
        SafeParcelWriter.w(parcel, 4, this.f26030B, false);
        SafeParcelWriter.b(parcel, a2);
    }
}
