package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableCollection;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

@ElementTypesAreNonnullByDefault
public abstract class ImmutableList<E> extends ImmutableCollection<E> implements List<E>, RandomAccess {

    /* renamed from: A  reason: collision with root package name */
    public static final UnmodifiableListIterator f28143A = new Itr(RegularImmutableList.D, 0);

    public static final class Builder<E> extends ImmutableCollection.ArrayBasedBuilder<E> {
        public Builder() {
            this(4);
        }

        /* renamed from: i */
        public Builder e(Object obj) {
            super.a(obj);
            return this;
        }

        public Builder j(Object... objArr) {
            super.f(objArr);
            return this;
        }

        public Builder k(Iterator it) {
            super.c(it);
            return this;
        }

        public ImmutableList l() {
            this.f28139c = true;
            return ImmutableList.q(this.f28137a, this.f28138b);
        }

        public Builder(int i2) {
            super(i2);
        }
    }

    public static class Itr<E> extends AbstractIndexedListIterator<E> {

        /* renamed from: B  reason: collision with root package name */
        public final ImmutableList f28144B;

        public Itr(ImmutableList immutableList, int i2) {
            super(immutableList.size(), i2);
            this.f28144B = immutableList;
        }

        public Object b(int i2) {
            return this.f28144B.get(i2);
        }
    }

    public static class ReverseImmutableList<E> extends ImmutableList<E> {

        /* renamed from: B  reason: collision with root package name */
        public final transient ImmutableList f28145B;

        public ReverseImmutableList(ImmutableList immutableList) {
            this.f28145B = immutableList;
        }

        public ImmutableList K() {
            return this.f28145B;
        }

        /* renamed from: M */
        public ImmutableList subList(int i2, int i3) {
            Preconditions.v(i2, i3, size());
            return this.f28145B.subList(R(i3), R(i2)).K();
        }

        public final int Q(int i2) {
            return (size() - 1) - i2;
        }

        public final int R(int i2) {
            return size() - i2;
        }

        public boolean contains(Object obj) {
            return this.f28145B.contains(obj);
        }

        public Object get(int i2) {
            Preconditions.o(i2, size());
            return this.f28145B.get(Q(i2));
        }

        public int indexOf(Object obj) {
            int lastIndexOf = this.f28145B.lastIndexOf(obj);
            if (lastIndexOf >= 0) {
                return Q(lastIndexOf);
            }
            return -1;
        }

        public /* bridge */ /* synthetic */ Iterator iterator() {
            return ImmutableList.super.iterator();
        }

        public int lastIndexOf(Object obj) {
            int indexOf = this.f28145B.indexOf(obj);
            if (indexOf >= 0) {
                return Q(indexOf);
            }
            return -1;
        }

        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return ImmutableList.super.listIterator();
        }

        public boolean n() {
            return this.f28145B.n();
        }

        public int size() {
            return this.f28145B.size();
        }

        public /* bridge */ /* synthetic */ ListIterator listIterator(int i2) {
            return ImmutableList.super.listIterator(i2);
        }
    }

    public static class SerializedForm implements Serializable {
    }

    public class SubList extends ImmutableList<E> {

        /* renamed from: B  reason: collision with root package name */
        public final transient int f28146B;
        public final transient int C;

        public SubList(int i2, int i3) {
            this.f28146B = i2;
            this.C = i3;
        }

        /* renamed from: M */
        public ImmutableList subList(int i2, int i3) {
            Preconditions.v(i2, i3, this.C);
            ImmutableList immutableList = ImmutableList.this;
            int i4 = this.f28146B;
            return immutableList.subList(i2 + i4, i3 + i4);
        }

        public Object get(int i2) {
            Preconditions.o(i2, this.C);
            return ImmutableList.this.get(i2 + this.f28146B);
        }

        public Object[] h() {
            return ImmutableList.this.h();
        }

        public int i() {
            return ImmutableList.this.m() + this.f28146B + this.C;
        }

        public /* bridge */ /* synthetic */ Iterator iterator() {
            return ImmutableList.super.iterator();
        }

        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return ImmutableList.super.listIterator();
        }

        public int m() {
            return ImmutableList.this.m() + this.f28146B;
        }

        public boolean n() {
            return true;
        }

        public int size() {
            return this.C;
        }

        public /* bridge */ /* synthetic */ ListIterator listIterator(int i2) {
            return ImmutableList.super.listIterator(i2);
        }
    }

    public static ImmutableList A(Object[] objArr) {
        return objArr.length == 0 ? D() : u((Object[]) objArr.clone());
    }

    public static ImmutableList D() {
        return RegularImmutableList.D;
    }

    public static ImmutableList E(Object obj) {
        return u(obj);
    }

    public static ImmutableList F(Object obj, Object obj2) {
        return u(obj, obj2);
    }

    public static ImmutableList H(Object obj, Object obj2, Object obj3) {
        return u(obj, obj2, obj3);
    }

    public static ImmutableList J(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        return u(obj, obj2, obj3, obj4, obj5, obj6, obj7);
    }

    public static ImmutableList L(Comparator comparator, Iterable iterable) {
        Preconditions.q(comparator);
        Object[] n2 = Iterables.n(iterable);
        ObjectArrays.b(n2);
        Arrays.sort(n2, comparator);
        return p(n2);
    }

    public static ImmutableList p(Object[] objArr) {
        return q(objArr, objArr.length);
    }

    public static ImmutableList q(Object[] objArr, int i2) {
        return i2 == 0 ? D() : new RegularImmutableList(objArr, i2);
    }

    public static Builder s() {
        return new Builder();
    }

    public static ImmutableList u(Object... objArr) {
        return p(ObjectArrays.b(objArr));
    }

    public static ImmutableList v(Iterable iterable) {
        Preconditions.q(iterable);
        return iterable instanceof Collection ? w((Collection) iterable) : z(iterable.iterator());
    }

    public static ImmutableList w(Collection collection) {
        if (!(collection instanceof ImmutableCollection)) {
            return u(collection.toArray());
        }
        ImmutableList e2 = ((ImmutableCollection) collection).e();
        return e2.n() ? p(e2.toArray()) : e2;
    }

    public static ImmutableList z(Iterator it) {
        if (!it.hasNext()) {
            return D();
        }
        Object next = it.next();
        return !it.hasNext() ? E(next) : new Builder().e(next).k(it).l();
    }

    /* renamed from: B */
    public UnmodifiableListIterator listIterator() {
        return listIterator(0);
    }

    /* renamed from: C */
    public UnmodifiableListIterator listIterator(int i2) {
        Preconditions.t(i2, size());
        return isEmpty() ? f28143A : new Itr(this, i2);
    }

    public ImmutableList K() {
        return size() <= 1 ? this : new ReverseImmutableList(this);
    }

    /* renamed from: M */
    public ImmutableList subList(int i2, int i3) {
        Preconditions.v(i2, i3, size());
        int i4 = i3 - i2;
        return i4 == size() ? this : i4 == 0 ? D() : P(i2, i3);
    }

    public ImmutableList P(int i2, int i3) {
        return new SubList(i2, i3 - i2);
    }

    public final void add(int i2, Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(int i2, Collection collection) {
        throw new UnsupportedOperationException();
    }

    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    public final ImmutableList e() {
        return this;
    }

    public boolean equals(Object obj) {
        return Lists.c(this, obj);
    }

    public int g(Object[] objArr, int i2) {
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            objArr[i2 + i3] = get(i3);
        }
        return i2 + size;
    }

    public int hashCode() {
        int size = size();
        int i2 = 1;
        for (int i3 = 0; i3 < size; i3++) {
            i2 = ~(~((i2 * 31) + get(i3).hashCode()));
        }
        return i2;
    }

    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return Lists.d(this, obj);
    }

    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return Lists.f(this, obj);
    }

    /* renamed from: o */
    public UnmodifiableIterator iterator() {
        return listIterator();
    }

    public final Object remove(int i2) {
        throw new UnsupportedOperationException();
    }

    public final Object set(int i2, Object obj) {
        throw new UnsupportedOperationException();
    }
}
