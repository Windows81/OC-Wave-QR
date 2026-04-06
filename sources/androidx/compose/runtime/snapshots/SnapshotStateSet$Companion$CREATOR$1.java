package androidx.compose.runtime.snapshots;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

@Metadata
public final class SnapshotStateSet$Companion$CREATOR$1 implements Parcelable.ClassLoaderCreator<SnapshotStateSet<Object>> {
    /* renamed from: a */
    public SnapshotStateSet createFromParcel(Parcel parcel) {
        return createFromParcel(parcel, (ClassLoader) null);
    }

    /* renamed from: b */
    public SnapshotStateSet createFromParcel(Parcel parcel, ClassLoader classLoader) {
        SnapshotStateSet snapshotStateSet = new SnapshotStateSet();
        if (classLoader == null) {
            classLoader = SnapshotStateSet.class.getClassLoader();
        }
        int readInt = parcel.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            snapshotStateSet.add(parcel.readValue(classLoader));
        }
        return snapshotStateSet;
    }

    /* renamed from: c */
    public SnapshotStateSet[] newArray(int i2) {
        return new SnapshotStateSet[i2];
    }
}
