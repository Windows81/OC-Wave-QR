package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationSpec;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function4;

@Metadata
@DebugMetadata(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$animateTo$4", f = "AnchoredDraggable.kt", l = {1344}, m = "invokeSuspend")
final class AnchoredDraggableKt$animateTo$4 extends SuspendLambda implements Function4<AnchoredDragScope, DraggableAnchors<Object>, Object, Continuation<? super Unit>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public /* synthetic */ Object F;
    public /* synthetic */ Object G;
    public final /* synthetic */ AnchoredDraggableState H;
    public final /* synthetic */ AnimationSpec I;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableKt$animateTo$4(AnchoredDraggableState anchoredDraggableState, AnimationSpec animationSpec, Continuation continuation) {
        super(4, continuation);
        this.H = anchoredDraggableState;
        this.I = animationSpec;
    }

    /* renamed from: A */
    public final Object j(AnchoredDragScope anchoredDragScope, DraggableAnchors draggableAnchors, Object obj, Continuation continuation) {
        AnchoredDraggableKt$animateTo$4 anchoredDraggableKt$animateTo$4 = new AnchoredDraggableKt$animateTo$4(this.H, this.I, continuation);
        anchoredDraggableKt$animateTo$4.E = anchoredDragScope;
        anchoredDraggableKt$animateTo$4.F = draggableAnchors;
        anchoredDraggableKt$animateTo$4.G = obj;
        return anchoredDraggableKt$animateTo$4.x(Unit.f40552a);
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            Object obj2 = this.G;
            AnchoredDraggableState anchoredDraggableState = this.H;
            float q2 = anchoredDraggableState.q();
            AnimationSpec animationSpec = this.I;
            this.E = null;
            this.F = null;
            this.D = 1;
            if (AnchoredDraggableKt.l(anchoredDraggableState, q2, (AnchoredDragScope) this.E, (DraggableAnchors) this.F, obj2, animationSpec, this) == f2) {
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
