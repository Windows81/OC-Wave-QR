package com.google.android.gms.internal.measurement;

import java.util.Iterator;

final class zzam implements Iterator<zzaq> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Iterator f25334z;

    public zzam(Iterator it) {
        this.f25334z = it;
    }

    public final boolean hasNext() {
        return this.f25334z.hasNext();
    }

    public final /* synthetic */ Object next() {
        return new zzas((String) this.f25334z.next());
    }
}
