package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

final class zzau implements Iterator<zzaq> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ zzas f25348A;

    /* renamed from: z  reason: collision with root package name */
    public int f25349z = 0;

    public zzau(zzas zzas) {
        this.f25348A = zzas;
    }

    public final boolean hasNext() {
        return this.f25349z < this.f25348A.f25345z.length();
    }

    public final /* synthetic */ Object next() {
        if (this.f25349z < this.f25348A.f25345z.length()) {
            String m2 = this.f25348A.f25345z;
            int i2 = this.f25349z;
            this.f25349z = i2 + 1;
            return new zzas(String.valueOf(m2.charAt(i2)));
        }
        throw new NoSuchElementException();
    }
}
