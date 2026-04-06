package com.google.common.collect;

import com.google.common.base.MoreObjects;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimaps;
import com.google.common.collect.Multisets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@ElementTypesAreNonnullByDefault
class FilteredEntryMultimap<K, V> extends AbstractMultimap<K, V> implements FilteredMultimap<K, V> {
    public final Multimap D;
    public final Predicate E;

    public class AsMap extends Maps.ViewCachingAbstractMap<K, Collection<V>> {
        public AsMap() {
        }

        public Set a() {
            return new Maps.EntrySet<K, Collection<V>>() {
                public Iterator iterator() {
                    return new AbstractIterator<Map.Entry<K, Collection<V>>>() {

                        /* renamed from: B  reason: collision with root package name */
                        public final Iterator f28092B;

                        {
                            this.f28092B = FilteredEntryMultimap.this.D.E().entrySet().iterator();
                        }

                        /* renamed from: e */
                        public Map.Entry b() {
                            while (this.f28092B.hasNext()) {
                                Map.Entry entry = (Map.Entry) this.f28092B.next();
                                Object key = entry.getKey();
                                Collection j2 = FilteredEntryMultimap.j((Collection) entry.getValue(), new ValuePredicate(key));
                                if (!j2.isEmpty()) {
                                    return Maps.t(key, j2);
                                }
                            }
                            return (Map.Entry) c();
                        }
                    };
                }

                public Map m() {
                    return AsMap.this;
                }

                public boolean removeAll(Collection collection) {
                    return FilteredEntryMultimap.this.k(Predicates.g(collection));
                }

                public boolean retainAll(Collection collection) {
                    return FilteredEntryMultimap.this.k(Predicates.j(Predicates.g(collection)));
                }

                public int size() {
                    return Iterators.H(iterator());
                }
            };
        }

        public Set b() {
            return new Maps.KeySet<K, Collection<V>>() {
                public boolean remove(Object obj) {
                    return AsMap.this.remove(obj) != null;
                }

                public boolean removeAll(Collection collection) {
                    return FilteredEntryMultimap.this.k(Maps.y(Predicates.g(collection)));
                }

                public boolean retainAll(Collection collection) {
                    return FilteredEntryMultimap.this.k(Maps.y(Predicates.j(Predicates.g(collection))));
                }
            };
        }

        public Collection c() {
            return new Maps.Values<K, Collection<V>>() {
                public boolean remove(Object obj) {
                    if (!(obj instanceof Collection)) {
                        return false;
                    }
                    Collection collection = (Collection) obj;
                    Iterator it = FilteredEntryMultimap.this.D.E().entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        Collection j2 = FilteredEntryMultimap.j((Collection) entry.getValue(), new ValuePredicate(entry.getKey()));
                        if (!j2.isEmpty() && collection.equals(j2)) {
                            if (j2.size() == ((Collection) entry.getValue()).size()) {
                                it.remove();
                                return true;
                            }
                            j2.clear();
                            return true;
                        }
                    }
                    return false;
                }

                public boolean removeAll(Collection collection) {
                    return FilteredEntryMultimap.this.k(Maps.Z(Predicates.g(collection)));
                }

                public boolean retainAll(Collection collection) {
                    return FilteredEntryMultimap.this.k(Maps.Z(Predicates.j(Predicates.g(collection))));
                }
            };
        }

        public void clear() {
            FilteredEntryMultimap.this.clear();
        }

        public boolean containsKey(Object obj) {
            return get(obj) != null;
        }

        /* renamed from: e */
        public Collection get(Object obj) {
            Collection collection = (Collection) FilteredEntryMultimap.this.D.E().get(obj);
            if (collection == null) {
                return null;
            }
            Collection j2 = FilteredEntryMultimap.j(collection, new ValuePredicate(obj));
            if (j2.isEmpty()) {
                return null;
            }
            return j2;
        }

        /* renamed from: f */
        public Collection remove(Object obj) {
            Collection collection = (Collection) FilteredEntryMultimap.this.D.E().get(obj);
            if (collection == null) {
                return null;
            }
            ArrayList h2 = Lists.h();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (FilteredEntryMultimap.this.l(obj, next)) {
                    it.remove();
                    h2.add(next);
                }
            }
            if (h2.isEmpty()) {
                return null;
            }
            return FilteredEntryMultimap.this.D instanceof SetMultimap ? Collections.unmodifiableSet(Sets.l(h2)) : Collections.unmodifiableList(h2);
        }
    }

    public class Keys extends Multimaps.Keys<K, V> {
        public final /* synthetic */ FilteredEntryMultimap C;

        public int N(Object obj, int i2) {
            CollectPreconditions.b(i2, "occurrences");
            if (i2 == 0) {
                return L0(obj);
            }
            Collection collection = (Collection) this.C.D.E().get(obj);
            int i3 = 0;
            if (collection == null) {
                return 0;
            }
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (this.C.l(obj, it.next()) && (i3 = i3 + 1) <= i2) {
                    it.remove();
                }
            }
            return i3;
        }

        public Set entrySet() {
            return new Multisets.EntrySet<K>() {
                public Iterator iterator() {
                    return Keys.this.m();
                }

                public Multiset m() {
                    return Keys.this;
                }

                public final boolean p(Predicate predicate) {
                    return Keys.this.C.k(new a(predicate));
                }

                public boolean removeAll(Collection collection) {
                    return p(Predicates.g(collection));
                }

                public boolean retainAll(Collection collection) {
                    return p(Predicates.j(Predicates.g(collection)));
                }

                public int size() {
                    return Keys.this.C.keySet().size();
                }
            };
        }
    }

    public final class ValuePredicate implements Predicate<V> {

        /* renamed from: z  reason: collision with root package name */
        public final Object f28097z;

        public ValuePredicate(Object obj) {
            this.f28097z = obj;
        }

        public boolean apply(Object obj) {
            return FilteredEntryMultimap.this.l(this.f28097z, obj);
        }
    }

    public static Collection j(Collection collection, Predicate predicate) {
        return collection instanceof Set ? Sets.d((Set) collection, predicate) : Collections2.d(collection, predicate);
    }

    public Predicate B() {
        return this.E;
    }

    public Map a() {
        return new AsMap();
    }

    public Collection b() {
        return j(this.D.m(), this.E);
    }

    public Set c() {
        return E().keySet();
    }

    public void clear() {
        m().clear();
    }

    public boolean containsKey(Object obj) {
        return E().get(obj) != null;
    }

    public Collection d() {
        return new FilteredMultimapValues(this);
    }

    public Iterator e() {
        throw new AssertionError("should never be called");
    }

    public Collection get(Object obj) {
        return j(this.D.get(obj), new ValuePredicate(obj));
    }

    public Collection h(Object obj) {
        return (Collection) MoreObjects.a((Collection) E().remove(obj), o());
    }

    public boolean k(Predicate predicate) {
        Iterator it = this.D.E().entrySet().iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            Collection j2 = j((Collection) entry.getValue(), new ValuePredicate(key));
            if (!j2.isEmpty() && predicate.apply(Maps.t(key, j2))) {
                if (j2.size() == ((Collection) entry.getValue()).size()) {
                    it.remove();
                } else {
                    j2.clear();
                }
                z2 = true;
            }
        }
        return z2;
    }

    public final boolean l(Object obj, Object obj2) {
        return this.E.apply(Maps.t(obj, obj2));
    }

    public Multimap n() {
        return this.D;
    }

    public Collection o() {
        return this.D instanceof SetMultimap ? Collections.emptySet() : Collections.emptyList();
    }

    public int size() {
        return m().size();
    }
}
