package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.StateFlow;

@Metadata
final class SubscriptionCountStateFlow extends SharedFlowImpl<Integer> implements StateFlow<Integer> {
    public SubscriptionCountStateFlow(int i2) {
        super(1, Integer.MAX_VALUE, BufferOverflow.DROP_OLDEST);
        i(Integer.valueOf(i2));
    }

    /* renamed from: a0 */
    public Integer getValue() {
        Integer valueOf;
        synchronized (this) {
            valueOf = Integer.valueOf(((Number) N()).intValue());
        }
        return valueOf;
    }

    public final boolean b0(int i2) {
        boolean i3;
        synchronized (this) {
            i3 = i(Integer.valueOf(((Number) N()).intValue() + i2));
        }
        return i3;
    }
}
