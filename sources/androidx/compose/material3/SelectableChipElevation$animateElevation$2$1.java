package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.material3.internal.ElevationKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.unit.Dp;
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
@DebugMetadata(c = "androidx.compose.material3.SelectableChipElevation$animateElevation$2$1", f = "Chip.kt", l = {2562, 2564}, m = "invokeSuspend")
final class SelectableChipElevation$animateElevation$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int D;
    public final /* synthetic */ Animatable E;
    public final /* synthetic */ float F;
    public final /* synthetic */ boolean G;
    public final /* synthetic */ Interaction H;
    public final /* synthetic */ MutableState I;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SelectableChipElevation$animateElevation$2$1(Animatable animatable, float f2, boolean z2, Interaction interaction, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.E = animatable;
        this.F = f2;
        this.G = z2;
        this.H = interaction;
        this.I = mutableState;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((SelectableChipElevation$animateElevation$2$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new SelectableChipElevation$animateElevation$2$1(this.E, this.F, this.G, this.H, this.I, continuation);
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            if (!Dp.o(((Dp) this.E.k()).t(), this.F)) {
                if (!this.G) {
                    Animatable animatable = this.E;
                    Dp j2 = Dp.j(this.F);
                    this.D = 1;
                    if (animatable.t(j2, this) == f2) {
                        return f2;
                    }
                } else {
                    Interaction a2 = SelectableChipElevation.c(this.I);
                    Animatable animatable2 = this.E;
                    float f3 = this.F;
                    Interaction interaction = this.H;
                    this.D = 2;
                    if (ElevationKt.d(animatable2, f3, a2, interaction, this) == f2) {
                        return f2;
                    }
                }
            }
            return Unit.f40552a;
        } else if (i2 == 1 || i2 == 2) {
            ResultKt.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        SelectableChipElevation.d(this.I, this.H);
        return Unit.f40552a;
    }
}
