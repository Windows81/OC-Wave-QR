package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzdw implements Parcelable.Creator<zzdt> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int N = SafeParcelReader.N(parcel);
        long j2 = 0;
        long j3 = 0;
        boolean z2 = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        Bundle bundle = null;
        String str4 = null;
        while (parcel.dataPosition() < N) {
            int E = SafeParcelReader.E(parcel);
            switch (SafeParcelReader.w(E)) {
                case 1:
                    j2 = SafeParcelReader.J(parcel2, E);
                    break;
                case 2:
                    j3 = SafeParcelReader.J(parcel2, E);
                    break;
                case 3:
                    z2 = SafeParcelReader.x(parcel2, E);
                    break;
                case 4:
                    str = SafeParcelReader.q(parcel2, E);
                    break;
                case 5:
                    str2 = SafeParcelReader.q(parcel2, E);
                    break;
                case 6:
                    str3 = SafeParcelReader.q(parcel2, E);
                    break;
                case 7:
                    bundle = SafeParcelReader.f(parcel2, E);
                    break;
                case 8:
                    str4 = SafeParcelReader.q(parcel2, E);
                    break;
                default:
                    SafeParcelReader.M(parcel2, E);
                    break;
            }
        }
        SafeParcelReader.v(parcel2, N);
        return new zzdt(j2, j3, z2, str, str2, str3, bundle, str4);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new zzdt[i2];
    }
}
