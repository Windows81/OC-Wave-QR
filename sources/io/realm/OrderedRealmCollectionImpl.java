package io.realm;

import io.realm.internal.InvalidRow;
import io.realm.internal.OsResults;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.UncheckedRow;
import io.realm.internal.core.NativeRealmAny;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

abstract class OrderedRealmCollectionImpl<E> extends AbstractList<E> implements OrderedRealmCollection<E> {

    /* renamed from: A  reason: collision with root package name */
    public final Class f39915A;

    /* renamed from: B  reason: collision with root package name */
    public final String f39916B;
    public final OsResults C;
    public final CollectionOperator D;

    /* renamed from: z  reason: collision with root package name */
    public final BaseRealm f39917z;

    public static class ByteValueOperator extends PrimitiveValueOperator<Byte> {
        public ByteValueOperator(BaseRealm baseRealm, OsResults osResults, Class cls, String str) {
            super(baseRealm, osResults, cls, str);
        }

        /* renamed from: c */
        public Byte a(int i2) {
            return Byte.valueOf(((Long) this.f39919b.m(i2)).byteValue());
        }

        /* renamed from: d */
        public Byte b(int i2, OsResults osResults) {
            Long l2 = (Long) osResults.m(i2);
            if (l2 == null) {
                return null;
            }
            return Byte.valueOf(l2.byteValue());
        }
    }

    public static abstract class CollectionOperator<T> {

        /* renamed from: a  reason: collision with root package name */
        public final BaseRealm f39918a;

        /* renamed from: b  reason: collision with root package name */
        public final OsResults f39919b;

        /* renamed from: c  reason: collision with root package name */
        public final Class f39920c;

        /* renamed from: d  reason: collision with root package name */
        public final String f39921d;

        public CollectionOperator(BaseRealm baseRealm, OsResults osResults, Class cls, String str) {
            this.f39918a = baseRealm;
            this.f39919b = osResults;
            this.f39920c = cls;
            this.f39921d = str;
        }

        public abstract Object a(int i2);

        public abstract Object b(int i2, OsResults osResults);
    }

    public static class IntegerValueOperator extends PrimitiveValueOperator<Integer> {
        public IntegerValueOperator(BaseRealm baseRealm, OsResults osResults, Class cls, String str) {
            super(baseRealm, osResults, cls, str);
        }

        /* renamed from: c */
        public Integer a(int i2) {
            return Integer.valueOf(((Long) this.f39919b.m(i2)).intValue());
        }

        /* renamed from: d */
        public Integer b(int i2, OsResults osResults) {
            Long l2 = (Long) osResults.m(i2);
            if (l2 == null) {
                return null;
            }
            return Integer.valueOf(l2.intValue());
        }
    }

    public static class ModelCollectionOperator<T> extends CollectionOperator<T> {
        public ModelCollectionOperator(BaseRealm baseRealm, OsResults osResults, Class cls, String str) {
            super(baseRealm, osResults, cls, str);
        }

        public Object a(int i2) {
            return this.f39918a.D(this.f39920c, this.f39921d, this.f39919b.l(i2));
        }

        public Object b(int i2, OsResults osResults) {
            return c(osResults.l(i2));
        }

        public Object c(UncheckedRow uncheckedRow) {
            return this.f39918a.D(this.f39920c, this.f39921d, uncheckedRow);
        }
    }

    public static class PrimitiveValueOperator<T> extends CollectionOperator<T> {
        public PrimitiveValueOperator(BaseRealm baseRealm, OsResults osResults, Class cls, String str) {
            super(baseRealm, osResults, cls, str);
        }

        public Object a(int i2) {
            return this.f39919b.m(i2);
        }

        public Object b(int i2, OsResults osResults) {
            return osResults.m(i2);
        }
    }

    public static class RealmAnyValueOperator extends PrimitiveValueOperator<RealmAny> {
        public RealmAnyValueOperator(BaseRealm baseRealm, OsResults osResults, Class cls, String str) {
            super(baseRealm, osResults, cls, str);
        }

        /* renamed from: c */
        public RealmAny a(int i2) {
            return new RealmAny(RealmAnyOperator.c(this.f39918a, (NativeRealmAny) this.f39919b.m(i2)));
        }

        /* renamed from: d */
        public RealmAny b(int i2, OsResults osResults) {
            return new RealmAny(RealmAnyOperator.c(this.f39918a, (NativeRealmAny) osResults.m(i2)));
        }
    }

    public class RealmCollectionIterator extends OsResults.Iterator<E> {
        public RealmCollectionIterator() {
            super(OrderedRealmCollectionImpl.this.C);
        }

        public Object e(int i2, OsResults osResults) {
            return OrderedRealmCollectionImpl.this.D.b(i2, osResults);
        }
    }

    public class RealmCollectionListIterator extends OsResults.ListIterator<E> {
        public RealmCollectionListIterator(int i2) {
            super(OrderedRealmCollectionImpl.this.C, i2);
        }

        public Object e(int i2, OsResults osResults) {
            return OrderedRealmCollectionImpl.this.D.b(i2, osResults);
        }
    }

    public static class ShortValueOperator extends PrimitiveValueOperator<Short> {
        public ShortValueOperator(BaseRealm baseRealm, OsResults osResults, Class cls, String str) {
            super(baseRealm, osResults, cls, str);
        }

        /* renamed from: c */
        public Short a(int i2) {
            return Short.valueOf(((Long) this.f39919b.m(i2)).shortValue());
        }

        /* renamed from: d */
        public Short b(int i2, OsResults osResults) {
            Long l2 = (Long) osResults.m(i2);
            if (l2 == null) {
                return null;
            }
            return Short.valueOf(l2.shortValue());
        }
    }

    public OrderedRealmCollectionImpl(BaseRealm baseRealm, OsResults osResults, Class cls, CollectionOperator collectionOperator) {
        this(baseRealm, osResults, cls, (String) null, collectionOperator);
    }

    public static CollectionOperator g(boolean z2, BaseRealm baseRealm, OsResults osResults, Class cls, String str) {
        if (!z2) {
            return new ModelCollectionOperator(baseRealm, osResults, cls, str);
        }
        Class<Integer> cls2 = Integer.class;
        if (cls == cls2) {
            return new IntegerValueOperator(baseRealm, osResults, cls2, str);
        }
        Class<Short> cls3 = Short.class;
        if (cls == cls3) {
            return new ShortValueOperator(baseRealm, osResults, cls3, str);
        }
        Class<Byte> cls4 = Byte.class;
        if (cls == cls4) {
            return new ByteValueOperator(baseRealm, osResults, cls4, str);
        }
        Class<RealmAny> cls5 = RealmAny.class;
        return cls == cls5 ? new RealmAnyValueOperator(baseRealm, osResults, cls5, str) : new PrimitiveValueOperator(baseRealm, osResults, cls, str);
    }

    public boolean add(Object obj) {
        throw new UnsupportedOperationException("This method is not supported by 'RealmResults' or 'OrderedRealmCollectionSnapshot'.");
    }

    public boolean addAll(int i2, Collection collection) {
        throw new UnsupportedOperationException("This method is not supported by 'RealmResults' or 'OrderedRealmCollectionSnapshot'.");
    }

    public void clear() {
        throw new UnsupportedOperationException("This method is not supported by 'RealmResults' or 'OrderedRealmCollectionSnapshot'.");
    }

    public boolean contains(Object obj) {
        if (!isLoaded() || ((obj instanceof RealmObjectProxy) && ((RealmObjectProxy) obj).b().e() == InvalidRow.INSTANCE)) {
            return false;
        }
        Iterator it = iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (!(next instanceof byte[]) || !(obj instanceof byte[])) {
                if (next != null && next.equals(obj)) {
                    return true;
                }
                if (next == null && obj == null) {
                    return true;
                }
            } else if (Arrays.equals((byte[]) next, (byte[]) obj)) {
                return true;
            }
        }
        return false;
    }

    public boolean e() {
        this.f39917z.j();
        if (size() <= 0) {
            return false;
        }
        this.C.e();
        return true;
    }

    public Object get(int i2) {
        this.f39917z.j();
        return this.D.a(i2);
    }

    public boolean h() {
        return this.C.o();
    }

    public Iterator iterator() {
        return new RealmCollectionIterator();
    }

    public ListIterator listIterator() {
        return new RealmCollectionListIterator(0);
    }

    public Object remove(int i2) {
        throw new UnsupportedOperationException("This method is not supported by 'RealmResults' or 'OrderedRealmCollectionSnapshot'.");
    }

    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("This method is not supported by 'RealmResults' or 'OrderedRealmCollectionSnapshot'.");
    }

    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("This method is not supported by 'RealmResults' or 'OrderedRealmCollectionSnapshot'.");
    }

    public Object set(int i2, Object obj) {
        throw new UnsupportedOperationException("This method is not supported by 'RealmResults' or 'OrderedRealmCollectionSnapshot'.");
    }

    public int size() {
        if (!isLoaded()) {
            return 0;
        }
        long s2 = this.C.s();
        if (s2 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) s2;
    }

    public OrderedRealmCollectionImpl(BaseRealm baseRealm, OsResults osResults, String str, CollectionOperator collectionOperator) {
        this(baseRealm, osResults, (Class) null, str, collectionOperator);
    }

    public void add(int i2, Object obj) {
        throw new UnsupportedOperationException("This method is not supported by 'RealmResults' or 'OrderedRealmCollectionSnapshot'.");
    }

    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("This method is not supported by 'RealmResults' or 'OrderedRealmCollectionSnapshot'.");
    }

    public ListIterator listIterator(int i2) {
        return new RealmCollectionListIterator(i2);
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("This method is not supported by 'RealmResults' or 'OrderedRealmCollectionSnapshot'.");
    }

    public OrderedRealmCollectionImpl(BaseRealm baseRealm, OsResults osResults, Class cls, String str, CollectionOperator collectionOperator) {
        this.f39917z = baseRealm;
        this.C = osResults;
        this.f39915A = cls;
        this.f39916B = str;
        this.D = collectionOperator;
    }
}
