package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public class EmoneyReadiness extends AbstractSafeParcelable {
    public static final Parcelable.Creator<EmoneyReadiness> CREATOR = new zzm();

    /* renamed from: z  reason: collision with root package name */
    public final int f27004z;

    public EmoneyReadiness(int i2) {
        this.f27004z = i2;
    }

    public int H() {
        return this.f27004z;
    }

    public boolean equals(Object obj) {
        if (obj instanceof EmoneyReadiness) {
            return Objects.a(Integer.valueOf(this.f27004z), Integer.valueOf(((EmoneyReadiness) obj).f27004z));
        }
        return false;
    }

    public int hashCode() {
        return Objects.b(Integer.valueOf(this.f27004z));
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.n(parcel, 1, H());
        SafeParcelWriter.b(parcel, a2);
    }
}
