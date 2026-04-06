package androidx.arch.core.internal;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

public class SafeIterableMap<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: A  reason: collision with root package name */
    public Entry f1389A;

    /* renamed from: B  reason: collision with root package name */
    public final WeakHashMap f1390B = new WeakHashMap();
    public int C = 0;

    /* renamed from: z  reason: collision with root package name */
    public Entry f1391z;

    public static class AscendingIterator<K, V> extends ListIterator<K, V> {
        public AscendingIterator(Entry entry, Entry entry2) {
            super(entry, entry2);
        }

        public Entry c(Entry entry) {
            return entry.C;
        }

        public Entry d(Entry entry) {
            return entry.f1393B;
        }
    }

    public static class DescendingIterator<K, V> extends ListIterator<K, V> {
        public DescendingIterator(Entry entry, Entry entry2) {
            super(entry, entry2);
        }

        public Entry c(Entry entry) {
            return entry.f1393B;
        }

        public Entry d(Entry entry) {
            return entry.C;
        }
    }

    public static class Entry<K, V> implements Map.Entry<K, V> {

        /* renamed from: A  reason: collision with root package name */
        public final Object f1392A;

        /* renamed from: B  reason: collision with root package name */
        public Entry f1393B;
        public Entry C;

        /* renamed from: z  reason: collision with root package name */
        public final Object f1394z;

        public Entry(Object obj, Object obj2) {
            this.f1394z = obj;
            this.f1392A = obj2;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            return this.f1394z.equals(entry.f1394z) && this.f1392A.equals(entry.f1392A);
        }

        public Object getKey() {
            return this.f1394z;
        }

        public Object getValue() {
            return this.f1392A;
        }

        public int hashCode() {
            return this.f1394z.hashCode() ^ this.f1392A.hashCode();
        }

        public Object setValue(Object obj) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f1394z + "=" + this.f1392A;
        }
    }

    public class IteratorWithAdditions extends SupportRemove<K, V> implements Iterator<Map.Entry<K, V>> {

        /* renamed from: A  reason: collision with root package name */
        public boolean f1395A = true;

        /* renamed from: z  reason: collision with root package name */
        public Entry f1397z;

        public IteratorWithAdditions() {
        }

        public void b(Entry entry) {
            Entry entry2 = this.f1397z;
            if (entry == entry2) {
                Entry entry3 = entry2.C;
                this.f1397z = entry3;
                this.f1395A = entry3 == null;
            }
        }

        /* renamed from: c */
        public Map.Entry next() {
            if (this.f1395A) {
                this.f1395A = false;
                this.f1397z = SafeIterableMap.this.f1391z;
            } else {
                Entry entry = this.f1397z;
                this.f1397z = entry != null ? entry.f1393B : null;
            }
            return this.f1397z;
        }

        public boolean hasNext() {
            if (this.f1395A) {
                return SafeIterableMap.this.f1391z != null;
            }
            Entry entry = this.f1397z;
            return (entry == null || entry.f1393B == null) ? false : true;
        }
    }

    public static abstract class ListIterator<K, V> extends SupportRemove<K, V> implements Iterator<Map.Entry<K, V>> {

        /* renamed from: A  reason: collision with root package name */
        public Entry f1398A;

        /* renamed from: z  reason: collision with root package name */
        public Entry f1399z;

        public ListIterator(Entry entry, Entry entry2) {
            this.f1399z = entry2;
            this.f1398A = entry;
        }

        public void b(Entry entry) {
            if (this.f1399z == entry && entry == this.f1398A) {
                this.f1398A = null;
                this.f1399z = null;
            }
            Entry entry2 = this.f1399z;
            if (entry2 == entry) {
                this.f1399z = c(entry2);
            }
            if (this.f1398A == entry) {
                this.f1398A = f();
            }
        }

        public abstract Entry c(Entry entry);

        public abstract Entry d(Entry entry);

        /* renamed from: e */
        public Map.Entry next() {
            Entry entry = this.f1398A;
            this.f1398A = f();
            return entry;
        }

        public final Entry f() {
            Entry entry = this.f1398A;
            Entry entry2 = this.f1399z;
            if (entry == entry2 || entry2 == null) {
                return null;
            }
            return d(entry);
        }

        public boolean hasNext() {
            return this.f1398A != null;
        }
    }

    public static abstract class SupportRemove<K, V> {
        public abstract void b(Entry entry);
    }

    public Iterator descendingIterator() {
        DescendingIterator descendingIterator = new DescendingIterator(this.f1389A, this.f1391z);
        this.f1390B.put(descendingIterator, Boolean.FALSE);
        return descendingIterator;
    }

    public Map.Entry e() {
        return this.f1391z;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SafeIterableMap)) {
            return false;
        }
        SafeIterableMap safeIterableMap = (SafeIterableMap) obj;
        if (size() != safeIterableMap.size()) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = safeIterableMap.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object next = it2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return !it.hasNext() && !it2.hasNext();
    }

    public Entry g(Object obj) {
        Entry entry = this.f1391z;
        while (entry != null && !entry.f1394z.equals(obj)) {
            entry = entry.f1393B;
        }
        return entry;
    }

    public IteratorWithAdditions h() {
        IteratorWithAdditions iteratorWithAdditions = new IteratorWithAdditions();
        this.f1390B.put(iteratorWithAdditions, Boolean.FALSE);
        return iteratorWithAdditions;
    }

    public int hashCode() {
        Iterator it = iterator();
        int i2 = 0;
        while (it.hasNext()) {
            i2 += ((Map.Entry) it.next()).hashCode();
        }
        return i2;
    }

    public Map.Entry i() {
        return this.f1389A;
    }

    public Iterator iterator() {
        AscendingIterator ascendingIterator = new AscendingIterator(this.f1391z, this.f1389A);
        this.f1390B.put(ascendingIterator, Boolean.FALSE);
        return ascendingIterator;
    }

    public Entry m(Object obj, Object obj2) {
        Entry entry = new Entry(obj, obj2);
        this.C++;
        Entry entry2 = this.f1389A;
        if (entry2 == null) {
            this.f1391z = entry;
            this.f1389A = entry;
            return entry;
        }
        entry2.f1393B = entry;
        entry.C = entry2;
        this.f1389A = entry;
        return entry;
    }

    public Object n(Object obj, Object obj2) {
        Entry g2 = g(obj);
        if (g2 != null) {
            return g2.f1392A;
        }
        m(obj, obj2);
        return null;
    }

    public Object o(Object obj) {
        Entry g2 = g(obj);
        if (g2 == null) {
            return null;
        }
        this.C--;
        if (!this.f1390B.isEmpty()) {
            for (SupportRemove b2 : this.f1390B.keySet()) {
                b2.b(g2);
            }
        }
        Entry entry = g2.C;
        if (entry != null) {
            entry.f1393B = g2.f1393B;
        } else {
            this.f1391z = g2.f1393B;
        }
        Entry entry2 = g2.f1393B;
        if (entry2 != null) {
            entry2.C = entry;
        } else {
            this.f1389A = entry;
        }
        g2.f1393B = null;
        g2.C = null;
        return g2.f1392A;
    }

    public int size() {
        return this.C;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            sb.append(((Map.Entry) it.next()).toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
