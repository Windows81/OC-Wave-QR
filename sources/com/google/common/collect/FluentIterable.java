package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import java.util.Iterator;

@ElementTypesAreNonnullByDefault
public abstract class FluentIterable<E> implements Iterable<E> {

    /* renamed from: z  reason: collision with root package name */
    public final Optional f28102z;

    /* renamed from: com.google.common.collect.FluentIterable$2  reason: invalid class name */
    class AnonymousClass2 extends FluentIterable<Object> {

        /* renamed from: A  reason: collision with root package name */
        public final /* synthetic */ Iterable f28104A;

        public Iterator iterator() {
            return Iterators.f(Iterators.J(this.f28104A.iterator(), Iterables.q()));
        }
    }

    public static class FromIterableFunction<E> implements Function<Iterable<E>, FluentIterable<E>> {
        /* renamed from: a */
        public FluentIterable apply(Iterable iterable) {
            return FluentIterable.n(iterable);
        }
    }

    public FluentIterable() {
        this.f28102z = Optional.a();
    }

    public static FluentIterable e(Iterable iterable, Iterable iterable2) {
        return g(iterable, iterable2);
    }

    public static FluentIterable g(final Iterable... iterableArr) {
        for (Iterable q2 : iterableArr) {
            Preconditions.q(q2);
        }
        return new FluentIterable<Object>() {
            public Iterator iterator() {
                return Iterators.f(new AbstractIndexedListIterator<Iterator<Object>>(iterableArr.length) {
                    /* renamed from: c */
                    public Iterator b(int i2) {
                        return iterableArr[i2].iterator();
                    }
                });
            }
        };
    }

    public static FluentIterable n(final Iterable iterable) {
        return iterable instanceof FluentIterable ? (FluentIterable) iterable : new FluentIterable<Object>(iterable) {
            public Iterator iterator() {
                return iterable.iterator();
            }
        };
    }

    public final FluentIterable h(Predicate predicate) {
        return n(Iterables.e(o(), predicate));
    }

    public final FluentIterable i(Class cls) {
        return n(Iterables.f(o(), cls));
    }

    public final Optional m() {
        Iterator it = o().iterator();
        return it.hasNext() ? Optional.d(it.next()) : Optional.a();
    }

    public final Iterable o() {
        return (Iterable) this.f28102z.e(this);
    }

    public final Object[] p(Class cls) {
        return Iterables.o(o(), cls);
    }

    public final ImmutableSet q() {
        return ImmutableSet.w(o());
    }

    public String toString() {
        return Iterables.r(o());
    }

    public FluentIterable(Iterable iterable) {
        this.f28102z = Optional.d(iterable);
    }
}
