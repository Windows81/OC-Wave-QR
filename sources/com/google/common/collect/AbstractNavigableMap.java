package com.google.common.collect;

import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;

@ElementTypesAreNonnullByDefault
abstract class AbstractNavigableMap<K, V> extends Maps.IteratorBasedAbstractMap<K, V> implements NavigableMap<K, V> {

    public final class DescendingMap extends Maps.DescendingMap<K, V> {
        public DescendingMap() {
        }

        public Iterator U() {
            return AbstractNavigableMap.this.b();
        }

        public NavigableMap V() {
            return AbstractNavigableMap.this;
        }
    }

    public abstract Iterator b();

    public Map.Entry ceilingEntry(Object obj) {
        return tailMap(obj, true).firstEntry();
    }

    public Object ceilingKey(Object obj) {
        return Maps.x(ceilingEntry(obj));
    }

    public NavigableSet descendingKeySet() {
        return descendingMap().navigableKeySet();
    }

    public NavigableMap descendingMap() {
        return new DescendingMap();
    }

    public Map.Entry firstEntry() {
        return (Map.Entry) Iterators.u(a(), (Object) null);
    }

    public Object firstKey() {
        Map.Entry firstEntry = firstEntry();
        if (firstEntry != null) {
            return firstEntry.getKey();
        }
        throw new NoSuchElementException();
    }

    public Map.Entry floorEntry(Object obj) {
        return headMap(obj, true).lastEntry();
    }

    public Object floorKey(Object obj) {
        return Maps.x(floorEntry(obj));
    }

    public SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    public Map.Entry higherEntry(Object obj) {
        return tailMap(obj, false).firstEntry();
    }

    public Object higherKey(Object obj) {
        return Maps.x(higherEntry(obj));
    }

    public Set keySet() {
        return navigableKeySet();
    }

    public Map.Entry lastEntry() {
        return (Map.Entry) Iterators.u(b(), (Object) null);
    }

    public Object lastKey() {
        Map.Entry lastEntry = lastEntry();
        if (lastEntry != null) {
            return lastEntry.getKey();
        }
        throw new NoSuchElementException();
    }

    public Map.Entry lowerEntry(Object obj) {
        return headMap(obj, false).lastEntry();
    }

    public Object lowerKey(Object obj) {
        return Maps.x(lowerEntry(obj));
    }

    public NavigableSet navigableKeySet() {
        return new Maps.NavigableKeySet(this);
    }

    public Map.Entry pollFirstEntry() {
        return (Map.Entry) Iterators.C(a());
    }

    public Map.Entry pollLastEntry() {
        return (Map.Entry) Iterators.C(b());
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    public SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }
}
