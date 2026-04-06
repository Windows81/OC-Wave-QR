package androidx.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class NavBackStackEntryState$Companion$CREATOR$1 implements Parcelable.Creator<NavBackStackEntryState> {
    /* renamed from: a */
    public NavBackStackEntryState createFromParcel(Parcel parcel) {
        Intrinsics.i(parcel, "inParcel");
        return new NavBackStackEntryState(parcel);
    }

    /* renamed from: b */
    public NavBackStackEntryState[] newArray(int i2) {
        return new NavBackStackEntryState[i2];
    }
}
