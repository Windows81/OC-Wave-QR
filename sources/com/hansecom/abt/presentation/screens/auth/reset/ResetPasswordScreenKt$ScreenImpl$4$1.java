package com.hansecom.abt.presentation.screens.auth.reset;

import androidx.compose.material3.SnackbarDuration;
import com.hansecom.abt.presentation.screens.auth.reset.ResetPassword;
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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.presentation.screens.auth.reset.ResetPasswordScreenKt$ScreenImpl$4$1", f = "ResetPasswordScreen.kt", l = {}, m = "invokeSuspend")
public final class ResetPasswordScreenKt$ScreenImpl$4$1 extends SuspendLambda implements Function2<ResetPassword.Effect, Continuation<? super Unit>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ Function1 F;
    public final /* synthetic */ AbtSnackbarHostState G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ResetPasswordScreenKt$ScreenImpl$4$1(Function1 function1, AbtSnackbarHostState abtSnackbarHostState, Continuation continuation) {
        super(2, continuation);
        this.F = function1;
        this.G = abtSnackbarHostState;
    }

    /* renamed from: A */
    public final Object m(ResetPassword.Effect effect, Continuation continuation) {
        return ((ResetPasswordScreenKt$ScreenImpl$4$1) s(effect, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        ResetPasswordScreenKt$ScreenImpl$4$1 resetPasswordScreenKt$ScreenImpl$4$1 = new ResetPasswordScreenKt$ScreenImpl$4$1(this.F, this.G, continuation);
        resetPasswordScreenKt$ScreenImpl$4$1.E = obj;
        return resetPasswordScreenKt$ScreenImpl$4$1;
    }

    public final Object x(Object obj) {
        IntrinsicsKt.f();
        if (this.D == 0) {
            ResultKt.b(obj);
            ResetPassword.Effect effect = (ResetPassword.Effect) this.E;
            if (effect instanceof ResetPassword.Effect.Success) {
                this.F.invoke(((ResetPassword.Effect.Success) effect).a());
            } else if (effect instanceof ResetPassword.Effect.Error) {
                AbtSnackbarHostState.d(this.G, ((ResetPassword.Effect.Error) effect).a(), (SnackbarType) null, (String) null, false, (SnackbarDuration) null, (CoroutineScope) null, 62, (Object) null);
            } else {
                throw new NoWhenBranchMatchedException();
            }
            return Unit.f40552a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
