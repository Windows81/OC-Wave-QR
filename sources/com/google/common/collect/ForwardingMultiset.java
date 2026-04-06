package com.google.common.collect;

import com.google.common.collect.Multisets;
import java.util.Iterator;
import java.util.Set;

@ElementTypesAreNonnullByDefault
public abstract class ForwardingMultiset<E> extends ForwardingCollection<E> implements Multiset<E> {

    public class StandardElementSet extends Multisets.ElementSet<E> {

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ ForwardingMultiset f28108z;

        public Iterator iterator() {
            return Multisets.e(m().entrySet().iterator());
        }

        public Multiset m() {
            return this.f28108z;
        }
    }

    public int L0(Object obj) {
        return Q().L0(obj);
    }

    public int N(Object obj, int i2) {
        return Q().N(obj, i2);
    }

    public int T(Object obj, int i2) {
        return Q().T(obj, i2);
    }

    /* renamed from: Z */
    public abstract Multiset Q();

    public Set entrySet() {
        return Q().entrySet();
    }

    public boolean equals(Object obj) {
        return obj == this || Q().equals(obj);
    }

    public int hashCode() {
        return Q().hashCode();
    }

    public Set k() {
        return Q().k();
    }

    public int n0(Object obj, int i2) {
        return Q().n0(obj, i2);
    }

    public boolean t0(Object obj, int i2, int i3) {
        return Q().t0(obj, i2, i3);
    }
}
