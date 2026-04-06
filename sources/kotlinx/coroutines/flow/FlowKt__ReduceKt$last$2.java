package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Ref;

@Metadata
public final class FlowKt__ReduceKt$last$2<T> implements FlowCollector {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f41666z;

    public FlowKt__ReduceKt$last$2(Ref.ObjectRef objectRef) {
        this.f41666z = objectRef;
    }

    public final Object c(Object obj, Continuation continuation) {
        this.f41666z.f40908z = obj;
        return Unit.f40552a;
    }
}
