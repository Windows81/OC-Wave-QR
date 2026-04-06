package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public class GoogleSignInOptionsExtensionParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GoogleSignInOptionsExtensionParcelable> CREATOR = new zaa();

    /* renamed from: A  reason: collision with root package name */
    public int f24338A;

    /* renamed from: B  reason: collision with root package name */
    public Bundle f24339B;

    /* renamed from: z  reason: collision with root package name */
    public final int f24340z;

    public GoogleSignInOptionsExtensionParcelable(int i2, int i3, Bundle bundle) {
        this.f24340z = i2;
        this.f24338A = i3;
        this.f24339B = bundle;
    }

    public int H() {
        return this.f24338A;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.n(parcel, 1, this.f24340z);
        SafeParcelWriter.n(parcel, 2, H());
        SafeParcelWriter.e(parcel, 3, this.f24339B, false);
        SafeParcelWriter.b(parcel, a2);
    }
}
