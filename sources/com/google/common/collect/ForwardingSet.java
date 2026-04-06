package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.Collection;
import java.util.Set;

@ElementTypesAreNonnullByDefault
public abstract class ForwardingSet<E> extends ForwardingCollection<E> implements Set<E> {
    /* renamed from: Z */
    public abstract Set Q();

    public boolean a0(Collection collection) {
        return Sets.m(this, (Collection) Preconditions.q(collection));
    }

    public boolean equals(Object obj) {
        return obj == this || Q().equals(obj);
    }

    public int hashCode() {
        return Q().hashCode();
    }
}
