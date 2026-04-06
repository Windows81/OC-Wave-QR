package androidx.compose.runtime;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

@Metadata
public final class ParcelableSnapshotMutableIntState$Companion$CREATOR$1 implements Parcelable.Creator<ParcelableSnapshotMutableIntState> {
    /* renamed from: a */
    public ParcelableSnapshotMutableIntState createFromParcel(Parcel parcel) {
        return new ParcelableSnapshotMutableIntState(parcel.readInt());
    }

    /* renamed from: b */
    public ParcelableSnapshotMutableIntState[] newArray(int i2) {
        return new ParcelableSnapshotMutableIntState[i2];
    }
}
