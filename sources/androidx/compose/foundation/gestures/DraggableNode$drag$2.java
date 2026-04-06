package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.DragEvent;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

@Metadata
@DebugMetadata(c = "androidx.compose.foundation.gestures.DraggableNode$drag$2", f = "Draggable.kt", l = {300}, m = "invokeSuspend")
public final class DraggableNode$drag$2 extends SuspendLambda implements Function2<DragScope, Continuation<? super Unit>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ Function2 F;
    public final /* synthetic */ DraggableNode G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DraggableNode$drag$2(Function2 function2, DraggableNode draggableNode, Continuation continuation) {
        super(2, continuation);
        this.F = function2;
        this.G = draggableNode;
    }

    /* renamed from: A */
    public final Object m(DragScope dragScope, Continuation continuation) {
        return ((DraggableNode$drag$2) s(dragScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        DraggableNode$drag$2 draggableNode$drag$2 = new DraggableNode$drag$2(this.F, this.G, continuation);
        draggableNode$drag$2.E = obj;
        return draggableNode$drag$2;
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            final DragScope dragScope = (DragScope) this.E;
            Function2 function2 = this.F;
            final DraggableNode draggableNode = this.G;
            AnonymousClass1 r3 = new Function1<DragEvent.DragDelta, Unit>() {
                public final void b(DragEvent.DragDelta dragDelta) {
                    dragScope.a(DraggableKt.j(draggableNode.H3(dragDelta.a()), draggableNode.Z));
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    b((DragEvent.DragDelta) obj);
                    return Unit.f40552a;
                }
            };
            this.D = 1;
            if (function2.m(r3, this) == f2) {
                return f2;
            }
        } else if (i2 == 1) {
            ResultKt.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.f40552a;
    }
}
