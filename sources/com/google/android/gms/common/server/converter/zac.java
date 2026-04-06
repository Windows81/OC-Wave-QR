package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zac extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zac> CREATOR = new zae();

    /* renamed from: A  reason: collision with root package name */
    public final String f25070A;

    /* renamed from: B  reason: collision with root package name */
    public final int f25071B;

    /* renamed from: z  reason: collision with root package name */
    public final int f25072z;

    public zac(int i2, String str, int i3) {
        this.f25072z = i2;
        this.f25070A = str;
        this.f25071B = i3;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int i3 = this.f25072z;
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.n(parcel, 1, i3);
        SafeParcelWriter.w(parcel, 2, this.f25070A, false);
        SafeParcelWriter.n(parcel, 3, this.f25071B);
        SafeParcelWriter.b(parcel, a2);
    }

    public zac(String str, int i2) {
        this.f25072z = 1;
        this.f25070A = str;
        this.f25071B = i2;
    }
}
