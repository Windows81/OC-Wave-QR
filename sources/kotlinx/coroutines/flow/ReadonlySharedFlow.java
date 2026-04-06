package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.FusibleFlow;

@Metadata
final class ReadonlySharedFlow<T> implements SharedFlow<T>, CancellableFlow<T>, FusibleFlow<T> {

    /* renamed from: A  reason: collision with root package name */
    public final Job f41742A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SharedFlow f41743z;

    public ReadonlySharedFlow(SharedFlow sharedFlow, Job job) {
        this.f41743z = sharedFlow;
        this.f41742A = job;
    }

    public Object a(FlowCollector flowCollector, Continuation continuation) {
        return this.f41743z.a(flowCollector, continuation);
    }

    public Flow b(CoroutineContext coroutineContext, int i2, BufferOverflow bufferOverflow) {
        return SharedFlowKt.e(this, coroutineContext, i2, bufferOverflow);
    }
}
