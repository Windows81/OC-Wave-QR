package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.maps.zzai;
import com.google.android.gms.internal.maps.zzaj;

public final class TileOverlayOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TileOverlayOptions> CREATOR = new zzv();

    /* renamed from: A  reason: collision with root package name */
    public TileProvider f26059A;

    /* renamed from: B  reason: collision with root package name */
    public boolean f26060B = true;
    public float C;
    public boolean D = true;
    public float E = 0.0f;

    /* renamed from: z  reason: collision with root package name */
    public zzaj f26061z;

    public TileOverlayOptions(IBinder iBinder, boolean z2, float f2, boolean z3, float f3) {
        zzaj N = zzai.N(iBinder);
        this.f26061z = N;
        this.f26059A = N == null ? null : new zzt(this);
        this.f26060B = z2;
        this.C = f2;
        this.D = z3;
        this.E = f3;
    }

    public boolean H() {
        return this.D;
    }

    public float Q() {
        return this.E;
    }

    public float S() {
        return this.C;
    }

    public boolean X() {
        return this.f26060B;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        zzaj zzaj = this.f26061z;
        SafeParcelWriter.m(parcel, 2, zzaj == null ? null : zzaj.asBinder(), false);
        SafeParcelWriter.c(parcel, 3, X());
        SafeParcelWriter.k(parcel, 4, S());
        SafeParcelWriter.c(parcel, 5, H());
        SafeParcelWriter.k(parcel, 6, Q());
        SafeParcelWriter.b(parcel, a2);
    }
}
