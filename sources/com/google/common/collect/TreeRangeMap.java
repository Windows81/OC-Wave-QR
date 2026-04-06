package com.google.common.collect;

import com.google.common.base.MoreObjects;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Maps;
import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Objects;
import java.util.Set;

@ElementTypesAreNonnullByDefault
public final class TreeRangeMap<K extends Comparable, V> implements RangeMap<K, V> {

    /* renamed from: A  reason: collision with root package name */
    public static final RangeMap f28634A = new RangeMap<Comparable<?>, Object>() {
        public Map a() {
            return Collections.emptyMap();
        }
    };

    /* renamed from: z  reason: collision with root package name */
    public final NavigableMap f28635z;

    public final class AsMapOfRanges extends Maps.IteratorBasedAbstractMap<Range<K>, V> {

        /* renamed from: z  reason: collision with root package name */
        public final Iterable f28637z;

        public AsMapOfRanges(Iterable iterable) {
            this.f28637z = iterable;
        }

        public Iterator a() {
            return this.f28637z.iterator();
        }

        public boolean containsKey(Object obj) {
            return get(obj) != null;
        }

        public Object get(Object obj) {
            if (!(obj instanceof Range)) {
                return null;
            }
            Range range = (Range) obj;
            RangeMapEntry rangeMapEntry = (RangeMapEntry) TreeRangeMap.this.f28635z.get(range.f28498z);
            if (rangeMapEntry == null || !rangeMapEntry.getKey().equals(range)) {
                return null;
            }
            return rangeMapEntry.getValue();
        }

        public int size() {
            return TreeRangeMap.this.f28635z.size();
        }
    }

    public static final class RangeMapEntry<K extends Comparable, V> extends AbstractMapEntry<Range<K>, V> {

        /* renamed from: A  reason: collision with root package name */
        public final Object f28638A;

        /* renamed from: z  reason: collision with root package name */
        public final Range f28639z;

        public RangeMapEntry(Cut cut, Cut cut2, Object obj) {
            this(Range.h(cut, cut2), obj);
        }

        /* renamed from: a */
        public Range getKey() {
            return this.f28639z;
        }

        public Cut b() {
            return this.f28639z.f28498z;
        }

        public Cut c() {
            return this.f28639z.f28497A;
        }

        public Object getValue() {
            return this.f28638A;
        }

        public RangeMapEntry(Range range, Object obj) {
            this.f28639z = range;
            this.f28638A = obj;
        }
    }

    public class SubRangeMap implements RangeMap<K, V> {

        /* renamed from: A  reason: collision with root package name */
        public final /* synthetic */ TreeRangeMap f28640A;

        /* renamed from: z  reason: collision with root package name */
        public final Range f28641z;

        /* renamed from: com.google.common.collect.TreeRangeMap$SubRangeMap$1  reason: invalid class name */
        class AnonymousClass1 extends TreeRangeMap<Comparable, Object>.SubRangeMap.SubRangeMapAsMap {

            /* renamed from: A  reason: collision with root package name */
            public final /* synthetic */ SubRangeMap f28642A;

            public Iterator b() {
                if (this.f28642A.f28641z.p()) {
                    return Iterators.m();
                }
                final Iterator it = this.f28642A.f28640A.f28635z.headMap(this.f28642A.f28641z.f28497A, false).descendingMap().values().iterator();
                return new AbstractIterator<Map.Entry<Range<Comparable>, Object>>() {
                    /* renamed from: e */
                    public Map.Entry b() {
                        if (!it.hasNext()) {
                            return (Map.Entry) c();
                        }
                        RangeMapEntry rangeMapEntry = (RangeMapEntry) it.next();
                        return rangeMapEntry.c().compareTo(AnonymousClass1.this.f28642A.f28641z.f28498z) <= 0 ? (Map.Entry) c() : Maps.t(rangeMapEntry.getKey().n(AnonymousClass1.this.f28642A.f28641z), rangeMapEntry.getValue());
                    }
                };
            }
        }

        public class SubRangeMapAsMap extends AbstractMap<Range<K>, V> {
            public SubRangeMapAsMap() {
            }

            public Iterator b() {
                if (SubRangeMap.this.f28641z.p()) {
                    return Iterators.m();
                }
                final Iterator it = SubRangeMap.this.f28640A.f28635z.tailMap((Cut) MoreObjects.a((Cut) SubRangeMap.this.f28640A.f28635z.floorKey(SubRangeMap.this.f28641z.f28498z), SubRangeMap.this.f28641z.f28498z), true).values().iterator();
                return new AbstractIterator<Map.Entry<Range<K>, V>>() {
                    /* renamed from: e */
                    public Map.Entry b() {
                        while (it.hasNext()) {
                            RangeMapEntry rangeMapEntry = (RangeMapEntry) it.next();
                            if (rangeMapEntry.b().compareTo(SubRangeMap.this.f28641z.f28497A) >= 0) {
                                return (Map.Entry) c();
                            }
                            if (rangeMapEntry.c().compareTo(SubRangeMap.this.f28641z.f28498z) > 0) {
                                return Maps.t(rangeMapEntry.getKey().n(SubRangeMap.this.f28641z), rangeMapEntry.getValue());
                            }
                        }
                        return (Map.Entry) c();
                    }
                };
            }

            public final boolean c(Predicate predicate) {
                ArrayList<Range> h2 = Lists.h();
                for (Map.Entry entry : entrySet()) {
                    if (predicate.apply(entry)) {
                        h2.add((Range) entry.getKey());
                    }
                }
                for (Range d2 : h2) {
                    SubRangeMap.this.f28640A.d(d2);
                }
                return !h2.isEmpty();
            }

            public void clear() {
                SubRangeMap.this.c();
            }

            public boolean containsKey(Object obj) {
                return get(obj) != null;
            }

            public Set entrySet() {
                return new Maps.EntrySet<Range<K>, V>() {
                    public boolean isEmpty() {
                        return !iterator().hasNext();
                    }

                    public Iterator iterator() {
                        return SubRangeMapAsMap.this.b();
                    }

                    public Map m() {
                        return SubRangeMapAsMap.this;
                    }

                    public boolean retainAll(Collection collection) {
                        return SubRangeMapAsMap.this.c(Predicates.j(Predicates.g(collection)));
                    }

                    public int size() {
                        return Iterators.H(iterator());
                    }
                };
            }

            public Object get(Object obj) {
                RangeMapEntry rangeMapEntry;
                try {
                    if (obj instanceof Range) {
                        Range range = (Range) obj;
                        if (SubRangeMap.this.f28641z.j(range)) {
                            if (!range.p()) {
                                if (range.f28498z.compareTo(SubRangeMap.this.f28641z.f28498z) == 0) {
                                    Map.Entry floorEntry = SubRangeMap.this.f28640A.f28635z.floorEntry(range.f28498z);
                                    rangeMapEntry = floorEntry != null ? (RangeMapEntry) floorEntry.getValue() : null;
                                } else {
                                    rangeMapEntry = (RangeMapEntry) SubRangeMap.this.f28640A.f28635z.get(range.f28498z);
                                }
                                if (rangeMapEntry != null && rangeMapEntry.getKey().o(SubRangeMap.this.f28641z) && rangeMapEntry.getKey().n(SubRangeMap.this.f28641z).equals(range)) {
                                    return rangeMapEntry.getValue();
                                }
                            }
                        }
                    }
                } catch (ClassCastException unused) {
                }
                return null;
            }

            public Set keySet() {
                return new Maps.KeySet<Range<K>, V>(this) {
                    public boolean remove(Object obj) {
                        return SubRangeMapAsMap.this.remove(obj) != null;
                    }

                    public boolean retainAll(Collection collection) {
                        return SubRangeMapAsMap.this.c(Predicates.e(Predicates.j(Predicates.g(collection)), Maps.v()));
                    }
                };
            }

            public Object remove(Object obj) {
                Object obj2 = get(obj);
                if (obj2 == null) {
                    return null;
                }
                Objects.requireNonNull(obj);
                SubRangeMap.this.f28640A.d((Range) obj);
                return obj2;
            }

            public Collection values() {
                return new Maps.Values<Range<K>, V>(this) {
                    public boolean removeAll(Collection collection) {
                        return SubRangeMapAsMap.this.c(Predicates.e(Predicates.g(collection), Maps.W()));
                    }

                    public boolean retainAll(Collection collection) {
                        return SubRangeMapAsMap.this.c(Predicates.e(Predicates.j(Predicates.g(collection)), Maps.W()));
                    }
                };
            }
        }

        public Map a() {
            return new SubRangeMapAsMap();
        }

        public void c() {
            this.f28640A.d(this.f28641z);
        }

        public boolean equals(Object obj) {
            if (obj instanceof RangeMap) {
                return a().equals(((RangeMap) obj).a());
            }
            return false;
        }

        public int hashCode() {
            return a().hashCode();
        }

        public String toString() {
            return a().toString();
        }
    }

    public Map a() {
        return new AsMapOfRanges(this.f28635z.values());
    }

    public final void c(Cut cut, Cut cut2, Object obj) {
        this.f28635z.put(cut, new RangeMapEntry(cut, cut2, obj));
    }

    public void d(Range range) {
        if (!range.p()) {
            Map.Entry lowerEntry = this.f28635z.lowerEntry(range.f28498z);
            if (lowerEntry != null) {
                RangeMapEntry rangeMapEntry = (RangeMapEntry) lowerEntry.getValue();
                if (rangeMapEntry.c().compareTo(range.f28498z) > 0) {
                    if (rangeMapEntry.c().compareTo(range.f28497A) > 0) {
                        c(range.f28497A, rangeMapEntry.c(), ((RangeMapEntry) lowerEntry.getValue()).getValue());
                    }
                    c(rangeMapEntry.b(), range.f28498z, ((RangeMapEntry) lowerEntry.getValue()).getValue());
                }
            }
            Map.Entry lowerEntry2 = this.f28635z.lowerEntry(range.f28497A);
            if (lowerEntry2 != null) {
                RangeMapEntry rangeMapEntry2 = (RangeMapEntry) lowerEntry2.getValue();
                if (rangeMapEntry2.c().compareTo(range.f28497A) > 0) {
                    c(range.f28497A, rangeMapEntry2.c(), ((RangeMapEntry) lowerEntry2.getValue()).getValue());
                }
            }
            this.f28635z.subMap(range.f28498z, range.f28497A).clear();
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof RangeMap) {
            return a().equals(((RangeMap) obj).a());
        }
        return false;
    }

    public int hashCode() {
        return a().hashCode();
    }

    public String toString() {
        return this.f28635z.values().toString();
    }
}
