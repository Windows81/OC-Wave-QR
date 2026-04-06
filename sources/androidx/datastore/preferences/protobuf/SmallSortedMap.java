package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.FieldSet;
import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

class SmallSortedMap<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: A  reason: collision with root package name */
    public Map f21136A;

    /* renamed from: B  reason: collision with root package name */
    public boolean f21137B;
    public volatile EntrySet C;
    public Map D;
    public volatile DescendingEntrySet E;

    /* renamed from: z  reason: collision with root package name */
    public List f21138z;

    public class DescendingEntryIterator implements Iterator<Map.Entry<K, V>> {

        /* renamed from: A  reason: collision with root package name */
        public Iterator f21139A;

        /* renamed from: z  reason: collision with root package name */
        public int f21141z;

        public DescendingEntryIterator() {
            this.f21141z = SmallSortedMap.this.f21138z.size();
        }

        public final Iterator b() {
            if (this.f21139A == null) {
                this.f21139A = SmallSortedMap.this.D.entrySet().iterator();
            }
            return this.f21139A;
        }

        /* renamed from: c */
        public Map.Entry next() {
            if (b().hasNext()) {
                return (Map.Entry) b().next();
            }
            List b2 = SmallSortedMap.this.f21138z;
            int i2 = this.f21141z - 1;
            this.f21141z = i2;
            return (Map.Entry) b2.get(i2);
        }

        public boolean hasNext() {
            int i2 = this.f21141z;
            return (i2 > 0 && i2 <= SmallSortedMap.this.f21138z.size()) || b().hasNext();
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

    public class Entry implements Map.Entry<K, V>, Comparable<SmallSortedMap<K, V>.Entry> {

        /* renamed from: A  reason: collision with root package name */
        public Object f21143A;

        /* renamed from: z  reason: collision with root package name */
        public final Comparable f21145z;

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
            return f(this.f21145z, entry.getKey()) && f(this.f21143A, entry.getValue());
        }

        public final boolean f(Object obj, Object obj2) {
            return obj == null ? obj2 == null : obj.equals(obj2);
        }

        public Object getValue() {
            return this.f21143A;
        }

        /* renamed from: h */
        public Comparable getKey() {
            return this.f21145z;
        }

        public int hashCode() {
            Comparable comparable = this.f21145z;
            int i2 = 0;
            int hashCode = comparable == null ? 0 : comparable.hashCode();
            Object obj = this.f21143A;
            if (obj != null) {
                i2 = obj.hashCode();
            }
            return hashCode ^ i2;
        }

        public Object setValue(Object obj) {
            SmallSortedMap.this.h();
            Object obj2 = this.f21143A;
            this.f21143A = obj;
            return obj2;
        }

        public String toString() {
            return this.f21145z + "=" + this.f21143A;
        }

        public Entry(Comparable comparable, Object obj) {
            this.f21145z = comparable;
            this.f21143A = obj;
        }
    }

    public class EntryIterator implements Iterator<Map.Entry<K, V>> {

        /* renamed from: A  reason: collision with root package name */
        public boolean f21146A;

        /* renamed from: B  reason: collision with root package name */
        public Iterator f21147B;

        /* renamed from: z  reason: collision with root package name */
        public int f21148z;

        public EntryIterator() {
            this.f21148z = -1;
        }

        public final Iterator b() {
            if (this.f21147B == null) {
                this.f21147B = SmallSortedMap.this.f21136A.entrySet().iterator();
            }
            return this.f21147B;
        }

        /* renamed from: c */
        public Map.Entry next() {
            this.f21146A = true;
            int i2 = this.f21148z + 1;
            this.f21148z = i2;
            return i2 < SmallSortedMap.this.f21138z.size() ? (Map.Entry) SmallSortedMap.this.f21138z.get(this.f21148z) : (Map.Entry) b().next();
        }

        public boolean hasNext() {
            if (this.f21148z + 1 >= SmallSortedMap.this.f21138z.size()) {
                return !SmallSortedMap.this.f21136A.isEmpty() && b().hasNext();
            }
            return true;
        }

        public void remove() {
            if (this.f21146A) {
                this.f21146A = false;
                SmallSortedMap.this.h();
                if (this.f21148z < SmallSortedMap.this.f21138z.size()) {
                    SmallSortedMap smallSortedMap = SmallSortedMap.this;
                    int i2 = this.f21148z;
                    this.f21148z = i2 - 1;
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

    public static SmallSortedMap s() {
        return new SmallSortedMap<FieldSet.FieldDescriptorLite<Object>, Object>() {
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
        if (!this.f21138z.isEmpty()) {
            this.f21138z.clear();
        }
        if (!this.f21136A.isEmpty()) {
            this.f21136A.clear();
        }
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return g(comparable) >= 0 || this.f21136A.containsKey(comparable);
    }

    public Set entrySet() {
        if (this.C == null) {
            this.C = new EntrySet();
        }
        return this.C;
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
            return this.f21136A.equals(smallSortedMap.f21136A);
        }
        return true;
    }

    public final int g(Comparable comparable) {
        int i2;
        int size = this.f21138z.size();
        int i3 = size - 1;
        if (i3 >= 0) {
            int compareTo = comparable.compareTo(((Entry) this.f21138z.get(i3)).getKey());
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
            int compareTo2 = comparable.compareTo(((Entry) this.f21138z.get(i5)).getKey());
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
        return g2 >= 0 ? ((Entry) this.f21138z.get(g2)).getValue() : this.f21136A.get(comparable);
    }

    public final void h() {
        if (this.f21137B) {
            throw new UnsupportedOperationException();
        }
    }

    public int hashCode() {
        int m2 = m();
        int i2 = 0;
        for (int i3 = 0; i3 < m2; i3++) {
            i2 += ((Entry) this.f21138z.get(i3)).hashCode();
        }
        return n() > 0 ? i2 + this.f21136A.hashCode() : i2;
    }

    public Set i() {
        if (this.E == null) {
            this.E = new DescendingEntrySet();
        }
        return this.E;
    }

    public final void j() {
        h();
        if (this.f21138z.isEmpty() && !(this.f21138z instanceof ArrayList)) {
            this.f21138z = new ArrayList(16);
        }
    }

    public Map.Entry k(int i2) {
        return (Map.Entry) this.f21138z.get(i2);
    }

    public int m() {
        return this.f21138z.size();
    }

    public int n() {
        return this.f21136A.size();
    }

    public Iterable o() {
        return this.f21136A.isEmpty() ? Collections.emptySet() : this.f21136A.entrySet();
    }

    public final SortedMap p() {
        h();
        if (this.f21136A.isEmpty() && !(this.f21136A instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f21136A = treeMap;
            this.D = treeMap.descendingMap();
        }
        return (SortedMap) this.f21136A;
    }

    public boolean q() {
        return this.f21137B;
    }

    public void r() {
        if (!this.f21137B) {
            this.f21136A = this.f21136A.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f21136A);
            this.D = this.D.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.D);
            this.f21137B = true;
        }
    }

    public Object remove(Object obj) {
        h();
        Comparable comparable = (Comparable) obj;
        int g2 = g(comparable);
        if (g2 >= 0) {
            return u(g2);
        }
        if (this.f21136A.isEmpty()) {
            return null;
        }
        return this.f21136A.remove(comparable);
    }

    public int size() {
        return this.f21138z.size() + this.f21136A.size();
    }

    /* renamed from: t */
    public Object put(Comparable comparable, Object obj) {
        h();
        int g2 = g(comparable);
        if (g2 >= 0) {
            return ((Entry) this.f21138z.get(g2)).setValue(obj);
        }
        j();
        int i2 = -(g2 + 1);
        if (i2 >= 16) {
            return p().put(comparable, obj);
        }
        if (this.f21138z.size() == 16) {
            Entry entry = (Entry) this.f21138z.remove(15);
            p().put(entry.getKey(), entry.getValue());
        }
        this.f21138z.add(i2, new Entry(comparable, obj));
        return null;
    }

    public final Object u(int i2) {
        h();
        Object value = ((Entry) this.f21138z.remove(i2)).getValue();
        if (!this.f21136A.isEmpty()) {
            Iterator it = p().entrySet().iterator();
            this.f21138z.add(new Entry(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    public SmallSortedMap() {
        this.f21138z = Collections.emptyList();
        this.f21136A = Collections.emptyMap();
        this.D = Collections.emptyMap();
    }
}
