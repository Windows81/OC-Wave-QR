package androidx.compose.runtime;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
final class ParcelableSnapshotMutableIntState extends SnapshotMutableIntStateImpl implements Parcelable {

    /* renamed from: B  reason: collision with root package name */
    public static final Companion f14747B = new Companion((DefaultConstructorMarker) null);
    public static final Parcelable.Creator<ParcelableSnapshotMutableIntState> CREATOR = new ParcelableSnapshotMutableIntState$Companion$CREATOR$1();

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public ParcelableSnapshotMutableIntState(int i2) {
        super(i2);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(e());
    }
}
