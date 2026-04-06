package com.google.android.gms.pay;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzaj implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N = SafeParcelReader.N(parcel);
        PendingIntent pendingIntent = null;
        int i2 = 0;
        byte[][] bArr = null;
        while (parcel.dataPosition() < N) {
            int E = SafeParcelReader.E(parcel);
            int w2 = SafeParcelReader.w(E);
            if (w2 == 1) {
                i2 = SafeParcelReader.G(parcel, E);
            } else if (w2 == 2) {
                pendingIntent = (PendingIntent) SafeParcelReader.p(parcel, E, PendingIntent.CREATOR);
            } else if (w2 != 4) {
                SafeParcelReader.M(parcel, E);
            } else {
                bArr = SafeParcelReader.h(parcel, E);
            }
        }
        SafeParcelReader.v(parcel, N);
        return new zzai(i2, pendingIntent, bArr);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new zzai[i2];
    }
}
