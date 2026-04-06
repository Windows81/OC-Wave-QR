package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;

@Metadata
@DebugMetadata(c = "androidx.compose.material3.EnterAlwaysSearchBarScrollBehavior$searchBarScrollBehavior$2", f = "SearchBar.kt", l = {904}, m = "invokeSuspend")
final class EnterAlwaysSearchBarScrollBehavior$searchBarScrollBehavior$2 extends SuspendLambda implements Function3<CoroutineScope, Float, Continuation<? super Unit>, Object> {
    public int D;
    public /* synthetic */ float E;
    public final /* synthetic */ EnterAlwaysSearchBarScrollBehavior F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EnterAlwaysSearchBarScrollBehavior$searchBarScrollBehavior$2(EnterAlwaysSearchBarScrollBehavior enterAlwaysSearchBarScrollBehavior, Continuation continuation) {
        super(3, continuation);
        this.F = enterAlwaysSearchBarScrollBehavior;
    }

    public final Object A(CoroutineScope coroutineScope, float f2, Continuation continuation) {
        EnterAlwaysSearchBarScrollBehavior$searchBarScrollBehavior$2 enterAlwaysSearchBarScrollBehavior$searchBarScrollBehavior$2 = new EnterAlwaysSearchBarScrollBehavior$searchBarScrollBehavior$2(this.F, continuation);
        enterAlwaysSearchBarScrollBehavior$searchBarScrollBehavior$2.E = f2;
        return enterAlwaysSearchBarScrollBehavior$searchBarScrollBehavior$2.x(Unit.f40552a);
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        return A((CoroutineScope) obj, ((Number) obj2).floatValue(), (Continuation) obj3);
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            float f3 = this.E;
            EnterAlwaysSearchBarScrollBehavior enterAlwaysSearchBarScrollBehavior = this.F;
            this.D = 1;
            if (enterAlwaysSearchBarScrollBehavior.i(f3, this) == f2) {
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
