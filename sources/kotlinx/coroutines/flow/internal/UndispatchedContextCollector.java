package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.internal.ThreadContextKt;

@Metadata
final class UndispatchedContextCollector<T> implements FlowCollector<T> {

    /* renamed from: A  reason: collision with root package name */
    public final Object f41816A;

    /* renamed from: B  reason: collision with root package name */
    public final Function2 f41817B;

    /* renamed from: z  reason: collision with root package name */
    public final CoroutineContext f41818z;

    public UndispatchedContextCollector(FlowCollector flowCollector, CoroutineContext coroutineContext) {
        this.f41818z = coroutineContext;
        this.f41816A = ThreadContextKt.g(coroutineContext);
        this.f41817B = new UndispatchedContextCollector$emitRef$1(flowCollector, (Continuation) null);
    }

    public Object c(Object obj, Continuation continuation) {
        Object c2 = ChannelFlowKt.c(this.f41818z, obj, this.f41816A, this.f41817B, continuation);
        return c2 == IntrinsicsKt.f() ? c2 : Unit.f40552a;
    }
}
