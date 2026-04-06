package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzaj implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N = SafeParcelReader.N(parcel);
        int i2 = 0;
        boolean z2 = false;
        boolean z3 = false;
        int i3 = 0;
        int i4 = 0;
        while (parcel.dataPosition() < N) {
            int E = SafeParcelReader.E(parcel);
            int w2 = SafeParcelReader.w(E);
            if (w2 == 1) {
                i2 = SafeParcelReader.G(parcel, E);
            } else if (w2 == 2) {
                z2 = SafeParcelReader.x(parcel, E);
            } else if (w2 == 3) {
                z3 = SafeParcelReader.x(parcel, E);
            } else if (w2 == 4) {
                i3 = SafeParcelReader.G(parcel, E);
            } else if (w2 != 5) {
                SafeParcelReader.M(parcel, E);
            } else {
                i4 = SafeParcelReader.G(parcel, E);
            }
        }
        SafeParcelReader.v(parcel, N);
        return new RootTelemetryConfiguration(i2, z2, z3, i3, i4);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new RootTelemetryConfiguration[i2];
    }
}
