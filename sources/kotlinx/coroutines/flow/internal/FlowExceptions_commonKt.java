package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;

@Metadata
public final class FlowExceptions_commonKt {
    public static final void a(AbortFlowException abortFlowException, Object obj) {
        if (abortFlowException.f41778z != obj) {
            throw abortFlowException;
        }
    }
}
