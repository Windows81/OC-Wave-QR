package com.google.android.gms.internal.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.RemoteViews;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzn implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N = SafeParcelReader.N(parcel);
        String[] strArr = null;
        int[] iArr = null;
        RemoteViews remoteViews = null;
        byte[] bArr = null;
        while (parcel.dataPosition() < N) {
            int E = SafeParcelReader.E(parcel);
            int w2 = SafeParcelReader.w(E);
            if (w2 == 1) {
                strArr = SafeParcelReader.r(parcel, E);
            } else if (w2 == 2) {
                iArr = SafeParcelReader.k(parcel, E);
            } else if (w2 == 3) {
                remoteViews = (RemoteViews) SafeParcelReader.p(parcel, E, RemoteViews.CREATOR);
            } else if (w2 != 4) {
                SafeParcelReader.M(parcel, E);
            } else {
                bArr = SafeParcelReader.g(parcel, E);
            }
        }
        SafeParcelReader.v(parcel, N);
        return new zzm(strArr, iArr, remoteViews, bArr);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new zzm[i2];
    }
}
