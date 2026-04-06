package androidx.compose.material3;

import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.foundation.MutatePriority;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata
public interface TooltipState {
    static /* synthetic */ Object d(TooltipState tooltipState, MutatePriority mutatePriority, Continuation continuation, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 1) != 0) {
                mutatePriority = MutatePriority.Default;
            }
            return tooltipState.a(mutatePriority, continuation);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: show");
    }

    Object a(MutatePriority mutatePriority, Continuation continuation);

    void b();

    MutableTransitionState c();

    void dismiss();

    boolean isVisible();
}
