package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;

@Metadata
public final class PressDownGestureKt {
    public static final Object a(PointerInputScope pointerInputScope, TapOnPosition tapOnPosition, Function0 function0, Continuation continuation) {
        Object e2 = ForEachGestureKt.e(pointerInputScope, new PressDownGestureKt$detectPressDownGesture$2(tapOnPosition, function0, (Continuation) null), continuation);
        return e2 == IntrinsicsKt.f() ? e2 : Unit.f40552a;
    }
}
