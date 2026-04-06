package com.google.protobuf;

import com.google.protobuf.FieldSet;
import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

class SmallSortedMap<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: A  reason: collision with root package name */
    public List f32288A;

    /* renamed from: B  reason: collision with root package name */
    public Map f32289B;
    public boolean C;
    public volatile EntrySet D;
    public Map E;
    public volatile DescendingEntrySet F;

    /* renamed from: z  reason: collision with root package name */
    public final int f32290z;

    public class DescendingEntryIterator implements Iterator<Map.Entry<K, V>> {

        /* renamed from: A  reason: collision with root package name */
        public Iterator f32291A;

        /* renamed from: z  reason: collision with root package name */
        public int f32293z;

        public DescendingEntryIterator() {
            this.f32293z = SmallSortedMap.this.f32288A.size();
        }

        public final Iterator b() {
            if (this.f32291A == null) {
                this.f32291A = SmallSortedMap.this.E.entrySet().iterator();
            }
            return this.f32291A;
        }

        /* renamed from: c */
        public Map.Entry next() {
            if (b().hasNext()) {
                return (Map.Entry) b().next();
            }
            List b2 = SmallSortedMap.this.f32288A;
            int i2 = this.f32293z - 1;
            this.f32293z = i2;
            return (Map.Entry) b2.get(i2);
        }

        public boolean hasNext() {
            int i2 = this.f32293z;
            return (i2 > 0 && i2 <= SmallSortedMap.this.f32288A.size()) || b().hasNext();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public class DescendingEntrySet extends SmallSortedMap<K, V>.EntrySet {
        public DescendingEntrySet() {
            super();
        }

        public Iterator iterator() {
            return new DescendingEntryIterator();
        }
    }

    public static class EmptySet {

        /* renamed from: a  reason: collision with root package name */
        public static final Iterator f32295a = new Iterator<Object>() {
            public boolean hasNext() {
                return false;
            }

            public Object next() {
                throw new NoSuchElementException();
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        };

        /* renamed from: b  reason: collision with root package name */
        public static final Iterable f32296b = new Iterable<Object>() {
            public Iterator iterator() {
                return EmptySet.f32295a;
            }
        };

        public static Iterable b() {
            return f32296b;
        }
    }

    public class Entry implements Map.Entry<K, V>, Comparable<SmallSortedMap<K, V>.Entry> {

        /* renamed from: A  reason: collision with root package name */
        public Object f32297A;

        /* renamed from: z  reason: collision with root package name */
        public final Comparable f32299z;

        public Entry(SmallSortedMap smallSortedMap, Map.Entry entry) {
            this((Comparable) entry.getKey(), entry.getValue());
        }

        /* renamed from: d */
        public int compareTo(Entry entry) {
            return getKey().compareTo(entry.getKey());
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return f(this.f32299z, entry.getKey()) && f(this.f32297A, entry.getValue());
        }

        public final boolean f(Object obj, Object obj2) {
            return obj == null ? obj2 == null : obj.equals(obj2);
        }

        public Object getValue() {
            return this.f32297A;
        }

        /* renamed from: h */
        public Comparable getKey() {
            return this.f32299z;
        }

        public int hashCode() {
            Comparable comparable = this.f32299z;
            int i2 = 0;
            int hashCode = comparable == null ? 0 : comparable.hashCode();
            Object obj = this.f32297A;
            if (obj != null) {
                i2 = obj.hashCode();
            }
            return hashCode ^ i2;
        }

        public Object setValue(Object obj) {
            SmallSortedMap.this.h();
            Object obj2 = this.f32297A;
            this.f32297A = obj;
            return obj2;
        }

        public String toString() {
            return this.f32299z + "=" + this.f32297A;
        }

        public Entry(Comparable comparable, Object obj) {
            this.f32299z = comparable;
            this.f32297A = obj;
        }
    }

    public class EntryIterator implements Iterator<Map.Entry<K, V>> {

        /* renamed from: A  reason: collision with root package name */
        public boolean f32300A;

        /* renamed from: B  reason: collision with root package name */
        public Iterator f32301B;

        /* renamed from: z  reason: collision with root package name */
        public int f32302z;

        public EntryIterator() {
            this.f32302z = -1;
        }

        public final Iterator b() {
            if (this.f32301B == null) {
                this.f32301B = SmallSortedMap.this.f32289B.entrySet().iterator();
            }
            return this.f32301B;
        }

        /* renamed from: c */
        public Map.Entry next() {
            this.f32300A = true;
            int i2 = this.f32302z + 1;
            this.f32302z = i2;
            return i2 < SmallSortedMap.this.f32288A.size() ? (Map.Entry) SmallSortedMap.this.f32288A.get(this.f32302z) : (Map.Entry) b().next();
        }

        public boolean hasNext() {
            if (this.f32302z + 1 >= SmallSortedMap.this.f32288A.size()) {
                return !SmallSortedMap.this.f32289B.isEmpty() && b().hasNext();
            }
            return true;
        }

        public void remove() {
            if (this.f32300A) {
                this.f32300A = false;
                SmallSortedMap.this.h();
                if (this.f32302z < SmallSortedMap.this.f32288A.size()) {
                    SmallSortedMap smallSortedMap = SmallSortedMap.this;
                    int i2 = this.f32302z;
                    this.f32302z = i2 - 1;
                    Object unused = smallSortedMap.u(i2);
                    return;
                }
                b().remove();
                return;
            }
            throw new IllegalStateException("remove() was called before next()");
        }
    }

    public class EntrySet extends AbstractSet<Map.Entry<K, V>> {
        public EntrySet() {
        }

        public void clear() {
            SmallSortedMap.this.clear();
        }

        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = SmallSortedMap.this.get(entry.getKey());
            Object value = entry.getValue();
            return obj2 == value || (obj2 != null && obj2.equals(value));
        }

        /* renamed from: e */
        public boolean add(Map.Entry entry) {
            if (contains(entry)) {
                return false;
            }
            SmallSortedMap.this.put((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        public Iterator iterator() {
            return new EntryIterator();
        }

        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            SmallSortedMap.this.remove(entry.getKey());
            return true;
        }

        public int size() {
            return SmallSortedMap.this.size();
        }
    }

    public static SmallSortedMap s(int i2) {
        return new SmallSortedMap<FieldSet.FieldDescriptorLite<Object>, Object>(i2) {
            public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
                return SmallSortedMap.super.put((Comparable) obj, obj2);
            }

            public void r() {
                if (!q()) {
                    for (int i2 = 0; i2 < m(); i2++) {
                        Map.Entry k2 = k(i2);
                        if (((FieldSet.FieldDescriptorLite) k2.getKey()).q()) {
                            k2.setValue(Collections.unmodifiableList((List) k2.getValue()));
                        }
                    }
                    for (Map.Entry entry : o()) {
                        if (((FieldSet.FieldDescriptorLite) entry.getKey()).q()) {
                            entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                        }
                    }
                }
                SmallSortedMap.super.r();
            }
        };
    }

    public void clear() {
        h();
        if (!this.f32288A.isEmpty()) {
            this.f32288A.clear();
        }
        if (!this.f32289B.isEmpty()) {
            this.f32289B.clear();
        }
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return g(comparable) >= 0 || this.f32289B.containsKey(comparable);
    }

    public Set entrySet() {
        if (this.D == null) {
            this.D = new EntrySet();
        }
        return this.D;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SmallSortedMap)) {
            return super.equals(obj);
        }
        SmallSortedMap smallSortedMap = (SmallSortedMap) obj;
        int size = size();
        if (size != smallSortedMap.size()) {
            return false;
        }
        int m2 = m();
        if (m2 != smallSortedMap.m()) {
            return entrySet().equals(smallSortedMap.entrySet());
        }
        for (int i2 = 0; i2 < m2; i2++) {
            if (!k(i2).equals(smallSortedMap.k(i2))) {
                return false;
            }
        }
        if (m2 != size) {
            return this.f32289B.equals(smallSortedMap.f32289B);
        }
        return true;
    }

    public final int g(Comparable comparable) {
        int i2;
        int size = this.f32288A.size();
        int i3 = size - 1;
        if (i3 >= 0) {
            int compareTo = comparable.compareTo(((Entry) this.f32288A.get(i3)).getKey());
            if (compareTo > 0) {
                i2 = size + 1;
                return -i2;
            } else if (compareTo == 0) {
                return i3;
            }
        }
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) / 2;
            int compareTo2 = comparable.compareTo(((Entry) this.f32288A.get(i5)).getKey());
            if (compareTo2 < 0) {
                i3 = i5 - 1;
            } else if (compareTo2 <= 0) {
                return i5;
            } else {
                i4 = i5 + 1;
            }
        }
        i2 = i4 + 1;
        return -i2;
    }

    public Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int g2 = g(comparable);
        return g2 >= 0 ? ((Entry) this.f32288A.get(g2)).getValue() : this.f32289B.get(comparable);
    }

    public final void h() {
        if (this.C) {
            throw new UnsupportedOperationException();
        }
    }

    public int hashCode() {
        int m2 = m();
        int i2 = 0;
        for (int i3 = 0; i3 < m2; i3++) {
            i2 += ((Entry) this.f32288A.get(i3)).hashCode();
        }
        return n() > 0 ? i2 + this.f32289B.hashCode() : i2;
    }

    public Set i() {
        if (this.F == null) {
            this.F = new DescendingEntrySet();
        }
        return this.F;
    }

    public final void j() {
        h();
        if (this.f32288A.isEmpty() && !(this.f32288A instanceof ArrayList)) {
            this.f32288A = new ArrayList(this.f32290z);
        }
    }

    public Map.Entry k(int i2) {
        return (Map.Entry) this.f32288A.get(i2);
    }

    public int m() {
        return this.f32288A.size();
    }

    public int n() {
        return this.f32289B.size();
    }

    public Iterable o() {
        return this.f32289B.isEmpty() ? EmptySet.b() : this.f32289B.entrySet();
    }

    public final SortedMap p() {
        h();
        if (this.f32289B.isEmpty() && !(this.f32289B instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f32289B = treeMap;
            this.E = treeMap.descendingMap();
        }
        return (SortedMap) this.f32289B;
    }

    public boolean q() {
        return this.C;
    }

    public void r() {
        if (!this.C) {
            this.f32289B = this.f32289B.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f32289B);
            this.E = this.E.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.E);
            this.C = true;
        }
    }

    public Object remove(Object obj) {
        h();
        Comparable comparable = (Comparable) obj;
        int g2 = g(comparable);
        if (g2 >= 0) {
            return u(g2);
        }
        if (this.f32289B.isEmpty()) {
            return null;
        }
        return this.f32289B.remove(comparable);
    }

    public int size() {
        return this.f32288A.size() + this.f32289B.size();
    }

    /* renamed from: t */
    public Object put(Comparable comparable, Object obj) {
        h();
        int g2 = g(comparable);
        if (g2 >= 0) {
            return ((Entry) this.f32288A.get(g2)).setValue(obj);
        }
        j();
        int i2 = -(g2 + 1);
        if (i2 >= this.f32290z) {
            return p().put(comparable, obj);
        }
        int size = this.f32288A.size();
        int i3 = this.f32290z;
        if (size == i3) {
            Entry entry = (Entry) this.f32288A.remove(i3 - 1);
            p().put(entry.getKey(), entry.getValue());
        }
        this.f32288A.add(i2, new Entry(comparable, obj));
        return null;
    }

    public final Object u(int i2) {
        h();
        Object value = ((Entry) this.f32288A.remove(i2)).getValue();
        if (!this.f32289B.isEmpty()) {
            Iterator it = p().entrySet().iterator();
            this.f32288A.add(new Entry(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    public SmallSortedMap(int i2) {
        this.f32290z = i2;
        this.f32288A = Collections.emptyList();
        this.f32289B = Collections.emptyMap();
        this.E = Collections.emptyMap();
    }
}
