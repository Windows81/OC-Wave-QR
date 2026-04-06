package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzdt extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdt> CREATOR = new zzdw();

    /* renamed from: A  reason: collision with root package name */
    public final long f25417A;

    /* renamed from: B  reason: collision with root package name */
    public final boolean f25418B;
    public final String C;
    public final String D;
    public final String E;
    public final Bundle F;
    public final String G;

    /* renamed from: z  reason: collision with root package name */
    public final long f25419z;

    public zzdt(long j2, long j3, boolean z2, String str, String str2, String str3, Bundle bundle, String str4) {
        this.f25419z = j2;
        this.f25417A = j3;
        this.f25418B = z2;
        this.C = str;
        this.D = str2;
        this.E = str3;
        this.F = bundle;
        this.G = str4;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.s(parcel, 1, this.f25419z);
        SafeParcelWriter.s(parcel, 2, this.f25417A);
        SafeParcelWriter.c(parcel, 3, this.f25418B);
        SafeParcelWriter.w(parcel, 4, this.C, false);
        SafeParcelWriter.w(parcel, 5, this.D, false);
        SafeParcelWriter.w(parcel, 6, this.E, false);
        SafeParcelWriter.e(parcel, 7, this.F, false);
        SafeParcelWriter.w(parcel, 8, this.G, false);
        SafeParcelWriter.b(parcel, a2);
    }
}
