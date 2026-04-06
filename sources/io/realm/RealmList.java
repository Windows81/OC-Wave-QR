package io.realm;

import io.realm.internal.InvalidRow;
import io.realm.internal.OsList;
import io.realm.internal.RealmObjectProxy;
import java.util.AbstractList;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.UUID;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

public class RealmList<E> extends AbstractList<E> implements OrderedRealmCollection<E> {

    /* renamed from: A  reason: collision with root package name */
    public String f40014A;

    /* renamed from: B  reason: collision with root package name */
    public final ManagedListOperator f40015B;
    public final BaseRealm C;
    public List D;

    /* renamed from: z  reason: collision with root package name */
    public Class f40016z;

    public class RealmItr implements Iterator<E> {

        /* renamed from: A  reason: collision with root package name */
        public int f40017A;

        /* renamed from: B  reason: collision with root package name */
        public int f40018B;

        /* renamed from: z  reason: collision with root package name */
        public int f40019z;

        public RealmItr() {
            this.f40019z = 0;
            this.f40017A = -1;
            this.f40018B = RealmList.this.modCount;
        }

        public final void b() {
            if (RealmList.this.modCount != this.f40018B) {
                throw new ConcurrentModificationException();
            }
        }

        public boolean hasNext() {
            RealmList.this.q();
            b();
            return this.f40019z != RealmList.this.size();
        }

        public Object next() {
            RealmList.this.q();
            b();
            int i2 = this.f40019z;
            try {
                Object obj = RealmList.this.get(i2);
                this.f40017A = i2;
                this.f40019z = i2 + 1;
                return obj;
            } catch (IndexOutOfBoundsException unused) {
                b();
                throw new NoSuchElementException("Cannot access index " + i2 + " when size is " + RealmList.this.size() + ". Remember to check hasNext() before using next().");
            }
        }

        public void remove() {
            RealmList.this.q();
            if (this.f40017A >= 0) {
                b();
                try {
                    RealmList.this.remove(this.f40017A);
                    int i2 = this.f40017A;
                    int i3 = this.f40019z;
                    if (i2 < i3) {
                        this.f40019z = i3 - 1;
                    }
                    this.f40017A = -1;
                    this.f40018B = RealmList.this.modCount;
                } catch (IndexOutOfBoundsException unused) {
                    throw new ConcurrentModificationException();
                }
            } else {
                throw new IllegalStateException("Cannot call remove() twice. Must call next() in between.");
            }
        }
    }

    public class RealmListItr extends RealmList<E>.RealmItr implements ListIterator<E> {
        public RealmListItr(int i2) {
            super();
            if (i2 < 0 || i2 > RealmList.this.size()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Starting location must be a valid index: [0, ");
                sb.append(RealmList.this.size() - 1);
                sb.append("]. Index was ");
                sb.append(i2);
                throw new IndexOutOfBoundsException(sb.toString());
            }
            this.f40019z = i2;
        }

        public void add(Object obj) {
            RealmList.this.C.j();
            b();
            try {
                int i2 = this.f40019z;
                RealmList.this.add(i2, obj);
                this.f40017A = -1;
                this.f40019z = i2 + 1;
                this.f40018B = RealmList.this.modCount;
            } catch (IndexOutOfBoundsException unused) {
                throw new ConcurrentModificationException();
            }
        }

        public boolean hasPrevious() {
            return this.f40019z != 0;
        }

        public int nextIndex() {
            return this.f40019z;
        }

        public Object previous() {
            b();
            int i2 = this.f40019z - 1;
            try {
                Object obj = RealmList.this.get(i2);
                this.f40019z = i2;
                this.f40017A = i2;
                return obj;
            } catch (IndexOutOfBoundsException unused) {
                b();
                throw new NoSuchElementException("Cannot access index less than zero. This was " + i2 + ". Remember to check hasPrevious() before using previous().");
            }
        }

        public int previousIndex() {
            return this.f40019z - 1;
        }

        public void set(Object obj) {
            RealmList.this.C.j();
            if (this.f40017A >= 0) {
                b();
                try {
                    RealmList.this.set(this.f40017A, obj);
                    this.f40018B = RealmList.this.modCount;
                } catch (IndexOutOfBoundsException unused) {
                    throw new ConcurrentModificationException();
                }
            } else {
                throw new IllegalStateException();
            }
        }
    }

    public RealmList(Class cls, OsList osList, BaseRealm baseRealm) {
        this.f40016z = cls;
        this.f40015B = u(baseRealm, osList, cls, (String) null);
        this.C = baseRealm;
    }

    public static boolean z(Class cls) {
        return RealmModel.class.isAssignableFrom(cls);
    }

    public boolean A() {
        BaseRealm baseRealm = this.C;
        if (baseRealm == null) {
            return true;
        }
        if (baseRealm.isClosed()) {
            return false;
        }
        return w();
    }

    public void B(OrderedRealmCollectionChangeListener orderedRealmCollectionChangeListener) {
        CollectionUtils.b(this.C, orderedRealmCollectionChangeListener, true);
        this.f40015B.g().L(this, orderedRealmCollectionChangeListener);
    }

    public void C(RealmChangeListener realmChangeListener) {
        CollectionUtils.b(this.C, realmChangeListener, true);
        this.f40015B.g().M(this, realmChangeListener);
    }

    public void add(int i2, Object obj) {
        if (isManaged()) {
            q();
            this.f40015B.h(i2, obj);
        } else {
            this.D.add(i2, obj);
        }
        this.modCount++;
    }

    public void clear() {
        if (isManaged()) {
            q();
            this.f40015B.m();
        } else {
            this.D.clear();
        }
        this.modCount++;
    }

    public boolean contains(Object obj) {
        if (!isManaged()) {
            return this.D.contains(obj);
        }
        this.C.j();
        if (!(obj instanceof RealmObjectProxy) || ((RealmObjectProxy) obj).b().e() != InvalidRow.INSTANCE) {
            return super.contains(obj);
        }
        return false;
    }

    public Object get(int i2) {
        if (!isManaged()) {
            return this.D.get(i2);
        }
        q();
        return this.f40015B.f(i2);
    }

    public boolean isManaged() {
        return this.C != null;
    }

    public Iterator iterator() {
        return isManaged() ? new RealmItr() : super.iterator();
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }

    public void o(OrderedRealmCollectionChangeListener orderedRealmCollectionChangeListener) {
        CollectionUtils.b(this.C, orderedRealmCollectionChangeListener, true);
        this.f40015B.g().g(this, orderedRealmCollectionChangeListener);
    }

    public void p(RealmChangeListener realmChangeListener) {
        CollectionUtils.b(this.C, realmChangeListener, true);
        this.f40015B.g().h(this, realmChangeListener);
    }

    public final void q() {
        this.C.j();
    }

    public Object remove(int i2) {
        Object obj;
        if (isManaged()) {
            q();
            obj = get(i2);
            this.f40015B.l(i2);
        } else {
            obj = this.D.remove(i2);
        }
        this.modCount++;
        return obj;
    }

    public boolean removeAll(Collection collection) {
        if (!isManaged() || this.C.O()) {
            return super.removeAll(collection);
        }
        throw new IllegalStateException("Objects can only be removed from inside a write transaction.");
    }

    public RealmList s() {
        if (!isManaged()) {
            throw new UnsupportedOperationException("This method is only available in managed mode.");
        } else if (A()) {
            BaseRealm y2 = this.C.y();
            OsList s2 = v().s(y2.D);
            String str = this.f40014A;
            return str != null ? new RealmList(str, s2, y2) : new RealmList(this.f40016z, s2, y2);
        } else {
            throw new IllegalStateException("Only valid, managed RealmLists can be frozen.");
        }
    }

    public Object set(int i2, Object obj) {
        if (!isManaged()) {
            return this.D.set(i2, obj);
        }
        q();
        return this.f40015B.n(i2, obj);
    }

    public int size() {
        if (!isManaged()) {
            return this.D.size();
        }
        q();
        return this.f40015B.q();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        if (!isManaged()) {
            sb.append("RealmList<?>@[");
            int size = size();
            while (i2 < size) {
                Object obj = get(i2);
                if (obj instanceof RealmModel) {
                    sb.append(System.identityHashCode(obj));
                } else if (obj instanceof byte[]) {
                    sb.append("byte[");
                    sb.append(((byte[]) obj).length);
                    sb.append("]");
                } else {
                    sb.append(obj);
                }
                sb.append(",");
                i2++;
            }
            if (size() > 0) {
                sb.setLength(sb.length() - 1);
            }
            sb.append("]");
        } else {
            sb.append("RealmList<");
            String str = this.f40014A;
            if (str != null) {
                sb.append(str);
            } else if (z(this.f40016z)) {
                sb.append(this.C.G().h(this.f40016z).c());
            } else {
                Class<byte[]> cls = this.f40016z;
                if (cls == byte[].class) {
                    sb.append(cls.getSimpleName());
                } else {
                    sb.append(cls.getName());
                }
            }
            sb.append(">@[");
            if (!w()) {
                sb.append("invalid");
            } else if (z(this.f40016z)) {
                while (i2 < size()) {
                    sb.append(((RealmObjectProxy) get(i2)).b().e().S());
                    sb.append(",");
                    i2++;
                }
                if (size() > 0) {
                    sb.setLength(sb.length() - 1);
                }
            } else {
                while (i2 < size()) {
                    Object obj2 = get(i2);
                    if (obj2 instanceof byte[]) {
                        sb.append("byte[");
                        sb.append(((byte[]) obj2).length);
                        sb.append("]");
                    } else {
                        sb.append(obj2);
                    }
                    sb.append(",");
                    i2++;
                }
                if (size() > 0) {
                    sb.setLength(sb.length() - 1);
                }
            }
            sb.append("]");
        }
        return sb.toString();
    }

    public final ManagedListOperator u(BaseRealm baseRealm, OsList osList, Class cls, String str) {
        if (cls == null || z(cls)) {
            return new RealmModelListOperator(baseRealm, osList, cls, str);
        }
        if (cls == String.class) {
            return new StringListOperator(baseRealm, osList, cls);
        }
        if (cls == Long.class || cls == Integer.class || cls == Short.class || cls == Byte.class) {
            return new LongListOperator(baseRealm, osList, cls);
        }
        if (cls == Boolean.class) {
            return new BooleanListOperator(baseRealm, osList, cls);
        }
        if (cls == byte[].class) {
            return new BinaryListOperator(baseRealm, osList, cls);
        }
        if (cls == Double.class) {
            return new DoubleListOperator(baseRealm, osList, cls);
        }
        if (cls == Float.class) {
            return new FloatListOperator(baseRealm, osList, cls);
        }
        if (cls == Date.class) {
            return new DateListOperator(baseRealm, osList, cls);
        }
        if (cls == Decimal128.class) {
            return new Decimal128ListOperator(baseRealm, osList, cls);
        }
        if (cls == ObjectId.class) {
            return new ObjectIdListOperator(baseRealm, osList, cls);
        }
        if (cls == UUID.class) {
            return new UUIDListOperator(baseRealm, osList, cls);
        }
        if (cls == RealmAny.class) {
            return new RealmAnyListOperator(baseRealm, osList, cls);
        }
        throw new IllegalArgumentException("Unexpected value class: " + cls.getName());
    }

    public OsList v() {
        return this.f40015B.g();
    }

    public final boolean w() {
        ManagedListOperator managedListOperator = this.f40015B;
        return managedListOperator != null && managedListOperator.k();
    }

    public ListIterator listIterator(int i2) {
        if (isManaged()) {
            return new RealmListItr(i2);
        }
        return super.listIterator(i2);
    }

    public RealmList(String str, OsList osList, BaseRealm baseRealm) {
        this.C = baseRealm;
        this.f40014A = str;
        this.f40015B = u(baseRealm, osList, (Class) null, str);
    }

    public boolean add(Object obj) {
        if (isManaged()) {
            q();
            this.f40015B.a(obj);
        } else {
            this.D.add(obj);
        }
        this.modCount++;
        return true;
    }

    public boolean remove(Object obj) {
        if (!isManaged() || this.C.O()) {
            return super.remove(obj);
        }
        throw new IllegalStateException("Objects can only be removed from inside a write transaction.");
    }
}
