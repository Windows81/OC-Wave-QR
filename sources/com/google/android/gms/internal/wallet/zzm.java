package com.google.android.gms.internal.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.RemoteViews;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzm extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzm> CREATOR = new zzn();

    /* renamed from: A  reason: collision with root package name */
    public int[] f25939A;

    /* renamed from: B  reason: collision with root package name */
    public RemoteViews f25940B;
    public byte[] C;

    /* renamed from: z  reason: collision with root package name */
    public String[] f25941z;

    public zzm(String[] strArr, int[] iArr, RemoteViews remoteViews, byte[] bArr) {
        this.f25941z = strArr;
        this.f25939A = iArr;
        this.f25940B = remoteViews;
        this.C = bArr;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.x(parcel, 1, this.f25941z, false);
        SafeParcelWriter.o(parcel, 2, this.f25939A, false);
        SafeParcelWriter.v(parcel, 3, this.f25940B, i2, false);
        SafeParcelWriter.g(parcel, 4, this.C, false);
        SafeParcelWriter.b(parcel, a2);
    }
}
