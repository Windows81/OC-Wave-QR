package androidx.compose.foundation;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata
public interface BasicTooltipState {
    static /* synthetic */ Object c(BasicTooltipState basicTooltipState, MutatePriority mutatePriority, Continuation continuation, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 1) != 0) {
                mutatePriority = MutatePriority.Default;
            }
            return basicTooltipState.a(mutatePriority, continuation);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: show");
    }

    Object a(MutatePriority mutatePriority, Continuation continuation);

    void b();

    void dismiss();

    boolean isVisible();
}
