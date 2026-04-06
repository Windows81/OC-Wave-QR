package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.util.ArrayUtils;
import java.util.ArrayList;

public final class zzf implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N = SafeParcelReader.N(parcel);
        ArrayList c2 = ArrayUtils.c();
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < N) {
            int E = SafeParcelReader.E(parcel);
            int w2 = SafeParcelReader.w(E);
            if (w2 == 2) {
                str = SafeParcelReader.q(parcel, E);
            } else if (w2 == 3) {
                str2 = SafeParcelReader.q(parcel, E);
            } else if (w2 != 4) {
                SafeParcelReader.M(parcel, E);
            } else {
                c2 = SafeParcelReader.u(parcel, E, LabelValue.CREATOR);
            }
        }
        SafeParcelReader.v(parcel, N);
        return new LabelValueRow(str, str2, c2);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new LabelValueRow[i2];
    }
}
