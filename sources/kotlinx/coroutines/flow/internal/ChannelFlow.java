package kotlinx.coroutines.flow.internal;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DebugStringsKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata
public abstract class ChannelFlow<T> implements FusibleFlow<T> {

    /* renamed from: A  reason: collision with root package name */
    public final int f41783A;

    /* renamed from: B  reason: collision with root package name */
    public final BufferOverflow f41784B;

    /* renamed from: z  reason: collision with root package name */
    public final CoroutineContext f41785z;

    public ChannelFlow(CoroutineContext coroutineContext, int i2, BufferOverflow bufferOverflow) {
        this.f41785z = coroutineContext;
        this.f41783A = i2;
        this.f41784B = bufferOverflow;
    }

    public static /* synthetic */ Object e(ChannelFlow channelFlow, FlowCollector flowCollector, Continuation continuation) {
        Object f2 = CoroutineScopeKt.f(new ChannelFlow$collect$2(flowCollector, channelFlow, (Continuation) null), continuation);
        return f2 == IntrinsicsKt.f() ? f2 : Unit.f40552a;
    }

    public Object a(FlowCollector flowCollector, Continuation continuation) {
        return e(this, flowCollector, continuation);
    }

    public Flow b(CoroutineContext coroutineContext, int i2, BufferOverflow bufferOverflow) {
        CoroutineContext y2 = coroutineContext.y(this.f41785z);
        if (bufferOverflow == BufferOverflow.SUSPEND) {
            int i3 = this.f41783A;
            if (i3 != -3) {
                if (i2 != -3) {
                    if (i3 != -2) {
                        if (i2 != -2) {
                            i2 += i3;
                            if (i2 < 0) {
                                i2 = Integer.MAX_VALUE;
                            }
                        }
                    }
                }
                i2 = i3;
            }
            bufferOverflow = this.f41784B;
        }
        return (Intrinsics.d(y2, this.f41785z) && i2 == this.f41783A && bufferOverflow == this.f41784B) ? this : j(y2, i2, bufferOverflow);
    }

    public String d() {
        return null;
    }

    public abstract Object f(ProducerScope producerScope, Continuation continuation);

    public abstract ChannelFlow j(CoroutineContext coroutineContext, int i2, BufferOverflow bufferOverflow);

    public Flow l() {
        return null;
    }

    public final Function2 m() {
        return new ChannelFlow$collectToFun$1(this, (Continuation) null);
    }

    public final int n() {
        int i2 = this.f41783A;
        if (i2 == -3) {
            return -2;
        }
        return i2;
    }

    public ReceiveChannel o(CoroutineScope coroutineScope) {
        return ProduceKt.e(coroutineScope, this.f41785z, n(), this.f41784B, CoroutineStart.ATOMIC, (Function1) null, m(), 16, (Object) null);
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String d2 = d();
        if (d2 != null) {
            arrayList.add(d2);
        }
        if (this.f41785z != EmptyCoroutineContext.f40721z) {
            arrayList.add("context=" + this.f41785z);
        }
        if (this.f41783A != -3) {
            arrayList.add("capacity=" + this.f41783A);
        }
        if (this.f41784B != BufferOverflow.SUSPEND) {
            arrayList.add("onBufferOverflow=" + this.f41784B);
        }
        return DebugStringsKt.a(this) + '[' + CollectionsKt.n0(arrayList, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null) + ']';
    }
}
