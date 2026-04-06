package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.channels.ChannelIterator;

@Metadata
@DebugMetadata(c = "kotlinx.coroutines.channels.ChannelIterator$DefaultImpls", f = "Channel.kt", l = {1092}, m = "next")
public final class ChannelIterator$next0$1<E> extends ContinuationImpl {
    public Object C;
    public /* synthetic */ Object D;
    public int E;

    public ChannelIterator$next0$1(Continuation continuation) {
        super(continuation);
    }

    public final Object x(Object obj) {
        this.D = obj;
        this.E |= Integer.MIN_VALUE;
        return ChannelIterator.DefaultImpls.a((ChannelIterator) null, this);
    }
}
