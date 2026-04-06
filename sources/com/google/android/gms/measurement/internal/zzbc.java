package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Iterator;

public final class zzbc extends AbstractSafeParcelable implements Iterable<String> {
    public static final Parcelable.Creator<zzbc> CREATOR = new zzbe();

    /* renamed from: z  reason: collision with root package name */
    public final Bundle f26240z;

    public zzbc(Bundle bundle) {
        this.f26240z = bundle;
    }

    public final int H() {
        return this.f26240z.size();
    }

    public final Double S(String str) {
        return Double.valueOf(this.f26240z.getDouble(str));
    }

    public final Bundle X() {
        return new Bundle(this.f26240z);
    }

    public final Long f0(String str) {
        return Long.valueOf(this.f26240z.getLong(str));
    }

    public final Iterator iterator() {
        return new zzbf(this);
    }

    public final Object m0(String str) {
        return this.f26240z.get(str);
    }

    public final String o0(String str) {
        return this.f26240z.getString(str);
    }

    public final String toString() {
        return this.f26240z.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.e(parcel, 2, X(), false);
        SafeParcelWriter.b(parcel, a2);
    }
}
