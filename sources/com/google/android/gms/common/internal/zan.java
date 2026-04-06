package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zan implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int N = SafeParcelReader.N(parcel);
        int i2 = -1;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        String str = null;
        String str2 = null;
        long j2 = 0;
        long j3 = 0;
        while (parcel.dataPosition() < N) {
            int E = SafeParcelReader.E(parcel);
            switch (SafeParcelReader.w(E)) {
                case 1:
                    i3 = SafeParcelReader.G(parcel2, E);
                    break;
                case 2:
                    i4 = SafeParcelReader.G(parcel2, E);
                    break;
                case 3:
                    i5 = SafeParcelReader.G(parcel2, E);
                    break;
                case 4:
                    j2 = SafeParcelReader.J(parcel2, E);
                    break;
                case 5:
                    j3 = SafeParcelReader.J(parcel2, E);
                    break;
                case 6:
                    str = SafeParcelReader.q(parcel2, E);
                    break;
                case 7:
                    str2 = SafeParcelReader.q(parcel2, E);
                    break;
                case 8:
                    i6 = SafeParcelReader.G(parcel2, E);
                    break;
                case 9:
                    i2 = SafeParcelReader.G(parcel2, E);
                    break;
                default:
                    SafeParcelReader.M(parcel2, E);
                    break;
            }
        }
        SafeParcelReader.v(parcel2, N);
        return new MethodInvocation(i3, i4, i5, j2, j3, str, str2, i6, i2);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new MethodInvocation[i2];
    }
}
