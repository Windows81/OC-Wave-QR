package androidx.compose.ui.input.pointer;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

@Metadata
public interface AwaitPointerEventScope extends Density {

    @Metadata
    public static final class DefaultImpls {
    }

    static /* synthetic */ Object P0(AwaitPointerEventScope awaitPointerEventScope, PointerEventPass pointerEventPass, Continuation continuation, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 1) != 0) {
                pointerEventPass = PointerEventPass.Main;
            }
            return awaitPointerEventScope.k0(pointerEventPass, continuation);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: awaitPointerEvent");
    }

    long I1() {
        return Size.f15876b.b();
    }

    Object S1(long j2, Function2 function2, Continuation continuation) {
        return function2.m(this, continuation);
    }

    Object V0(long j2, Function2 function2, Continuation continuation) {
        return function2.m(this, continuation);
    }

    long a();

    ViewConfiguration getViewConfiguration();

    Object k0(PointerEventPass pointerEventPass, Continuation continuation);

    PointerEvent l0();
}
