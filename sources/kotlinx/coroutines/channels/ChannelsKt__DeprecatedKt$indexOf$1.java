package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", l = {514}, m = "indexOf")
public final class ChannelsKt__DeprecatedKt$indexOf$1<E> extends ContinuationImpl {
    public Object C;
    public Object D;
    public Object E;
    public Object F;
    public /* synthetic */ Object G;
    public int H;

    public ChannelsKt__DeprecatedKt$indexOf$1(Continuation continuation) {
        super(continuation);
    }

    public final Object x(Object obj) {
        this.G = obj;
        this.H |= Integer.MIN_VALUE;
        return ChannelsKt__DeprecatedKt.j((ReceiveChannel) null, (Object) null, this);
    }
}
