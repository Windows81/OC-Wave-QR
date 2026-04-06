package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.ui.unit.Dp;
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
@DebugMetadata(c = "androidx.compose.material3.TabIndicatorOffsetNode$measure$3", f = "TabRow.kt", l = {731}, m = "invokeSuspend")
public final class TabIndicatorOffsetNode$measure$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int D;
    public final /* synthetic */ Animatable E;
    public final /* synthetic */ float F;
    public final /* synthetic */ TabIndicatorOffsetNode G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TabIndicatorOffsetNode$measure$3(Animatable animatable, float f2, TabIndicatorOffsetNode tabIndicatorOffsetNode, Continuation continuation) {
        super(2, continuation);
        this.E = animatable;
        this.F = f2;
        this.G = tabIndicatorOffsetNode;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((TabIndicatorOffsetNode$measure$3) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new TabIndicatorOffsetNode$measure$3(this.E, this.F, this.G, continuation);
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            Animatable animatable = this.E;
            Dp j2 = Dp.j(this.F);
            FiniteAnimationSpec b3 = this.G.b3();
            this.D = 1;
            if (Animatable.f(animatable, j2, b3, (Object) null, (Function1) null, this, 12, (Object) null) == f2) {
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
