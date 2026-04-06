package com.google.android.gms.identity.intents;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.identity.intents.model.CountrySpecification;
import java.util.ArrayList;

public final class zze implements Parcelable.Creator<UserAddressRequest> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N = SafeParcelReader.N(parcel);
        ArrayList arrayList = null;
        while (parcel.dataPosition() < N) {
            int E = SafeParcelReader.E(parcel);
            if (SafeParcelReader.w(E) != 2) {
                SafeParcelReader.M(parcel, E);
            } else {
                arrayList = SafeParcelReader.u(parcel, E, CountrySpecification.CREATOR);
            }
        }
        SafeParcelReader.v(parcel, N);
        return new UserAddressRequest(arrayList);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i2) {
        return new UserAddressRequest[i2];
    }
}
