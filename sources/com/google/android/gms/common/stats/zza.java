package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

public final class zza implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int N = SafeParcelReader.N(parcel);
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        boolean z2 = false;
        String str = null;
        ArrayList arrayList = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        float f2 = 0.0f;
        while (parcel.dataPosition() < N) {
            int E = SafeParcelReader.E(parcel);
            switch (SafeParcelReader.w(E)) {
                case 1:
                    i2 = SafeParcelReader.G(parcel2, E);
                    break;
                case 2:
                    j2 = SafeParcelReader.J(parcel2, E);
                    break;
                case 4:
                    str = SafeParcelReader.q(parcel2, E);
                    break;
                case 5:
                    i4 = SafeParcelReader.G(parcel2, E);
                    break;
                case 6:
                    arrayList = SafeParcelReader.s(parcel2, E);
                    break;
                case 8:
                    j3 = SafeParcelReader.J(parcel2, E);
                    break;
                case 10:
                    str3 = SafeParcelReader.q(parcel2, E);
                    break;
                case 11:
                    i3 = SafeParcelReader.G(parcel2, E);
                    break;
                case 12:
                    str2 = SafeParcelReader.q(parcel2, E);
                    break;
                case 13:
                    str4 = SafeParcelReader.q(parcel2, E);
                    break;
                case 14:
                    i5 = SafeParcelReader.G(parcel2, E);
                    break;
                case 15:
                    f2 = SafeParcelReader.C(parcel2, E);
                    break;
                case 16:
                    j4 = SafeParcelReader.J(parcel2, E);
                    break;
                case 17:
                    str5 = SafeParcelReader.q(parcel2, E);
                    break;
                case 18:
                    z2 = SafeParcelReader.x(parcel2, E);
                    break;
                default:
                    SafeParcelReader.M(parcel2, E);
                    break;
            }
        }
        SafeParcelReader.v(parcel2, N);
        return new WakeLockEvent(i2, j2, i3, str, i4, arrayList, str2, j3, i5, str3, str4, f2, j4, str5, z2);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new WakeLockEvent[i2];
    }
}
