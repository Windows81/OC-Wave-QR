package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.Multimaps;
import com.google.common.collect.Sets;
import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

@ElementTypesAreNonnullByDefault
public class LinkedListMultimap<K, V> extends AbstractMultimap<K, V> implements ListMultimap<K, V>, Serializable {
    public transient Node D;
    public transient Node E;
    public transient Map F;
    public transient int G;
    public transient int H;

    public class DistinctKeyIterator implements Iterator<K> {

        /* renamed from: A  reason: collision with root package name */
        public Node f28286A;

        /* renamed from: B  reason: collision with root package name */
        public Node f28287B;
        public int C;

        /* renamed from: z  reason: collision with root package name */
        public final Set f28288z;

        public DistinctKeyIterator() {
            this.f28288z = Sets.i(LinkedListMultimap.this.keySet().size());
            this.f28286A = LinkedListMultimap.this.D;
            this.C = LinkedListMultimap.this.H;
        }

        public final void b() {
            if (LinkedListMultimap.this.H != this.C) {
                throw new ConcurrentModificationException();
            }
        }

        public boolean hasNext() {
            b();
            return this.f28286A != null;
        }

        public Object next() {
            Node node;
            b();
            Node node2 = this.f28286A;
            if (node2 != null) {
                this.f28287B = node2;
                this.f28288z.add(node2.f28294z);
                do {
                    node = this.f28286A.f28293B;
                    this.f28286A = node;
                    if (node == null || this.f28288z.add(node.f28294z)) {
                    }
                    node = this.f28286A.f28293B;
                    this.f28286A = node;
                    break;
                } while (this.f28288z.add(node.f28294z));
                return this.f28287B.f28294z;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            b();
            Preconditions.x(this.f28287B != null, "no calls to next() since the last call to remove()");
            LinkedListMultimap.this.x(this.f28287B.f28294z);
            this.f28287B = null;
            this.C = LinkedListMultimap.this.H;
        }
    }

    public static class KeyList<K, V> {

        /* renamed from: a  reason: collision with root package name */
        public Node f28289a;

        /* renamed from: b  reason: collision with root package name */
        public Node f28290b;

        /* renamed from: c  reason: collision with root package name */
        public int f28291c = 1;

        public KeyList(Node node) {
            this.f28289a = node;
            this.f28290b = node;
            node.E = null;
            node.D = null;
        }
    }

    public static final class Node<K, V> extends AbstractMapEntry<K, V> {

        /* renamed from: A  reason: collision with root package name */
        public Object f28292A;

        /* renamed from: B  reason: collision with root package name */
        public Node f28293B;
        public Node C;
        public Node D;
        public Node E;

        /* renamed from: z  reason: collision with root package name */
        public final Object f28294z;

        public Node(Object obj, Object obj2) {
            this.f28294z = obj;
            this.f28292A = obj2;
        }

        public Object getKey() {
            return this.f28294z;
        }

        public Object getValue() {
            return this.f28292A;
        }

        public Object setValue(Object obj) {
            Object obj2 = this.f28292A;
            this.f28292A = obj;
            return obj2;
        }
    }

    public class NodeIterator implements ListIterator<Map.Entry<K, V>> {

        /* renamed from: A  reason: collision with root package name */
        public Node f28295A;

        /* renamed from: B  reason: collision with root package name */
        public Node f28296B;
        public Node C;
        public int D;

        /* renamed from: z  reason: collision with root package name */
        public int f28297z;

        public NodeIterator(int i2) {
            this.D = LinkedListMultimap.this.H;
            int size = LinkedListMultimap.this.size();
            Preconditions.t(i2, size);
            if (i2 < size / 2) {
                this.f28295A = LinkedListMultimap.this.D;
                while (true) {
                    int i3 = i2 - 1;
                    if (i2 <= 0) {
                        break;
                    }
                    next();
                    i2 = i3;
                }
            } else {
                this.C = LinkedListMultimap.this.E;
                this.f28297z = size;
                while (true) {
                    int i4 = i2 + 1;
                    if (i2 >= size) {
                        break;
                    }
                    previous();
                    i2 = i4;
                }
            }
            this.f28296B = null;
        }

        /* renamed from: b */
        public void add(Map.Entry entry) {
            throw new UnsupportedOperationException();
        }

        public final void c() {
            if (LinkedListMultimap.this.H != this.D) {
                throw new ConcurrentModificationException();
            }
        }

        /* renamed from: d */
        public Node next() {
            c();
            Node node = this.f28295A;
            if (node != null) {
                this.f28296B = node;
                this.C = node;
                this.f28295A = node.f28293B;
                this.f28297z++;
                return node;
            }
            throw new NoSuchElementException();
        }

        /* renamed from: e */
        public Node previous() {
            c();
            Node node = this.C;
            if (node != null) {
                this.f28296B = node;
                this.f28295A = node;
                this.C = node.C;
                this.f28297z--;
                return node;
            }
            throw new NoSuchElementException();
        }

        /* renamed from: f */
        public void set(Map.Entry entry) {
            throw new UnsupportedOperationException();
        }

        public void g(Object obj) {
            Preconditions.w(this.f28296B != null);
            this.f28296B.f28292A = obj;
        }

        public boolean hasNext() {
            c();
            return this.f28295A != null;
        }

        public boolean hasPrevious() {
            c();
            return this.C != null;
        }

        public int nextIndex() {
            return this.f28297z;
        }

        public int previousIndex() {
            return this.f28297z - 1;
        }

        public void remove() {
            c();
            Preconditions.x(this.f28296B != null, "no calls to next() since the last call to remove()");
            Node node = this.f28296B;
            if (node != this.f28295A) {
                this.C = node.C;
                this.f28297z--;
            } else {
                this.f28295A = node.f28293B;
            }
            LinkedListMultimap.this.y(node);
            this.f28296B = null;
            this.D = LinkedListMultimap.this.H;
        }
    }

    public /* bridge */ /* synthetic */ Map E() {
        return super.E();
    }

    public /* bridge */ /* synthetic */ boolean F(Object obj, Object obj2) {
        return super.F(obj, obj2);
    }

    public Map a() {
        return new Multimaps.AsMap(this);
    }

    public Set c() {
        return new Sets.ImprovedAbstractSet<K>() {
            public boolean contains(Object obj) {
                return LinkedListMultimap.this.containsKey(obj);
            }

            public Iterator iterator() {
                return new DistinctKeyIterator();
            }

            public boolean remove(Object obj) {
                return !LinkedListMultimap.this.h(obj).isEmpty();
            }

            public int size() {
                return LinkedListMultimap.this.F.size();
            }
        };
    }

    public void clear() {
        this.D = null;
        this.E = null;
        this.F.clear();
        this.G = 0;
        this.H++;
    }

    public boolean containsKey(Object obj) {
        return this.F.containsKey(obj);
    }

    public boolean containsValue(Object obj) {
        return z().contains(obj);
    }

    public Iterator e() {
        throw new AssertionError("should never be called");
    }

    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public boolean isEmpty() {
        return this.D == null;
    }

    public /* bridge */ /* synthetic */ Set keySet() {
        return super.keySet();
    }

    public boolean put(Object obj, Object obj2) {
        s(obj, obj2, (Node) null);
        return true;
    }

    public /* bridge */ /* synthetic */ boolean remove(Object obj, Object obj2) {
        return super.remove(obj, obj2);
    }

    public final Node s(Object obj, Object obj2, Node node) {
        Node node2 = new Node(obj, obj2);
        if (this.D == null) {
            this.E = node2;
            this.D = node2;
            this.F.put(obj, new KeyList(node2));
            this.H++;
        } else if (node == null) {
            Node node3 = this.E;
            Objects.requireNonNull(node3);
            node3.f28293B = node2;
            node2.C = this.E;
            this.E = node2;
            KeyList keyList = (KeyList) this.F.get(obj);
            if (keyList == null) {
                this.F.put(obj, new KeyList(node2));
                this.H++;
            } else {
                keyList.f28291c++;
                Node node4 = keyList.f28290b;
                node4.D = node2;
                node2.E = node4;
                keyList.f28290b = node2;
            }
        } else {
            KeyList keyList2 = (KeyList) this.F.get(obj);
            Objects.requireNonNull(keyList2);
            keyList2.f28291c++;
            node2.C = node.C;
            node2.E = node.E;
            node2.f28293B = node;
            node2.D = node;
            Node node5 = node.E;
            if (node5 == null) {
                keyList2.f28289a = node2;
            } else {
                node5.D = node2;
            }
            Node node6 = node.C;
            if (node6 == null) {
                this.D = node2;
            } else {
                node6.f28293B = node2;
            }
            node.C = node2;
            node.E = node2;
        }
        this.G++;
        return node2;
    }

    public int size() {
        return this.G;
    }

    /* renamed from: t */
    public List b() {
        return new AbstractSequentialList<Map.Entry<K, V>>() {
            public ListIterator listIterator(int i2) {
                return new NodeIterator(i2);
            }

            public int size() {
                return LinkedListMultimap.this.G;
            }
        };
    }

    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    /* renamed from: u */
    public List d() {
        return new AbstractSequentialList<V>() {
            public ListIterator listIterator(int i2) {
                final NodeIterator nodeIterator = new NodeIterator(i2);
                return new TransformedListIterator<Map.Entry<K, V>, V>(this, nodeIterator) {
                    /* renamed from: d */
                    public Object b(Map.Entry entry) {
                        return entry.getValue();
                    }

                    public void set(Object obj) {
                        nodeIterator.g(obj);
                    }
                };
            }

            public int size() {
                return LinkedListMultimap.this.G;
            }
        };
    }

    /* renamed from: v */
    public List m() {
        return (List) super.m();
    }

    public final List w(Object obj) {
        return Collections.unmodifiableList(Lists.j(new ValueForKeyIterator(obj)));
    }

    public final void x(Object obj) {
        Iterators.e(new ValueForKeyIterator(obj));
    }

    public final void y(Node node) {
        Node node2 = node.C;
        if (node2 != null) {
            node2.f28293B = node.f28293B;
        } else {
            this.D = node.f28293B;
        }
        Node node3 = node.f28293B;
        if (node3 != null) {
            node3.C = node2;
        } else {
            this.E = node2;
        }
        if (node.E == null && node.D == null) {
            KeyList keyList = (KeyList) this.F.remove(node.f28294z);
            Objects.requireNonNull(keyList);
            keyList.f28291c = 0;
            this.H++;
        } else {
            KeyList keyList2 = (KeyList) this.F.get(node.f28294z);
            Objects.requireNonNull(keyList2);
            keyList2.f28291c--;
            Node node4 = node.E;
            if (node4 == null) {
                Node node5 = node.D;
                Objects.requireNonNull(node5);
                keyList2.f28289a = node5;
            } else {
                node4.D = node.D;
            }
            Node node6 = node.D;
            if (node6 == null) {
                Node node7 = node.E;
                Objects.requireNonNull(node7);
                keyList2.f28290b = node7;
            } else {
                node6.E = node.E;
            }
        }
        this.G--;
    }

    public List z() {
        return (List) super.g();
    }

    public List get(final Object obj) {
        return new AbstractSequentialList<V>() {
            public ListIterator listIterator(int i2) {
                return new ValueForKeyIterator(obj, i2);
            }

            public int size() {
                KeyList keyList = (KeyList) LinkedListMultimap.this.F.get(obj);
                if (keyList == null) {
                    return 0;
                }
                return keyList.f28291c;
            }
        };
    }

    public List h(Object obj) {
        List w2 = w(obj);
        x(obj);
        return w2;
    }

    public class ValueForKeyIterator implements ListIterator<V> {

        /* renamed from: A  reason: collision with root package name */
        public int f28298A;

        /* renamed from: B  reason: collision with root package name */
        public Node f28299B;
        public Node C;
        public Node D;

        /* renamed from: z  reason: collision with root package name */
        public final Object f28300z;

        public ValueForKeyIterator(Object obj) {
            Node node;
            this.f28300z = obj;
            KeyList keyList = (KeyList) LinkedListMultimap.this.F.get(obj);
            if (keyList == null) {
                node = null;
            } else {
                node = keyList.f28289a;
            }
            this.f28299B = node;
        }

        public void add(Object obj) {
            this.D = LinkedListMultimap.this.s(this.f28300z, obj, this.f28299B);
            this.f28298A++;
            this.C = null;
        }

        public boolean hasNext() {
            return this.f28299B != null;
        }

        public boolean hasPrevious() {
            return this.D != null;
        }

        public Object next() {
            Node node = this.f28299B;
            if (node != null) {
                this.C = node;
                this.D = node;
                this.f28299B = node.D;
                this.f28298A++;
                return node.f28292A;
            }
            throw new NoSuchElementException();
        }

        public int nextIndex() {
            return this.f28298A;
        }

        public Object previous() {
            Node node = this.D;
            if (node != null) {
                this.C = node;
                this.f28299B = node;
                this.D = node.E;
                this.f28298A--;
                return node.f28292A;
            }
            throw new NoSuchElementException();
        }

        public int previousIndex() {
            return this.f28298A - 1;
        }

        public void remove() {
            Preconditions.x(this.C != null, "no calls to next() since the last call to remove()");
            Node node = this.C;
            if (node != this.f28299B) {
                this.D = node.E;
                this.f28298A--;
            } else {
                this.f28299B = node.D;
            }
            LinkedListMultimap.this.y(node);
            this.C = null;
        }

        public void set(Object obj) {
            Preconditions.w(this.C != null);
            this.C.f28292A = obj;
        }

        public ValueForKeyIterator(Object obj, int i2) {
            int i3;
            Node node;
            Node node2;
            KeyList keyList = (KeyList) LinkedListMultimap.this.F.get(obj);
            if (keyList == null) {
                i3 = 0;
            } else {
                i3 = keyList.f28291c;
            }
            Preconditions.t(i2, i3);
            if (i2 < i3 / 2) {
                if (keyList == null) {
                    node = null;
                } else {
                    node = keyList.f28289a;
                }
                this.f28299B = node;
                while (true) {
                    int i4 = i2 - 1;
                    if (i2 <= 0) {
                        break;
                    }
                    next();
                    i2 = i4;
                }
            } else {
                if (keyList == null) {
                    node2 = null;
                } else {
                    node2 = keyList.f28290b;
                }
                this.D = node2;
                this.f28298A = i3;
                while (true) {
                    int i5 = i2 + 1;
                    if (i2 >= i3) {
                        break;
                    }
                    previous();
                    i2 = i5;
                }
            }
            this.f28300z = obj;
            this.C = null;
        }
    }
}
