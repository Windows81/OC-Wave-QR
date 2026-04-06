package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

final class zzae implements Iterator<zzaq> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Iterator f25322A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Iterator f25323z;

    public zzae(zzaf zzaf, Iterator it, Iterator it2) {
        this.f25323z = it;
        this.f25322A = it2;
    }

    public final boolean hasNext() {
        if (this.f25323z.hasNext()) {
            return true;
        }
        return this.f25322A.hasNext();
    }

    public final /* synthetic */ Object next() {
        if (this.f25323z.hasNext()) {
            return new zzas(((Integer) this.f25323z.next()).toString());
        }
        if (this.f25322A.hasNext()) {
            return new zzas((String) this.f25322A.next());
        }
        throw new NoSuchElementException();
    }
}
