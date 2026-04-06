package androidx.compose.runtime;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

@Metadata
public final class ParcelableSnapshotMutableState$Companion$CREATOR$1 implements Parcelable.ClassLoaderCreator<ParcelableSnapshotMutableState<Object>> {
    /* renamed from: a */
    public ParcelableSnapshotMutableState createFromParcel(Parcel parcel) {
        return createFromParcel(parcel, (ClassLoader) null);
    }

    /* renamed from: b */
    public ParcelableSnapshotMutableState createFromParcel(Parcel parcel, ClassLoader classLoader) {
        SnapshotMutationPolicy snapshotMutationPolicy;
        if (classLoader == null) {
            classLoader = ParcelableSnapshotMutableState$Companion$CREATOR$1.class.getClassLoader();
        }
        Object readValue = parcel.readValue(classLoader);
        int readInt = parcel.readInt();
        if (readInt == 0) {
            snapshotMutationPolicy = SnapshotStateKt.k();
        } else if (readInt == 1) {
            snapshotMutationPolicy = SnapshotStateKt.r();
        } else if (readInt == 2) {
            snapshotMutationPolicy = SnapshotStateKt.o();
        } else {
            throw new IllegalStateException("Unsupported MutableState policy " + readInt + " was restored");
        }
        return new ParcelableSnapshotMutableState(readValue, snapshotMutationPolicy);
    }

    /* renamed from: c */
    public ParcelableSnapshotMutableState[] newArray(int i2) {
        return new ParcelableSnapshotMutableState[i2];
    }
}
