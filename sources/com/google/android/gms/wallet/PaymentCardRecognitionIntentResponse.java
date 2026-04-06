package com.google.android.gms.wallet;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public class PaymentCardRecognitionIntentResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PaymentCardRecognitionIntentResponse> CREATOR = new zzz();

    /* renamed from: z  reason: collision with root package name */
    public PendingIntent f27287z;

    public PaymentCardRecognitionIntentResponse(PendingIntent pendingIntent) {
        this.f27287z = pendingIntent;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.v(parcel, 1, this.f27287z, i2, false);
        SafeParcelWriter.b(parcel, a2);
    }
}
