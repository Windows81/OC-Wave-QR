package androidx.compose.material3.internal;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Ref;

@Metadata
@DebugMetadata(c = "androidx.compose.material3.internal.AnchoredDraggableKt$animateTo$2", f = "AnchoredDraggable.kt", l = {682}, m = "invokeSuspend")
public final class AnchoredDraggableKt$animateTo$2 extends SuspendLambda implements Function4<AnchoredDragScope, DraggableAnchors<Object>, Object, Continuation<? super Unit>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public /* synthetic */ Object F;
    public /* synthetic */ Object G;
    public final /* synthetic */ AnchoredDraggableState H;
    public final /* synthetic */ float I;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableKt$animateTo$2(AnchoredDraggableState anchoredDraggableState, float f2, Continuation continuation) {
        super(4, continuation);
        this.H = anchoredDraggableState;
        this.I = f2;
    }

    /* access modifiers changed from: private */
    public static final Unit C(AnchoredDragScope anchoredDragScope, Ref.FloatRef floatRef, float f2, float f3) {
        anchoredDragScope.a(f2, f3);
        floatRef.f40905z = f2;
        return Unit.f40552a;
    }

    /* renamed from: B */
    public final Object j(AnchoredDragScope anchoredDragScope, DraggableAnchors draggableAnchors, Object obj, Continuation continuation) {
        AnchoredDraggableKt$animateTo$2 anchoredDraggableKt$animateTo$2 = new AnchoredDraggableKt$animateTo$2(this.H, this.I, continuation);
        anchoredDraggableKt$animateTo$2.E = anchoredDragScope;
        anchoredDraggableKt$animateTo$2.F = draggableAnchors;
        anchoredDraggableKt$animateTo$2.G = obj;
        return anchoredDraggableKt$animateTo$2.x(Unit.f40552a);
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            AnchoredDragScope anchoredDragScope = (AnchoredDragScope) this.E;
            float c2 = ((DraggableAnchors) this.F).c(this.G);
            if (!Float.isNaN(c2)) {
                Ref.FloatRef floatRef = new Ref.FloatRef();
                float x2 = Float.isNaN(this.H.x()) ? 0.0f : this.H.x();
                floatRef.f40905z = x2;
                C0141n nVar = new C0141n(anchoredDragScope, floatRef);
                this.E = null;
                this.F = null;
                this.D = 1;
                if (SuspendAnimationKt.b(x2, c2, this.I, (AnimationSpec) this.H.q().invoke(), nVar, this) == f2) {
                    return f2;
                }
            }
        } else if (i2 == 1) {
            ResultKt.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.f40552a;
    }
}
