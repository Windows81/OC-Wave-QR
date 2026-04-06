package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

@Metadata
public interface ReusableComposition extends Composition {
    void deactivate();

    void r(Function2 function2);
}
