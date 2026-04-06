package androidx.compose.material3.internal;

import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.material3.TooltipState;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.CancellableContinuation;

@Metadata
final class BasicTooltipStateImpl implements TooltipState {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f12177a;

    /* renamed from: b  reason: collision with root package name */
    public final MutatorMutex f12178b;

    /* renamed from: c  reason: collision with root package name */
    public final MutableState f12179c;

    /* renamed from: d  reason: collision with root package name */
    public final MutableTransitionState f12180d;

    /* renamed from: e  reason: collision with root package name */
    public CancellableContinuation f12181e;

    public Object a(MutatePriority mutatePriority, Continuation continuation) {
        Object d2 = this.f12178b.d(mutatePriority, new BasicTooltipStateImpl$show$2(this, new BasicTooltipStateImpl$show$cancellableShow$1(this, (Continuation) null), (Continuation) null), continuation);
        return d2 == IntrinsicsKt.f() ? d2 : Unit.f40552a;
    }

    public void b() {
        CancellableContinuation cancellableContinuation = this.f12181e;
        if (cancellableContinuation != null) {
            CancellableContinuation.DefaultImpls.a(cancellableContinuation, (Throwable) null, 1, (Object) null);
        }
    }

    public MutableTransitionState c() {
        return this.f12180d;
    }

    public void dismiss() {
        g(false);
    }

    public boolean f() {
        return this.f12177a;
    }

    public void g(boolean z2) {
        this.f12179c.setValue(Boolean.valueOf(z2));
    }

    public boolean isVisible() {
        return ((Boolean) this.f12179c.getValue()).booleanValue();
    }
}
