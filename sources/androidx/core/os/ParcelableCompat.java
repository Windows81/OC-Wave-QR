package androidx.core.os;

import android.os.Parcel;
import android.os.Parcelable;

@Deprecated
public final class ParcelableCompat {

    public static class ParcelableCompatCreatorHoneycombMR2<T> implements Parcelable.ClassLoaderCreator<T> {

        /* renamed from: a  reason: collision with root package name */
        public final ParcelableCompatCreatorCallbacks f19968a;

        public Object createFromParcel(Parcel parcel) {
            return this.f19968a.createFromParcel(parcel, (ClassLoader) null);
        }

        public Object[] newArray(int i2) {
            return this.f19968a.newArray(i2);
        }

        public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return this.f19968a.createFromParcel(parcel, classLoader);
        }
    }
}
