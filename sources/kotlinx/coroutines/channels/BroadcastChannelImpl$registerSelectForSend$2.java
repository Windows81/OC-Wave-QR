package kotlinx.coroutines.channels;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.selects.SelectImplementation;
import kotlinx.coroutines.selects.SelectInstance;
import kotlinx.coroutines.selects.TrySelectDetailedResult;

@Metadata
@DebugMetadata(c = "kotlinx.coroutines.channels.BroadcastChannelImpl$registerSelectForSend$2", f = "BroadcastChannel.kt", l = {240}, m = "invokeSuspend")
public final class BroadcastChannelImpl$registerSelectForSend$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int D;
    public final /* synthetic */ BroadcastChannelImpl E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ SelectInstance G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BroadcastChannelImpl$registerSelectForSend$2(BroadcastChannelImpl broadcastChannelImpl, Object obj, SelectInstance selectInstance, Continuation continuation) {
        super(2, continuation);
        this.E = broadcastChannelImpl;
        this.F = obj;
        this.G = selectInstance;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((BroadcastChannelImpl$registerSelectForSend$2) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new BroadcastChannelImpl$registerSelectForSend$2(this.E, this.F, this.G, continuation);
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        boolean z2 = true;
        if (i2 == 0) {
            ResultKt.b(obj);
            BroadcastChannelImpl broadcastChannelImpl = this.E;
            Object obj2 = this.F;
            this.D = 1;
            if (broadcastChannelImpl.O(obj2, this) == f2) {
                return f2;
            }
        } else if (i2 == 1) {
            try {
                ResultKt.b(obj);
            } catch (Throwable th) {
                if (!this.E.R() || (!(th instanceof ClosedSendChannelException) && this.E.s0() != th)) {
                    throw th;
                }
                z2 = false;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ReentrantLock I1 = this.E.M;
        BroadcastChannelImpl broadcastChannelImpl2 = this.E;
        SelectInstance selectInstance = this.G;
        I1.lock();
        try {
            broadcastChannelImpl2.P.put(selectInstance, z2 ? Unit.f40552a : BufferedChannelKt.z());
            Intrinsics.g(selectInstance, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
            SelectImplementation selectImplementation = (SelectImplementation) selectInstance;
            Unit unit = Unit.f40552a;
            if (((SelectImplementation) selectInstance).A(broadcastChannelImpl2, unit) != TrySelectDetailedResult.REREGISTER) {
                broadcastChannelImpl2.P.remove(selectInstance);
            }
            I1.unlock();
            return unit;
        } catch (Throwable th2) {
            I1.unlock();
            throw th2;
        }
    }
}
