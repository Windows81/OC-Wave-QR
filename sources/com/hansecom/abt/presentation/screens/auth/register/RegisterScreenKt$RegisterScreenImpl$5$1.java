package com.hansecom.abt.presentation.screens.auth.register;

import androidx.compose.material3.SnackbarDuration;
import com.hansecom.abt.presentation.screens.auth.register.Register;
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
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.presentation.screens.auth.register.RegisterScreenKt$RegisterScreenImpl$5$1", f = "RegisterScreen.kt", l = {}, m = "invokeSuspend")
public final class RegisterScreenKt$RegisterScreenImpl$5$1 extends SuspendLambda implements Function2<Register.Effect, Continuation<? super Unit>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ AbtSnackbarHostState F;
    public final /* synthetic */ Function0 G;
    public final /* synthetic */ Function0 H;
    public final /* synthetic */ Function0 I;
    public final /* synthetic */ Function0 J;
    public final /* synthetic */ Function0 K;
    public final /* synthetic */ Function1 L;
    public final /* synthetic */ Function1 M;
    public final /* synthetic */ Function1 N;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RegisterScreenKt$RegisterScreenImpl$5$1(AbtSnackbarHostState abtSnackbarHostState, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05, Function1 function1, Function1 function12, Function1 function13, Continuation continuation) {
        super(2, continuation);
        this.F = abtSnackbarHostState;
        this.G = function0;
        this.H = function02;
        this.I = function03;
        this.J = function04;
        this.K = function05;
        this.L = function1;
        this.M = function12;
        this.N = function13;
    }

    /* renamed from: A */
    public final Object m(Register.Effect effect, Continuation continuation) {
        return ((RegisterScreenKt$RegisterScreenImpl$5$1) s(effect, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        RegisterScreenKt$RegisterScreenImpl$5$1 registerScreenKt$RegisterScreenImpl$5$1 = new RegisterScreenKt$RegisterScreenImpl$5$1(this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, continuation);
        registerScreenKt$RegisterScreenImpl$5$1.E = obj;
        return registerScreenKt$RegisterScreenImpl$5$1;
    }

    public final Object x(Object obj) {
        IntrinsicsKt.f();
        if (this.D == 0) {
            ResultKt.b(obj);
            Register.Effect effect = (Register.Effect) this.E;
            if (effect instanceof Register.Effect.Fail) {
                AbtSnackbarHostState.d(this.F, ((Register.Effect.Fail) effect).a(), (SnackbarType) null, (String) null, false, (SnackbarDuration) null, (CoroutineScope) null, 62, (Object) null);
            } else if (Intrinsics.d(effect, Register.Effect.GoToHome.f34379a)) {
                this.G.invoke();
            } else if (Intrinsics.d(effect, Register.Effect.GoToSignIn.f34382a)) {
                this.H.invoke();
            } else if (Intrinsics.d(effect, Register.Effect.GoToQuestionsStep.f34381a)) {
                this.I.invoke();
            } else if (Intrinsics.d(effect, Register.Effect.GoBack.f34375a)) {
                this.J.invoke();
            } else if (Intrinsics.d(effect, Register.Effect.GoToFirstStep.f34378a)) {
                this.K.invoke();
            } else if (effect instanceof Register.Effect.GoToExistingAccountNeedsActivation) {
                this.L.invoke(((Register.Effect.GoToExistingAccountNeedsActivation) effect).a());
            } else if (effect instanceof Register.Effect.GoToExitingAccount) {
                this.M.invoke(((Register.Effect.GoToExitingAccount) effect).a());
            } else if (effect instanceof Register.Effect.GoToNeedsActivation) {
                this.N.invoke(((Register.Effect.GoToNeedsActivation) effect).a());
            } else {
                throw new NoWhenBranchMatchedException();
            }
            return Unit.f40552a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
