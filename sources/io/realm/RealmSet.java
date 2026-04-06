package io.realm;

import io.realm.internal.ManageableObject;
import io.realm.internal.OsSet;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class RealmSet<E> implements Set<E>, ManageableObject, RealmCollection<E> {

    /* renamed from: z  reason: collision with root package name */
    public final SetStrategy f40065z;

    public static abstract class SetStrategy<E> implements Set<E>, ManageableObject, RealmCollection<E> {
        public abstract OsSet e();
    }

    public static class UnmanagedSetStrategy<E> extends SetStrategy<E> {

        /* renamed from: z  reason: collision with root package name */
        public final Set f40068z;

        public boolean add(Object obj) {
            return this.f40068z.add(obj);
        }

        public boolean addAll(Collection collection) {
            return this.f40068z.addAll(collection);
        }

        public void clear() {
            this.f40068z.clear();
        }

        public boolean contains(Object obj) {
            return this.f40068z.contains(obj);
        }

        public boolean containsAll(Collection collection) {
            return this.f40068z.containsAll(collection);
        }

        public OsSet e() {
            throw new UnsupportedOperationException("Unmanaged RealmSets do not have a representation in native code.");
        }

        public boolean isEmpty() {
            return this.f40068z.isEmpty();
        }

        public boolean isManaged() {
            return false;
        }

        public Iterator iterator() {
            return this.f40068z.iterator();
        }

        public boolean remove(Object obj) {
            return this.f40068z.remove(obj);
        }

        public boolean removeAll(Collection collection) {
            return this.f40068z.removeAll(collection);
        }

        public boolean retainAll(Collection collection) {
            return this.f40068z.retainAll(collection);
        }

        public int size() {
            return this.f40068z.size();
        }

        public Object[] toArray() {
            return this.f40068z.toArray();
        }

        public Object[] toArray(Object[] objArr) {
            return this.f40068z.toArray(objArr);
        }
    }

    public boolean add(Object obj) {
        return this.f40065z.add(obj);
    }

    public boolean addAll(Collection collection) {
        return this.f40065z.addAll(collection);
    }

    public void clear() {
        this.f40065z.clear();
    }

    public boolean contains(Object obj) {
        return this.f40065z.contains(obj);
    }

    public boolean containsAll(Collection collection) {
        return this.f40065z.containsAll(collection);
    }

    public OsSet e() {
        return this.f40065z.e();
    }

    public boolean isEmpty() {
        return this.f40065z.isEmpty();
    }

    public boolean isManaged() {
        return this.f40065z.isManaged();
    }

    public Iterator iterator() {
        return this.f40065z.iterator();
    }

    public boolean remove(Object obj) {
        return this.f40065z.remove(obj);
    }

    public boolean removeAll(Collection collection) {
        return this.f40065z.removeAll(collection);
    }

    public boolean retainAll(Collection collection) {
        return this.f40065z.retainAll(collection);
    }

    public int size() {
        return this.f40065z.size();
    }

    public Object[] toArray() {
        return this.f40065z.toArray();
    }

    public Object[] toArray(Object[] objArr) {
        return this.f40065z.toArray(objArr);
    }

    public static class ManagedSetStrategy<E> extends SetStrategy<E> {

        /* renamed from: A  reason: collision with root package name */
        public Class f40066A;

        /* renamed from: z  reason: collision with root package name */
        public final SetValueOperator f40067z;

        public boolean add(Object obj) {
            return this.f40067z.a(obj);
        }

        public boolean addAll(Collection collection) {
            h(collection);
            return this.f40067z.b(collection);
        }

        public void clear() {
            this.f40067z.d();
        }

        public boolean contains(Object obj) {
            return this.f40067z.e(obj);
        }

        public boolean containsAll(Collection collection) {
            h(collection);
            return this.f40067z.f(collection);
        }

        public OsSet e() {
            return this.f40067z.j();
        }

        public final void g(Object[] objArr) {
            if (objArr != null) {
                String simpleName = this.f40066A.getSimpleName();
                String simpleName2 = objArr.getClass().getComponentType().getSimpleName();
                if (!simpleName.equals(simpleName2)) {
                    throw new ArrayStoreException("Array type must be of type '" + simpleName + "' but it was of type '" + simpleName2 + "'.");
                }
                return;
            }
            throw new NullPointerException("Cannot pass a null array when calling 'toArray'.");
        }

        public final void h(Collection collection) {
            if (collection == null) {
                throw new NullPointerException("Collection must not be null.");
            }
        }

        public boolean isEmpty() {
            return this.f40067z.l();
        }

        public boolean isManaged() {
            return true;
        }

        public Iterator iterator() {
            return this.f40067z.p();
        }

        public boolean remove(Object obj) {
            return this.f40067z.r(obj);
        }

        public boolean removeAll(Collection collection) {
            h(collection);
            return this.f40067z.s(collection);
        }

        public boolean retainAll(Collection collection) {
            h(collection);
            return this.f40067z.v(collection);
        }

        public int size() {
            return this.f40067z.x();
        }

        public Object[] toArray() {
            Object[] objArr = new Object[size()];
            Iterator it = iterator();
            int i2 = 0;
            while (it.hasNext()) {
                objArr[i2] = it.next();
                i2++;
            }
            return objArr;
        }

        public Object[] toArray(Object[] objArr) {
            g(objArr);
            long size = (long) size();
            Object[] objArr2 = (((long) objArr.length) == size || ((long) objArr.length) > size) ? objArr : (Object[]) Array.newInstance(this.f40066A, (int) size);
            Iterator it = iterator();
            int i2 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                if (next == null) {
                    objArr2[i2] = null;
                } else {
                    objArr2[i2] = next;
                }
                i2++;
            }
            if (((long) objArr.length) > size) {
                objArr2[i2] = null;
            }
            return objArr2;
        }
    }
}
