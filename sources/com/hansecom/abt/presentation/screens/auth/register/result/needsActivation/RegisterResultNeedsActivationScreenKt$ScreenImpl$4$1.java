package com.hansecom.abt.presentation.screens.auth.register.result.needsActivation;

import androidx.compose.material3.SnackbarDuration;
import com.hansecom.abt.presentation.screens.auth.register.result.needsActivation.RegisterResultNeedsActivation;
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
@DebugMetadata(c = "com.hansecom.abt.presentation.screens.auth.register.result.needsActivation.RegisterResultNeedsActivationScreenKt$ScreenImpl$4$1", f = "RegisterResultNeedsActivationScreen.kt", l = {}, m = "invokeSuspend")
public final class RegisterResultNeedsActivationScreenKt$ScreenImpl$4$1 extends SuspendLambda implements Function2<RegisterResultNeedsActivation.Effect, Continuation<? super Unit>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ AbtSnackbarHostState F;
    public final /* synthetic */ String G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RegisterResultNeedsActivationScreenKt$ScreenImpl$4$1(AbtSnackbarHostState abtSnackbarHostState, String str, Continuation continuation) {
        super(2, continuation);
        this.F = abtSnackbarHostState;
        this.G = str;
    }

    /* renamed from: A */
    public final Object m(RegisterResultNeedsActivation.Effect effect, Continuation continuation) {
        return ((RegisterResultNeedsActivationScreenKt$ScreenImpl$4$1) s(effect, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        RegisterResultNeedsActivationScreenKt$ScreenImpl$4$1 registerResultNeedsActivationScreenKt$ScreenImpl$4$1 = new RegisterResultNeedsActivationScreenKt$ScreenImpl$4$1(this.F, this.G, continuation);
        registerResultNeedsActivationScreenKt$ScreenImpl$4$1.E = obj;
        return registerResultNeedsActivationScreenKt$ScreenImpl$4$1;
    }

    public final Object x(Object obj) {
        IntrinsicsKt.f();
        if (this.D == 0) {
            ResultKt.b(obj);
            RegisterResultNeedsActivation.Effect effect = (RegisterResultNeedsActivation.Effect) this.E;
            if (effect instanceof RegisterResultNeedsActivation.Effect.Success) {
                AbtSnackbarHostState.e(this.F, this.G, SnackbarType.POSITIVE, (String) null, false, (SnackbarDuration) null, (CoroutineScope) null, 60, (Object) null);
            } else if (effect instanceof RegisterResultNeedsActivation.Effect.Error) {
                AbtSnackbarHostState.d(this.F, ((RegisterResultNeedsActivation.Effect.Error) effect).a(), (SnackbarType) null, (String) null, false, (SnackbarDuration) null, (CoroutineScope) null, 62, (Object) null);
            } else {
                throw new NoWhenBranchMatchedException();
            }
            return Unit.f40552a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
