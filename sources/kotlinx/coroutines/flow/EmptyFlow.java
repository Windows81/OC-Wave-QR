package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@Metadata
final class EmptyFlow implements Flow {

    /* renamed from: z  reason: collision with root package name */
    public static final EmptyFlow f41576z = new EmptyFlow();

    public Object a(FlowCollector flowCollector, Continuation continuation) {
        return Unit.f40552a;
    }
}
