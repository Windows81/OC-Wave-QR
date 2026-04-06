package kotlinx.coroutines.sync;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.internal.Segment;

@Metadata
final class SemaphoreSegment extends Segment<SemaphoreSegment> {
    public final /* synthetic */ AtomicReferenceArray D = new AtomicReferenceArray(SemaphoreKt.f41980f);

    public SemaphoreSegment(long j2, SemaphoreSegment semaphoreSegment, int i2) {
        super(j2, semaphoreSegment, i2);
    }

    public int r() {
        return SemaphoreKt.f41980f;
    }

    public void s(int i2, Throwable th, CoroutineContext coroutineContext) {
        v().set(i2, SemaphoreKt.f41979e);
        t();
    }

    public String toString() {
        return "SemaphoreSegment[id=" + this.f41864B + ", hashCode=" + hashCode() + ']';
    }

    public final /* synthetic */ AtomicReferenceArray v() {
        return this.D;
    }
}
