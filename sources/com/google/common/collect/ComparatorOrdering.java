package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.Comparator;

@ElementTypesAreNonnullByDefault
final class ComparatorOrdering<T> extends Ordering<T> implements Serializable {

    /* renamed from: z  reason: collision with root package name */
    public final Comparator f28051z;

    public ComparatorOrdering(Comparator comparator) {
        this.f28051z = (Comparator) Preconditions.q(comparator);
    }

    public int compare(Object obj, Object obj2) {
        return this.f28051z.compare(obj, obj2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ComparatorOrdering) {
            return this.f28051z.equals(((ComparatorOrdering) obj).f28051z);
        }
        return false;
    }

    public int hashCode() {
        return this.f28051z.hashCode();
    }

    public String toString() {
        return this.f28051z.toString();
    }
}
