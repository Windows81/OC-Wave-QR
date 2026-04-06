package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

final class zzng implements Iterator {

    /* renamed from: A  reason: collision with root package name */
    public Iterator f25700A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ zzne f25701B;

    /* renamed from: z  reason: collision with root package name */
    public int f25702z;

    public final Iterator b() {
        if (this.f25700A == null) {
            this.f25700A = this.f25701B.E.entrySet().iterator();
        }
        return this.f25700A;
    }

    public final boolean hasNext() {
        int i2 = this.f25702z;
        return (i2 > 0 && i2 <= this.f25701B.f25696A) || b().hasNext();
    }

    public final /* synthetic */ Object next() {
        if (b().hasNext()) {
            return (Map.Entry) b().next();
        }
        Object[] q2 = this.f25701B.f25698z;
        int i2 = this.f25702z - 1;
        this.f25702z = i2;
        return (zznk) q2[i2];
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public zzng(zzne zzne) {
        this.f25701B = zzne;
        this.f25702z = zzne.f25696A;
    }
}
