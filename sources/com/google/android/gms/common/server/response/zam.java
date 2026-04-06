package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.server.response.FastJsonResponse;

public final class zam extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zam> CREATOR = new zak();

    /* renamed from: A  reason: collision with root package name */
    public final String f25096A;

    /* renamed from: B  reason: collision with root package name */
    public final FastJsonResponse.Field f25097B;

    /* renamed from: z  reason: collision with root package name */
    public final int f25098z;

    public zam(int i2, String str, FastJsonResponse.Field field) {
        this.f25098z = i2;
        this.f25096A = str;
        this.f25097B = field;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int i3 = this.f25098z;
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.n(parcel, 1, i3);
        SafeParcelWriter.w(parcel, 2, this.f25096A, false);
        SafeParcelWriter.v(parcel, 3, this.f25097B, i2, false);
        SafeParcelWriter.b(parcel, a2);
    }

    public zam(String str, FastJsonResponse.Field field) {
        this.f25098z = 1;
        this.f25096A = str;
        this.f25097B = field;
    }
}
