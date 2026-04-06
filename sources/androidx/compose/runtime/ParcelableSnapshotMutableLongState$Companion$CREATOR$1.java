package androidx.compose.runtime;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

@Metadata
public final class ParcelableSnapshotMutableLongState$Companion$CREATOR$1 implements Parcelable.Creator<ParcelableSnapshotMutableLongState> {
    /* renamed from: a */
    public ParcelableSnapshotMutableLongState createFromParcel(Parcel parcel) {
        return new ParcelableSnapshotMutableLongState(parcel.readLong());
    }

    /* renamed from: b */
    public ParcelableSnapshotMutableLongState[] newArray(int i2) {
        return new ParcelableSnapshotMutableLongState[i2];
    }
}
