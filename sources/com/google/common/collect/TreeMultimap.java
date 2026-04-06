package com.google.common.collect;

import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

@ElementTypesAreNonnullByDefault
public class TreeMultimap<K, V> extends AbstractSortedKeySortedSetMultimap<K, V> {
    public transient Comparator F;
    public transient Comparator G;

    public /* bridge */ /* synthetic */ boolean F(Object obj, Object obj2) {
        return super.F(obj, obj2);
    }

    /* renamed from: G */
    public SortedSet r() {
        return new TreeSet(this.G);
    }

    /* renamed from: L */
    public NavigableMap J() {
        return (NavigableMap) super.E();
    }

    /* renamed from: M */
    public NavigableSet get(Object obj) {
        return (NavigableSet) super.get(obj);
    }

    public Comparator N() {
        return this.F;
    }

    /* renamed from: P */
    public NavigableSet keySet() {
        return (NavigableSet) super.keySet();
    }

    public Map a() {
        return t();
    }

    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    public /* bridge */ /* synthetic */ boolean containsKey(Object obj) {
        return super.containsKey(obj);
    }

    public /* bridge */ /* synthetic */ boolean containsValue(Object obj) {
        return super.containsValue(obj);
    }

    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    public /* bridge */ /* synthetic */ SortedSet h(Object obj) {
        return super.h(obj);
    }

    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    public /* bridge */ /* synthetic */ Set m() {
        return super.m();
    }

    public /* bridge */ /* synthetic */ boolean put(Object obj, Object obj2) {
        return super.put(obj, obj2);
    }

    public /* bridge */ /* synthetic */ boolean remove(Object obj, Object obj2) {
        return super.remove(obj, obj2);
    }

    public Collection s(Object obj) {
        if (obj == null) {
            N().compare(obj, obj);
        }
        return super.s(obj);
    }

    public /* bridge */ /* synthetic */ int size() {
        return super.size();
    }

    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
