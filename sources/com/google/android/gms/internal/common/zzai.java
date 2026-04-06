package com.google.android.gms.internal.common;

import org.jspecify.nullness.NullMarked;

@NullMarked
final class zzai extends zzag {
    public static final zzag D = new zzai(new Object[0], 0);

    /* renamed from: B  reason: collision with root package name */
    public final transient Object[] f25283B;
    public final transient int C;

    public zzai(Object[] objArr, int i2) {
        this.f25283B = objArr;
        this.C = i2;
    }

    public final int e(Object[] objArr, int i2) {
        System.arraycopy(this.f25283B, 0, objArr, 0, this.C);
        return this.C;
    }

    public final int g() {
        return this.C;
    }

    public final Object get(int i2) {
        zzs.a(i2, this.C, "index");
        Object obj = this.f25283B[i2];
        obj.getClass();
        return obj;
    }

    public final int h() {
        return 0;
    }

    public final boolean n() {
        return false;
    }

    public final Object[] o() {
        return this.f25283B;
    }

    public final int size() {
        return this.C;
    }
}
