package com.google.android.gms.internal.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zze extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zze> CREATOR = new zzf();

    /* renamed from: z  reason: collision with root package name */
    public final byte[] f25935z;

    public zze(byte[] bArr) {
        this.f25935z = bArr;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        byte[] bArr = this.f25935z;
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.g(parcel, 2, bArr, false);
        SafeParcelWriter.b(parcel, a2);
    }
}
