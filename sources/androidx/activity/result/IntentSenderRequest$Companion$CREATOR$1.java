package androidx.activity.result;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class IntentSenderRequest$Companion$CREATOR$1 implements Parcelable.Creator<IntentSenderRequest> {
    /* renamed from: a */
    public IntentSenderRequest createFromParcel(Parcel parcel) {
        Intrinsics.i(parcel, "inParcel");
        return new IntentSenderRequest(parcel);
    }

    /* renamed from: b */
    public IntentSenderRequest[] newArray(int i2) {
        return new IntentSenderRequest[i2];
    }
}
