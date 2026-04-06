package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;

@Metadata
@DebugMetadata(c = "androidx.compose.foundation.gestures.AnchoredDraggableNode$fling$2", f = "AnchoredDraggable.kt", l = {469}, m = "invokeSuspend")
public final class AnchoredDraggableNode$fling$2 extends SuspendLambda implements Function3<AnchoredDragScope, DraggableAnchors<T>, Continuation<? super Unit>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ AnchoredDraggableNode F;
    public final /* synthetic */ Ref.FloatRef G;
    public final /* synthetic */ float H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableNode$fling$2(AnchoredDraggableNode anchoredDraggableNode, Ref.FloatRef floatRef, float f2, Continuation continuation) {
        super(3, continuation);
        this.F = anchoredDraggableNode;
        this.G = floatRef;
        this.H = f2;
    }

    /* renamed from: A */
    public final Object d(AnchoredDragScope anchoredDragScope, DraggableAnchors draggableAnchors, Continuation continuation) {
        AnchoredDraggableNode$fling$2 anchoredDraggableNode$fling$2 = new AnchoredDraggableNode$fling$2(this.F, this.G, this.H, continuation);
        anchoredDraggableNode$fling$2.E = anchoredDragScope;
        return anchoredDraggableNode$fling$2.x(Unit.f40552a);
    }

    public final Object x(Object obj) {
        Ref.FloatRef floatRef;
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            AnchoredDraggableNode$fling$2$scrollScope$1 anchoredDraggableNode$fling$2$scrollScope$1 = new AnchoredDraggableNode$fling$2$scrollScope$1(this.F, (AnchoredDragScope) this.E);
            FlingBehavior L3 = this.F.L3();
            Ref.FloatRef floatRef2 = this.G;
            float f3 = this.H;
            this.E = floatRef2;
            this.D = 1;
            obj = L3.a(anchoredDraggableNode$fling$2$scrollScope$1, f3, this);
            if (obj == f2) {
                return f2;
            }
            floatRef = floatRef2;
        } else if (i2 == 1) {
            floatRef = (Ref.FloatRef) this.E;
            ResultKt.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        floatRef.f40905z = ((Number) obj).floatValue();
        return Unit.f40552a;
    }
}
