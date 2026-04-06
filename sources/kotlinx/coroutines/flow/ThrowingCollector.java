package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata
public final class ThrowingCollector implements FlowCollector<Object> {

    /* renamed from: z  reason: collision with root package name */
    public final Throwable f41776z;

    public ThrowingCollector(Throwable th) {
        this.f41776z = th;
    }

    public Object c(Object obj, Continuation continuation) {
        throw this.f41776z;
    }
}
