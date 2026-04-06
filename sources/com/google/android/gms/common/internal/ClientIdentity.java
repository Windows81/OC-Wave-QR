package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public class ClientIdentity extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ClientIdentity> CREATOR = new zaa();

    /* renamed from: A  reason: collision with root package name */
    public final String f24863A;

    /* renamed from: z  reason: collision with root package name */
    public final int f24864z;

    public ClientIdentity(int i2, String str) {
        this.f24864z = i2;
        this.f24863A = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ClientIdentity)) {
            return false;
        }
        ClientIdentity clientIdentity = (ClientIdentity) obj;
        return clientIdentity.f24864z == this.f24864z && Objects.a(clientIdentity.f24863A, this.f24863A);
    }

    public final int hashCode() {
        return this.f24864z;
    }

    public final String toString() {
        return this.f24864z + ":" + this.f24863A;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int i3 = this.f24864z;
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.n(parcel, 1, i3);
        SafeParcelWriter.w(parcel, 2, this.f24863A, false);
        SafeParcelWriter.b(parcel, a2);
    }
}
