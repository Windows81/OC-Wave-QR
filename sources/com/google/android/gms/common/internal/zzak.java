package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

@Deprecated
public final class zzak extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzak> CREATOR = new zzal();

    /* renamed from: z  reason: collision with root package name */
    public final int f24972z;

    public zzak(int i2) {
        this.f24972z = i2;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int i3 = this.f24972z;
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.n(parcel, 1, i3);
        SafeParcelWriter.b(parcel, a2);
    }
}
