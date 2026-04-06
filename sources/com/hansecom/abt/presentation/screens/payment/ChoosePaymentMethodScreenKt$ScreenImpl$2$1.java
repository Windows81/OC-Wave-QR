package com.hansecom.abt.presentation.screens.payment;

import androidx.compose.material3.SnackbarDuration;
import com.hansecom.abt.presentation.screens.payment.ChoosePaymentMethod;
import com.hansecom.abt.ui.components.snackbar.AbtSnackbarHostState;
import com.hansecom.abt.ui.components.snackbar.SnackbarType;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.presentation.screens.payment.ChoosePaymentMethodScreenKt$ScreenImpl$2$1", f = "ChoosePaymentMethodScreen.kt", l = {}, m = "invokeSuspend")
public final class ChoosePaymentMethodScreenKt$ScreenImpl$2$1 extends SuspendLambda implements Function2<ChoosePaymentMethod.Effect, Continuation<? super Unit>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ AbtSnackbarHostState F;
    public final /* synthetic */ Function0 G;
    public final /* synthetic */ Function1 H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChoosePaymentMethodScreenKt$ScreenImpl$2$1(AbtSnackbarHostState abtSnackbarHostState, Function0 function0, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.F = abtSnackbarHostState;
        this.G = function0;
        this.H = function1;
    }

    /* renamed from: A */
    public final Object m(ChoosePaymentMethod.Effect effect, Continuation continuation) {
        return ((ChoosePaymentMethodScreenKt$ScreenImpl$2$1) s(effect, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        ChoosePaymentMethodScreenKt$ScreenImpl$2$1 choosePaymentMethodScreenKt$ScreenImpl$2$1 = new ChoosePaymentMethodScreenKt$ScreenImpl$2$1(this.F, this.G, this.H, continuation);
        choosePaymentMethodScreenKt$ScreenImpl$2$1.E = obj;
        return choosePaymentMethodScreenKt$ScreenImpl$2$1;
    }

    public final Object x(Object obj) {
        IntrinsicsKt.f();
        if (this.D == 0) {
            ResultKt.b(obj);
            ChoosePaymentMethod.Effect effect = (ChoosePaymentMethod.Effect) this.E;
            if (effect instanceof ChoosePaymentMethod.Effect.Error) {
                AbtSnackbarHostState.d(this.F, ((ChoosePaymentMethod.Effect.Error) effect).a(), (SnackbarType) null, (String) null, false, (SnackbarDuration) null, (CoroutineScope) null, 62, (Object) null);
            } else if (Intrinsics.d(effect, ChoosePaymentMethod.Effect.InputCardDetails.f37741a)) {
                this.G.invoke();
            } else if (effect instanceof ChoosePaymentMethod.Effect.C0010ChoosePaymentMethod) {
                this.H.invoke(((ChoosePaymentMethod.Effect.C0010ChoosePaymentMethod) effect).a());
            } else {
                throw new NoWhenBranchMatchedException();
            }
            return Unit.f40552a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
