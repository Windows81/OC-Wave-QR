package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.Waiter;
import kotlinx.coroutines.internal.Segment;

@Metadata
final class ReceiveCatching<E> implements Waiter {

    /* renamed from: z  reason: collision with root package name */
    public final CancellableContinuationImpl f41499z;

    public ReceiveCatching(CancellableContinuationImpl cancellableContinuationImpl) {
        this.f41499z = cancellableContinuationImpl;
    }

    public void c(Segment segment, int i2) {
        this.f41499z.c(segment, i2);
    }
}
