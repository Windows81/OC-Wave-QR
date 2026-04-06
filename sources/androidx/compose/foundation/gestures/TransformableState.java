package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

@Metadata
public interface TransformableState {

    @Metadata
    public static final class DefaultImpls {
    }

    Object a(MutatePriority mutatePriority, Function2 function2, Continuation continuation);
}
