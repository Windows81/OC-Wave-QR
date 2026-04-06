package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.math.IntMath;
import java.util.AbstractQueue;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Queue;

@ElementTypesAreNonnullByDefault
public final class MinMaxPriorityQueue<E> extends AbstractQueue<E> {

    /* renamed from: A  reason: collision with root package name */
    public final Heap f28420A;

    /* renamed from: B  reason: collision with root package name */
    public final int f28421B;
    public Object[] C;
    public int D;
    public int E;

    /* renamed from: z  reason: collision with root package name */
    public final Heap f28422z;

    public static final class Builder<B> {
    }

    public class Heap {

        /* renamed from: a  reason: collision with root package name */
        public final Ordering f28423a;

        /* renamed from: b  reason: collision with root package name */
        public Heap f28424b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ MinMaxPriorityQueue f28425c;

        public void a(int i2, Object obj) {
            Heap heap;
            int e2 = e(i2, obj);
            if (e2 == i2) {
                e2 = i2;
                heap = this;
            } else {
                heap = this.f28424b;
            }
            heap.b(e2, obj);
        }

        public int b(int i2, Object obj) {
            while (i2 > 2) {
                int j2 = j(i2);
                Object n2 = this.f28425c.n(j2);
                if (this.f28423a.compare(n2, obj) <= 0) {
                    break;
                }
                this.f28425c.C[i2] = n2;
                i2 = j2;
            }
            this.f28425c.C[i2] = obj;
            return i2;
        }

        public int c(int i2, int i3) {
            return this.f28423a.compare(this.f28425c.n(i2), this.f28425c.n(i3));
        }

        public int d(int i2, Object obj) {
            int h2 = h(i2);
            if (h2 <= 0 || this.f28423a.compare(this.f28425c.n(h2), obj) >= 0) {
                return e(i2, obj);
            }
            this.f28425c.C[i2] = this.f28425c.n(h2);
            this.f28425c.C[h2] = obj;
            return h2;
        }

        public int e(int i2, Object obj) {
            int m2;
            if (i2 == 0) {
                this.f28425c.C[0] = obj;
                return 0;
            }
            int l2 = l(i2);
            Object n2 = this.f28425c.n(l2);
            if (!(l2 == 0 || (m2 = m(l(l2))) == l2 || k(m2) < this.f28425c.D)) {
                Object n3 = this.f28425c.n(m2);
                if (this.f28423a.compare(n3, n2) < 0) {
                    l2 = m2;
                    n2 = n3;
                }
            }
            if (this.f28423a.compare(n2, obj) < 0) {
                this.f28425c.C[i2] = n2;
                this.f28425c.C[l2] = obj;
                return l2;
            }
            this.f28425c.C[i2] = obj;
            return i2;
        }

        public int f(int i2) {
            while (true) {
                int i3 = i(i2);
                if (i3 <= 0) {
                    return i2;
                }
                this.f28425c.C[i2] = this.f28425c.n(i3);
                i2 = i3;
            }
        }

        public int g(int i2, int i3) {
            if (i2 >= this.f28425c.D) {
                return -1;
            }
            Preconditions.w(i2 > 0);
            int min = Math.min(i2, this.f28425c.D - i3) + i3;
            for (int i4 = i2 + 1; i4 < min; i4++) {
                if (c(i4, i2) < 0) {
                    i2 = i4;
                }
            }
            return i2;
        }

        public int h(int i2) {
            return g(k(i2), 2);
        }

        public int i(int i2) {
            int k2 = k(i2);
            if (k2 < 0) {
                return -1;
            }
            return g(k(k2), 4);
        }

        public final int j(int i2) {
            return l(l(i2));
        }

        public final int k(int i2) {
            return (i2 * 2) + 1;
        }

        public final int l(int i2) {
            return (i2 - 1) / 2;
        }

        public final int m(int i2) {
            return (i2 * 2) + 2;
        }

        public int n(Object obj) {
            int m2;
            int l2 = l(this.f28425c.D);
            if (!(l2 == 0 || (m2 = m(l(l2))) == l2 || k(m2) < this.f28425c.D)) {
                Object n2 = this.f28425c.n(m2);
                if (this.f28423a.compare(n2, obj) < 0) {
                    this.f28425c.C[m2] = obj;
                    this.f28425c.C[this.f28425c.D] = n2;
                    return m2;
                }
            }
            return this.f28425c.D;
        }

        public MoveDesc o(int i2, int i3, Object obj) {
            int d2 = d(i3, obj);
            if (d2 == i3) {
                return null;
            }
            Object n2 = d2 < i2 ? this.f28425c.n(i2) : this.f28425c.n(l(i2));
            if (this.f28424b.b(d2, obj) < i2) {
                return new MoveDesc(obj, n2);
            }
            return null;
        }
    }

    public static class MoveDesc<E> {

        /* renamed from: a  reason: collision with root package name */
        public final Object f28426a;

        /* renamed from: b  reason: collision with root package name */
        public final Object f28427b;

        public MoveDesc(Object obj, Object obj2) {
            this.f28426a = obj;
            this.f28427b = obj2;
        }
    }

    public class QueueIterator implements Iterator<E> {

        /* renamed from: A  reason: collision with root package name */
        public int f28428A;

        /* renamed from: B  reason: collision with root package name */
        public int f28429B;
        public Queue C;
        public List D;
        public Object E;
        public boolean F;

        /* renamed from: z  reason: collision with root package name */
        public int f28430z;

        public QueueIterator() {
            this.f28430z = -1;
            this.f28428A = -1;
            this.f28429B = MinMaxPriorityQueue.this.E;
        }

        public final void b() {
            if (MinMaxPriorityQueue.this.E != this.f28429B) {
                throw new ConcurrentModificationException();
            }
        }

        public final boolean c(Iterable iterable, Object obj) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                if (it.next() == obj) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }

        public final void d(int i2) {
            if (this.f28428A < i2) {
                if (this.D != null) {
                    while (i2 < MinMaxPriorityQueue.this.size() && c(this.D, MinMaxPriorityQueue.this.n(i2))) {
                        i2++;
                    }
                }
                this.f28428A = i2;
            }
        }

        public final boolean e(Object obj) {
            for (int i2 = 0; i2 < MinMaxPriorityQueue.this.D; i2++) {
                if (MinMaxPriorityQueue.this.C[i2] == obj) {
                    MinMaxPriorityQueue.this.w(i2);
                    return true;
                }
            }
            return false;
        }

        public boolean hasNext() {
            b();
            d(this.f28430z + 1);
            if (this.f28428A < MinMaxPriorityQueue.this.size()) {
                return true;
            }
            Queue queue = this.C;
            return queue != null && !queue.isEmpty();
        }

        public Object next() {
            b();
            d(this.f28430z + 1);
            if (this.f28428A < MinMaxPriorityQueue.this.size()) {
                int i2 = this.f28428A;
                this.f28430z = i2;
                this.F = true;
                return MinMaxPriorityQueue.this.n(i2);
            }
            if (this.C != null) {
                this.f28430z = MinMaxPriorityQueue.this.size();
                Object poll = this.C.poll();
                this.E = poll;
                if (poll != null) {
                    this.F = true;
                    return poll;
                }
            }
            throw new NoSuchElementException("iterator moved past last element in queue.");
        }

        public void remove() {
            CollectPreconditions.e(this.F);
            b();
            this.F = false;
            this.f28429B++;
            if (this.f28430z < MinMaxPriorityQueue.this.size()) {
                MoveDesc w2 = MinMaxPriorityQueue.this.w(this.f28430z);
                if (w2 != null) {
                    if (this.C == null || this.D == null) {
                        this.C = new ArrayDeque();
                        this.D = new ArrayList(3);
                    }
                    if (!c(this.D, w2.f28426a)) {
                        this.C.add(w2.f28426a);
                    }
                    if (!c(this.C, w2.f28427b)) {
                        this.D.add(w2.f28427b);
                    }
                }
                this.f28430z--;
                this.f28428A--;
                return;
            }
            Object obj = this.E;
            Objects.requireNonNull(obj);
            Preconditions.w(e(obj));
            this.E = null;
        }
    }

    public static int m(int i2, int i3) {
        return Math.min(i2 - 1, i3) + 1;
    }

    public static boolean u(int i2) {
        int i3 = ~(~(i2 + 1));
        Preconditions.x(i3 > 0, "negative index");
        return (1431655765 & i3) > (i3 & -1431655766);
    }

    public boolean add(Object obj) {
        offer(obj);
        return true;
    }

    public boolean addAll(Collection collection) {
        boolean z2 = false;
        for (Object offer : collection) {
            offer(offer);
            z2 = true;
        }
        return z2;
    }

    public void clear() {
        for (int i2 = 0; i2 < this.D; i2++) {
            this.C[i2] = null;
        }
        this.D = 0;
    }

    public final int i() {
        int length = this.C.length;
        return m(length < 64 ? (length + 1) * 2 : IntMath.c(length / 2, 3), this.f28421B);
    }

    public Iterator iterator() {
        return new QueueIterator();
    }

    public Object n(int i2) {
        Object obj = this.C[i2];
        Objects.requireNonNull(obj);
        return obj;
    }

    public final MoveDesc o(int i2, Object obj) {
        Heap s2 = s(i2);
        int f2 = s2.f(i2);
        int b2 = s2.b(f2, obj);
        if (b2 == f2) {
            return s2.o(i2, f2, obj);
        }
        if (b2 < i2) {
            return new MoveDesc(obj, n(i2));
        }
        return null;
    }

    public boolean offer(Object obj) {
        Preconditions.q(obj);
        this.E++;
        int i2 = this.D;
        this.D = i2 + 1;
        q();
        s(i2).a(i2, obj);
        return this.D <= this.f28421B || pollLast() != obj;
    }

    public final int p() {
        int i2 = this.D;
        if (i2 != 1) {
            return (i2 == 2 || this.f28420A.c(1, 2) <= 0) ? 1 : 2;
        }
        return 0;
    }

    public Object peek() {
        if (isEmpty()) {
            return null;
        }
        return n(0);
    }

    public Object poll() {
        if (isEmpty()) {
            return null;
        }
        return v(0);
    }

    public Object pollLast() {
        if (isEmpty()) {
            return null;
        }
        return v(p());
    }

    public final void q() {
        if (this.D > this.C.length) {
            Object[] objArr = new Object[i()];
            Object[] objArr2 = this.C;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.C = objArr;
        }
    }

    public final Heap s(int i2) {
        return u(i2) ? this.f28422z : this.f28420A;
    }

    public int size() {
        return this.D;
    }

    public Object[] toArray() {
        int i2 = this.D;
        Object[] objArr = new Object[i2];
        System.arraycopy(this.C, 0, objArr, 0, i2);
        return objArr;
    }

    public final Object v(int i2) {
        Object n2 = n(i2);
        w(i2);
        return n2;
    }

    public MoveDesc w(int i2) {
        Preconditions.t(i2, this.D);
        this.E++;
        int i3 = this.D - 1;
        this.D = i3;
        if (i3 == i2) {
            this.C[i3] = null;
            return null;
        }
        Object n2 = n(i3);
        int n3 = s(this.D).n(n2);
        if (n3 == i2) {
            this.C[this.D] = null;
            return null;
        }
        Object n4 = n(this.D);
        this.C[this.D] = null;
        MoveDesc o2 = o(i2, n4);
        return n3 < i2 ? o2 == null ? new MoveDesc(n2, n4) : new MoveDesc(n2, o2.f28427b) : o2;
    }
}
