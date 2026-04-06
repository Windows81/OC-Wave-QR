package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.channels.ChannelResult;

@Metadata
final /* synthetic */ class ChannelsKt__ChannelsKt {
    public static final Object a(SendChannel sendChannel, Object obj) {
        Object L = sendChannel.L(obj);
        if (L instanceof ChannelResult.Failed) {
            return ((ChannelResult) BuildersKt__BuildersKt.b((CoroutineContext) null, new ChannelsKt__ChannelsKt$trySendBlocking$2(sendChannel, obj, (Continuation) null), 1, (Object) null)).l();
        }
        Unit unit = (Unit) L;
        return ChannelResult.f41493b.c(Unit.f40552a);
    }
}
