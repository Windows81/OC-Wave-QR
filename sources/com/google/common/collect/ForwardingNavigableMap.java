package com.google.common.collect;

import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.NoSuchElementException;

@ElementTypesAreNonnullByDefault
public abstract class ForwardingNavigableMap<K, V> extends ForwardingSortedMap<K, V> implements NavigableMap<K, V> {

    public class StandardDescendingMap extends Maps.DescendingMap<K, V> {
        public final /* synthetic */ ForwardingNavigableMap C;

        public Iterator U() {
            return new Iterator<Map.Entry<K, V>>() {

                /* renamed from: A  reason: collision with root package name */
                public Map.Entry f28109A;

                /* renamed from: z  reason: collision with root package name */
                public Map.Entry f28111z = null;

                {
                    this.f28109A = StandardDescendingMap.this.V().lastEntry();
                }

                /* renamed from: b */
                public Map.Entry next() {
                    Map.Entry entry = this.f28109A;
                    if (entry != null) {
                        this.f28111z = entry;
                        this.f28109A = StandardDescendingMap.this.V().lowerEntry(this.f28109A.getKey());
                        return entry;
                    }
                    throw new NoSuchElementException();
                }

                public boolean hasNext() {
                    return this.f28109A != null;
                }

                public void remove() {
                    if (this.f28111z != null) {
                        StandardDescendingMap.this.V().remove(this.f28111z.getKey());
                        this.f28111z = null;
                        return;
                    }
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
            };
        }

        public NavigableMap V() {
            return this.C;
        }
    }

    public class StandardNavigableKeySet extends Maps.NavigableKeySet<K, V> {
    }

    /* renamed from: U */
    public abstract NavigableMap S();

    public Map.Entry ceilingEntry(Object obj) {
        return S().ceilingEntry(obj);
    }

    public Object ceilingKey(Object obj) {
        return S().ceilingKey(obj);
    }

    public NavigableSet descendingKeySet() {
        return S().descendingKeySet();
    }

    public NavigableMap descendingMap() {
        return S().descendingMap();
    }

    public Map.Entry firstEntry() {
        return S().firstEntry();
    }

    public Map.Entry floorEntry(Object obj) {
        return S().floorEntry(obj);
    }

    public Object floorKey(Object obj) {
        return S().floorKey(obj);
    }

    public NavigableMap headMap(Object obj, boolean z2) {
        return S().headMap(obj, z2);
    }

    public Map.Entry higherEntry(Object obj) {
        return S().higherEntry(obj);
    }

    public Object higherKey(Object obj) {
        return S().higherKey(obj);
    }

    public Map.Entry lastEntry() {
        return S().lastEntry();
    }

    public Map.Entry lowerEntry(Object obj) {
        return S().lowerEntry(obj);
    }

    public Object lowerKey(Object obj) {
        return S().lowerKey(obj);
    }

    public NavigableSet navigableKeySet() {
        return S().navigableKeySet();
    }

    public Map.Entry pollFirstEntry() {
        return S().pollFirstEntry();
    }

    public Map.Entry pollLastEntry() {
        return S().pollLastEntry();
    }

    public NavigableMap subMap(Object obj, boolean z2, Object obj2, boolean z3) {
        return S().subMap(obj, z2, obj2, z3);
    }

    public NavigableMap tailMap(Object obj, boolean z2) {
        return S().tailMap(obj, z2);
    }
}
