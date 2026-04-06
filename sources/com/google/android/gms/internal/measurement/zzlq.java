package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

final class zzlq<K> implements Iterator<Map.Entry<K, Object>> {

    /* renamed from: z  reason: collision with root package name */
    public Iterator f25641z;

    public zzlq(Iterator it) {
        this.f25641z = it;
    }

    public final boolean hasNext() {
        return this.f25641z.hasNext();
    }

    public final /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.f25641z.next();
        return entry.getValue() instanceof zzlp ? new zzlo(entry) : entry;
    }

    public final void remove() {
        this.f25641z.remove();
    }
}
