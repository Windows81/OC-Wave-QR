package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzp implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N = SafeParcelReader.N(parcel);
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        String str = null;
        IBinder iBinder = null;
        while (parcel.dataPosition() < N) {
            int E = SafeParcelReader.E(parcel);
            switch (SafeParcelReader.w(E)) {
                case 1:
                    str = SafeParcelReader.q(parcel, E);
                    break;
                case 2:
                    z2 = SafeParcelReader.x(parcel, E);
                    break;
                case 3:
                    z3 = SafeParcelReader.x(parcel, E);
                    break;
                case 4:
                    iBinder = SafeParcelReader.F(parcel, E);
                    break;
                case 5:
                    z4 = SafeParcelReader.x(parcel, E);
                    break;
                case 6:
                    z5 = SafeParcelReader.x(parcel, E);
                    break;
                default:
                    SafeParcelReader.M(parcel, E);
                    break;
            }
        }
        SafeParcelReader.v(parcel, N);
        return new zzo(str, z2, z3, iBinder, z4, z5);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new zzo[i2];
    }
}
