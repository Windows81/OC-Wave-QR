package com.hansecom.abt.presentation.screens.home.account.payment.detalis;

import androidx.compose.material3.SnackbarDuration;
import com.hansecom.abt.presentation.screens.home.account.payment.detalis.PaymentMethodDetails;
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
@DebugMetadata(c = "com.hansecom.abt.presentation.screens.home.account.payment.detalis.PaymentMethodDetailsScreenKt$ScreenImpl$2$1", f = "PaymentMethodDetailsScreen.kt", l = {}, m = "invokeSuspend")
public final class PaymentMethodDetailsScreenKt$ScreenImpl$2$1 extends SuspendLambda implements Function2<PaymentMethodDetails.Effect, Continuation<? super Unit>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ Function0 F;
    public final /* synthetic */ AbtSnackbarHostState G;
    public final /* synthetic */ Function0 H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaymentMethodDetailsScreenKt$ScreenImpl$2$1(Function0 function0, AbtSnackbarHostState abtSnackbarHostState, Function0 function02, Continuation continuation) {
        super(2, continuation);
        this.F = function0;
        this.G = abtSnackbarHostState;
        this.H = function02;
    }

    /* renamed from: A */
    public final Object m(PaymentMethodDetails.Effect effect, Continuation continuation) {
        return ((PaymentMethodDetailsScreenKt$ScreenImpl$2$1) s(effect, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        PaymentMethodDetailsScreenKt$ScreenImpl$2$1 paymentMethodDetailsScreenKt$ScreenImpl$2$1 = new PaymentMethodDetailsScreenKt$ScreenImpl$2$1(this.F, this.G, this.H, continuation);
        paymentMethodDetailsScreenKt$ScreenImpl$2$1.E = obj;
        return paymentMethodDetailsScreenKt$ScreenImpl$2$1;
    }

    public final Object x(Object obj) {
        IntrinsicsKt.f();
        if (this.D == 0) {
            ResultKt.b(obj);
            PaymentMethodDetails.Effect effect = (PaymentMethodDetails.Effect) this.E;
            if (Intrinsics.d(effect, PaymentMethodDetails.Effect.DeleteSuccess.f35768a)) {
                this.F.invoke();
            } else if (effect instanceof PaymentMethodDetails.Effect.Error) {
                AbtSnackbarHostState.d(this.G, ((PaymentMethodDetails.Effect.Error) effect).a(), (SnackbarType) null, (String) null, false, (SnackbarDuration) null, (CoroutineScope) null, 62, (Object) null);
            } else if (effect instanceof PaymentMethodDetails.Effect.InitialLoadingError) {
                AbtSnackbarHostState.d(this.G, ((PaymentMethodDetails.Effect.InitialLoadingError) effect).a(), (SnackbarType) null, (String) null, false, (SnackbarDuration) null, (CoroutineScope) null, 62, (Object) null);
                this.H.invoke();
            } else if (Intrinsics.d(effect, PaymentMethodDetails.Effect.SaveSuccess.f35771a)) {
                this.F.invoke();
            } else {
                throw new NoWhenBranchMatchedException();
            }
            return Unit.f40552a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
