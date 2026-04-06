package androidx.compose.foundation;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

@Metadata
public final class AbstractClickableNode$onPointerEvent$3 implements PointerInputEventHandler {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AbstractClickableNode f2875z;

    public AbstractClickableNode$onPointerEvent$3(AbstractClickableNode abstractClickableNode) {
        this.f2875z = abstractClickableNode;
    }

    public final Object invoke(PointerInputScope pointerInputScope, Continuation continuation) {
        Object n3 = this.f2875z.n3(pointerInputScope, continuation);
        return n3 == IntrinsicsKt.f() ? n3 : Unit.f40552a;
    }
}
