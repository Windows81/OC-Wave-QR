package com.google.android.gms.internal.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzi extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzi> CREATOR = new zzj();

    /* renamed from: z  reason: collision with root package name */
    public final byte[] f25937z;

    public zzi(byte[] bArr) {
        this.f25937z = bArr;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        byte[] bArr = this.f25937z;
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.g(parcel, 1, bArr, false);
        SafeParcelWriter.b(parcel, a2);
    }
}
