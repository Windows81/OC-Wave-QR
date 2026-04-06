package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

@Deprecated
public final class zzaj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaj> CREATOR = new zzak();

    /* renamed from: A  reason: collision with root package name */
    public final String f27376A;

    /* renamed from: B  reason: collision with root package name */
    public final int f27377B;
    public final int C;

    /* renamed from: z  reason: collision with root package name */
    public final String f27378z;

    public zzaj(String str, String str2, int i2, int i3) {
        this.f27378z = str;
        this.f27376A = str2;
        this.f27377B = i2;
        this.C = i3;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        String str = this.f27378z;
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.w(parcel, 2, str, false);
        SafeParcelWriter.w(parcel, 3, this.f27376A, false);
        SafeParcelWriter.n(parcel, 4, this.f27377B);
        SafeParcelWriter.n(parcel, 5, this.C);
        SafeParcelWriter.b(parcel, a2);
    }
}
