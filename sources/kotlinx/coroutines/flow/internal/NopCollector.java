package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata
public final class NopCollector implements FlowCollector<Object> {

    /* renamed from: z  reason: collision with root package name */
    public static final NopCollector f41807z = new NopCollector();

    public Object c(Object obj, Continuation continuation) {
        return Unit.f40552a;
    }
}
