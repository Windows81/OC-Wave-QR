package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class TextModuleData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TextModuleData> CREATOR = new zzk();

    /* renamed from: A  reason: collision with root package name */
    public String f27360A;

    /* renamed from: z  reason: collision with root package name */
    public String f27361z;

    public TextModuleData(String str, String str2) {
        this.f27361z = str;
        this.f27360A = str2;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.w(parcel, 2, this.f27361z, false);
        SafeParcelWriter.w(parcel, 3, this.f27360A, false);
        SafeParcelWriter.b(parcel, a2);
    }
}
