package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

public final class zzam implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N = SafeParcelReader.N(parcel);
        ArrayList arrayList = null;
        while (parcel.dataPosition() < N) {
            int E = SafeParcelReader.E(parcel);
            if (SafeParcelReader.w(E) != 1) {
                SafeParcelReader.M(parcel, E);
            } else {
                arrayList = SafeParcelReader.s(parcel, E);
            }
        }
        SafeParcelReader.v(parcel, N);
        return new ShippingAddressRequirements(arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new ShippingAddressRequirements[i2];
    }
}
