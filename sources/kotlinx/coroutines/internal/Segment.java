package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.NotCompleted;
import kotlinx.coroutines.internal.Segment;

@Metadata
public abstract class Segment<S extends Segment<S>> extends ConcurrentLinkedListNode<S> implements NotCompleted {
    public static final /* synthetic */ AtomicIntegerFieldUpdater C = AtomicIntegerFieldUpdater.newUpdater(Segment.class, "cleanedAndPointers$volatile");

    /* renamed from: B  reason: collision with root package name */
    public final long f41864B;
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    public Segment(long j2, Segment segment, int i2) {
        super(segment);
        this.f41864B = j2;
        this.cleanedAndPointers$volatile = i2 << 16;
    }

    public boolean k() {
        return C.get(this) == r() && !l();
    }

    public final boolean p() {
        return C.addAndGet(this, -65536) == r() && !l();
    }

    public abstract int r();

    public abstract void s(int i2, Throwable th, CoroutineContext coroutineContext);

    public final void t() {
        if (C.incrementAndGet(this) == r()) {
            n();
        }
    }

    public final boolean u() {
        int i2;
        AtomicIntegerFieldUpdater q2 = C;
        do {
            i2 = q2.get(this);
            if (i2 == r() && !l()) {
                return false;
            }
        } while (!q2.compareAndSet(this, i2, 65536 + i2));
        return true;
    }
}
