package androidx.compose.ui.input.pointer;

import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

@Metadata
public interface PointerInputScope extends Density {

    @Metadata
    public static final class DefaultImpls {
    }

    Object M0(Function2 function2, Continuation continuation);

    ViewConfiguration getViewConfiguration();

    void l2(boolean z2) {
    }
}
