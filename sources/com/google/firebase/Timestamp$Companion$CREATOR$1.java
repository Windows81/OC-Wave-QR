package com.google.firebase;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class Timestamp$Companion$CREATOR$1 implements Parcelable.Creator<Timestamp> {
    /* renamed from: a */
    public Timestamp createFromParcel(Parcel parcel) {
        Intrinsics.i(parcel, "source");
        return new Timestamp(parcel.readLong(), parcel.readInt());
    }

    /* renamed from: b */
    public Timestamp[] newArray(int i2) {
        return new Timestamp[i2];
    }
}
