package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
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
@DebugMetadata(c = "androidx.compose.material3.IndicatorLineNode$invalidateIndicator$2", f = "TextField.kt", l = {1611}, m = "invokeSuspend")
public final class IndicatorLineNode$invalidateIndicator$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int D;
    public final /* synthetic */ IndicatorLineNode E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IndicatorLineNode$invalidateIndicator$2(IndicatorLineNode indicatorLineNode, Continuation continuation) {
        super(2, continuation);
        this.E = indicatorLineNode;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((IndicatorLineNode$invalidateIndicator$2) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new IndicatorLineNode$invalidateIndicator$2(this.E, continuation);
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            Animatable n3 = this.E.Z;
            Dp j2 = Dp.j((!this.E.U || !this.E.P) ? this.E.T : this.E.S);
            AnimationSpec a2 = this.E.P ? MotionSchemeKt.a((MotionScheme) CompositionLocalConsumerModifierNodeKt.a(this.E, MaterialTheme.f10273a.b()), MotionSchemeKeyTokens.FastSpatial) : AnimationSpecKt.j(0, 1, (Object) null);
            this.D = 1;
            if (Animatable.f(n3, j2, a2, (Object) null, (Function1) null, this, 12, (Object) null) == f2) {
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
