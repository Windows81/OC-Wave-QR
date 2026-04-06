package androidx.compose.material;

import androidx.compose.foundation.gestures.DragScope;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

@Metadata
@DebugMetadata(c = "androidx.compose.material.SwipeableState$snapInternalToOffset$2", f = "Swipeable.kt", l = {}, m = "invokeSuspend")
public final class SwipeableState$snapInternalToOffset$2 extends SuspendLambda implements Function2<DragScope, Continuation<? super Unit>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ float F;
    public final /* synthetic */ SwipeableState G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwipeableState$snapInternalToOffset$2(float f2, SwipeableState swipeableState, Continuation continuation) {
        super(2, continuation);
        this.F = f2;
        this.G = swipeableState;
    }

    /* renamed from: A */
    public final Object m(DragScope dragScope, Continuation continuation) {
        return ((SwipeableState$snapInternalToOffset$2) s(dragScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        SwipeableState$snapInternalToOffset$2 swipeableState$snapInternalToOffset$2 = new SwipeableState$snapInternalToOffset$2(this.F, this.G, continuation);
        swipeableState$snapInternalToOffset$2.E = obj;
        return swipeableState$snapInternalToOffset$2;
    }

    public final Object x(Object obj) {
        IntrinsicsKt.f();
        if (this.D == 0) {
            ResultKt.b(obj);
            ((DragScope) this.E).a(this.F - this.G.f8587g.c());
            return Unit.f40552a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
