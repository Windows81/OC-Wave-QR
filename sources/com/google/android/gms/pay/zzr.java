package com.google.android.gms.pay;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzr implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N = SafeParcelReader.N(parcel);
        Bitmap[] bitmapArr = null;
        while (parcel.dataPosition() < N) {
            int E = SafeParcelReader.E(parcel);
            if (SafeParcelReader.w(E) != 2) {
                SafeParcelReader.M(parcel, E);
            } else {
                bitmapArr = (Bitmap[]) SafeParcelReader.t(parcel, E, Bitmap.CREATOR);
            }
        }
        SafeParcelReader.v(parcel, N);
        return new zzq(bitmapArr);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new zzq[i2];
    }
}
