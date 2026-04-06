package androidx.compose.material3.pulltorefresh;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata
@DebugMetadata(c = "androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$update$1", f = "PullToRefresh.kt", l = {304, 306}, m = "invokeSuspend")
public final class PullToRefreshModifierNode$update$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int D;
    public final /* synthetic */ PullToRefreshModifierNode E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PullToRefreshModifierNode$update$1(PullToRefreshModifierNode pullToRefreshModifierNode, Continuation continuation) {
        super(2, continuation);
        this.E = pullToRefreshModifierNode;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((PullToRefreshModifierNode$update$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new PullToRefreshModifierNode$update$1(this.E, continuation);
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            if (!this.E.u3()) {
                PullToRefreshModifierNode pullToRefreshModifierNode = this.E;
                this.D = 1;
                if (pullToRefreshModifierNode.k3(this) == f2) {
                    return f2;
                }
            } else {
                PullToRefreshModifierNode pullToRefreshModifierNode2 = this.E;
                this.D = 2;
                if (pullToRefreshModifierNode2.l3(this) == f2) {
                    return f2;
                }
            }
        } else if (i2 == 1 || i2 == 2) {
            ResultKt.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.f40552a;
    }
}
