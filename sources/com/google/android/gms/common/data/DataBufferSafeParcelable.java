package com.google.android.gms.common.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class DataBufferSafeParcelable<T extends SafeParcelable> extends AbstractDataBuffer<T> {

    /* renamed from: B  reason: collision with root package name */
    public static final String[] f24791B = {"data"};

    /* renamed from: A  reason: collision with root package name */
    public final Parcelable.Creator f24792A;

    /* renamed from: m */
    public SafeParcelable get(int i2) {
        DataHolder dataHolder = (DataHolder) Preconditions.m(this.f24782z);
        byte[] H = dataHolder.H("data", i2, dataHolder.f0(i2));
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(H, 0, H.length);
        obtain.setDataPosition(0);
        SafeParcelable safeParcelable = (SafeParcelable) this.f24792A.createFromParcel(obtain);
        obtain.recycle();
        return safeParcelable;
    }
}
