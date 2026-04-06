package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

@Metadata
public final class TransformableNode$onPointerEvent$2 implements PointerInputEventHandler {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ ScrollConfig f3616A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TransformableNode f3617z;

    public TransformableNode$onPointerEvent$2(TransformableNode transformableNode, ScrollConfig scrollConfig) {
        this.f3617z = transformableNode;
        this.f3616A = scrollConfig;
    }

    public final Object invoke(PointerInputScope pointerInputScope, Continuation continuation) {
        Object d2 = TransformableKt.h(pointerInputScope, this.f3617z.U, this.f3616A, continuation);
        return d2 == IntrinsicsKt.f() ? d2 : Unit.f40552a;
    }
}
