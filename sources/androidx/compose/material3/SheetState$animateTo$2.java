package androidx.compose.material3;

import androidx.compose.animation.core.FiniteAnimationSpec;
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
@DebugMetadata(c = "androidx.compose.material3.SheetState$animateTo$2", f = "SheetDefaults.kt", l = {245}, m = "invokeSuspend")
public final class SheetState$animateTo$2 extends SuspendLambda implements Function4<AnchoredDragScope, DraggableAnchors<SheetValue>, SheetValue, Continuation<? super Unit>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public /* synthetic */ Object F;
    public /* synthetic */ Object G;
    public final /* synthetic */ SheetState H;
    public final /* synthetic */ float I;
    public final /* synthetic */ FiniteAnimationSpec J;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SheetState$animateTo$2(SheetState sheetState, float f2, FiniteAnimationSpec finiteAnimationSpec, Continuation continuation) {
        super(4, continuation);
        this.H = sheetState;
        this.I = f2;
        this.J = finiteAnimationSpec;
    }

    /* access modifiers changed from: private */
    public static final Unit C(AnchoredDragScope anchoredDragScope, Ref.FloatRef floatRef, float f2, float f3) {
        anchoredDragScope.a(f2, f3);
        floatRef.f40905z = f2;
        return Unit.f40552a;
    }

    /* renamed from: B */
    public final Object j(AnchoredDragScope anchoredDragScope, DraggableAnchors draggableAnchors, SheetValue sheetValue, Continuation continuation) {
        SheetState$animateTo$2 sheetState$animateTo$2 = new SheetState$animateTo$2(this.H, this.I, this.J, continuation);
        sheetState$animateTo$2.E = anchoredDragScope;
        sheetState$animateTo$2.F = draggableAnchors;
        sheetState$animateTo$2.G = sheetValue;
        return sheetState$animateTo$2.x(Unit.f40552a);
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            AnchoredDragScope anchoredDragScope = (AnchoredDragScope) this.E;
            float c2 = ((DraggableAnchors) this.F).c((SheetValue) this.G);
            if (!Float.isNaN(c2)) {
                Ref.FloatRef floatRef = new Ref.FloatRef();
                float n2 = Float.isNaN(this.H.n()) ? 0.0f : this.H.n();
                floatRef.f40905z = n2;
                float f3 = this.I;
                FiniteAnimationSpec finiteAnimationSpec = this.J;
                Y5 y5 = new Y5(anchoredDragScope, floatRef);
                this.E = null;
                this.F = null;
                this.D = 1;
                if (SuspendAnimationKt.b(n2, c2, f3, finiteAnimationSpec, y5, this) == f2) {
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
