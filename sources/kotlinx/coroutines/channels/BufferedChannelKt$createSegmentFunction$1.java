package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata
public /* synthetic */ class BufferedChannelKt$createSegmentFunction$1 extends FunctionReferenceImpl implements Function2<Long, ChannelSegment<Object>, ChannelSegment<Object>> {
    public static final BufferedChannelKt$createSegmentFunction$1 I = new BufferedChannelKt$createSegmentFunction$1();

    public BufferedChannelKt$createSegmentFunction$1() {
        super(2, BufferedChannelKt.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        return v(((Number) obj).longValue(), (ChannelSegment) obj2);
    }

    public final ChannelSegment v(long j2, ChannelSegment channelSegment) {
        return BufferedChannelKt.x(j2, channelSegment);
    }
}
