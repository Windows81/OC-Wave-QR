package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzl implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N = SafeParcelReader.N(parcel);
        Bundle bundle = null;
        ConnectionTelemetryConfiguration connectionTelemetryConfiguration = null;
        int i2 = 0;
        Feature[] featureArr = null;
        while (parcel.dataPosition() < N) {
            int E = SafeParcelReader.E(parcel);
            int w2 = SafeParcelReader.w(E);
            if (w2 == 1) {
                bundle = SafeParcelReader.f(parcel, E);
            } else if (w2 == 2) {
                featureArr = (Feature[]) SafeParcelReader.t(parcel, E, Feature.CREATOR);
            } else if (w2 == 3) {
                i2 = SafeParcelReader.G(parcel, E);
            } else if (w2 != 4) {
                SafeParcelReader.M(parcel, E);
            } else {
                connectionTelemetryConfiguration = (ConnectionTelemetryConfiguration) SafeParcelReader.p(parcel, E, ConnectionTelemetryConfiguration.CREATOR);
            }
        }
        SafeParcelReader.v(parcel, N);
        return new zzk(bundle, featureArr, i2, connectionTelemetryConfiguration);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new zzk[i2];
    }
}
