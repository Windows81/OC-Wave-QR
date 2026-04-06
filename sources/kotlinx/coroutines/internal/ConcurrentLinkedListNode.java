package kotlinx.coroutines.internal;

import androidx.concurrent.futures.a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.ConcurrentLinkedListNode;

@Metadata
public abstract class ConcurrentLinkedListNode<N extends ConcurrentLinkedListNode<N>> {

    /* renamed from: A  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f41827A;

    /* renamed from: z  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f41828z;
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    static {
        Class<ConcurrentLinkedListNode> cls = ConcurrentLinkedListNode.class;
        Class<Object> cls2 = Object.class;
        f41828z = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_next$volatile");
        f41827A = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_prev$volatile");
    }

    public ConcurrentLinkedListNode(ConcurrentLinkedListNode concurrentLinkedListNode) {
        this._prev$volatile = concurrentLinkedListNode;
    }

    public final void b() {
        f41827A.set(this, (Object) null);
    }

    public final ConcurrentLinkedListNode c() {
        ConcurrentLinkedListNode h2 = h();
        while (h2 != null && h2.k()) {
            h2 = (ConcurrentLinkedListNode) f41827A.get(h2);
        }
        return h2;
    }

    public final ConcurrentLinkedListNode d() {
        ConcurrentLinkedListNode f2;
        ConcurrentLinkedListNode f3 = f();
        Intrinsics.f(f3);
        while (f3.k() && (f2 = f3.f()) != null) {
            f3 = f2;
        }
        return f3;
    }

    public final ConcurrentLinkedListNode f() {
        Object a2 = g();
        if (a2 == ConcurrentLinkedListKt.f41826a) {
            return null;
        }
        return (ConcurrentLinkedListNode) a2;
    }

    public final Object g() {
        return f41828z.get(this);
    }

    public final ConcurrentLinkedListNode h() {
        return (ConcurrentLinkedListNode) f41827A.get(this);
    }

    public abstract boolean k();

    public final boolean l() {
        return f() == null;
    }

    public final boolean m() {
        return a.a(f41828z, this, (Object) null, ConcurrentLinkedListKt.f41826a);
    }

    public final void n() {
        Object obj;
        if (!l()) {
            while (true) {
                ConcurrentLinkedListNode c2 = c();
                ConcurrentLinkedListNode d2 = d();
                AtomicReferenceFieldUpdater j2 = f41827A;
                do {
                    obj = j2.get(d2);
                } while (!a.a(j2, d2, obj, ((ConcurrentLinkedListNode) obj) == null ? null : c2));
                if (c2 != null) {
                    f41828z.set(c2, d2);
                }
                if ((!d2.k() || d2.l()) && (c2 == null || !c2.k())) {
                    return;
                }
            }
        }
    }

    public final boolean o(ConcurrentLinkedListNode concurrentLinkedListNode) {
        return a.a(f41828z, this, (Object) null, concurrentLinkedListNode);
    }
}
