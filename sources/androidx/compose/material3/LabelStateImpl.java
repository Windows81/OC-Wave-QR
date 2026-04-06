package androidx.compose.material3;

import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.foundation.MutatePriority;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@Metadata
final class LabelStateImpl implements TooltipState {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f10216a;

    /* renamed from: b  reason: collision with root package name */
    public final MutableTransitionState f10217b;

    public Object a(MutatePriority mutatePriority, Continuation continuation) {
        return Unit.f40552a;
    }

    public void b() {
    }

    public MutableTransitionState c() {
        return this.f10217b;
    }

    public void dismiss() {
    }

    public boolean isVisible() {
        return this.f10216a;
    }
}
