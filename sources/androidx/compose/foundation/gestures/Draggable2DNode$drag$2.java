package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.ui.geometry.Offset;
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
@DebugMetadata(c = "androidx.compose.foundation.gestures.Draggable2DNode$drag$2", f = "Draggable2D.kt", l = {257}, m = "invokeSuspend")
public final class Draggable2DNode$drag$2 extends SuspendLambda implements Function2<Drag2DScope, Continuation<? super Unit>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ Function2 F;
    public final /* synthetic */ Draggable2DNode G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Draggable2DNode$drag$2(Function2 function2, Draggable2DNode draggable2DNode, Continuation continuation) {
        super(2, continuation);
        this.F = function2;
        this.G = draggable2DNode;
    }

    /* renamed from: A */
    public final Object m(Drag2DScope drag2DScope, Continuation continuation) {
        return ((Draggable2DNode$drag$2) s(drag2DScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        Draggable2DNode$drag$2 draggable2DNode$drag$2 = new Draggable2DNode$drag$2(this.F, this.G, continuation);
        draggable2DNode$drag$2.E = obj;
        return draggable2DNode$drag$2;
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            final Drag2DScope drag2DScope = (Drag2DScope) this.E;
            Function2 function2 = this.F;
            final Draggable2DNode draggable2DNode = this.G;
            AnonymousClass1 r3 = new Function1<DragEvent.DragDelta, Unit>() {
                public final void b(DragEvent.DragDelta dragDelta) {
                    Drag2DScope drag2DScope = drag2DScope;
                    Draggable2DNode draggable2DNode = draggable2DNode;
                    long a2 = dragDelta.a();
                    if (draggable2DNode.a0) {
                        a2 = Offset.e(a2 ^ -9223372034707292160L);
                    }
                    drag2DScope.a(a2);
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
