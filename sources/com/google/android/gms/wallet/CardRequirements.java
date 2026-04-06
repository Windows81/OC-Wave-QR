package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.ArrayList;

public final class CardRequirements extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CardRequirements> CREATOR = new zzg();

    /* renamed from: A  reason: collision with root package name */
    public boolean f27256A;

    /* renamed from: B  reason: collision with root package name */
    public boolean f27257B;
    public int C;

    /* renamed from: z  reason: collision with root package name */
    public ArrayList f27258z;

    public final class Builder {
    }

    public CardRequirements(ArrayList arrayList, boolean z2, boolean z3, int i2) {
        this.f27258z = arrayList;
        this.f27256A = z2;
        this.f27257B = z3;
        this.C = i2;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.p(parcel, 1, this.f27258z, false);
        SafeParcelWriter.c(parcel, 2, this.f27256A);
        SafeParcelWriter.c(parcel, 3, this.f27257B);
        SafeParcelWriter.n(parcel, 4, this.C);
        SafeParcelWriter.b(parcel, a2);
    }
}
