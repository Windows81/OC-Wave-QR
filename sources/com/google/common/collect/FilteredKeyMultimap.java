package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

@ElementTypesAreNonnullByDefault
class FilteredKeyMultimap<K, V> extends AbstractMultimap<K, V> implements FilteredMultimap<K, V> {
    public final Multimap D;
    public final Predicate E;

    public static class AddRejectingList<K, V> extends ForwardingList<V> {

        /* renamed from: z  reason: collision with root package name */
        public final Object f28098z;

        public AddRejectingList(Object obj) {
            this.f28098z = obj;
        }

        /* renamed from: Z */
        public List Q() {
            return Collections.emptyList();
        }

        public boolean add(Object obj) {
            add(0, obj);
            return true;
        }

        public boolean addAll(Collection collection) {
            addAll(0, collection);
            return true;
        }

        public void add(int i2, Object obj) {
            Preconditions.t(i2, 0);
            String valueOf = String.valueOf(this.f28098z);
            StringBuilder sb = new StringBuilder(valueOf.length() + 32);
            sb.append("Key does not satisfy predicate: ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        }

        public boolean addAll(int i2, Collection collection) {
            Preconditions.q(collection);
            Preconditions.t(i2, 0);
            String valueOf = String.valueOf(this.f28098z);
            StringBuilder sb = new StringBuilder(valueOf.length() + 32);
            sb.append("Key does not satisfy predicate: ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public static class AddRejectingSet<K, V> extends ForwardingSet<V> {

        /* renamed from: z  reason: collision with root package name */
        public final Object f28099z;

        public AddRejectingSet(Object obj) {
            this.f28099z = obj;
        }

        /* renamed from: Z */
        public Set Q() {
            return Collections.emptySet();
        }

        public boolean add(Object obj) {
            String valueOf = String.valueOf(this.f28099z);
            StringBuilder sb = new StringBuilder(valueOf.length() + 32);
            sb.append("Key does not satisfy predicate: ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        }

        public boolean addAll(Collection collection) {
            Preconditions.q(collection);
            String valueOf = String.valueOf(this.f28099z);
            StringBuilder sb = new StringBuilder(valueOf.length() + 32);
            sb.append("Key does not satisfy predicate: ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public class Entries extends ForwardingCollection<Map.Entry<K, V>> {
        public Entries() {
        }

        /* renamed from: Q */
        public Collection M() {
            return Collections2.d(FilteredKeyMultimap.this.D.m(), FilteredKeyMultimap.this.B());
        }

        public boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (!FilteredKeyMultimap.this.D.containsKey(entry.getKey()) || !FilteredKeyMultimap.this.E.apply(entry.getKey())) {
                return false;
            }
            return FilteredKeyMultimap.this.D.remove(entry.getKey(), entry.getValue());
        }
    }

    public Predicate B() {
        return Maps.y(this.E);
    }

    public Map a() {
        return Maps.s(this.D.E(), this.E);
    }

    public Collection b() {
        return new Entries();
    }

    public Set c() {
        return Sets.d(this.D.keySet(), this.E);
    }

    public void clear() {
        keySet().clear();
    }

    public boolean containsKey(Object obj) {
        if (this.D.containsKey(obj)) {
            return this.E.apply(obj);
        }
        return false;
    }

    public Collection d() {
        return new FilteredMultimapValues(this);
    }

    public Iterator e() {
        throw new AssertionError("should never be called");
    }

    public Collection get(Object obj) {
        return this.E.apply(obj) ? this.D.get(obj) : this.D instanceof SetMultimap ? new AddRejectingSet(obj) : new AddRejectingList(obj);
    }

    public Collection h(Object obj) {
        return containsKey(obj) ? this.D.h(obj) : i();
    }

    public Collection i() {
        return this.D instanceof SetMultimap ? Collections.emptySet() : Collections.emptyList();
    }

    public Multimap n() {
        return this.D;
    }

    public int size() {
        int i2 = 0;
        for (Collection size : E().values()) {
            i2 += size.size();
        }
        return i2;
    }
}
