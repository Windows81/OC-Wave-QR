package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class Scope extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new zza();

    /* renamed from: A  reason: collision with root package name */
    public final String f24446A;

    /* renamed from: z  reason: collision with root package name */
    public final int f24447z;

    public Scope(int i2, String str) {
        Preconditions.h(str, "scopeUri must not be null or empty");
        this.f24447z = i2;
        this.f24446A = str;
    }

    public String H() {
        return this.f24446A;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f24446A.equals(((Scope) obj).f24446A);
    }

    public int hashCode() {
        return this.f24446A.hashCode();
    }

    public String toString() {
        return this.f24446A;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int i3 = this.f24447z;
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.n(parcel, 1, i3);
        SafeParcelWriter.w(parcel, 2, H(), false);
        SafeParcelWriter.b(parcel, a2);
    }

    public Scope(String str) {
        this(1, str);
    }
}
