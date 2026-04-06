package kotlinx.coroutines.channels;

import com.lokalise.sdk.api.Params;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.internal.Symbol;

@Metadata
public final class BufferedChannelKt {

    /* renamed from: a  reason: collision with root package name */
    public static final ChannelSegment f41471a = new ChannelSegment(-1, (ChannelSegment) null, (BufferedChannel) null, 0);

    /* renamed from: b  reason: collision with root package name */
    public static final int f41472b = SystemPropsKt__SystemProps_commonKt.e("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12, (Object) null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f41473c = SystemPropsKt__SystemProps_commonKt.e("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", Params.Timeout.CONNECT_LONG, 0, 0, 12, (Object) null);

    /* renamed from: d  reason: collision with root package name */
    public static final Symbol f41474d = new Symbol("BUFFERED");

    /* renamed from: e  reason: collision with root package name */
    public static final Symbol f41475e = new Symbol("SHOULD_BUFFER");

    /* renamed from: f  reason: collision with root package name */
    public static final Symbol f41476f = new Symbol("S_RESUMING_BY_RCV");

    /* renamed from: g  reason: collision with root package name */
    public static final Symbol f41477g = new Symbol("RESUMING_BY_EB");

    /* renamed from: h  reason: collision with root package name */
    public static final Symbol f41478h = new Symbol("POISONED");

    /* renamed from: i  reason: collision with root package name */
    public static final Symbol f41479i = new Symbol("DONE_RCV");

    /* renamed from: j  reason: collision with root package name */
    public static final Symbol f41480j = new Symbol("INTERRUPTED_SEND");

    /* renamed from: k  reason: collision with root package name */
    public static final Symbol f41481k = new Symbol("INTERRUPTED_RCV");

    /* renamed from: l  reason: collision with root package name */
    public static final Symbol f41482l = new Symbol("CHANNEL_CLOSED");

    /* renamed from: m  reason: collision with root package name */
    public static final Symbol f41483m = new Symbol("SUSPEND");

    /* renamed from: n  reason: collision with root package name */
    public static final Symbol f41484n = new Symbol("SUSPEND_NO_WAITER");

    /* renamed from: o  reason: collision with root package name */
    public static final Symbol f41485o = new Symbol("FAILED");

    /* renamed from: p  reason: collision with root package name */
    public static final Symbol f41486p = new Symbol("NO_RECEIVE_RESULT");

    /* renamed from: q  reason: collision with root package name */
    public static final Symbol f41487q = new Symbol("CLOSE_HANDLER_CLOSED");

    /* renamed from: r  reason: collision with root package name */
    public static final Symbol f41488r = new Symbol("CLOSE_HANDLER_INVOKED");

    /* renamed from: s  reason: collision with root package name */
    public static final Symbol f41489s = new Symbol("NO_CLOSE_CAUSE");

    public static final long A(int i2) {
        if (i2 == 0) {
            return 0;
        }
        if (i2 != Integer.MAX_VALUE) {
            return (long) i2;
        }
        return Long.MAX_VALUE;
    }

    public static final boolean B(CancellableContinuation cancellableContinuation, Object obj, Function3 function3) {
        Object Z = cancellableContinuation.Z(obj, (Object) null, function3);
        if (Z == null) {
            return false;
        }
        cancellableContinuation.a0(Z);
        return true;
    }

    public static /* synthetic */ boolean C(CancellableContinuation cancellableContinuation, Object obj, Function3 function3, int i2, Object obj2) {
        if ((i2 & 2) != 0) {
            function3 = null;
        }
        return B(cancellableContinuation, obj, function3);
    }

    public static final long v(long j2, boolean z2) {
        return (z2 ? 4611686018427387904L : 0) + j2;
    }

    public static final long w(long j2, int i2) {
        return (((long) i2) << 60) + j2;
    }

    public static final ChannelSegment x(long j2, ChannelSegment channelSegment) {
        return new ChannelSegment(j2, channelSegment, channelSegment.y(), 0);
    }

    public static final KFunction y() {
        return BufferedChannelKt$createSegmentFunction$1.I;
    }

    public static final Symbol z() {
        return f41482l;
    }
}
