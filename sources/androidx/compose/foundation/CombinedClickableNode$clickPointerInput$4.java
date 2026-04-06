package androidx.compose.foundation;

import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

@Metadata
@DebugMetadata(c = "androidx.compose.foundation.CombinedClickableNode$clickPointerInput$4", f = "Clickable.kt", l = {770}, m = "invokeSuspend")
public final class CombinedClickableNode$clickPointerInput$4 extends SuspendLambda implements Function3<PressGestureScope, Offset, Continuation<? super Unit>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public /* synthetic */ long F;
    public final /* synthetic */ CombinedClickableNode G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CombinedClickableNode$clickPointerInput$4(CombinedClickableNode combinedClickableNode, Continuation continuation) {
        super(3, continuation);
        this.G = combinedClickableNode;
    }

    public final Object A(PressGestureScope pressGestureScope, long j2, Continuation continuation) {
        CombinedClickableNode$clickPointerInput$4 combinedClickableNode$clickPointerInput$4 = new CombinedClickableNode$clickPointerInput$4(this.G, continuation);
        combinedClickableNode$clickPointerInput$4.E = pressGestureScope;
        combinedClickableNode$clickPointerInput$4.F = j2;
        return combinedClickableNode$clickPointerInput$4.x(Unit.f40552a);
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        return A((PressGestureScope) obj, ((Offset) obj2).t(), (Continuation) obj3);
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            PressGestureScope pressGestureScope = (PressGestureScope) this.E;
            long j2 = this.F;
            if (this.G.s3()) {
                CombinedClickableNode combinedClickableNode = this.G;
                this.D = 1;
                if (combinedClickableNode.u3(pressGestureScope, j2, this) == f2) {
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
