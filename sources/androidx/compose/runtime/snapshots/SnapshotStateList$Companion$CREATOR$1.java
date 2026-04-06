package androidx.compose.runtime.snapshots;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

@Metadata
public final class SnapshotStateList$Companion$CREATOR$1 implements Parcelable.ClassLoaderCreator<SnapshotStateList<Object>> {
    public static final Object d(Parcel parcel, ClassLoader classLoader, int i2) {
        return parcel.readValue(classLoader);
    }

    /* renamed from: b */
    public SnapshotStateList createFromParcel(Parcel parcel) {
        return createFromParcel(parcel, (ClassLoader) null);
    }

    /* renamed from: c */
    public SnapshotStateList createFromParcel(Parcel parcel, ClassLoader classLoader) {
        if (classLoader == null) {
            classLoader = SnapshotStateList$Companion$CREATOR$1.class.getClassLoader();
        }
        return SnapshotStateListKt.a(parcel.readInt(), new j(parcel, classLoader));
    }

    /* renamed from: e */
    public SnapshotStateList[] newArray(int i2) {
        return new SnapshotStateList[i2];
    }
}
