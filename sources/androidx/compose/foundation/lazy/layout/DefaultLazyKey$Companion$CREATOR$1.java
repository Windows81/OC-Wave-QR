package androidx.compose.foundation.lazy.layout;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

@Metadata
public final class DefaultLazyKey$Companion$CREATOR$1 implements Parcelable.Creator<DefaultLazyKey> {
    /* renamed from: a */
    public DefaultLazyKey createFromParcel(Parcel parcel) {
        return new DefaultLazyKey(parcel.readInt());
    }

    /* renamed from: b */
    public DefaultLazyKey[] newArray(int i2) {
        return new DefaultLazyKey[i2];
    }
}
