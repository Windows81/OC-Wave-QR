package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Ref;

@Metadata
public final class FlowKt__CountKt$count$2<T> implements FlowCollector {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Ref.IntRef f41593z;

    public FlowKt__CountKt$count$2(Ref.IntRef intRef) {
        this.f41593z = intRef;
    }

    public final Object c(Object obj, Continuation continuation) {
        this.f41593z.f40906z++;
        return Unit.f40552a;
    }
}
