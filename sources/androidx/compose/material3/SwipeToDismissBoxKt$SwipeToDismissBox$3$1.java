package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata
@DebugMetadata(c = "androidx.compose.material3.SwipeToDismissBoxKt$SwipeToDismissBox$3$1", f = "SwipeToDismissBox.kt", l = {}, m = "invokeSuspend")
final class SwipeToDismissBoxKt$SwipeToDismissBox$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int D;
    public final /* synthetic */ SwipeToDismissBoxState E;
    public final /* synthetic */ Function1 F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwipeToDismissBoxKt$SwipeToDismissBox$3$1(SwipeToDismissBoxState swipeToDismissBoxState, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.E = swipeToDismissBoxState;
        this.F = function1;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((SwipeToDismissBoxKt$SwipeToDismissBox$3$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new SwipeToDismissBoxKt$SwipeToDismissBox$3$1(this.E, this.F, continuation);
    }

    public final Object x(Object obj) {
        IntrinsicsKt.f();
        if (this.D == 0) {
            ResultKt.b(obj);
            if (this.E.c() != SwipeToDismissBoxValue.Settled) {
                this.F.invoke(this.E.a());
            }
            return Unit.f40552a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
