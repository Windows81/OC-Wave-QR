package com.hansecom.abt.presentation.screens.auth.register.result.exitingAccountNeedsActivation;

import androidx.compose.material3.SnackbarDuration;
import com.hansecom.abt.R;
import com.hansecom.abt.presentation.screens.auth.register.result.exitingAccountNeedsActivation.RegisterResultExitingAccountNeedsActivation;
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
@DebugMetadata(c = "com.hansecom.abt.presentation.screens.auth.register.result.exitingAccountNeedsActivation.RegisterResultExitingAccountNeedsActivationScreenKt$ScreenImpl$4$1", f = "RegisterResultExitingAccountNeedsActivationScreen.kt", l = {}, m = "invokeSuspend")
public final class RegisterResultExitingAccountNeedsActivationScreenKt$ScreenImpl$4$1 extends SuspendLambda implements Function2<RegisterResultExitingAccountNeedsActivation.Effect, Continuation<? super Unit>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ AbtSnackbarHostState F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RegisterResultExitingAccountNeedsActivationScreenKt$ScreenImpl$4$1(AbtSnackbarHostState abtSnackbarHostState, Continuation continuation) {
        super(2, continuation);
        this.F = abtSnackbarHostState;
    }

    /* renamed from: A */
    public final Object m(RegisterResultExitingAccountNeedsActivation.Effect effect, Continuation continuation) {
        return ((RegisterResultExitingAccountNeedsActivationScreenKt$ScreenImpl$4$1) s(effect, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        RegisterResultExitingAccountNeedsActivationScreenKt$ScreenImpl$4$1 registerResultExitingAccountNeedsActivationScreenKt$ScreenImpl$4$1 = new RegisterResultExitingAccountNeedsActivationScreenKt$ScreenImpl$4$1(this.F, continuation);
        registerResultExitingAccountNeedsActivationScreenKt$ScreenImpl$4$1.E = obj;
        return registerResultExitingAccountNeedsActivationScreenKt$ScreenImpl$4$1;
    }

    public final Object x(Object obj) {
        IntrinsicsKt.f();
        if (this.D == 0) {
            ResultKt.b(obj);
            RegisterResultExitingAccountNeedsActivation.Effect effect = (RegisterResultExitingAccountNeedsActivation.Effect) this.E;
            if (effect instanceof RegisterResultExitingAccountNeedsActivation.Effect.Success) {
                AbtSnackbarHostState.d(this.F, StringValueKt.c(R.string.C8), SnackbarType.POSITIVE, (String) null, false, (SnackbarDuration) null, (CoroutineScope) null, 60, (Object) null);
            } else if (effect instanceof RegisterResultExitingAccountNeedsActivation.Effect.Error) {
                AbtSnackbarHostState.d(this.F, ((RegisterResultExitingAccountNeedsActivation.Effect.Error) effect).a(), (SnackbarType) null, (String) null, false, (SnackbarDuration) null, (CoroutineScope) null, 62, (Object) null);
            } else {
                throw new NoWhenBranchMatchedException();
            }
            return Unit.f40552a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
