package com.google.android.gms.pay;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzap implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N = SafeParcelReader.N(parcel);
        zzcz[] zzczArr = null;
        Bitmap bitmap = null;
        Bitmap bitmap2 = null;
        zzdd[] zzddArr = null;
        while (parcel.dataPosition() < N) {
            int E = SafeParcelReader.E(parcel);
            int w2 = SafeParcelReader.w(E);
            if (w2 == 1) {
                zzczArr = (zzcz[]) SafeParcelReader.t(parcel, E, zzcz.CREATOR);
            } else if (w2 == 2) {
                bitmap = (Bitmap) SafeParcelReader.p(parcel, E, Bitmap.CREATOR);
            } else if (w2 == 3) {
                bitmap2 = (Bitmap) SafeParcelReader.p(parcel, E, Bitmap.CREATOR);
            } else if (w2 != 4) {
                SafeParcelReader.M(parcel, E);
            } else {
                zzddArr = (zzdd[]) SafeParcelReader.t(parcel, E, zzdd.CREATOR);
            }
        }
        SafeParcelReader.v(parcel, N);
        return new zzao(zzczArr, bitmap, bitmap2, zzddArr);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new zzao[i2];
    }
}
