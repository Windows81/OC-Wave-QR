package com.google.common.collect;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Iterator;

@ElementTypesAreNonnullByDefault
final class LexicographicalOrdering<T> extends Ordering<Iterable<T>> implements Serializable {

    /* renamed from: z  reason: collision with root package name */
    public final Comparator f28269z;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof LexicographicalOrdering) {
            return this.f28269z.equals(((LexicographicalOrdering) obj).f28269z);
        }
        return false;
    }

    public int hashCode() {
        return this.f28269z.hashCode() ^ 2075626741;
    }

    /* renamed from: k */
    public int compare(Iterable iterable, Iterable iterable2) {
        Iterator it = iterable2.iterator();
        for (Object compare : iterable) {
            if (!it.hasNext()) {
                return 1;
            }
            int compare2 = this.f28269z.compare(compare, it.next());
            if (compare2 != 0) {
                return compare2;
            }
        }
        return it.hasNext() ? -1 : 0;
    }

    public String toString() {
        String valueOf = String.valueOf(this.f28269z);
        StringBuilder sb = new StringBuilder(valueOf.length() + 18);
        sb.append(valueOf);
        sb.append(".lexicographical()");
        return sb.toString();
    }
}
