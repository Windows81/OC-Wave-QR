package androidx.compose.foundation;

import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.CancellableContinuation;

@Metadata
final class BasicTooltipStateImpl implements BasicTooltipState {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f2959a;

    /* renamed from: b  reason: collision with root package name */
    public final MutatorMutex f2960b;

    /* renamed from: c  reason: collision with root package name */
    public final MutableState f2961c;

    /* renamed from: d  reason: collision with root package name */
    public CancellableContinuation f2962d;

    public Object a(MutatePriority mutatePriority, Continuation continuation) {
        Object d2 = this.f2960b.d(mutatePriority, new BasicTooltipStateImpl$show$2(this, new BasicTooltipStateImpl$show$cancellableShow$1(this, (Continuation) null), (Continuation) null), continuation);
        return d2 == IntrinsicsKt.f() ? d2 : Unit.f40552a;
    }

    public void b() {
        CancellableContinuation cancellableContinuation = this.f2962d;
        if (cancellableContinuation != null) {
            CancellableContinuation.DefaultImpls.a(cancellableContinuation, (Throwable) null, 1, (Object) null);
        }
    }

    public void dismiss() {
        f(false);
    }

    public boolean e() {
        return this.f2959a;
    }

    public void f(boolean z2) {
        this.f2961c.setValue(Boolean.valueOf(z2));
    }

    public boolean isVisible() {
        return ((Boolean) this.f2961c.getValue()).booleanValue();
    }
}
