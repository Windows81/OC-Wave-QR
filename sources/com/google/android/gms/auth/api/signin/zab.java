package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

public final class zab implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int N = SafeParcelReader.N(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Uri uri = null;
        String str5 = null;
        String str6 = null;
        ArrayList arrayList = null;
        String str7 = null;
        String str8 = null;
        long j2 = 0;
        int i2 = 0;
        while (parcel.dataPosition() < N) {
            int E = SafeParcelReader.E(parcel);
            switch (SafeParcelReader.w(E)) {
                case 1:
                    i2 = SafeParcelReader.G(parcel2, E);
                    break;
                case 2:
                    str = SafeParcelReader.q(parcel2, E);
                    break;
                case 3:
                    str2 = SafeParcelReader.q(parcel2, E);
                    break;
                case 4:
                    str3 = SafeParcelReader.q(parcel2, E);
                    break;
                case 5:
                    str4 = SafeParcelReader.q(parcel2, E);
                    break;
                case 6:
                    uri = (Uri) SafeParcelReader.p(parcel2, E, Uri.CREATOR);
                    break;
                case 7:
                    str5 = SafeParcelReader.q(parcel2, E);
                    break;
                case 8:
                    j2 = SafeParcelReader.J(parcel2, E);
                    break;
                case 9:
                    str6 = SafeParcelReader.q(parcel2, E);
                    break;
                case 10:
                    arrayList = SafeParcelReader.u(parcel2, E, Scope.CREATOR);
                    break;
                case 11:
                    str7 = SafeParcelReader.q(parcel2, E);
                    break;
                case 12:
                    str8 = SafeParcelReader.q(parcel2, E);
                    break;
                default:
                    SafeParcelReader.M(parcel2, E);
                    break;
            }
        }
        SafeParcelReader.v(parcel2, N);
        return new GoogleSignInAccount(i2, str, str2, str3, str4, uri, str5, j2, str6, arrayList, str7, str8);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new GoogleSignInAccount[i2];
    }
}
