package com.google.common.graph;

import com.google.common.collect.AbstractIterator;
import com.google.common.collect.UnmodifiableIterator;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

@ElementTypesAreNonnullByDefault
abstract class MultiEdgesConnecting<E> extends AbstractSet<E> {

    /* renamed from: A  reason: collision with root package name */
    public final Object f28789A;

    /* renamed from: z  reason: collision with root package name */
    public final Map f28790z;

    public boolean contains(Object obj) {
        return this.f28789A.equals(this.f28790z.get(obj));
    }

    /* renamed from: g */
    public UnmodifiableIterator iterator() {
        final Iterator it = this.f28790z.entrySet().iterator();
        return new AbstractIterator<E>() {
            public Object b() {
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (MultiEdgesConnecting.this.f28789A.equals(entry.getValue())) {
                        return entry.getKey();
                    }
                }
                return c();
            }
        };
    }
}
