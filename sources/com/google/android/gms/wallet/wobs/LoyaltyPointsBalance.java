package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class LoyaltyPointsBalance extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LoyaltyPointsBalance> CREATOR = new zzi();

    /* renamed from: A  reason: collision with root package name */
    public String f27357A;

    /* renamed from: B  reason: collision with root package name */
    public double f27358B;
    public String C;
    public long D;
    public int E;

    /* renamed from: z  reason: collision with root package name */
    public int f27359z;

    public final class Builder {
    }

    public interface Type {
    }

    public LoyaltyPointsBalance(int i2, String str, double d2, String str2, long j2, int i3) {
        this.f27359z = i2;
        this.f27357A = str;
        this.f27358B = d2;
        this.C = str2;
        this.D = j2;
        this.E = i3;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.n(parcel, 2, this.f27359z);
        SafeParcelWriter.w(parcel, 3, this.f27357A, false);
        SafeParcelWriter.i(parcel, 4, this.f27358B);
        SafeParcelWriter.w(parcel, 5, this.C, false);
        SafeParcelWriter.s(parcel, 6, this.D);
        SafeParcelWriter.n(parcel, 7, this.E);
        SafeParcelWriter.b(parcel, a2);
    }
}
