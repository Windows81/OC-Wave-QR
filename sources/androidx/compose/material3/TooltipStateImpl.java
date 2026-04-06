package androidx.compose.material3;

import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.CancellableContinuation;

@Metadata
final class TooltipStateImpl implements TooltipState {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f11621a;

    /* renamed from: b  reason: collision with root package name */
    public final MutatorMutex f11622b;

    /* renamed from: c  reason: collision with root package name */
    public final MutableTransitionState f11623c;

    /* renamed from: d  reason: collision with root package name */
    public CancellableContinuation f11624d;

    public TooltipStateImpl(boolean z2, boolean z3, MutatorMutex mutatorMutex) {
        this.f11621a = z3;
        this.f11622b = mutatorMutex;
        this.f11623c = new MutableTransitionState(Boolean.valueOf(z2));
    }

    public Object a(MutatePriority mutatePriority, Continuation continuation) {
        Object d2 = this.f11622b.d(mutatePriority, new TooltipStateImpl$show$2(this, new TooltipStateImpl$show$cancellableShow$1(this, (Continuation) null), mutatePriority, (Continuation) null), continuation);
        return d2 == IntrinsicsKt.f() ? d2 : Unit.f40552a;
    }

    public void b() {
        CancellableContinuation cancellableContinuation = this.f11624d;
        if (cancellableContinuation != null) {
            CancellableContinuation.DefaultImpls.a(cancellableContinuation, (Throwable) null, 1, (Object) null);
        }
    }

    public MutableTransitionState c() {
        return this.f11623c;
    }

    public void dismiss() {
        CancellableContinuation cancellableContinuation;
        c().h(Boolean.FALSE);
        if (f() && (cancellableContinuation = this.f11624d) != null) {
            CancellableContinuation.DefaultImpls.a(cancellableContinuation, (Throwable) null, 1, (Object) null);
        }
    }

    public boolean f() {
        return this.f11621a;
    }

    public boolean isVisible() {
        return ((Boolean) c().a()).booleanValue() || ((Boolean) c().b()).booleanValue();
    }
}
