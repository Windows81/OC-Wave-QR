package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

final class zzah implements Iterator<zzaq> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ zzaf f25327A;

    /* renamed from: z  reason: collision with root package name */
    public int f25328z = 0;

    public zzah(zzaf zzaf) {
        this.f25327A = zzaf;
    }

    public final boolean hasNext() {
        return this.f25328z < this.f25327A.w();
    }

    public final /* synthetic */ Object next() {
        if (this.f25328z < this.f25327A.w()) {
            zzaf zzaf = this.f25327A;
            int i2 = this.f25328z;
            this.f25328z = i2 + 1;
            return zzaf.s(i2);
        }
        int i3 = this.f25328z;
        throw new NoSuchElementException("Out of bounds index: " + i3);
    }
}
