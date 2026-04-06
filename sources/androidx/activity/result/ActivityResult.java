package androidx.activity.result;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class ActivityResult implements Parcelable {

    /* renamed from: B  reason: collision with root package name */
    public static final Companion f216B = new Companion((DefaultConstructorMarker) null);
    public static final Parcelable.Creator<ActivityResult> CREATOR = new ActivityResult$Companion$CREATOR$1();

    /* renamed from: A  reason: collision with root package name */
    public final Intent f217A;

    /* renamed from: z  reason: collision with root package name */
    public final int f218z;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(int i2) {
            return i2 != -1 ? i2 != 0 ? String.valueOf(i2) : "RESULT_CANCELED" : "RESULT_OK";
        }

        public Companion() {
        }
    }

    public ActivityResult(int i2, Intent intent) {
        this.f218z = i2;
        this.f217A = intent;
    }

    public final Intent a() {
        return this.f217A;
    }

    public final int b() {
        return this.f218z;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "ActivityResult{resultCode=" + f216B.a(this.f218z) + ", data=" + this.f217A + '}';
    }

    public void writeToParcel(Parcel parcel, int i2) {
        Intrinsics.i(parcel, "dest");
        parcel.writeInt(this.f218z);
        parcel.writeInt(this.f217A == null ? 0 : 1);
        Intent intent = this.f217A;
        if (intent != null) {
            intent.writeToParcel(parcel, i2);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ActivityResult(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel));
        Intrinsics.i(parcel, "parcel");
    }
}
