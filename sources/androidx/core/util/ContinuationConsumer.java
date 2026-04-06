package androidx.core.util;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;

@Metadata
final class ContinuationConsumer<T> extends AtomicBoolean implements Consumer<T> {

    /* renamed from: z  reason: collision with root package name */
    public final Continuation f20143z;

    public void accept(Object obj) {
        if (compareAndSet(false, true)) {
            this.f20143z.q(Result.b(obj));
        }
    }

    public String toString() {
        return "ContinuationConsumer(resultAccepted = " + get() + ')';
    }
}
