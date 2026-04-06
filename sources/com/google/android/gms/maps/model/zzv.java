package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzv implements Parcelable.Creator<TileOverlayOptions> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N = SafeParcelReader.N(parcel);
        IBinder iBinder = null;
        boolean z2 = false;
        float f2 = 0.0f;
        float f3 = 0.0f;
        boolean z3 = true;
        while (parcel.dataPosition() < N) {
            int E = SafeParcelReader.E(parcel);
            int w2 = SafeParcelReader.w(E);
            if (w2 == 2) {
                iBinder = SafeParcelReader.F(parcel, E);
            } else if (w2 == 3) {
                z2 = SafeParcelReader.x(parcel, E);
            } else if (w2 == 4) {
                f2 = SafeParcelReader.C(parcel, E);
            } else if (w2 == 5) {
                z3 = SafeParcelReader.x(parcel, E);
            } else if (w2 != 6) {
                SafeParcelReader.M(parcel, E);
            } else {
                f3 = SafeParcelReader.C(parcel, E);
            }
        }
        SafeParcelReader.v(parcel, N);
        return new TileOverlayOptions(iBinder, z2, f2, z3, f3);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new TileOverlayOptions[i2];
    }
}
