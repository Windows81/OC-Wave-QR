package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class Tile extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Tile> CREATOR = new zzs();

    /* renamed from: A  reason: collision with root package name */
    public final int f26055A;

    /* renamed from: B  reason: collision with root package name */
    public final byte[] f26056B;

    /* renamed from: z  reason: collision with root package name */
    public final int f26057z;

    public Tile(int i2, int i3, byte[] bArr) {
        this.f26057z = i2;
        this.f26055A = i3;
        this.f26056B = bArr;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.n(parcel, 2, this.f26057z);
        SafeParcelWriter.n(parcel, 3, this.f26055A);
        SafeParcelWriter.g(parcel, 4, this.f26056B, false);
        SafeParcelWriter.b(parcel, a2);
    }
}
