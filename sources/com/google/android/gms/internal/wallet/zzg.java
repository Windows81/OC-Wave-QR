package com.google.android.gms.internal.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzg> CREATOR = new zzh();

    /* renamed from: z  reason: collision with root package name */
    public final byte[] f25936z;

    public zzg(byte[] bArr) {
        this.f25936z = bArr;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        byte[] bArr = this.f25936z;
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.g(parcel, 2, bArr, false);
        SafeParcelWriter.b(parcel, a2);
    }
}
