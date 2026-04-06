package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Queue;

@ElementTypesAreNonnullByDefault
@Deprecated
public abstract class TreeTraverser<T> {

    /* renamed from: com.google.common.collect.TreeTraverser$1  reason: invalid class name */
    class AnonymousClass1 extends TreeTraverser<Object> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Function f28667a;

        public Iterable a(Object obj) {
            return (Iterable) this.f28667a.apply(obj);
        }
    }

    /* renamed from: com.google.common.collect.TreeTraverser$2  reason: invalid class name */
    class AnonymousClass2 extends FluentIterable<Object> {

        /* renamed from: A  reason: collision with root package name */
        public final /* synthetic */ Object f28668A;

        /* renamed from: B  reason: collision with root package name */
        public final /* synthetic */ TreeTraverser f28669B;

        /* renamed from: s */
        public UnmodifiableIterator iterator() {
            return this.f28669B.c(this.f28668A);
        }
    }

    /* renamed from: com.google.common.collect.TreeTraverser$3  reason: invalid class name */
    class AnonymousClass3 extends FluentIterable<Object> {

        /* renamed from: A  reason: collision with root package name */
        public final /* synthetic */ Object f28670A;

        /* renamed from: B  reason: collision with root package name */
        public final /* synthetic */ TreeTraverser f28671B;

        /* renamed from: s */
        public UnmodifiableIterator iterator() {
            return this.f28671B.b(this.f28670A);
        }
    }

    /* renamed from: com.google.common.collect.TreeTraverser$4  reason: invalid class name */
    class AnonymousClass4 extends FluentIterable<Object> {

        /* renamed from: A  reason: collision with root package name */
        public final /* synthetic */ Object f28672A;

        /* renamed from: B  reason: collision with root package name */
        public final /* synthetic */ TreeTraverser f28673B;

        /* renamed from: s */
        public UnmodifiableIterator iterator() {
            return new BreadthFirstIterator(this.f28672A);
        }
    }

    public final class BreadthFirstIterator extends UnmodifiableIterator<T> implements PeekingIterator<T> {

        /* renamed from: z  reason: collision with root package name */
        public final Queue f28675z;

        public BreadthFirstIterator(Object obj) {
            ArrayDeque arrayDeque = new ArrayDeque();
            this.f28675z = arrayDeque;
            arrayDeque.add(obj);
        }

        public boolean hasNext() {
            return !this.f28675z.isEmpty();
        }

        public Object next() {
            Object remove = this.f28675z.remove();
            Iterables.a(this.f28675z, TreeTraverser.this.a(remove));
            return remove;
        }

        public Object peek() {
            return this.f28675z.element();
        }
    }

    public final class PostOrderIterator extends AbstractIterator<T> {

        /* renamed from: B  reason: collision with root package name */
        public final ArrayDeque f28676B;

        public PostOrderIterator(Object obj) {
            ArrayDeque arrayDeque = new ArrayDeque();
            this.f28676B = arrayDeque;
            arrayDeque.addLast(e(obj));
        }

        public Object b() {
            while (!this.f28676B.isEmpty()) {
                PostOrderNode postOrderNode = (PostOrderNode) this.f28676B.getLast();
                if (postOrderNode.f28678b.hasNext()) {
                    this.f28676B.addLast(e(postOrderNode.f28678b.next()));
                } else {
                    this.f28676B.removeLast();
                    return postOrderNode.f28677a;
                }
            }
            return c();
        }

        public final PostOrderNode e(Object obj) {
            return new PostOrderNode(obj, TreeTraverser.this.a(obj).iterator());
        }
    }

    public static final class PostOrderNode<T> {

        /* renamed from: a  reason: collision with root package name */
        public final Object f28677a;

        /* renamed from: b  reason: collision with root package name */
        public final Iterator f28678b;

        public PostOrderNode(Object obj, Iterator it) {
            this.f28677a = Preconditions.q(obj);
            this.f28678b = (Iterator) Preconditions.q(it);
        }
    }

    public final class PreOrderIterator extends UnmodifiableIterator<T> {

        /* renamed from: z  reason: collision with root package name */
        public final Deque f28680z;

        public PreOrderIterator(Object obj) {
            ArrayDeque arrayDeque = new ArrayDeque();
            this.f28680z = arrayDeque;
            arrayDeque.addLast(Iterators.G(Preconditions.q(obj)));
        }

        public boolean hasNext() {
            return !this.f28680z.isEmpty();
        }

        public Object next() {
            Iterator it = (Iterator) this.f28680z.getLast();
            Object q2 = Preconditions.q(it.next());
            if (!it.hasNext()) {
                this.f28680z.removeLast();
            }
            Iterator it2 = TreeTraverser.this.a(q2).iterator();
            if (it2.hasNext()) {
                this.f28680z.addLast(it2);
            }
            return q2;
        }
    }

    public abstract Iterable a(Object obj);

    public UnmodifiableIterator b(Object obj) {
        return new PostOrderIterator(obj);
    }

    public UnmodifiableIterator c(Object obj) {
        return new PreOrderIterator(obj);
    }
}
