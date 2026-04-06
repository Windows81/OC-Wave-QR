package com.google.common.collect;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

@ElementTypesAreNonnullByDefault
final class FilteredMultimapValues<K, V> extends AbstractCollection<V> {

    /* renamed from: z  reason: collision with root package name */
    public final FilteredMultimap f28101z;

    public FilteredMultimapValues(FilteredMultimap filteredMultimap) {
        this.f28101z = (FilteredMultimap) Preconditions.q(filteredMultimap);
    }

    public void clear() {
        this.f28101z.clear();
    }

    public boolean contains(Object obj) {
        return this.f28101z.containsValue(obj);
    }

    public Iterator iterator() {
        return Maps.X(this.f28101z.m().iterator());
    }

    public boolean remove(Object obj) {
        Predicate B2 = this.f28101z.B();
        Iterator it = this.f28101z.n().m().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (B2.apply(entry) && Objects.a(entry.getValue(), obj)) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    public boolean removeAll(Collection collection) {
        return Iterables.j(this.f28101z.n().m(), Predicates.c(this.f28101z.B(), Maps.Z(Predicates.g(collection))));
    }

    public boolean retainAll(Collection collection) {
        return Iterables.j(this.f28101z.n().m(), Predicates.c(this.f28101z.B(), Maps.Z(Predicates.j(Predicates.g(collection)))));
    }

    public int size() {
        return this.f28101z.size();
    }
}
