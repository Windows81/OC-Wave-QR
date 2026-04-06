package com.google.android.gms.common.data;

import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;

public abstract class DataBufferRef {

    /* renamed from: a  reason: collision with root package name */
    public final DataHolder f24788a;

    /* renamed from: b  reason: collision with root package name */
    public int f24789b;

    /* renamed from: c  reason: collision with root package name */
    public int f24790c;

    public final void a(int i2) {
        boolean z2 = false;
        if (i2 >= 0 && i2 < this.f24788a.getCount()) {
            z2 = true;
        }
        Preconditions.q(z2);
        this.f24789b = i2;
        this.f24790c = this.f24788a.f0(i2);
    }

    public boolean equals(Object obj) {
        if (obj instanceof DataBufferRef) {
            DataBufferRef dataBufferRef = (DataBufferRef) obj;
            return Objects.a(Integer.valueOf(dataBufferRef.f24789b), Integer.valueOf(this.f24789b)) && Objects.a(Integer.valueOf(dataBufferRef.f24790c), Integer.valueOf(this.f24790c)) && dataBufferRef.f24788a == this.f24788a;
        }
    }

    public int hashCode() {
        return Objects.b(Integer.valueOf(this.f24789b), Integer.valueOf(this.f24790c), this.f24788a);
    }
}
