package androidx.compose.runtime;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
final class ParcelableSnapshotMutableDoubleState extends SnapshotMutableDoubleStateImpl implements Parcelable {

    /* renamed from: B  reason: collision with root package name */
    public static final Companion f14745B = new Companion((DefaultConstructorMarker) null);
    public static final Parcelable.Creator<ParcelableSnapshotMutableDoubleState> CREATOR = new ParcelableSnapshotMutableDoubleState$Companion$CREATOR$1();

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public ParcelableSnapshotMutableDoubleState(double d2) {
        super(d2);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeDouble(b());
    }
}
