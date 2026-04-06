package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.zav;

public final class zak extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zak> CREATOR = new zal();

    /* renamed from: A  reason: collision with root package name */
    public final ConnectionResult f27153A;

    /* renamed from: B  reason: collision with root package name */
    public final zav f27154B;

    /* renamed from: z  reason: collision with root package name */
    public final int f27155z;

    public zak(int i2, ConnectionResult connectionResult, zav zav) {
        this.f27155z = i2;
        this.f27153A = connectionResult;
        this.f27154B = zav;
    }

    public final ConnectionResult H() {
        return this.f27153A;
    }

    public final zav Q() {
        return this.f27154B;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.n(parcel, 1, this.f27155z);
        SafeParcelWriter.v(parcel, 2, this.f27153A, i2, false);
        SafeParcelWriter.v(parcel, 3, this.f27154B, i2, false);
        SafeParcelWriter.b(parcel, a2);
    }
}
