package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class StreetViewSource extends AbstractSafeParcelable {

    /* renamed from: A  reason: collision with root package name */
    public static final StreetViewSource f26052A = new StreetViewSource(0);

    /* renamed from: B  reason: collision with root package name */
    public static final StreetViewSource f26053B = new StreetViewSource(1);
    public static final Parcelable.Creator<StreetViewSource> CREATOR = new zzr();

    /* renamed from: z  reason: collision with root package name */
    public final int f26054z;

    public StreetViewSource(int i2) {
        this.f26054z = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StreetViewSource) && this.f26054z == ((StreetViewSource) obj).f26054z;
    }

    public int hashCode() {
        return Objects.b(Integer.valueOf(this.f26054z));
    }

    public String toString() {
        int i2 = this.f26054z;
        return String.format("StreetViewSource:%s", new Object[]{i2 != 0 ? i2 != 1 ? String.format("UNKNOWN(%s)", new Object[]{Integer.valueOf(i2)}) : "OUTDOOR" : "DEFAULT"});
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.n(parcel, 2, this.f26054z);
        SafeParcelWriter.b(parcel, a2);
    }
}
