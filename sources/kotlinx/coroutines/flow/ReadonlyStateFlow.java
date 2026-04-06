package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.FusibleFlow;

@Metadata
final class ReadonlyStateFlow<T> implements StateFlow<T>, CancellableFlow<T>, FusibleFlow<T> {

    /* renamed from: A  reason: collision with root package name */
    public final Job f41744A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ StateFlow f41745z;

    public ReadonlyStateFlow(StateFlow stateFlow, Job job) {
        this.f41745z = stateFlow;
        this.f41744A = job;
    }

    public Object a(FlowCollector flowCollector, Continuation continuation) {
        return this.f41745z.a(flowCollector, continuation);
    }

    public Flow b(CoroutineContext coroutineContext, int i2, BufferOverflow bufferOverflow) {
        return StateFlowKt.d(this, coroutineContext, i2, bufferOverflow);
    }

    public Object getValue() {
        return this.f41745z.getValue();
    }
}
