package com.hansecom.abt.presentation.screens.home.account.information;

import androidx.compose.material3.SnackbarDuration;
import com.hansecom.abt.R;
import com.hansecom.abt.presentation.screens.home.account.information.AccountInformation;
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
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.presentation.screens.home.account.information.AccountInformationScreenKt$ScreenImpl$4$1", f = "AccountInformationScreen.kt", l = {}, m = "invokeSuspend")
public final class AccountInformationScreenKt$ScreenImpl$4$1 extends SuspendLambda implements Function2<AccountInformation.Effect, Continuation<? super Unit>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ AbtSnackbarHostState F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccountInformationScreenKt$ScreenImpl$4$1(AbtSnackbarHostState abtSnackbarHostState, Continuation continuation) {
        super(2, continuation);
        this.F = abtSnackbarHostState;
    }

    /* renamed from: A */
    public final Object m(AccountInformation.Effect effect, Continuation continuation) {
        return ((AccountInformationScreenKt$ScreenImpl$4$1) s(effect, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        AccountInformationScreenKt$ScreenImpl$4$1 accountInformationScreenKt$ScreenImpl$4$1 = new AccountInformationScreenKt$ScreenImpl$4$1(this.F, continuation);
        accountInformationScreenKt$ScreenImpl$4$1.E = obj;
        return accountInformationScreenKt$ScreenImpl$4$1;
    }

    public final Object x(Object obj) {
        IntrinsicsKt.f();
        if (this.D == 0) {
            ResultKt.b(obj);
            AccountInformation.Effect effect = (AccountInformation.Effect) this.E;
            if (effect instanceof AccountInformation.Effect.Failure) {
                AbtSnackbarHostState.d(this.F, ((AccountInformation.Effect.Failure) effect).a(), (SnackbarType) null, (String) null, false, (SnackbarDuration) null, (CoroutineScope) null, 62, (Object) null);
            } else if (effect instanceof AccountInformation.Effect.Success) {
                AbtSnackbarHostState.d(this.F, StringValueKt.c(R.string.f33060m), SnackbarType.POSITIVE, (String) null, false, (SnackbarDuration) null, (CoroutineScope) null, 60, (Object) null);
            } else {
                throw new NoWhenBranchMatchedException();
            }
            return Unit.f40552a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
