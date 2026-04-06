package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.server.response.FastJsonResponse;

public final class zak implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N = SafeParcelReader.N(parcel);
        String str = null;
        int i2 = 0;
        FastJsonResponse.Field field = null;
        while (parcel.dataPosition() < N) {
            int E = SafeParcelReader.E(parcel);
            int w2 = SafeParcelReader.w(E);
            if (w2 == 1) {
                i2 = SafeParcelReader.G(parcel, E);
            } else if (w2 == 2) {
                str = SafeParcelReader.q(parcel, E);
            } else if (w2 != 3) {
                SafeParcelReader.M(parcel, E);
            } else {
                field = (FastJsonResponse.Field) SafeParcelReader.p(parcel, E, FastJsonResponse.Field.CREATOR);
            }
        }
        SafeParcelReader.v(parcel, N);
        return new zam(i2, str, field);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new zam[i2];
    }
}
