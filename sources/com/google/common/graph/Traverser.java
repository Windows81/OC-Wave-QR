package com.google.common.graph;

import com.google.common.base.Preconditions;
import com.google.common.collect.AbstractIterator;
import com.google.common.collect.ImmutableSet;
import com.google.errorprone.annotations.DoNotMock;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

@ElementTypesAreNonnullByDefault
@DoNotMock
public abstract class Traverser<N> {

    /* renamed from: com.google.common.graph.Traverser$1  reason: invalid class name */
    class AnonymousClass1 extends Traverser<Object> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ SuccessorsFunction f28803a;

        public Traversal a() {
            return Traversal.b(this.f28803a);
        }
    }

    /* renamed from: com.google.common.graph.Traverser$2  reason: invalid class name */
    class AnonymousClass2 extends Traverser<Object> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ SuccessorsFunction f28804a;

        public Traversal a() {
            return Traversal.c(this.f28804a);
        }
    }

    /* renamed from: com.google.common.graph.Traverser$3  reason: invalid class name */
    class AnonymousClass3 implements Iterable<Object> {

        /* renamed from: A  reason: collision with root package name */
        public final /* synthetic */ Traverser f28805A;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ ImmutableSet f28806z;

        public Iterator iterator() {
            return this.f28805A.a().a(this.f28806z.iterator());
        }
    }

    /* renamed from: com.google.common.graph.Traverser$4  reason: invalid class name */
    class AnonymousClass4 implements Iterable<Object> {

        /* renamed from: A  reason: collision with root package name */
        public final /* synthetic */ Traverser f28807A;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ ImmutableSet f28808z;

        public Iterator iterator() {
            return this.f28807A.a().e(this.f28808z.iterator());
        }
    }

    /* renamed from: com.google.common.graph.Traverser$5  reason: invalid class name */
    class AnonymousClass5 implements Iterable<Object> {

        /* renamed from: A  reason: collision with root package name */
        public final /* synthetic */ Traverser f28809A;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ ImmutableSet f28810z;

        public Iterator iterator() {
            return this.f28809A.a().d(this.f28810z.iterator());
        }
    }

    public enum InsertionOrder {
        FRONT {
            public void f(Deque deque, Object obj) {
                deque.addFirst(obj);
            }
        },
        BACK {
            public void f(Deque deque, Object obj) {
                deque.addLast(obj);
            }
        };

        public abstract void f(Deque deque, Object obj);
    }

    public static abstract class Traversal<N> {

        /* renamed from: a  reason: collision with root package name */
        public final SuccessorsFunction f28814a;

        public Traversal(SuccessorsFunction successorsFunction) {
            this.f28814a = successorsFunction;
        }

        public static Traversal b(SuccessorsFunction successorsFunction) {
            final HashSet hashSet = new HashSet();
            return new Traversal<Object>(successorsFunction) {
                public Object g(Deque deque) {
                    Iterator it = (Iterator) deque.getFirst();
                    while (it.hasNext()) {
                        Object next = it.next();
                        Objects.requireNonNull(next);
                        if (hashSet.add(next)) {
                            return next;
                        }
                    }
                    deque.removeFirst();
                    return null;
                }
            };
        }

        public static Traversal c(SuccessorsFunction successorsFunction) {
            return new Traversal<Object>(successorsFunction) {
                public Object g(Deque deque) {
                    Iterator it = (Iterator) deque.getFirst();
                    if (it.hasNext()) {
                        return Preconditions.q(it.next());
                    }
                    deque.removeFirst();
                    return null;
                }
            };
        }

        public final Iterator a(Iterator it) {
            return f(it, InsertionOrder.BACK);
        }

        public final Iterator d(Iterator it) {
            final ArrayDeque arrayDeque = new ArrayDeque();
            final ArrayDeque arrayDeque2 = new ArrayDeque();
            arrayDeque2.add(it);
            return new AbstractIterator<N>() {
                public Object b() {
                    while (true) {
                        Object g2 = Traversal.this.g(arrayDeque2);
                        if (g2 == null) {
                            return !arrayDeque.isEmpty() ? arrayDeque.pop() : c();
                        }
                        Iterator it = Traversal.this.f28814a.a(g2).iterator();
                        if (!it.hasNext()) {
                            return g2;
                        }
                        arrayDeque2.addFirst(it);
                        arrayDeque.push(g2);
                    }
                }
            };
        }

        public final Iterator e(Iterator it) {
            return f(it, InsertionOrder.FRONT);
        }

        public final Iterator f(Iterator it, final InsertionOrder insertionOrder) {
            final ArrayDeque arrayDeque = new ArrayDeque();
            arrayDeque.add(it);
            return new AbstractIterator<N>() {
                public Object b() {
                    do {
                        Object g2 = Traversal.this.g(arrayDeque);
                        if (g2 != null) {
                            Iterator it = Traversal.this.f28814a.a(g2).iterator();
                            if (it.hasNext()) {
                                insertionOrder.f(arrayDeque, it);
                            }
                            return g2;
                        }
                    } while (!arrayDeque.isEmpty());
                    return c();
                }
            };
        }

        public abstract Object g(Deque deque);
    }

    public abstract Traversal a();
}
