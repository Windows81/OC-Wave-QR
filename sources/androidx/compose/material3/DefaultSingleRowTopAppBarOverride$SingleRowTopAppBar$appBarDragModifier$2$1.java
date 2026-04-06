package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpec;
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
@DebugMetadata(c = "androidx.compose.material3.DefaultSingleRowTopAppBarOverride$SingleRowTopAppBar$appBarDragModifier$2$1", f = "AppBar.kt", l = {2555}, m = "invokeSuspend")
public final class DefaultSingleRowTopAppBarOverride$SingleRowTopAppBar$appBarDragModifier$2$1 extends SuspendLambda implements Function3<CoroutineScope, Float, Continuation<? super Unit>, Object> {
    public int D;
    public /* synthetic */ float E;
    public final /* synthetic */ SingleRowTopAppBarOverrideScope F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DefaultSingleRowTopAppBarOverride$SingleRowTopAppBar$appBarDragModifier$2$1(SingleRowTopAppBarOverrideScope singleRowTopAppBarOverrideScope, Continuation continuation) {
        super(3, continuation);
        this.F = singleRowTopAppBarOverrideScope;
    }

    public final Object A(CoroutineScope coroutineScope, float f2, Continuation continuation) {
        DefaultSingleRowTopAppBarOverride$SingleRowTopAppBar$appBarDragModifier$2$1 defaultSingleRowTopAppBarOverride$SingleRowTopAppBar$appBarDragModifier$2$1 = new DefaultSingleRowTopAppBarOverride$SingleRowTopAppBar$appBarDragModifier$2$1(this.F, continuation);
        defaultSingleRowTopAppBarOverride$SingleRowTopAppBar$appBarDragModifier$2$1.E = f2;
        return defaultSingleRowTopAppBarOverride$SingleRowTopAppBar$appBarDragModifier$2$1.x(Unit.f40552a);
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
            TopAppBarState c2 = this.F.f().c();
            DecayAnimationSpec a2 = this.F.f().a();
            AnimationSpec b2 = this.F.f().b();
            this.D = 1;
            if (AppBarKt.P(c2, f3, a2, b2, this) == f2) {
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
