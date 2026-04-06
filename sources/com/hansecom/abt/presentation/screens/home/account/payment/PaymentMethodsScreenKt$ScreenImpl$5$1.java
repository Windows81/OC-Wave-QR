package com.hansecom.abt.presentation.screens.home.account.payment;

import androidx.compose.material3.SnackbarDuration;
import com.hansecom.abt.presentation.screens.home.account.payment.PaymentMethods;
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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.presentation.screens.home.account.payment.PaymentMethodsScreenKt$ScreenImpl$5$1", f = "PaymentMethodsScreen.kt", l = {}, m = "invokeSuspend")
public final class PaymentMethodsScreenKt$ScreenImpl$5$1 extends SuspendLambda implements Function2<PaymentMethods.Effect, Continuation<? super Unit>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ AbtSnackbarHostState F;
    public final /* synthetic */ Function0 G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaymentMethodsScreenKt$ScreenImpl$5$1(AbtSnackbarHostState abtSnackbarHostState, Function0 function0, Continuation continuation) {
        super(2, continuation);
        this.F = abtSnackbarHostState;
        this.G = function0;
    }

    /* renamed from: A */
    public final Object m(PaymentMethods.Effect effect, Continuation continuation) {
        return ((PaymentMethodsScreenKt$ScreenImpl$5$1) s(effect, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        PaymentMethodsScreenKt$ScreenImpl$5$1 paymentMethodsScreenKt$ScreenImpl$5$1 = new PaymentMethodsScreenKt$ScreenImpl$5$1(this.F, this.G, continuation);
        paymentMethodsScreenKt$ScreenImpl$5$1.E = obj;
        return paymentMethodsScreenKt$ScreenImpl$5$1;
    }

    public final Object x(Object obj) {
        IntrinsicsKt.f();
        if (this.D == 0) {
            ResultKt.b(obj);
            PaymentMethods.Effect effect = (PaymentMethods.Effect) this.E;
            if (effect instanceof PaymentMethods.Effect.Error) {
                AbtSnackbarHostState.d(this.F, ((PaymentMethods.Effect.Error) effect).a(), (SnackbarType) null, (String) null, false, (SnackbarDuration) null, (CoroutineScope) null, 62, (Object) null);
            } else if (Intrinsics.d(effect, PaymentMethods.Effect.InputCardDetails.f35499a)) {
                this.G.invoke();
            } else {
                throw new NoWhenBranchMatchedException();
            }
            return Unit.f40552a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
