package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.ArrayList;
import java.util.List;

public class TelemetryData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TelemetryData> CREATOR = new zaab();

    /* renamed from: A  reason: collision with root package name */
    public List f24912A;

    /* renamed from: z  reason: collision with root package name */
    public final int f24913z;

    public TelemetryData(int i2, List list) {
        this.f24913z = i2;
        this.f24912A = list;
    }

    public final int H() {
        return this.f24913z;
    }

    public final List Q() {
        return this.f24912A;
    }

    public final void S(MethodInvocation methodInvocation) {
        if (this.f24912A == null) {
            this.f24912A = new ArrayList();
        }
        this.f24912A.add(methodInvocation);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.n(parcel, 1, this.f24913z);
        SafeParcelWriter.A(parcel, 2, this.f24912A, false);
        SafeParcelWriter.b(parcel, a2);
    }
}
