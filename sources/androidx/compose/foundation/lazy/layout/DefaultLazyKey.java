package androidx.compose.foundation.lazy.layout;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
final class DefaultLazyKey implements Parcelable {

    /* renamed from: A  reason: collision with root package name */
    public static final Companion f4774A = new Companion((DefaultConstructorMarker) null);
    public static final Parcelable.Creator<DefaultLazyKey> CREATOR = new DefaultLazyKey$Companion$CREATOR$1();

    /* renamed from: z  reason: collision with root package name */
    public final int f4775z;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public DefaultLazyKey(int i2) {
        this.f4775z = i2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DefaultLazyKey) && this.f4775z == ((DefaultLazyKey) obj).f4775z;
    }

    public int hashCode() {
        return Integer.hashCode(this.f4775z);
    }

    public String toString() {
        return "DefaultLazyKey(index=" + this.f4775z + ')';
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f4775z);
    }
}
