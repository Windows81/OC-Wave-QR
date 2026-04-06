package com.google.android.gms.wallet;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzz implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N = SafeParcelReader.N(parcel);
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < N) {
            int E = SafeParcelReader.E(parcel);
            if (SafeParcelReader.w(E) != 1) {
                SafeParcelReader.M(parcel, E);
            } else {
                pendingIntent = (PendingIntent) SafeParcelReader.p(parcel, E, PendingIntent.CREATOR);
            }
        }
        SafeParcelReader.v(parcel, N);
        return new PaymentCardRecognitionIntentResponse(pendingIntent);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new PaymentCardRecognitionIntentResponse[i2];
    }
}
