package com.hansecom.abt.presentation.screens.auth.login;

import androidx.compose.material3.SnackbarDuration;
import com.hansecom.abt.presentation.screens.auth.login.Login;
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
import kotlinx.coroutines.CoroutineScope;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.presentation.screens.auth.login.LoginScreenKt$ScreenImpl$10$1", f = "LoginScreen.kt", l = {}, m = "invokeSuspend")
public final class LoginScreenKt$ScreenImpl$10$1 extends SuspendLambda implements Function2<Login.Effect, Continuation<? super Unit>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ AbtSnackbarHostState F;
    public final /* synthetic */ Function0 G;
    public final /* synthetic */ Function1 H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LoginScreenKt$ScreenImpl$10$1(AbtSnackbarHostState abtSnackbarHostState, Function0 function0, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.F = abtSnackbarHostState;
        this.G = function0;
        this.H = function1;
    }

    /* renamed from: A */
    public final Object m(Login.Effect effect, Continuation continuation) {
        return ((LoginScreenKt$ScreenImpl$10$1) s(effect, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        LoginScreenKt$ScreenImpl$10$1 loginScreenKt$ScreenImpl$10$1 = new LoginScreenKt$ScreenImpl$10$1(this.F, this.G, this.H, continuation);
        loginScreenKt$ScreenImpl$10$1.E = obj;
        return loginScreenKt$ScreenImpl$10$1;
    }

    public final Object x(Object obj) {
        IntrinsicsKt.f();
        if (this.D == 0) {
            ResultKt.b(obj);
            Login.Effect effect = (Login.Effect) this.E;
            if (effect instanceof Login.Effect.LoginFail) {
                AbtSnackbarHostState.d(this.F, ((Login.Effect.LoginFail) effect).a(), (SnackbarType) null, (String) null, false, (SnackbarDuration) null, (CoroutineScope) null, 62, (Object) null);
            } else if (effect instanceof Login.Effect.LoginSuccess) {
                this.G.invoke();
            } else if (effect instanceof Login.Effect.AccountInactive) {
                this.H.invoke(((Login.Effect.AccountInactive) effect).a());
            } else {
                throw new NoWhenBranchMatchedException();
            }
            return Unit.f40552a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
