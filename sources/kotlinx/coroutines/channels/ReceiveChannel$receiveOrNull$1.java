package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.channels.ReceiveChannel;

@Metadata
@DebugMetadata(c = "kotlinx.coroutines.channels.ReceiveChannel$DefaultImpls", f = "Channel.kt", l = {770}, m = "receiveOrNull")
public final class ReceiveChannel$receiveOrNull$1<E> extends ContinuationImpl {
    public /* synthetic */ Object C;
    public int D;

    public ReceiveChannel$receiveOrNull$1(Continuation continuation) {
        super(continuation);
    }

    public final Object x(Object obj) {
        this.C = obj;
        this.D |= Integer.MIN_VALUE;
        return ReceiveChannel.DefaultImpls.b((ReceiveChannel) null, this);
    }
}
