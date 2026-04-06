package androidx.activity.result;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class ActivityResult$Companion$CREATOR$1 implements Parcelable.Creator<ActivityResult> {
    /* renamed from: a */
    public ActivityResult createFromParcel(Parcel parcel) {
        Intrinsics.i(parcel, "parcel");
        return new ActivityResult(parcel);
    }

    /* renamed from: b */
    public ActivityResult[] newArray(int i2) {
        return new ActivityResult[i2];
    }
}
