package androidx.compose.runtime;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

@Metadata
public final class ParcelableSnapshotMutableFloatState$Companion$CREATOR$1 implements Parcelable.Creator<ParcelableSnapshotMutableFloatState> {
    /* renamed from: a */
    public ParcelableSnapshotMutableFloatState createFromParcel(Parcel parcel) {
        return new ParcelableSnapshotMutableFloatState(parcel.readFloat());
    }

    /* renamed from: b */
    public ParcelableSnapshotMutableFloatState[] newArray(int i2) {
        return new ParcelableSnapshotMutableFloatState[i2];
    }
}
