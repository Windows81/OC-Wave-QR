package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.CoroutineScopeKt;

@Metadata
public final class LongPressTextDragObserverKt {
    public static final Object c(PointerInputScope pointerInputScope, TextDragObserver textDragObserver, Continuation continuation) {
        Object f2 = CoroutineScopeKt.f(new LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2(pointerInputScope, textDragObserver, (Continuation) null), continuation);
        return f2 == IntrinsicsKt.f() ? f2 : Unit.f40552a;
    }

    public static final Object d(PointerInputScope pointerInputScope, TextDragObserver textDragObserver, Continuation continuation) {
        Object m2 = DragGestureDetectorKt.m(pointerInputScope, new LongPressTextDragObserverKt$detectDragGesturesWithObserver$2(textDragObserver), new LongPressTextDragObserverKt$detectDragGesturesWithObserver$3(textDragObserver), new LongPressTextDragObserverKt$detectDragGesturesWithObserver$4(textDragObserver), new LongPressTextDragObserverKt$detectDragGesturesWithObserver$5(textDragObserver), continuation);
        return m2 == IntrinsicsKt.f() ? m2 : Unit.f40552a;
    }

    public static final Object e(PointerInputScope pointerInputScope, TextDragObserver textDragObserver, Continuation continuation) {
        Object e2 = ForEachGestureKt.e(pointerInputScope, new LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2(textDragObserver, (Continuation) null), continuation);
        return e2 == IntrinsicsKt.f() ? e2 : Unit.f40552a;
    }
}
