package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public class Cap extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Cap> CREATOR = new zzb();

    /* renamed from: A  reason: collision with root package name */
    public final BitmapDescriptor f26002A;

    /* renamed from: B  reason: collision with root package name */
    public final Float f26003B;

    /* renamed from: z  reason: collision with root package name */
    public final int f26004z;

    public Cap(int i2) {
        this(i2, (BitmapDescriptor) null, (Float) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Cap)) {
            return false;
        }
        Cap cap = (Cap) obj;
        return this.f26004z == cap.f26004z && Objects.a(this.f26002A, cap.f26002A) && Objects.a(this.f26003B, cap.f26003B);
    }

    public int hashCode() {
        return Objects.b(Integer.valueOf(this.f26004z), this.f26002A, this.f26003B);
    }

    public String toString() {
        int i2 = this.f26004z;
        StringBuilder sb = new StringBuilder(23);
        sb.append("[Cap: type=");
        sb.append(i2);
        sb.append("]");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.n(parcel, 2, this.f26004z);
        BitmapDescriptor bitmapDescriptor = this.f26002A;
        SafeParcelWriter.m(parcel, 3, bitmapDescriptor == null ? null : bitmapDescriptor.a().asBinder(), false);
        SafeParcelWriter.l(parcel, 4, this.f26003B, false);
        SafeParcelWriter.b(parcel, a2);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Cap(int r2, android.os.IBinder r3, java.lang.Float r4) {
        /*
            r1 = this;
            if (r3 != 0) goto L_0x0004
            r3 = 0
            goto L_0x000e
        L_0x0004:
            com.google.android.gms.dynamic.IObjectWrapper r3 = com.google.android.gms.dynamic.IObjectWrapper.Stub.N(r3)
            com.google.android.gms.maps.model.BitmapDescriptor r0 = new com.google.android.gms.maps.model.BitmapDescriptor
            r0.<init>(r3)
            r3 = r0
        L_0x000e:
            r1.<init>((int) r2, (com.google.android.gms.maps.model.BitmapDescriptor) r3, (java.lang.Float) r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.model.Cap.<init>(int, android.os.IBinder, java.lang.Float):void");
    }

    public Cap(int i2, BitmapDescriptor bitmapDescriptor, Float f2) {
        boolean z2 = true;
        boolean z3 = f2 != null && f2.floatValue() > 0.0f;
        if (i2 == 3) {
            z2 = (bitmapDescriptor == null || !z3) ? false : z2;
            i2 = 3;
        }
        Preconditions.b(z2, String.format("Invalid Cap: type=%s bitmapDescriptor=%s bitmapRefWidth=%s", new Object[]{Integer.valueOf(i2), bitmapDescriptor, f2}));
        this.f26004z = i2;
        this.f26002A = bitmapDescriptor;
        this.f26003B = f2;
    }
}
