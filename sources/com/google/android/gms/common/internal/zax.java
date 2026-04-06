package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zax extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zax> CREATOR = new zay();

    /* renamed from: A  reason: collision with root package name */
    public final int f24960A;

    /* renamed from: B  reason: collision with root package name */
    public final int f24961B;
    public final Scope[] C;

    /* renamed from: z  reason: collision with root package name */
    public final int f24962z;

    public zax(int i2, int i3, int i4, Scope[] scopeArr) {
        this.f24962z = i2;
        this.f24960A = i3;
        this.f24961B = i4;
        this.C = scopeArr;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int i3 = this.f24962z;
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.n(parcel, 1, i3);
        SafeParcelWriter.n(parcel, 2, this.f24960A);
        SafeParcelWriter.n(parcel, 3, this.f24961B);
        SafeParcelWriter.z(parcel, 4, this.C, i2, false);
        SafeParcelWriter.b(parcel, a2);
    }
}
