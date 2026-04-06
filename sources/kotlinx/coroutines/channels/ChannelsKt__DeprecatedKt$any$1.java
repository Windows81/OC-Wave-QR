package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", l = {434}, m = "any")
public final class ChannelsKt__DeprecatedKt$any$1<E> extends ContinuationImpl {
    public Object C;
    public /* synthetic */ Object D;
    public int E;

    public ChannelsKt__DeprecatedKt$any$1(Continuation continuation) {
        super(continuation);
    }

    public final Object x(Object obj) {
        this.D = obj;
        this.E |= Integer.MIN_VALUE;
        return ChannelsKt__DeprecatedKt.a((ReceiveChannel) null, this);
    }
}
