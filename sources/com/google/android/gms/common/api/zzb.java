package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzb implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N = SafeParcelReader.N(parcel);
        String str = null;
        ConnectionResult connectionResult = null;
        int i2 = 0;
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < N) {
            int E = SafeParcelReader.E(parcel);
            int w2 = SafeParcelReader.w(E);
            if (w2 == 1) {
                i2 = SafeParcelReader.G(parcel, E);
            } else if (w2 == 2) {
                str = SafeParcelReader.q(parcel, E);
            } else if (w2 == 3) {
                pendingIntent = (PendingIntent) SafeParcelReader.p(parcel, E, PendingIntent.CREATOR);
            } else if (w2 != 4) {
                SafeParcelReader.M(parcel, E);
            } else {
                connectionResult = (ConnectionResult) SafeParcelReader.p(parcel, E, ConnectionResult.CREATOR);
            }
        }
        SafeParcelReader.v(parcel, N);
        return new Status(i2, str, pendingIntent, connectionResult);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new Status[i2];
    }
}
