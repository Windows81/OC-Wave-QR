package kotlinx.coroutines.channels;

import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", l = {514}, m = "toMap")
public final class ChannelsKt__DeprecatedKt$toMap$2<K, V, M extends Map<? super K, ? super V>> extends ContinuationImpl {
    public Object C;
    public Object D;
    public Object E;
    public /* synthetic */ Object F;
    public int G;

    public ChannelsKt__DeprecatedKt$toMap$2(Continuation continuation) {
        super(continuation);
    }

    public final Object x(Object obj) {
        this.F = obj;
        this.G |= Integer.MIN_VALUE;
        return ChannelsKt.v((ReceiveChannel) null, (Map) null, this);
    }
}
