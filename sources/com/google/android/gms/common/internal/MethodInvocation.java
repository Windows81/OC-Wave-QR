package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public class MethodInvocation extends AbstractSafeParcelable {
    public static final Parcelable.Creator<MethodInvocation> CREATOR = new zan();

    /* renamed from: A  reason: collision with root package name */
    public final int f24897A;

    /* renamed from: B  reason: collision with root package name */
    public final int f24898B;
    public final long C;
    public final long D;
    public final String E;
    public final String F;
    public final int G;
    public final int H;

    /* renamed from: z  reason: collision with root package name */
    public final int f24899z;

    public MethodInvocation(int i2, int i3, int i4, long j2, long j3, String str, String str2, int i5, int i6) {
        this.f24899z = i2;
        this.f24897A = i3;
        this.f24898B = i4;
        this.C = j2;
        this.D = j3;
        this.E = str;
        this.F = str2;
        this.G = i5;
        this.H = i6;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int i3 = this.f24899z;
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.n(parcel, 1, i3);
        SafeParcelWriter.n(parcel, 2, this.f24897A);
        SafeParcelWriter.n(parcel, 3, this.f24898B);
        SafeParcelWriter.s(parcel, 4, this.C);
        SafeParcelWriter.s(parcel, 5, this.D);
        SafeParcelWriter.w(parcel, 6, this.E, false);
        SafeParcelWriter.w(parcel, 7, this.F, false);
        SafeParcelWriter.n(parcel, 8, this.G);
        SafeParcelWriter.n(parcel, 9, this.H);
        SafeParcelWriter.b(parcel, a2);
    }
}
