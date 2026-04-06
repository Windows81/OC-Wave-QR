package androidx.compose.material3.internal;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.material3.TooltipState;
import androidx.compose.ui.focus.FocusState;
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
@DebugMetadata(c = "androidx.compose.material3.internal.BasicTooltipKt$keyboardBehavior$1$1", f = "BasicTooltip.kt", l = {301}, m = "invokeSuspend")
public final class BasicTooltipKt$keyboardBehavior$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int D;
    public final /* synthetic */ FocusState E;
    public final /* synthetic */ TooltipState F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BasicTooltipKt$keyboardBehavior$1$1(FocusState focusState, TooltipState tooltipState, Continuation continuation) {
        super(2, continuation);
        this.E = focusState;
        this.F = tooltipState;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((BasicTooltipKt$keyboardBehavior$1$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new BasicTooltipKt$keyboardBehavior$1$1(this.E, this.F, continuation);
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            if (this.E.f()) {
                TooltipState tooltipState = this.F;
                MutatePriority mutatePriority = MutatePriority.PreventUserInput;
                this.D = 1;
                if (tooltipState.a(mutatePriority, this) == f2) {
                    return f2;
                }
            }
        } else if (i2 == 1) {
            ResultKt.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (this.F.isVisible() && !this.E.f()) {
            this.F.dismiss();
        }
        return Unit.f40552a;
    }
}
