package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new zzr();

    /* renamed from: A  reason: collision with root package name */
    public final String f25178A;

    /* renamed from: B  reason: collision with root package name */
    public final int f25179B;
    public final int C;

    /* renamed from: z  reason: collision with root package name */
    public final boolean f25180z;

    public zzq(boolean z2, String str, int i2, int i3) {
        this.f25180z = z2;
        this.f25178A = str;
        this.f25179B = zzy.a(i2) - 1;
        this.C = zzd.a(i3) - 1;
    }

    public final String H() {
        return this.f25178A;
    }

    public final boolean Q() {
        return this.f25180z;
    }

    public final int S() {
        return zzd.a(this.C);
    }

    public final int X() {
        return zzy.a(this.f25179B);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.c(parcel, 1, this.f25180z);
        SafeParcelWriter.w(parcel, 2, this.f25178A, false);
        SafeParcelWriter.n(parcel, 3, this.f25179B);
        SafeParcelWriter.n(parcel, 4, this.C);
        SafeParcelWriter.b(parcel, a2);
    }
}
