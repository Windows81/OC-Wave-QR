package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.Multiset;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;
import java.util.Set;

@ElementTypesAreNonnullByDefault
public abstract class ImmutableMultiset<E> extends ImmutableMultisetGwtSerializationDependencies<E> implements Multiset<E> {

    /* renamed from: A  reason: collision with root package name */
    public transient ImmutableList f28181A;

    /* renamed from: B  reason: collision with root package name */
    public transient ImmutableSet f28182B;

    public static class Builder<E> extends ImmutableCollection.Builder<E> {

        /* renamed from: a  reason: collision with root package name */
        public ObjectCountHashMap f28186a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f28187b = false;

        /* renamed from: c  reason: collision with root package name */
        public boolean f28188c = false;

        public Builder(int i2) {
            this.f28186a = ObjectCountHashMap.c(i2);
        }

        public static ObjectCountHashMap i(Iterable iterable) {
            if (iterable instanceof RegularImmutableMultiset) {
                return ((RegularImmutableMultiset) iterable).C;
            }
            if (iterable instanceof AbstractMapBasedMultiset) {
                return ((AbstractMapBasedMultiset) iterable).f27979B;
            }
            return null;
        }

        /* renamed from: e */
        public Builder a(Object obj) {
            return g(obj, 1);
        }

        public Builder f(Iterable iterable) {
            Objects.requireNonNull(this.f28186a);
            if (iterable instanceof Multiset) {
                Multiset d2 = Multisets.d(iterable);
                ObjectCountHashMap i2 = i(d2);
                if (i2 != null) {
                    ObjectCountHashMap objectCountHashMap = this.f28186a;
                    objectCountHashMap.d(Math.max(objectCountHashMap.C(), i2.C()));
                    for (int e2 = i2.e(); e2 >= 0; e2 = i2.s(e2)) {
                        g(i2.i(e2), i2.k(e2));
                    }
                } else {
                    Set entrySet = d2.entrySet();
                    ObjectCountHashMap objectCountHashMap2 = this.f28186a;
                    objectCountHashMap2.d(Math.max(objectCountHashMap2.C(), entrySet.size()));
                    for (Multiset.Entry entry : d2.entrySet()) {
                        g(entry.a(), entry.getCount());
                    }
                }
            } else {
                super.b(iterable);
            }
            return this;
        }

        public Builder g(Object obj, int i2) {
            Objects.requireNonNull(this.f28186a);
            if (i2 == 0) {
                return this;
            }
            if (this.f28187b) {
                this.f28186a = new ObjectCountHashMap(this.f28186a);
                this.f28188c = false;
            }
            this.f28187b = false;
            Preconditions.q(obj);
            ObjectCountHashMap objectCountHashMap = this.f28186a;
            objectCountHashMap.u(obj, i2 + objectCountHashMap.f(obj));
            return this;
        }

        public ImmutableMultiset h() {
            Objects.requireNonNull(this.f28186a);
            if (this.f28186a.C() == 0) {
                return ImmutableMultiset.w();
            }
            if (this.f28188c) {
                this.f28186a = new ObjectCountHashMap(this.f28186a);
                this.f28188c = false;
            }
            this.f28187b = true;
            return new RegularImmutableMultiset(this.f28186a);
        }
    }

    public final class EntrySet extends IndexedImmutableSet<Multiset.Entry<E>> {
        public EntrySet() {
        }

        /* renamed from: K */
        public Multiset.Entry get(int i2) {
            return ImmutableMultiset.this.v(i2);
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Multiset.Entry)) {
                return false;
            }
            Multiset.Entry entry = (Multiset.Entry) obj;
            return entry.getCount() > 0 && ImmutableMultiset.this.L0(entry.a()) == entry.getCount();
        }

        public int hashCode() {
            return ImmutableMultiset.this.hashCode();
        }

        public boolean n() {
            return ImmutableMultiset.this.n();
        }

        public int size() {
            return ImmutableMultiset.this.k().size();
        }
    }

    public static class EntrySetSerializedForm<E> implements Serializable {
    }

    public static ImmutableMultiset p(Iterable iterable) {
        if (iterable instanceof ImmutableMultiset) {
            ImmutableMultiset immutableMultiset = (ImmutableMultiset) iterable;
            if (!immutableMultiset.n()) {
                return immutableMultiset;
            }
        }
        Builder builder = new Builder(Multisets.h(iterable));
        builder.f(iterable);
        return builder.h();
    }

    private ImmutableSet q() {
        return isEmpty() ? ImmutableSet.D() : new EntrySet();
    }

    public static ImmutableMultiset w() {
        return RegularImmutableMultiset.F;
    }

    public final int N(Object obj, int i2) {
        throw new UnsupportedOperationException();
    }

    public final int T(Object obj, int i2) {
        throw new UnsupportedOperationException();
    }

    public boolean contains(Object obj) {
        return L0(obj) > 0;
    }

    public ImmutableList e() {
        ImmutableList immutableList = this.f28181A;
        if (immutableList != null) {
            return immutableList;
        }
        ImmutableList e2 = super.e();
        this.f28181A = e2;
        return e2;
    }

    public boolean equals(Object obj) {
        return Multisets.f(this, obj);
    }

    public int g(Object[] objArr, int i2) {
        UnmodifiableIterator o2 = entrySet().iterator();
        while (o2.hasNext()) {
            Multiset.Entry entry = (Multiset.Entry) o2.next();
            Arrays.fill(objArr, i2, entry.getCount() + i2, entry.a());
            i2 += entry.getCount();
        }
        return i2;
    }

    public int hashCode() {
        return Sets.f(entrySet());
    }

    public final int n0(Object obj, int i2) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: o */
    public UnmodifiableIterator iterator() {
        final UnmodifiableIterator o2 = entrySet().iterator();
        return new UnmodifiableIterator<E>(this) {

            /* renamed from: A  reason: collision with root package name */
            public Object f28183A;

            /* renamed from: z  reason: collision with root package name */
            public int f28185z;

            public boolean hasNext() {
                return this.f28185z > 0 || o2.hasNext();
            }

            public Object next() {
                if (this.f28185z <= 0) {
                    Multiset.Entry entry = (Multiset.Entry) o2.next();
                    this.f28183A = entry.a();
                    this.f28185z = entry.getCount();
                }
                this.f28185z--;
                Object obj = this.f28183A;
                Objects.requireNonNull(obj);
                return obj;
            }
        };
    }

    /* renamed from: s */
    public abstract ImmutableSet k();

    public final boolean t0(Object obj, int i2, int i3) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return entrySet().toString();
    }

    /* renamed from: u */
    public ImmutableSet entrySet() {
        ImmutableSet immutableSet = this.f28182B;
        if (immutableSet != null) {
            return immutableSet;
        }
        ImmutableSet q2 = q();
        this.f28182B = q2;
        return q2;
    }

    public abstract Multiset.Entry v(int i2);
}
