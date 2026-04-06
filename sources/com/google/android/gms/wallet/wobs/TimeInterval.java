package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class TimeInterval extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TimeInterval> CREATOR = new zzl();

    /* renamed from: A  reason: collision with root package name */
    public long f27362A;

    /* renamed from: z  reason: collision with root package name */
    public long f27363z;

    public TimeInterval(long j2, long j3) {
        this.f27363z = j2;
        this.f27362A = j3;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.s(parcel, 2, this.f27363z);
        SafeParcelWriter.s(parcel, 3, this.f27362A);
        SafeParcelWriter.b(parcel, a2);
    }
}
