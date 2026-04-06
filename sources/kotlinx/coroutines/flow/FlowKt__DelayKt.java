package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.time.Duration;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.internal.FlowCoroutineKt;

@Metadata
final /* synthetic */ class FlowKt__DelayKt {
    public static final long b(Function1 function1, Object obj) {
        return DelayKt.e(((Duration) function1.invoke(obj)).a0());
    }

    public static final Flow c(Flow flow, Function1 function1) {
        return d(flow, new a(function1));
    }

    public static final Flow d(Flow flow, Function1 function1) {
        return FlowCoroutineKt.b(new FlowKt__DelayKt$debounceInternal$1(function1, flow, (Continuation) null));
    }

    public static final ReceiveChannel e(CoroutineScope coroutineScope, long j2) {
        return ProduceKt.d(coroutineScope, (CoroutineContext) null, 0, new FlowKt__DelayKt$fixedPeriodTicker$1(j2, (Continuation) null), 1, (Object) null);
    }
}
