package androidx.compose.foundation.contextmenu;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;

@Metadata
public final class ContextMenuGestures_androidKt$contextMenuGestures$2 implements PointerInputEventHandler {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function1 f3241z;

    public ContextMenuGestures_androidKt$contextMenuGestures$2(Function1 function1) {
        this.f3241z = function1;
    }

    public final Object invoke(PointerInputScope pointerInputScope, Continuation continuation) {
        Object d2 = ContextMenuGestures_androidKt.d(pointerInputScope, this.f3241z, continuation);
        return d2 == IntrinsicsKt.f() ? d2 : Unit.f40552a;
    }
}
