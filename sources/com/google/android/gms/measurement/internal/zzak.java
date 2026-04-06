package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzak extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzak> CREATOR = new zzan();

    /* renamed from: z  reason: collision with root package name */
    public final Bundle f26182z;

    public zzak(Bundle bundle) {
        this.f26182z = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.e(parcel, 1, this.f26182z, false);
        SafeParcelWriter.b(parcel, a2);
    }
}
