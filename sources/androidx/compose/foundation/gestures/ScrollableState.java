package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

@Metadata
public interface ScrollableState {

    @Metadata
    public static final class DefaultImpls {
    }

    static /* synthetic */ Object c(ScrollableState scrollableState, MutatePriority mutatePriority, Function2 function2, Continuation continuation, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 1) != 0) {
                mutatePriority = MutatePriority.Default;
            }
            return scrollableState.e(mutatePriority, function2, continuation);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scroll");
    }

    boolean a();

    float b(float f2);

    boolean d() {
        return true;
    }

    Object e(MutatePriority mutatePriority, Function2 function2, Continuation continuation);

    boolean f() {
        return true;
    }
}
