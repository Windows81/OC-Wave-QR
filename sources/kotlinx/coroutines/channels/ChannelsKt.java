package kotlinx.coroutines.channels;

import java.util.Collection;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata
public final class ChannelsKt {
    public static final void b(ReceiveChannel receiveChannel, Throwable th) {
        ChannelsKt__Channels_commonKt.a(receiveChannel, th);
    }

    public static final Object s(ReceiveChannel receiveChannel, SendChannel sendChannel, Continuation continuation) {
        return ChannelsKt__DeprecatedKt.s(receiveChannel, sendChannel, continuation);
    }

    public static final Object t(ReceiveChannel receiveChannel, Collection collection, Continuation continuation) {
        return ChannelsKt__DeprecatedKt.t(receiveChannel, collection, continuation);
    }

    public static final Object u(ReceiveChannel receiveChannel, Continuation continuation) {
        return ChannelsKt__Channels_commonKt.c(receiveChannel, continuation);
    }

    public static final Object v(ReceiveChannel receiveChannel, Map map, Continuation continuation) {
        return ChannelsKt__DeprecatedKt.u(receiveChannel, map, continuation);
    }

    public static final Object w(SendChannel sendChannel, Object obj) {
        return ChannelsKt__ChannelsKt.a(sendChannel, obj);
    }
}
