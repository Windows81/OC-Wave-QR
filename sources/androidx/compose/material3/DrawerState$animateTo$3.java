package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.gestures.AnchoredDragScope;
import androidx.compose.foundation.gestures.DraggableAnchors;
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
@DebugMetadata(c = "androidx.compose.material3.DrawerState$animateTo$3", f = "NavigationDrawer.kt", l = {274}, m = "invokeSuspend")
public final class DrawerState$animateTo$3 extends SuspendLambda implements Function4<AnchoredDragScope, DraggableAnchors<DrawerValue>, DrawerValue, Continuation<? super Unit>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public /* synthetic */ Object F;
    public /* synthetic */ Object G;
    public final /* synthetic */ DrawerState H;
    public final /* synthetic */ float I;
    public final /* synthetic */ AnimationSpec J;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DrawerState$animateTo$3(DrawerState drawerState, float f2, AnimationSpec animationSpec, Continuation continuation) {
        super(4, continuation);
        this.H = drawerState;
        this.I = f2;
        this.J = animationSpec;
    }

    public static final Unit C(AnchoredDragScope anchoredDragScope, Ref.FloatRef floatRef, float f2, float f3) {
        anchoredDragScope.a(f2, f3);
        floatRef.f40905z = f2;
        return Unit.f40552a;
    }

    /* renamed from: B */
    public final Object j(AnchoredDragScope anchoredDragScope, DraggableAnchors draggableAnchors, DrawerValue drawerValue, Continuation continuation) {
        DrawerState$animateTo$3 drawerState$animateTo$3 = new DrawerState$animateTo$3(this.H, this.I, this.J, continuation);
        drawerState$animateTo$3.E = anchoredDragScope;
        drawerState$animateTo$3.F = draggableAnchors;
        drawerState$animateTo$3.G = drawerValue;
        return drawerState$animateTo$3.x(Unit.f40552a);
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            AnchoredDragScope anchoredDragScope = (AnchoredDragScope) this.E;
            float c2 = ((DraggableAnchors) this.F).c((DrawerValue) this.G);
            if (!Float.isNaN(c2)) {
                Ref.FloatRef floatRef = new Ref.FloatRef();
                float e2 = Float.isNaN(this.H.e()) ? 0.0f : this.H.e();
                floatRef.f40905z = e2;
                float f3 = this.I;
                AnimationSpec animationSpec = this.J;
                C0237s2 s2Var = new C0237s2(anchoredDragScope, floatRef);
                this.E = null;
                this.F = null;
                this.D = 1;
                if (SuspendAnimationKt.b(e2, c2, f3, animationSpec, s2Var, this) == f2) {
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
