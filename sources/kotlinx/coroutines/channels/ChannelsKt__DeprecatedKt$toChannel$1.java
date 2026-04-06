package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.channels.SendChannel;

@Metadata
@DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", l = {514, 308}, m = "toChannel")
public final class ChannelsKt__DeprecatedKt$toChannel$1<E, C extends SendChannel<? super E>> extends ContinuationImpl {
    public Object C;
    public Object D;
    public Object E;
    public /* synthetic */ Object F;
    public int G;

    public ChannelsKt__DeprecatedKt$toChannel$1(Continuation continuation) {
        super(continuation);
    }

    public final Object x(Object obj) {
        this.F = obj;
        this.G |= Integer.MIN_VALUE;
        return ChannelsKt.s((ReceiveChannel) null, (SendChannel) null, this);
    }
}
