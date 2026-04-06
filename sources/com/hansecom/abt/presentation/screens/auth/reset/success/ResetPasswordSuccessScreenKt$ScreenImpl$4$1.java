package com.hansecom.abt.presentation.screens.auth.reset.success;

import androidx.compose.material3.SnackbarDuration;
import com.hansecom.abt.presentation.screens.auth.reset.success.ResetPasswordSuccess;
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
@DebugMetadata(c = "com.hansecom.abt.presentation.screens.auth.reset.success.ResetPasswordSuccessScreenKt$ScreenImpl$4$1", f = "ResetPasswordSuccessScreen.kt", l = {}, m = "invokeSuspend")
public final class ResetPasswordSuccessScreenKt$ScreenImpl$4$1 extends SuspendLambda implements Function2<ResetPasswordSuccess.Effect, Continuation<? super Unit>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ AbtSnackbarHostState F;
    public final /* synthetic */ String G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ResetPasswordSuccessScreenKt$ScreenImpl$4$1(AbtSnackbarHostState abtSnackbarHostState, String str, Continuation continuation) {
        super(2, continuation);
        this.F = abtSnackbarHostState;
        this.G = str;
    }

    /* renamed from: A */
    public final Object m(ResetPasswordSuccess.Effect effect, Continuation continuation) {
        return ((ResetPasswordSuccessScreenKt$ScreenImpl$4$1) s(effect, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        ResetPasswordSuccessScreenKt$ScreenImpl$4$1 resetPasswordSuccessScreenKt$ScreenImpl$4$1 = new ResetPasswordSuccessScreenKt$ScreenImpl$4$1(this.F, this.G, continuation);
        resetPasswordSuccessScreenKt$ScreenImpl$4$1.E = obj;
        return resetPasswordSuccessScreenKt$ScreenImpl$4$1;
    }

    public final Object x(Object obj) {
        IntrinsicsKt.f();
        if (this.D == 0) {
            ResultKt.b(obj);
            ResetPasswordSuccess.Effect effect = (ResetPasswordSuccess.Effect) this.E;
            if (effect instanceof ResetPasswordSuccess.Effect.Success) {
                AbtSnackbarHostState.e(this.F, this.G, SnackbarType.POSITIVE, (String) null, false, (SnackbarDuration) null, (CoroutineScope) null, 60, (Object) null);
            } else if (effect instanceof ResetPasswordSuccess.Effect.Error) {
                AbtSnackbarHostState.d(this.F, ((ResetPasswordSuccess.Effect.Error) effect).a(), (SnackbarType) null, (String) null, false, (SnackbarDuration) null, (CoroutineScope) null, 62, (Object) null);
            } else {
                throw new NoWhenBranchMatchedException();
            }
            return Unit.f40552a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
