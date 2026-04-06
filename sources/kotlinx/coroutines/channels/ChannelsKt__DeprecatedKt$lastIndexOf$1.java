package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", l = {514}, m = "lastIndexOf")
public final class ChannelsKt__DeprecatedKt$lastIndexOf$1<E> extends ContinuationImpl {
    public Object C;
    public Object D;
    public Object E;
    public Object F;
    public Object G;
    public /* synthetic */ Object H;
    public int I;

    public ChannelsKt__DeprecatedKt$lastIndexOf$1(Continuation continuation) {
        super(continuation);
    }

    public final Object x(Object obj) {
        this.H = obj;
        this.I |= Integer.MIN_VALUE;
        return ChannelsKt__DeprecatedKt.l((ReceiveChannel) null, (Object) null, this);
    }
}
