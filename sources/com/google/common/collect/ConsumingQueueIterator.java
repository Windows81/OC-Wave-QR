package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.Queue;

@ElementTypesAreNonnullByDefault
final class ConsumingQueueIterator<T> extends AbstractIterator<T> {

    /* renamed from: B  reason: collision with root package name */
    public final Queue f28065B;

    public ConsumingQueueIterator(Queue queue) {
        this.f28065B = (Queue) Preconditions.q(queue);
    }

    public Object b() {
        return this.f28065B.isEmpty() ? c() : this.f28065B.remove();
    }
}
