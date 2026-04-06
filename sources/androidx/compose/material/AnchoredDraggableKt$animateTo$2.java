package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Ref;

@Metadata
@DebugMetadata(c = "androidx.compose.material.AnchoredDraggableKt$animateTo$2", f = "AnchoredDraggable.kt", l = {693}, m = "invokeSuspend")
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

    /* renamed from: A */
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
            final AnchoredDragScope anchoredDragScope = (AnchoredDragScope) this.E;
            float c2 = ((DraggableAnchors) this.F).c(this.G);
            if (!Float.isNaN(c2)) {
                final Ref.FloatRef floatRef = new Ref.FloatRef();
                float w2 = Float.isNaN(this.H.w()) ? 0.0f : this.H.w();
                floatRef.f40905z = w2;
                float f3 = this.I;
                AnimationSpec p2 = this.H.p();
                AnonymousClass1 r8 = new Function2<Float, Float, Unit>() {
                    public final void b(float f2, float f3) {
                        anchoredDragScope.a(f2, f3);
                        floatRef.f40905z = f2;
                    }

                    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
                        b(((Number) obj).floatValue(), ((Number) obj2).floatValue());
                        return Unit.f40552a;
                    }
                };
                this.E = null;
                this.F = null;
                this.D = 1;
                if (SuspendAnimationKt.b(w2, c2, f3, p2, r8, this) == f2) {
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
