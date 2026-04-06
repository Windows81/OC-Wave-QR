package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

public final class BinderWrapper implements Parcelable {
    public static final Parcelable.Creator<BinderWrapper> CREATOR = new zzh();

    /* renamed from: z  reason: collision with root package name */
    public final IBinder f24862z;

    public /* synthetic */ BinderWrapper(Parcel parcel, zzi zzi) {
        this.f24862z = parcel.readStrongBinder();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeStrongBinder(this.f24862z);
    }
}
