package com.google.android.gms.signin.internal;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.base.zab;
import com.google.android.gms.internal.base.zac;

public abstract class zad extends zab implements zae {
    public zad() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    public final boolean W2(int i2, Parcel parcel, Parcel parcel2, int i3) {
        switch (i2) {
            case 3:
                ConnectionResult connectionResult = (ConnectionResult) zac.a(parcel, ConnectionResult.CREATOR);
                zaa zaa = (zaa) zac.a(parcel, zaa.CREATOR);
                zac.b(parcel);
                break;
            case 4:
                Status status = (Status) zac.a(parcel, Status.CREATOR);
                zac.b(parcel);
                break;
            case 6:
                Status status2 = (Status) zac.a(parcel, Status.CREATOR);
                zac.b(parcel);
                break;
            case 7:
                Status status3 = (Status) zac.a(parcel, Status.CREATOR);
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) zac.a(parcel, GoogleSignInAccount.CREATOR);
                zac.b(parcel);
                break;
            case 8:
                zac.b(parcel);
                E0((zak) zac.a(parcel, zak.CREATOR));
                break;
            case 9:
                zag zag = (zag) zac.a(parcel, zag.CREATOR);
                zac.b(parcel);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
