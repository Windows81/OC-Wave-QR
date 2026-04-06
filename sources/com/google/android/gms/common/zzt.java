package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzt implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N = SafeParcelReader.N(parcel);
        boolean z2 = false;
        String str = null;
        IBinder iBinder = null;
        boolean z3 = false;
        while (parcel.dataPosition() < N) {
            int E = SafeParcelReader.E(parcel);
            int w2 = SafeParcelReader.w(E);
            if (w2 == 1) {
                str = SafeParcelReader.q(parcel, E);
            } else if (w2 == 2) {
                iBinder = SafeParcelReader.F(parcel, E);
            } else if (w2 == 3) {
                z2 = SafeParcelReader.x(parcel, E);
            } else if (w2 != 4) {
                SafeParcelReader.M(parcel, E);
            } else {
                z3 = SafeParcelReader.x(parcel, E);
            }
        }
        SafeParcelReader.v(parcel, N);
        return new zzs(str, iBinder, z2, z3);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new zzs[i2];
    }
}
