package com.google.common.base;

import java.io.Serializable;
import java.util.Iterator;

@ElementTypesAreNonnullByDefault
final class PairwiseEquivalence<E, T extends E> extends Equivalence<Iterable<T>> implements Serializable {

    /* renamed from: z  reason: collision with root package name */
    public final Equivalence f27747z;

    public boolean equals(Object obj) {
        if (obj instanceof PairwiseEquivalence) {
            return this.f27747z.equals(((PairwiseEquivalence) obj).f27747z);
        }
        return false;
    }

    /* renamed from: g */
    public boolean a(Iterable iterable, Iterable iterable2) {
        Iterator it = iterable.iterator();
        Iterator it2 = iterable2.iterator();
        while (it.hasNext() && it2.hasNext()) {
            if (!this.f27747z.d(it.next(), it2.next())) {
                return false;
            }
        }
        return !it.hasNext() && !it2.hasNext();
    }

    /* renamed from: h */
    public int b(Iterable iterable) {
        int i2 = 78721;
        for (Object e2 : iterable) {
            i2 = (i2 * 24943) + this.f27747z.e(e2);
        }
        return i2;
    }

    public int hashCode() {
        return this.f27747z.hashCode() ^ 1185147655;
    }

    public String toString() {
        String valueOf = String.valueOf(this.f27747z);
        StringBuilder sb = new StringBuilder(valueOf.length() + 11);
        sb.append(valueOf);
        sb.append(".pairwise()");
        return sb.toString();
    }
}
