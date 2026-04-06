package androidx.compose.foundation;

import androidx.compose.ui.node.DelegatableNode;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

@Metadata
public interface OverscrollEffect {
    DelegatableNode M() {
        return new OverscrollEffect$node$1();
    }

    long N(long j2, int i2, Function1 function1);

    Object O(long j2, Function2 function2, Continuation continuation);

    boolean P();
}
