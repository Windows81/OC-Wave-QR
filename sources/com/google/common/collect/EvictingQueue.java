package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.Collection;
import java.util.Queue;

@ElementTypesAreNonnullByDefault
public final class EvictingQueue<E> extends ForwardingQueue<E> implements Serializable {

    /* renamed from: A  reason: collision with root package name */
    public final int f28088A;

    /* renamed from: z  reason: collision with root package name */
    public final Queue f28089z;

    /* renamed from: Z */
    public Queue Q() {
        return this.f28089z;
    }

    public boolean add(Object obj) {
        Preconditions.q(obj);
        if (this.f28088A == 0) {
            return true;
        }
        if (size() == this.f28088A) {
            this.f28089z.remove();
        }
        this.f28089z.add(obj);
        return true;
    }

    public boolean addAll(Collection collection) {
        int size = collection.size();
        if (size < this.f28088A) {
            return R(collection);
        }
        clear();
        return Iterables.a(this, Iterables.l(collection, size - this.f28088A));
    }

    public boolean offer(Object obj) {
        return add(obj);
    }

    public Object[] toArray() {
        return super.toArray();
    }
}
