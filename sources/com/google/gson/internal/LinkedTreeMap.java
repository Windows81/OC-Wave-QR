package com.google.gson.internal;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

public final class LinkedTreeMap<K, V> extends AbstractMap<K, V> implements Serializable {
    public static final Comparator H = new Comparator<Comparable>() {
        /* renamed from: a */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    };

    /* renamed from: A  reason: collision with root package name */
    public final boolean f31734A;

    /* renamed from: B  reason: collision with root package name */
    public Node f31735B;
    public int C;
    public int D;
    public final Node E;
    public EntrySet F;
    public KeySet G;

    /* renamed from: z  reason: collision with root package name */
    public final Comparator f31736z;

    public class EntrySet extends AbstractSet<Map.Entry<K, V>> {
        public EntrySet() {
        }

        public void clear() {
            LinkedTreeMap.this.clear();
        }

        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && LinkedTreeMap.this.c((Map.Entry) obj) != null;
        }

        public Iterator iterator() {
            return new LinkedTreeMap<K, V>.LinkedTreeMapIterator<Map.Entry<K, V>>() {
                {
                    LinkedTreeMap linkedTreeMap = LinkedTreeMap.this;
                }

                /* renamed from: c */
                public Map.Entry next() {
                    return b();
                }
            };
        }

        public boolean remove(Object obj) {
            Node c2;
            if (!(obj instanceof Map.Entry) || (c2 = LinkedTreeMap.this.c((Map.Entry) obj)) == null) {
                return false;
            }
            LinkedTreeMap.this.g(c2, true);
            return true;
        }

        public int size() {
            return LinkedTreeMap.this.C;
        }
    }

    public final class KeySet extends AbstractSet<K> {
        public KeySet() {
        }

        public void clear() {
            LinkedTreeMap.this.clear();
        }

        public boolean contains(Object obj) {
            return LinkedTreeMap.this.containsKey(obj);
        }

        public Iterator iterator() {
            return new LinkedTreeMap<K, V>.LinkedTreeMapIterator<K>() {
                {
                    LinkedTreeMap linkedTreeMap = LinkedTreeMap.this;
                }

                public Object next() {
                    return b().E;
                }
            };
        }

        public boolean remove(Object obj) {
            return LinkedTreeMap.this.h(obj) != null;
        }

        public int size() {
            return LinkedTreeMap.this.C;
        }
    }

    public abstract class LinkedTreeMapIterator<T> implements Iterator<T> {

        /* renamed from: A  reason: collision with root package name */
        public Node f31739A = null;

        /* renamed from: B  reason: collision with root package name */
        public int f31740B;

        /* renamed from: z  reason: collision with root package name */
        public Node f31741z;

        public LinkedTreeMapIterator() {
            this.f31741z = LinkedTreeMap.this.E.C;
            this.f31740B = LinkedTreeMap.this.D;
        }

        public final Node b() {
            Node node = this.f31741z;
            LinkedTreeMap linkedTreeMap = LinkedTreeMap.this;
            if (node == linkedTreeMap.E) {
                throw new NoSuchElementException();
            } else if (linkedTreeMap.D == this.f31740B) {
                this.f31741z = node.C;
                this.f31739A = node;
                return node;
            } else {
                throw new ConcurrentModificationException();
            }
        }

        public final boolean hasNext() {
            return this.f31741z != LinkedTreeMap.this.E;
        }

        public final void remove() {
            Node node = this.f31739A;
            if (node != null) {
                LinkedTreeMap.this.g(node, true);
                this.f31739A = null;
                this.f31740B = LinkedTreeMap.this.D;
                return;
            }
            throw new IllegalStateException();
        }
    }

    public LinkedTreeMap() {
        this(H, true);
    }

    public final boolean a(Object obj, Object obj2) {
        return Objects.equals(obj, obj2);
    }

    public Node b(Object obj, boolean z2) {
        int i2;
        Node node;
        Comparator comparator = this.f31736z;
        Node node2 = this.f31735B;
        if (node2 != null) {
            Comparable comparable = comparator == H ? (Comparable) obj : null;
            while (true) {
                i2 = comparable != null ? comparable.compareTo(node2.E) : comparator.compare(obj, node2.E);
                if (i2 == 0) {
                    return node2;
                }
                Node node3 = i2 < 0 ? node2.f31742A : node2.f31743B;
                if (node3 == null) {
                    break;
                }
                node2 = node3;
            }
        } else {
            i2 = 0;
        }
        if (!z2) {
            return null;
        }
        Node node4 = this.E;
        if (node2 != null) {
            node = new Node(this.f31734A, node2, obj, node4, node4.D);
            if (i2 < 0) {
                node2.f31742A = node;
            } else {
                node2.f31743B = node;
            }
            f(node2, true);
        } else if (comparator != H || (obj instanceof Comparable)) {
            node = new Node(this.f31734A, node2, obj, node4, node4.D);
            this.f31735B = node;
        } else {
            throw new ClassCastException(obj.getClass().getName() + " is not Comparable");
        }
        this.C++;
        this.D++;
        return node;
    }

    public Node c(Map.Entry entry) {
        Node e2 = e(entry.getKey());
        if (e2 == null || !a(e2.G, entry.getValue())) {
            return null;
        }
        return e2;
    }

    public void clear() {
        this.f31735B = null;
        this.C = 0;
        this.D++;
        Node node = this.E;
        node.D = node;
        node.C = node;
    }

    public boolean containsKey(Object obj) {
        return e(obj) != null;
    }

    public Node e(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return b(obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    public Set entrySet() {
        EntrySet entrySet = this.F;
        if (entrySet != null) {
            return entrySet;
        }
        EntrySet entrySet2 = new EntrySet();
        this.F = entrySet2;
        return entrySet2;
    }

    public final void f(Node node, boolean z2) {
        while (node != null) {
            Node node2 = node.f31742A;
            Node node3 = node.f31743B;
            int i2 = 0;
            int i3 = node2 != null ? node2.H : 0;
            int i4 = node3 != null ? node3.H : 0;
            int i5 = i3 - i4;
            if (i5 == -2) {
                Node node4 = node3.f31742A;
                Node node5 = node3.f31743B;
                int i6 = node5 != null ? node5.H : 0;
                if (node4 != null) {
                    i2 = node4.H;
                }
                int i7 = i2 - i6;
                if (i7 == -1 || (i7 == 0 && !z2)) {
                    j(node);
                } else {
                    k(node3);
                    j(node);
                }
                if (z2) {
                    return;
                }
            } else if (i5 == 2) {
                Node node6 = node2.f31742A;
                Node node7 = node2.f31743B;
                int i8 = node7 != null ? node7.H : 0;
                if (node6 != null) {
                    i2 = node6.H;
                }
                int i9 = i2 - i8;
                if (i9 == 1 || (i9 == 0 && !z2)) {
                    k(node);
                } else {
                    j(node2);
                    k(node);
                }
                if (z2) {
                    return;
                }
            } else if (i5 == 0) {
                node.H = i3 + 1;
                if (z2) {
                    return;
                }
            } else {
                node.H = Math.max(i3, i4) + 1;
                if (!z2) {
                    return;
                }
            }
            node = node.f31744z;
        }
    }

    public void g(Node node, boolean z2) {
        int i2;
        if (z2) {
            Node node2 = node.D;
            node2.C = node.C;
            node.C.D = node2;
        }
        Node node3 = node.f31742A;
        Node node4 = node.f31743B;
        Node node5 = node.f31744z;
        int i3 = 0;
        if (node3 == null || node4 == null) {
            if (node3 != null) {
                i(node, node3);
                node.f31742A = null;
            } else if (node4 != null) {
                i(node, node4);
                node.f31743B = null;
            } else {
                i(node, (Node) null);
            }
            f(node5, false);
            this.C--;
            this.D++;
            return;
        }
        Node b2 = node3.H > node4.H ? node3.b() : node4.a();
        g(b2, false);
        Node node6 = node.f31742A;
        if (node6 != null) {
            i2 = node6.H;
            b2.f31742A = node6;
            node6.f31744z = b2;
            node.f31742A = null;
        } else {
            i2 = 0;
        }
        Node node7 = node.f31743B;
        if (node7 != null) {
            i3 = node7.H;
            b2.f31743B = node7;
            node7.f31744z = b2;
            node.f31743B = null;
        }
        b2.H = Math.max(i2, i3) + 1;
        i(node, b2);
    }

    public Object get(Object obj) {
        Node e2 = e(obj);
        if (e2 != null) {
            return e2.G;
        }
        return null;
    }

    public Node h(Object obj) {
        Node e2 = e(obj);
        if (e2 != null) {
            g(e2, true);
        }
        return e2;
    }

    public final void i(Node node, Node node2) {
        Node node3 = node.f31744z;
        node.f31744z = null;
        if (node2 != null) {
            node2.f31744z = node3;
        }
        if (node3 == null) {
            this.f31735B = node2;
        } else if (node3.f31742A == node) {
            node3.f31742A = node2;
        } else {
            node3.f31743B = node2;
        }
    }

    public final void j(Node node) {
        Node node2 = node.f31742A;
        Node node3 = node.f31743B;
        Node node4 = node3.f31742A;
        Node node5 = node3.f31743B;
        node.f31743B = node4;
        if (node4 != null) {
            node4.f31744z = node;
        }
        i(node, node3);
        node3.f31742A = node;
        node.f31744z = node3;
        int i2 = 0;
        int max = Math.max(node2 != null ? node2.H : 0, node4 != null ? node4.H : 0) + 1;
        node.H = max;
        if (node5 != null) {
            i2 = node5.H;
        }
        node3.H = Math.max(max, i2) + 1;
    }

    public final void k(Node node) {
        Node node2 = node.f31742A;
        Node node3 = node.f31743B;
        Node node4 = node2.f31742A;
        Node node5 = node2.f31743B;
        node.f31742A = node5;
        if (node5 != null) {
            node5.f31744z = node;
        }
        i(node, node2);
        node2.f31743B = node;
        node.f31744z = node2;
        int i2 = 0;
        int max = Math.max(node3 != null ? node3.H : 0, node5 != null ? node5.H : 0) + 1;
        node.H = max;
        if (node4 != null) {
            i2 = node4.H;
        }
        node2.H = Math.max(max, i2) + 1;
    }

    public Set keySet() {
        KeySet keySet = this.G;
        if (keySet != null) {
            return keySet;
        }
        KeySet keySet2 = new KeySet();
        this.G = keySet2;
        return keySet2;
    }

    public Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        } else if (obj2 != null || this.f31734A) {
            Node b2 = b(obj, true);
            Object obj3 = b2.G;
            b2.G = obj2;
            return obj3;
        } else {
            throw new NullPointerException("value == null");
        }
    }

    public Object remove(Object obj) {
        Node h2 = h(obj);
        if (h2 != null) {
            return h2.G;
        }
        return null;
    }

    public int size() {
        return this.C;
    }

    public LinkedTreeMap(boolean z2) {
        this(H, z2);
    }

    public LinkedTreeMap(Comparator comparator, boolean z2) {
        this.C = 0;
        this.D = 0;
        this.f31736z = comparator == null ? H : comparator;
        this.f31734A = z2;
        this.E = new Node(z2);
    }

    public static final class Node<K, V> implements Map.Entry<K, V> {

        /* renamed from: A  reason: collision with root package name */
        public Node f31742A;

        /* renamed from: B  reason: collision with root package name */
        public Node f31743B;
        public Node C;
        public Node D;
        public final Object E;
        public final boolean F;
        public Object G;
        public int H;

        /* renamed from: z  reason: collision with root package name */
        public Node f31744z;

        public Node(boolean z2) {
            this.E = null;
            this.F = z2;
            this.D = this;
            this.C = this;
        }

        public Node a() {
            Node node = this;
            for (Node node2 = this.f31742A; node2 != null; node2 = node2.f31742A) {
                node = node2;
            }
            return node;
        }

        public Node b() {
            Node node = this;
            for (Node node2 = this.f31743B; node2 != null; node2 = node2.f31743B) {
                node = node2;
            }
            return node;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0031 A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r4) {
            /*
                r3 = this;
                boolean r0 = r4 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 == 0) goto L_0x0032
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                java.lang.Object r0 = r3.E
                if (r0 != 0) goto L_0x0012
                java.lang.Object r0 = r4.getKey()
                if (r0 != 0) goto L_0x0032
                goto L_0x001c
            L_0x0012:
                java.lang.Object r2 = r4.getKey()
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x0032
            L_0x001c:
                java.lang.Object r0 = r3.G
                if (r0 != 0) goto L_0x0027
                java.lang.Object r4 = r4.getValue()
                if (r4 != 0) goto L_0x0032
                goto L_0x0031
            L_0x0027:
                java.lang.Object r4 = r4.getValue()
                boolean r4 = r0.equals(r4)
                if (r4 == 0) goto L_0x0032
            L_0x0031:
                r1 = 1
            L_0x0032:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.LinkedTreeMap.Node.equals(java.lang.Object):boolean");
        }

        public Object getKey() {
            return this.E;
        }

        public Object getValue() {
            return this.G;
        }

        public int hashCode() {
            Object obj = this.E;
            int i2 = 0;
            int hashCode = obj == null ? 0 : obj.hashCode();
            Object obj2 = this.G;
            if (obj2 != null) {
                i2 = obj2.hashCode();
            }
            return hashCode ^ i2;
        }

        public Object setValue(Object obj) {
            if (obj != null || this.F) {
                Object obj2 = this.G;
                this.G = obj;
                return obj2;
            }
            throw new NullPointerException("value == null");
        }

        public String toString() {
            return this.E + "=" + this.G;
        }

        public Node(boolean z2, Node node, Object obj, Node node2, Node node3) {
            this.f31744z = node;
            this.E = obj;
            this.F = z2;
            this.H = 1;
            this.C = node2;
            this.D = node3;
            node3.C = this;
            node2.D = this;
        }
    }
}
