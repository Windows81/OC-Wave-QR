package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata
public abstract class AbstractSharedFlowSlot<F> {
    public abstract boolean a(Object obj);

    public abstract Continuation[] b(Object obj);
}
