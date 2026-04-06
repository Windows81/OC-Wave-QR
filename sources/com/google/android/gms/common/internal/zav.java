package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zav extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zav> CREATOR = new zaw();

    /* renamed from: A  reason: collision with root package name */
    public final IBinder f24957A;

    /* renamed from: B  reason: collision with root package name */
    public final ConnectionResult f24958B;
    public final boolean C;
    public final boolean D;

    /* renamed from: z  reason: collision with root package name */
    public final int f24959z;

    public zav(int i2, IBinder iBinder, ConnectionResult connectionResult, boolean z2, boolean z3) {
        this.f24959z = i2;
        this.f24957A = iBinder;
        this.f24958B = connectionResult;
        this.C = z2;
        this.D = z3;
    }

    public final ConnectionResult H() {
        return this.f24958B;
    }

    public final IAccountAccessor Q() {
        IBinder iBinder = this.f24957A;
        if (iBinder == null) {
            return null;
        }
        return IAccountAccessor.Stub.N(iBinder);
    }

    public final boolean S() {
        return this.C;
    }

    public final boolean X() {
        return this.D;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zav)) {
            return false;
        }
        zav zav = (zav) obj;
        return this.f24958B.equals(zav.f24958B) && Objects.a(Q(), zav.Q());
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.n(parcel, 1, this.f24959z);
        SafeParcelWriter.m(parcel, 2, this.f24957A, false);
        SafeParcelWriter.v(parcel, 3, this.f24958B, i2, false);
        SafeParcelWriter.c(parcel, 4, this.C);
        SafeParcelWriter.c(parcel, 5, this.D);
        SafeParcelWriter.b(parcel, a2);
    }
}
