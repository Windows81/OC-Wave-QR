package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

final class zzav implements Iterator<zzaq> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ zzas f25350A;

    /* renamed from: z  reason: collision with root package name */
    public int f25351z = 0;

    public zzav(zzas zzas) {
        this.f25350A = zzas;
    }

    public final boolean hasNext() {
        return this.f25351z < this.f25350A.f25345z.length();
    }

    public final /* synthetic */ Object next() {
        if (this.f25351z < this.f25350A.f25345z.length()) {
            int i2 = this.f25351z;
            this.f25351z = i2 + 1;
            return new zzas(String.valueOf(i2));
        }
        throw new NoSuchElementException();
    }
}
