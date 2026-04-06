package com.hansecom.abt.presentation.screens.home.account;

import androidx.compose.material3.SnackbarDuration;
import com.hansecom.abt.R;
import com.hansecom.abt.presentation.screens.home.account.Account;
import com.hansecom.abt.ui.components.snackbar.AbtSnackbarHostState;
import com.hansecom.abt.ui.components.snackbar.SnackbarType;
import com.hansecom.abt.util.resourcesResolvers.StringValueKt;
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
@DebugMetadata(c = "com.hansecom.abt.presentation.screens.home.account.AccountScreenKt$ScreenImpl$2$1", f = "AccountScreen.kt", l = {}, m = "invokeSuspend")
public final class AccountScreenKt$ScreenImpl$2$1 extends SuspendLambda implements Function2<Account.Effect, Continuation<? super Unit>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ Function0 F;
    public final /* synthetic */ Function0 G;
    public final /* synthetic */ Function0 H;
    public final /* synthetic */ Function0 I;
    public final /* synthetic */ Function0 J;
    public final /* synthetic */ Function0 K;
    public final /* synthetic */ Function0 L;
    public final /* synthetic */ AbtSnackbarHostState M;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccountScreenKt$ScreenImpl$2$1(Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05, Function0 function06, Function0 function07, AbtSnackbarHostState abtSnackbarHostState, Continuation continuation) {
        super(2, continuation);
        this.F = function0;
        this.G = function02;
        this.H = function03;
        this.I = function04;
        this.J = function05;
        this.K = function06;
        this.L = function07;
        this.M = abtSnackbarHostState;
    }

    /* renamed from: A */
    public final Object m(Account.Effect effect, Continuation continuation) {
        return ((AccountScreenKt$ScreenImpl$2$1) s(effect, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        AccountScreenKt$ScreenImpl$2$1 accountScreenKt$ScreenImpl$2$1 = new AccountScreenKt$ScreenImpl$2$1(this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, continuation);
        accountScreenKt$ScreenImpl$2$1.E = obj;
        return accountScreenKt$ScreenImpl$2$1;
    }

    public final Object x(Object obj) {
        IntrinsicsKt.f();
        if (this.D == 0) {
            ResultKt.b(obj);
            Account.Effect effect = (Account.Effect) this.E;
            if (Intrinsics.d(effect, Account.Effect.ErrorLoadingConfig.f35022a)) {
                this.F.invoke();
            } else if (Intrinsics.d(effect, Account.Effect.OpenAccountInformation.f35023a)) {
                this.G.invoke();
            } else if (Intrinsics.d(effect, Account.Effect.OpenPaymentMethods.f35028a)) {
                this.H.invoke();
            } else if (Intrinsics.d(effect, Account.Effect.OpenChangeSecurityQuestion.f35027a)) {
                this.I.invoke();
            } else if (Intrinsics.d(effect, Account.Effect.OpenChangePassword.f35025a)) {
                this.J.invoke();
            } else if (Intrinsics.d(effect, Account.Effect.OpenChangePin.f35026a)) {
                this.K.invoke();
            } else if (Intrinsics.d(effect, Account.Effect.OpenChangeAddress.f35024a)) {
                this.L.invoke();
            } else if (!(effect instanceof Account.Effect.SuccessClosingAccount)) {
                throw new NoWhenBranchMatchedException();
            } else if (((Account.Effect.SuccessClosingAccount) effect).a()) {
                AbtSnackbarHostState.d(this.M, StringValueKt.c(R.string.f33069v), SnackbarType.INFO, (String) null, false, (SnackbarDuration) null, (CoroutineScope) null, 60, (Object) null);
            } else {
                AbtSnackbarHostState.d(this.M, StringValueKt.c(R.string.f33068u), SnackbarType.POSITIVE, (String) null, false, (SnackbarDuration) null, (CoroutineScope) null, 60, (Object) null);
            }
            return Unit.f40552a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
