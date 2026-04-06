package androidx.compose.foundation.interaction;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;

@Metadata
final class MutableInteractionSourceImpl implements MutableInteractionSource {

    /* renamed from: a  reason: collision with root package name */
    public final MutableSharedFlow f3689a = SharedFlowKt.b(0, 16, BufferOverflow.DROP_OLDEST, 1, (Object) null);

    public Object a(Interaction interaction, Continuation continuation) {
        Object c2 = c().c(interaction, continuation);
        return c2 == IntrinsicsKt.f() ? c2 : Unit.f40552a;
    }

    public boolean b(Interaction interaction) {
        return c().i(interaction);
    }

    /* renamed from: d */
    public MutableSharedFlow c() {
        return this.f3689a;
    }
}
