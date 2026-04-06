package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.List;

public final class zag extends AbstractSafeParcelable implements Result {
    public static final Parcelable.Creator<zag> CREATOR = new zah();

    /* renamed from: A  reason: collision with root package name */
    public final String f27149A;

    /* renamed from: z  reason: collision with root package name */
    public final List f27150z;

    public zag(List list, String str) {
        this.f27150z = list;
        this.f27149A = str;
    }

    public final Status A() {
        return this.f27149A != null ? Status.E : Status.I;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        List list = this.f27150z;
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.y(parcel, 1, list, false);
        SafeParcelWriter.w(parcel, 2, this.f27149A, false);
        SafeParcelWriter.b(parcel, a2);
    }
}
