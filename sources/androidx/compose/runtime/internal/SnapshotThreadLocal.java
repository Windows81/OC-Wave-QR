package androidx.compose.runtime.internal;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Unit;

@Metadata
public final class SnapshotThreadLocal<T> {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReference f15148a = new AtomicReference(SnapshotThreadLocalKt.f15151a);

    /* renamed from: b  reason: collision with root package name */
    public final Object f15149b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public Object f15150c;

    public final Object a() {
        long a2 = Thread_jvmKt.a();
        return a2 == Thread_androidKt.a() ? this.f15150c : ((ThreadMap) this.f15148a.get()).b(a2);
    }

    public final void b(Object obj) {
        long a2 = Thread_jvmKt.a();
        if (a2 == Thread_androidKt.a()) {
            this.f15150c = obj;
            return;
        }
        synchronized (this.f15149b) {
            ThreadMap threadMap = (ThreadMap) this.f15148a.get();
            if (!threadMap.d(a2, obj)) {
                this.f15148a.set(threadMap.c(a2, obj));
                Unit unit = Unit.f40552a;
            }
        }
    }
}
