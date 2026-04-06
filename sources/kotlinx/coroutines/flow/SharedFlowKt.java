package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.ChannelFlowOperatorImpl;
import kotlinx.coroutines.internal.Symbol;

@Metadata
public final class SharedFlowKt {

    /* renamed from: a  reason: collision with root package name */
    public static final Symbol f41751a = new Symbol("NO_VALUE");

    public static final MutableSharedFlow a(int i2, int i3, BufferOverflow bufferOverflow) {
        if (i2 < 0) {
            throw new IllegalArgumentException(("replay cannot be negative, but was " + i2).toString());
        } else if (i3 < 0) {
            throw new IllegalArgumentException(("extraBufferCapacity cannot be negative, but was " + i3).toString());
        } else if (i2 > 0 || i3 > 0 || bufferOverflow == BufferOverflow.SUSPEND) {
            int i4 = i3 + i2;
            if (i4 < 0) {
                i4 = Integer.MAX_VALUE;
            }
            return new SharedFlowImpl(i2, i4, bufferOverflow);
        } else {
            throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + bufferOverflow).toString());
        }
    }

    public static /* synthetic */ MutableSharedFlow b(int i2, int i3, BufferOverflow bufferOverflow, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = 0;
        }
        if ((i4 & 4) != 0) {
            bufferOverflow = BufferOverflow.SUSPEND;
        }
        return a(i2, i3, bufferOverflow);
    }

    public static final Flow e(SharedFlow sharedFlow, CoroutineContext coroutineContext, int i2, BufferOverflow bufferOverflow) {
        return ((i2 == 0 || i2 == -3) && bufferOverflow == BufferOverflow.SUSPEND) ? sharedFlow : new ChannelFlowOperatorImpl(sharedFlow, coroutineContext, i2, bufferOverflow);
    }

    public static final Object f(Object[] objArr, long j2) {
        return objArr[((int) j2) & (objArr.length - 1)];
    }

    public static final void g(Object[] objArr, long j2, Object obj) {
        objArr[((int) j2) & (objArr.length - 1)] = obj;
    }
}
