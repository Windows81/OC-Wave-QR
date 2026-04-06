package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.material3.internal.AnchoredDragScope;
import androidx.compose.material3.internal.DraggableAnchors;
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
@DebugMetadata(c = "androidx.compose.material3.ModalWideNavigationRailState$animateTo$2", f = "WideNavigationRailState.kt", l = {240}, m = "invokeSuspend")
public final class ModalWideNavigationRailState$animateTo$2 extends SuspendLambda implements Function4<AnchoredDragScope, DraggableAnchors<WideNavigationRailValue>, WideNavigationRailValue, Continuation<? super Unit>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public /* synthetic */ Object F;
    public /* synthetic */ Object G;
    public final /* synthetic */ ModalWideNavigationRailState H;
    public final /* synthetic */ float I;
    public final /* synthetic */ AnimationSpec J;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ModalWideNavigationRailState$animateTo$2(ModalWideNavigationRailState modalWideNavigationRailState, float f2, AnimationSpec animationSpec, Continuation continuation) {
        super(4, continuation);
        this.H = modalWideNavigationRailState;
        this.I = f2;
        this.J = animationSpec;
    }

    public static final Unit C(AnchoredDragScope anchoredDragScope, Ref.FloatRef floatRef, float f2, float f3) {
        anchoredDragScope.a(f2, f3);
        floatRef.f40905z = f2;
        return Unit.f40552a;
    }

    /* renamed from: B */
    public final Object j(AnchoredDragScope anchoredDragScope, DraggableAnchors draggableAnchors, WideNavigationRailValue wideNavigationRailValue, Continuation continuation) {
        ModalWideNavigationRailState$animateTo$2 modalWideNavigationRailState$animateTo$2 = new ModalWideNavigationRailState$animateTo$2(this.H, this.I, this.J, continuation);
        modalWideNavigationRailState$animateTo$2.E = anchoredDragScope;
        modalWideNavigationRailState$animateTo$2.F = draggableAnchors;
        modalWideNavigationRailState$animateTo$2.G = wideNavigationRailValue;
        return modalWideNavigationRailState$animateTo$2.x(Unit.f40552a);
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            AnchoredDragScope anchoredDragScope = (AnchoredDragScope) this.E;
            float c2 = ((DraggableAnchors) this.F).c((WideNavigationRailValue) this.G);
            if (!Float.isNaN(c2)) {
                Ref.FloatRef floatRef = new Ref.FloatRef();
                float f3 = Float.isNaN(this.H.f()) ? 0.0f : this.H.f();
                floatRef.f40905z = f3;
                float f4 = this.I;
                AnimationSpec animationSpec = this.J;
                C0067c4 c4Var = new C0067c4(anchoredDragScope, floatRef);
                this.E = null;
                this.F = null;
                this.D = 1;
                if (SuspendAnimationKt.b(f3, c2, f4, animationSpec, c4Var, this) == f2) {
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
