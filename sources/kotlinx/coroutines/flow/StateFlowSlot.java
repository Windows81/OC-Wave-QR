package kotlinx.coroutines.flow;

import androidx.compose.animation.core.h;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.flow.internal.AbstractSharedFlowKt;
import kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot;
import kotlinx.coroutines.internal.Concurrent_commonKt;

@Metadata
final class StateFlowSlot extends AbstractSharedFlowSlot<StateFlowImpl<?>> {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReference f41771a = new AtomicReference((Object) null);

    /* renamed from: d */
    public boolean a(StateFlowImpl stateFlowImpl) {
        if (Concurrent_commonKt.a(this.f41771a) != null) {
            return false;
        }
        Concurrent_commonKt.b(this.f41771a, StateFlowKt.f41769a);
        return true;
    }

    public final Object e(Continuation continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.c(continuation), 1);
        cancellableContinuationImpl.G();
        if (!h.a(this.f41771a, StateFlowKt.f41769a, cancellableContinuationImpl)) {
            Result.Companion companion = Result.f40519A;
            cancellableContinuationImpl.q(Result.b(Unit.f40552a));
        }
        Object A2 = cancellableContinuationImpl.A();
        if (A2 == IntrinsicsKt.f()) {
            DebugProbesKt.c(continuation);
        }
        return A2 == IntrinsicsKt.f() ? A2 : Unit.f40552a;
    }

    /* renamed from: f */
    public Continuation[] b(StateFlowImpl stateFlowImpl) {
        Concurrent_commonKt.b(this.f41771a, (Object) null);
        return AbstractSharedFlowKt.f41782a;
    }

    public final void g() {
        AtomicReference atomicReference = this.f41771a;
        while (true) {
            Object a2 = Concurrent_commonKt.a(atomicReference);
            if (a2 != null && a2 != StateFlowKt.f41770b) {
                if (a2 == StateFlowKt.f41769a) {
                    if (h.a(this.f41771a, a2, StateFlowKt.f41770b)) {
                        return;
                    }
                } else if (h.a(this.f41771a, a2, StateFlowKt.f41769a)) {
                    Result.Companion companion = Result.f40519A;
                    ((CancellableContinuationImpl) a2).q(Result.b(Unit.f40552a));
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final boolean h() {
        Object andSet = this.f41771a.getAndSet(StateFlowKt.f41769a);
        Intrinsics.f(andSet);
        return andSet == StateFlowKt.f41770b;
    }
}
