package androidx.compose.material;

import androidx.compose.animation.core.Animatable;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;

@Metadata
@DebugMetadata(c = "androidx.compose.material.DefaultButtonElevation$elevation$2$1", f = "Button.kt", l = {554, 563}, m = "invokeSuspend")
public final class DefaultButtonElevation$elevation$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int D;
    public final /* synthetic */ Animatable E;
    public final /* synthetic */ float F;
    public final /* synthetic */ boolean G;
    public final /* synthetic */ DefaultButtonElevation H;
    public final /* synthetic */ Interaction I;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DefaultButtonElevation$elevation$2$1(Animatable animatable, float f2, boolean z2, DefaultButtonElevation defaultButtonElevation, Interaction interaction, Continuation continuation) {
        super(2, continuation);
        this.E = animatable;
        this.F = f2;
        this.G = z2;
        this.H = defaultButtonElevation;
        this.I = interaction;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((DefaultButtonElevation$elevation$2$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new DefaultButtonElevation$elevation$2$1(this.E, this.F, this.G, this.H, this.I, continuation);
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
                    float t2 = ((Dp) this.E.k()).t();
                    Interaction interaction = null;
                    if (Dp.o(t2, this.H.f7571b)) {
                        interaction = new PressInteraction.Press(Offset.f15855b.c(), (DefaultConstructorMarker) null);
                    } else if (Dp.o(t2, this.H.f7573d)) {
                        interaction = new HoverInteraction.Enter();
                    } else if (Dp.o(t2, this.H.f7574e)) {
                        interaction = new FocusInteraction.Focus();
                    }
                    Animatable animatable2 = this.E;
                    float f3 = this.F;
                    Interaction interaction2 = this.I;
                    this.D = 2;
                    if (ElevationKt.d(animatable2, f3, interaction, interaction2, this) == f2) {
                        return f2;
                    }
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
