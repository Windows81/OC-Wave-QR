package com.google.android.gms.common.server;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public class FavaDiagnosticsEntity extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<FavaDiagnosticsEntity> CREATOR = new zaa();

    /* renamed from: A  reason: collision with root package name */
    public final String f25062A;

    /* renamed from: B  reason: collision with root package name */
    public final int f25063B;

    /* renamed from: z  reason: collision with root package name */
    public final int f25064z;

    public FavaDiagnosticsEntity(int i2, String str, int i3) {
        this.f25064z = i2;
        this.f25062A = str;
        this.f25063B = i3;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int i3 = this.f25064z;
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.n(parcel, 1, i3);
        SafeParcelWriter.w(parcel, 2, this.f25062A, false);
        SafeParcelWriter.n(parcel, 3, this.f25063B);
        SafeParcelWriter.b(parcel, a2);
    }
}
