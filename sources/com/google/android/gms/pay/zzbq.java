package com.google.android.gms.pay;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzbq implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N = SafeParcelReader.N(parcel);
        zzbr zzbr = null;
        Bitmap bitmap = null;
        while (parcel.dataPosition() < N) {
            int E = SafeParcelReader.E(parcel);
            int w2 = SafeParcelReader.w(E);
            if (w2 == 1) {
                zzbr = (zzbr) SafeParcelReader.p(parcel, E, zzbr.CREATOR);
            } else if (w2 != 2) {
                SafeParcelReader.M(parcel, E);
            } else {
                bitmap = (Bitmap) SafeParcelReader.p(parcel, E, Bitmap.CREATOR);
            }
        }
        SafeParcelReader.v(parcel, N);
        return new zzbp(zzbr, bitmap);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new zzbp[i2];
    }
}
