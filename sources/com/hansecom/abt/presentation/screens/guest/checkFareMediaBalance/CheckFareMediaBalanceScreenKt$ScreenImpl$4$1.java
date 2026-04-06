package com.hansecom.abt.presentation.screens.guest.checkFareMediaBalance;

import androidx.compose.material3.SnackbarDuration;
import com.hansecom.abt.presentation.screens.guest.checkFareMediaBalance.CheckFareMediaBalance;
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
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.presentation.screens.guest.checkFareMediaBalance.CheckFareMediaBalanceScreenKt$ScreenImpl$4$1", f = "CheckFareMediaBalanceScreen.kt", l = {}, m = "invokeSuspend")
public final class CheckFareMediaBalanceScreenKt$ScreenImpl$4$1 extends SuspendLambda implements Function2<CheckFareMediaBalance.Effect, Continuation<? super Unit>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ AbtSnackbarHostState F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckFareMediaBalanceScreenKt$ScreenImpl$4$1(AbtSnackbarHostState abtSnackbarHostState, Continuation continuation) {
        super(2, continuation);
        this.F = abtSnackbarHostState;
    }

    /* renamed from: A */
    public final Object m(CheckFareMediaBalance.Effect effect, Continuation continuation) {
        return ((CheckFareMediaBalanceScreenKt$ScreenImpl$4$1) s(effect, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        CheckFareMediaBalanceScreenKt$ScreenImpl$4$1 checkFareMediaBalanceScreenKt$ScreenImpl$4$1 = new CheckFareMediaBalanceScreenKt$ScreenImpl$4$1(this.F, continuation);
        checkFareMediaBalanceScreenKt$ScreenImpl$4$1.E = obj;
        return checkFareMediaBalanceScreenKt$ScreenImpl$4$1;
    }

    public final Object x(Object obj) {
        IntrinsicsKt.f();
        if (this.D == 0) {
            ResultKt.b(obj);
            CheckFareMediaBalance.Effect effect = (CheckFareMediaBalance.Effect) this.E;
            if (effect instanceof CheckFareMediaBalance.Effect.Error) {
                AbtSnackbarHostState.d(this.F, ((CheckFareMediaBalance.Effect.Error) effect).a(), (SnackbarType) null, (String) null, false, (SnackbarDuration) null, (CoroutineScope) null, 62, (Object) null);
                return Unit.f40552a;
            }
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
