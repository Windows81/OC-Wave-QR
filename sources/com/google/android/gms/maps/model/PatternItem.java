package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public class PatternItem extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PatternItem> CREATOR = new zzj();

    /* renamed from: A  reason: collision with root package name */
    public final Float f26027A;

    /* renamed from: z  reason: collision with root package name */
    public final int f26028z;

    public PatternItem(int i2, Float f2) {
        boolean z2 = true;
        if (i2 != 1 && (f2 == null || f2.floatValue() < 0.0f)) {
            z2 = false;
        }
        String valueOf = String.valueOf(f2);
        StringBuilder sb = new StringBuilder(valueOf.length() + 45);
        sb.append("Invalid PatternItem: type=");
        sb.append(i2);
        sb.append(" length=");
        sb.append(valueOf);
        Preconditions.b(z2, sb.toString());
        this.f26028z = i2;
        this.f26027A = f2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PatternItem)) {
            return false;
        }
        PatternItem patternItem = (PatternItem) obj;
        return this.f26028z == patternItem.f26028z && Objects.a(this.f26027A, patternItem.f26027A);
    }

    public int hashCode() {
        return Objects.b(Integer.valueOf(this.f26028z), this.f26027A);
    }

    public String toString() {
        int i2 = this.f26028z;
        String valueOf = String.valueOf(this.f26027A);
        StringBuilder sb = new StringBuilder(valueOf.length() + 39);
        sb.append("[PatternItem: type=");
        sb.append(i2);
        sb.append(" length=");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.n(parcel, 2, this.f26028z);
        SafeParcelWriter.l(parcel, 3, this.f26027A, false);
        SafeParcelWriter.b(parcel, a2);
    }
}
