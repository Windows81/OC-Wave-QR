package kotlinx.coroutines.internal;

import androidx.concurrent.futures.a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.DebugStringsKt;

@Metadata
public class LockFreeLinkedListNode {

    /* renamed from: A  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f41843A;

    /* renamed from: B  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f41844B;

    /* renamed from: z  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f41845z;
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    static {
        Class<LockFreeLinkedListNode> cls = LockFreeLinkedListNode.class;
        Class<Object> cls2 = Object.class;
        f41845z = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_next$volatile");
        f41843A = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_prev$volatile");
        f41844B = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_removedRef$volatile");
    }

    public final boolean c(LockFreeLinkedListNode lockFreeLinkedListNode, int i2) {
        LockFreeLinkedListNode n2;
        do {
            n2 = n();
            if (n2 instanceof ListClosed) {
                return (((ListClosed) n2).C & i2) == 0 && n2.c(lockFreeLinkedListNode, i2);
            }
        } while (!n2.e(lockFreeLinkedListNode, this));
        return true;
    }

    public final boolean e(LockFreeLinkedListNode lockFreeLinkedListNode, LockFreeLinkedListNode lockFreeLinkedListNode2) {
        f41843A.set(lockFreeLinkedListNode, this);
        f41845z.set(lockFreeLinkedListNode, lockFreeLinkedListNode2);
        if (!a.a(f41845z, this, lockFreeLinkedListNode2, lockFreeLinkedListNode)) {
            return false;
        }
        lockFreeLinkedListNode.k(lockFreeLinkedListNode2);
        return true;
    }

    public final boolean f(LockFreeLinkedListNode lockFreeLinkedListNode) {
        f41843A.set(lockFreeLinkedListNode, this);
        f41845z.set(lockFreeLinkedListNode, this);
        while (l() == this) {
            if (a.a(f41845z, this, this, lockFreeLinkedListNode)) {
                lockFreeLinkedListNode.k(this);
                return true;
            }
        }
        return false;
    }

    public final void g(int i2) {
        c(new ListClosed(i2), i2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: kotlinx.coroutines.internal.LockFreeLinkedListNode} */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003f, code lost:
        if (androidx.concurrent.futures.a.a(o(), r3, r2, ((kotlinx.coroutines.internal.Removed) r4).f41863a) != false) goto L_0x0042;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final kotlinx.coroutines.internal.LockFreeLinkedListNode i() {
        /*
            r7 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f41843A
            java.lang.Object r0 = r0.get(r7)
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r0
            r1 = 0
            r2 = r0
        L_0x000c:
            r3 = r1
        L_0x000d:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = f41845z
            java.lang.Object r4 = r4.get(r2)
            if (r4 != r7) goto L_0x0026
            if (r0 != r2) goto L_0x001a
            return r2
        L_0x001a:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f41843A
            boolean r0 = androidx.concurrent.futures.a.a(r1, r7, r0, r2)
            if (r0 != 0) goto L_0x0025
            goto L_0x0000
        L_0x0025:
            return r2
        L_0x0026:
            boolean r5 = r7.r()
            if (r5 == 0) goto L_0x002d
            return r1
        L_0x002d:
            boolean r5 = r4 instanceof kotlinx.coroutines.internal.Removed
            if (r5 == 0) goto L_0x004f
            if (r3 == 0) goto L_0x0044
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = f41845z
            kotlinx.coroutines.internal.Removed r4 = (kotlinx.coroutines.internal.Removed) r4
            kotlinx.coroutines.internal.LockFreeLinkedListNode r4 = r4.f41863a
            boolean r2 = androidx.concurrent.futures.a.a(r5, r3, r2, r4)
            if (r2 != 0) goto L_0x0042
            goto L_0x0000
        L_0x0042:
            r2 = r3
            goto L_0x000c
        L_0x0044:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = f41843A
            java.lang.Object r2 = r4.get(r2)
            kotlinx.coroutines.internal.LockFreeLinkedListNode r2 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r2
            goto L_0x000d
        L_0x004f:
            java.lang.String r3 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode"
            kotlin.jvm.internal.Intrinsics.g(r4, r3)
            r3 = r4
            kotlinx.coroutines.internal.LockFreeLinkedListNode r3 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r3
            r6 = r3
            r3 = r2
            r2 = r6
            goto L_0x000d
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.LockFreeLinkedListNode.i():kotlinx.coroutines.internal.LockFreeLinkedListNode");
    }

    public final LockFreeLinkedListNode j(LockFreeLinkedListNode lockFreeLinkedListNode) {
        while (lockFreeLinkedListNode.r()) {
            lockFreeLinkedListNode = (LockFreeLinkedListNode) f41843A.get(lockFreeLinkedListNode);
        }
        return lockFreeLinkedListNode;
    }

    public final void k(LockFreeLinkedListNode lockFreeLinkedListNode) {
        LockFreeLinkedListNode lockFreeLinkedListNode2;
        AtomicReferenceFieldUpdater p2 = f41843A;
        do {
            lockFreeLinkedListNode2 = (LockFreeLinkedListNode) p2.get(lockFreeLinkedListNode);
            if (l() != lockFreeLinkedListNode) {
                return;
            }
        } while (!a.a(f41843A, lockFreeLinkedListNode, lockFreeLinkedListNode2, this));
        if (r()) {
            lockFreeLinkedListNode.i();
        }
    }

    public final Object l() {
        return f41845z.get(this);
    }

    public final LockFreeLinkedListNode m() {
        LockFreeLinkedListNode lockFreeLinkedListNode;
        Object l2 = l();
        Removed removed = l2 instanceof Removed ? (Removed) l2 : null;
        if (removed != null && (lockFreeLinkedListNode = removed.f41863a) != null) {
            return lockFreeLinkedListNode;
        }
        Intrinsics.g(l2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        return (LockFreeLinkedListNode) l2;
    }

    public final LockFreeLinkedListNode n() {
        LockFreeLinkedListNode i2 = i();
        return i2 == null ? j((LockFreeLinkedListNode) f41843A.get(this)) : i2;
    }

    public boolean r() {
        return l() instanceof Removed;
    }

    public boolean s() {
        return t() == null;
    }

    public final LockFreeLinkedListNode t() {
        Object l2;
        LockFreeLinkedListNode lockFreeLinkedListNode;
        do {
            l2 = l();
            if (l2 instanceof Removed) {
                return ((Removed) l2).f41863a;
            }
            if (l2 == this) {
                return (LockFreeLinkedListNode) l2;
            }
            Intrinsics.g(l2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
            lockFreeLinkedListNode = (LockFreeLinkedListNode) l2;
        } while (!a.a(f41845z, this, l2, lockFreeLinkedListNode.u()));
        lockFreeLinkedListNode.i();
        return null;
    }

    public String toString() {
        return new LockFreeLinkedListNode$toString$1(this) + '@' + DebugStringsKt.b(this);
    }

    public final Removed u() {
        Removed removed = (Removed) f41844B.get(this);
        if (removed != null) {
            return removed;
        }
        Removed removed2 = new Removed(this);
        f41844B.set(this, removed2);
        return removed2;
    }
}
