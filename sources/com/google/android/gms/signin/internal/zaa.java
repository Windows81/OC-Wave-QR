package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zaa extends AbstractSafeParcelable implements Result {
    public static final Parcelable.Creator<zaa> CREATOR = new zab();

    /* renamed from: A  reason: collision with root package name */
    public int f27146A;

    /* renamed from: B  reason: collision with root package name */
    public Intent f27147B;

    /* renamed from: z  reason: collision with root package name */
    public final int f27148z;

    public zaa(int i2, int i3, Intent intent) {
        this.f27148z = i2;
        this.f27146A = i3;
        this.f27147B = intent;
    }

    public final Status A() {
        return this.f27146A == 0 ? Status.E : Status.I;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int i3 = this.f27148z;
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.n(parcel, 1, i3);
        SafeParcelWriter.n(parcel, 2, this.f27146A);
        SafeParcelWriter.v(parcel, 3, this.f27147B, i2, false);
        SafeParcelWriter.b(parcel, a2);
    }
}
