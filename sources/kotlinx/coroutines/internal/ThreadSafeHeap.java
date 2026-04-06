package kotlinx.coroutines.internal;

import java.lang.Comparable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.ThreadSafeHeapNode;

@Metadata
public class ThreadSafeHeap<T extends ThreadSafeHeapNode & Comparable<? super T>> {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f41879b = AtomicIntegerFieldUpdater.newUpdater(ThreadSafeHeap.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;

    /* renamed from: a  reason: collision with root package name */
    public ThreadSafeHeapNode[] f41880a;

    public final void a(ThreadSafeHeapNode threadSafeHeapNode) {
        threadSafeHeapNode.f(this);
        ThreadSafeHeapNode[] g2 = g();
        int c2 = c();
        k(c2 + 1);
        g2[c2] = threadSafeHeapNode;
        threadSafeHeapNode.setIndex(c2);
        m(c2);
    }

    public final ThreadSafeHeapNode b() {
        ThreadSafeHeapNode[] threadSafeHeapNodeArr = this.f41880a;
        if (threadSafeHeapNodeArr != null) {
            return threadSafeHeapNodeArr[0];
        }
        return null;
    }

    public final int c() {
        return f41879b.get(this);
    }

    public final boolean e() {
        return c() == 0;
    }

    public final ThreadSafeHeapNode f() {
        ThreadSafeHeapNode b2;
        synchronized (this) {
            b2 = b();
        }
        return b2;
    }

    public final ThreadSafeHeapNode[] g() {
        ThreadSafeHeapNode[] threadSafeHeapNodeArr = this.f41880a;
        if (threadSafeHeapNodeArr == null) {
            ThreadSafeHeapNode[] threadSafeHeapNodeArr2 = new ThreadSafeHeapNode[4];
            this.f41880a = threadSafeHeapNodeArr2;
            return threadSafeHeapNodeArr2;
        } else if (c() < threadSafeHeapNodeArr.length) {
            return threadSafeHeapNodeArr;
        } else {
            Object[] copyOf = Arrays.copyOf(threadSafeHeapNodeArr, c() * 2);
            Intrinsics.h(copyOf, "copyOf(...)");
            ThreadSafeHeapNode[] threadSafeHeapNodeArr3 = (ThreadSafeHeapNode[]) copyOf;
            this.f41880a = threadSafeHeapNodeArr3;
            return threadSafeHeapNodeArr3;
        }
    }

    public final boolean h(ThreadSafeHeapNode threadSafeHeapNode) {
        boolean z2;
        synchronized (this) {
            if (threadSafeHeapNode.j() == null) {
                z2 = false;
            } else {
                i(threadSafeHeapNode.getIndex());
                z2 = true;
            }
        }
        return z2;
    }

    public final ThreadSafeHeapNode i(int i2) {
        ThreadSafeHeapNode[] threadSafeHeapNodeArr = this.f41880a;
        Intrinsics.f(threadSafeHeapNodeArr);
        k(c() - 1);
        if (i2 < c()) {
            n(i2, c());
            int i3 = (i2 - 1) / 2;
            if (i2 > 0) {
                ThreadSafeHeapNode threadSafeHeapNode = threadSafeHeapNodeArr[i2];
                Intrinsics.f(threadSafeHeapNode);
                ThreadSafeHeapNode threadSafeHeapNode2 = threadSafeHeapNodeArr[i3];
                Intrinsics.f(threadSafeHeapNode2);
                if (((Comparable) threadSafeHeapNode).compareTo(threadSafeHeapNode2) < 0) {
                    n(i2, i3);
                    m(i3);
                }
            }
            l(i2);
        }
        ThreadSafeHeapNode threadSafeHeapNode3 = threadSafeHeapNodeArr[c()];
        Intrinsics.f(threadSafeHeapNode3);
        threadSafeHeapNode3.f((ThreadSafeHeap) null);
        threadSafeHeapNode3.setIndex(-1);
        threadSafeHeapNodeArr[c()] = null;
        return threadSafeHeapNode3;
    }

    public final ThreadSafeHeapNode j() {
        ThreadSafeHeapNode i2;
        synchronized (this) {
            i2 = c() > 0 ? i(0) : null;
        }
        return i2;
    }

    public final void k(int i2) {
        f41879b.set(this, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0028, code lost:
        if (((java.lang.Comparable) r3).compareTo(r4) < 0) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void l(int r6) {
        /*
            r5 = this;
        L_0x0000:
            int r0 = r6 * 2
            int r1 = r0 + 1
            int r2 = r5.c()
            if (r1 < r2) goto L_0x000b
            return
        L_0x000b:
            kotlinx.coroutines.internal.ThreadSafeHeapNode[] r2 = r5.f41880a
            kotlin.jvm.internal.Intrinsics.f(r2)
            int r0 = r0 + 2
            int r3 = r5.c()
            if (r0 >= r3) goto L_0x002b
            r3 = r2[r0]
            kotlin.jvm.internal.Intrinsics.f(r3)
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            r4 = r2[r1]
            kotlin.jvm.internal.Intrinsics.f(r4)
            int r3 = r3.compareTo(r4)
            if (r3 >= 0) goto L_0x002b
            goto L_0x002c
        L_0x002b:
            r0 = r1
        L_0x002c:
            r1 = r2[r6]
            kotlin.jvm.internal.Intrinsics.f(r1)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            r2 = r2[r0]
            kotlin.jvm.internal.Intrinsics.f(r2)
            int r1 = r1.compareTo(r2)
            if (r1 > 0) goto L_0x003f
            return
        L_0x003f:
            r5.n(r6, r0)
            r6 = r0
            goto L_0x0000
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.ThreadSafeHeap.l(int):void");
    }

    public final void m(int i2) {
        while (i2 > 0) {
            ThreadSafeHeapNode[] threadSafeHeapNodeArr = this.f41880a;
            Intrinsics.f(threadSafeHeapNodeArr);
            int i3 = (i2 - 1) / 2;
            ThreadSafeHeapNode threadSafeHeapNode = threadSafeHeapNodeArr[i3];
            Intrinsics.f(threadSafeHeapNode);
            ThreadSafeHeapNode threadSafeHeapNode2 = threadSafeHeapNodeArr[i2];
            Intrinsics.f(threadSafeHeapNode2);
            if (((Comparable) threadSafeHeapNode).compareTo(threadSafeHeapNode2) > 0) {
                n(i2, i3);
                i2 = i3;
            } else {
                return;
            }
        }
    }

    public final void n(int i2, int i3) {
        ThreadSafeHeapNode[] threadSafeHeapNodeArr = this.f41880a;
        Intrinsics.f(threadSafeHeapNodeArr);
        ThreadSafeHeapNode threadSafeHeapNode = threadSafeHeapNodeArr[i3];
        Intrinsics.f(threadSafeHeapNode);
        ThreadSafeHeapNode threadSafeHeapNode2 = threadSafeHeapNodeArr[i2];
        Intrinsics.f(threadSafeHeapNode2);
        threadSafeHeapNodeArr[i2] = threadSafeHeapNode;
        threadSafeHeapNodeArr[i3] = threadSafeHeapNode2;
        threadSafeHeapNode.setIndex(i2);
        threadSafeHeapNode2.setIndex(i3);
    }
}
