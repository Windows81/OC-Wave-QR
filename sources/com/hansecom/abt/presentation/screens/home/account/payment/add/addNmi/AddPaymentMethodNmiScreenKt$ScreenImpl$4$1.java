package com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi;

import androidx.compose.material3.SnackbarDuration;
import com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmi;
import com.hansecom.abt.ui.components.snackbar.AbtSnackbarHostState;
import com.hansecom.abt.ui.components.snackbar.SnackbarType;
import kotlin.Metadata;
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
@DebugMetadata(c = "com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmiScreenKt$ScreenImpl$4$1", f = "AddPaymentMethodNmiScreen.kt", l = {}, m = "invokeSuspend")
public final class AddPaymentMethodNmiScreenKt$ScreenImpl$4$1 extends SuspendLambda implements Function2<AddPaymentMethodNmi.Effect, Continuation<? super Unit>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ AbtSnackbarHostState F;
    public final /* synthetic */ Function0 G;
    public final /* synthetic */ Function0 H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddPaymentMethodNmiScreenKt$ScreenImpl$4$1(AbtSnackbarHostState abtSnackbarHostState, Function0 function0, Function0 function02, Continuation continuation) {
        super(2, continuation);
        this.F = abtSnackbarHostState;
        this.G = function0;
        this.H = function02;
    }

    /* renamed from: A */
    public final Object m(AddPaymentMethodNmi.Effect effect, Continuation continuation) {
        return ((AddPaymentMethodNmiScreenKt$ScreenImpl$4$1) s(effect, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        AddPaymentMethodNmiScreenKt$ScreenImpl$4$1 addPaymentMethodNmiScreenKt$ScreenImpl$4$1 = new AddPaymentMethodNmiScreenKt$ScreenImpl$4$1(this.F, this.G, this.H, continuation);
        addPaymentMethodNmiScreenKt$ScreenImpl$4$1.E = obj;
        return addPaymentMethodNmiScreenKt$ScreenImpl$4$1;
    }

    public final Object x(Object obj) {
        IntrinsicsKt.f();
        if (this.D == 0) {
            ResultKt.b(obj);
            AddPaymentMethodNmi.Effect effect = (AddPaymentMethodNmi.Effect) this.E;
            if (effect instanceof AddPaymentMethodNmi.Effect.Error) {
                AbtSnackbarHostState.d(this.F, ((AddPaymentMethodNmi.Effect.Error) effect).a(), (SnackbarType) null, (String) null, false, (SnackbarDuration) null, (CoroutineScope) null, 62, (Object) null);
            } else if (Intrinsics.d(effect, AddPaymentMethodNmi.Effect.Success.f35612a)) {
                this.G.invoke();
            } else if (effect instanceof AddPaymentMethodNmi.Effect.InitialLoadingError) {
                AbtSnackbarHostState.d(this.F, ((AddPaymentMethodNmi.Effect.InitialLoadingError) effect).a(), (SnackbarType) null, (String) null, false, (SnackbarDuration) null, (CoroutineScope) null, 62, (Object) null);
                this.H.invoke();
            }
            return Unit.f40552a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
