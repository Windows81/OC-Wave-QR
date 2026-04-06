package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;

final class zzjr extends zzjt {

    /* renamed from: A  reason: collision with root package name */
    public final int f25565A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ zzjs f25566B;

    /* renamed from: z  reason: collision with root package name */
    public int f25567z = 0;

    public zzjr(zzjs zzjs) {
        this.f25566B = zzjs;
        this.f25565A = zzjs.u();
    }

    public final byte a() {
        int i2 = this.f25567z;
        if (i2 < this.f25565A) {
            this.f25567z = i2 + 1;
            return this.f25566B.s(i2);
        }
        throw new NoSuchElementException();
    }

    public final boolean hasNext() {
        return this.f25567z < this.f25565A;
    }
}
