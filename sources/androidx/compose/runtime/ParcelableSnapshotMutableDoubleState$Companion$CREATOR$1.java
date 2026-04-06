package androidx.compose.runtime;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

@Metadata
public final class ParcelableSnapshotMutableDoubleState$Companion$CREATOR$1 implements Parcelable.Creator<ParcelableSnapshotMutableDoubleState> {
    /* renamed from: a */
    public ParcelableSnapshotMutableDoubleState createFromParcel(Parcel parcel) {
        return new ParcelableSnapshotMutableDoubleState(parcel.readDouble());
    }

    /* renamed from: b */
    public ParcelableSnapshotMutableDoubleState[] newArray(int i2) {
        return new ParcelableSnapshotMutableDoubleState[i2];
    }
}
