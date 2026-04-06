package com.google.android.gms.common;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class zzo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzo> CREATOR = new zzp();

    /* renamed from: A  reason: collision with root package name */
    public final boolean f25175A;

    /* renamed from: B  reason: collision with root package name */
    public final boolean f25176B;
    public final Context C;
    public final boolean D;
    public final boolean E;

    /* renamed from: z  reason: collision with root package name */
    public final String f25177z;

    public zzo(String str, boolean z2, boolean z3, IBinder iBinder, boolean z4, boolean z5) {
        this.f25177z = str;
        this.f25175A = z2;
        this.f25176B = z3;
        this.C = (Context) ObjectWrapper.P(IObjectWrapper.Stub.N(iBinder));
        this.D = z4;
        this.E = z5;
    }

    /* JADX WARNING: type inference failed for: r5v5, types: [com.google.android.gms.dynamic.IObjectWrapper, android.os.IBinder] */
    public final void writeToParcel(Parcel parcel, int i2) {
        String str = this.f25177z;
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.w(parcel, 1, str, false);
        SafeParcelWriter.c(parcel, 2, this.f25175A);
        SafeParcelWriter.c(parcel, 3, this.f25176B);
        SafeParcelWriter.m(parcel, 4, ObjectWrapper.u1(this.C), false);
        SafeParcelWriter.c(parcel, 5, this.D);
        SafeParcelWriter.c(parcel, 6, this.E);
        SafeParcelWriter.b(parcel, a2);
    }
}
