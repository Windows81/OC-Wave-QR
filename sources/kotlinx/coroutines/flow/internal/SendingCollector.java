package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata
public final class SendingCollector<T> implements FlowCollector<T> {

    /* renamed from: z  reason: collision with root package name */
    public final SendChannel f41813z;

    public SendingCollector(SendChannel sendChannel) {
        this.f41813z = sendChannel;
    }

    public Object c(Object obj, Continuation continuation) {
        Object O = this.f41813z.O(obj, continuation);
        return O == IntrinsicsKt.f() ? O : Unit.f40552a;
    }
}
