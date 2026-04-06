package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class WalletObjectMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<WalletObjectMessage> CREATOR = new zzo();

    /* renamed from: A  reason: collision with root package name */
    public String f27366A;

    /* renamed from: B  reason: collision with root package name */
    public TimeInterval f27367B;
    public UriData C;
    public UriData D;

    /* renamed from: z  reason: collision with root package name */
    public String f27368z;

    public final class Builder {
    }

    public WalletObjectMessage(String str, String str2, TimeInterval timeInterval, UriData uriData, UriData uriData2) {
        this.f27368z = str;
        this.f27366A = str2;
        this.f27367B = timeInterval;
        this.C = uriData;
        this.D = uriData2;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.w(parcel, 2, this.f27368z, false);
        SafeParcelWriter.w(parcel, 3, this.f27366A, false);
        SafeParcelWriter.v(parcel, 4, this.f27367B, i2, false);
        SafeParcelWriter.v(parcel, 5, this.C, i2, false);
        SafeParcelWriter.v(parcel, 6, this.D, i2, false);
        SafeParcelWriter.b(parcel, a2);
    }
}
