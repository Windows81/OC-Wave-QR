package com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions;

import androidx.compose.material3.SnackbarDuration;
import com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestions;
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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestionScreenKt$ScreenImpl$2$1", f = "ChangeSecurityQuestionScreen.kt", l = {}, m = "invokeSuspend")
public final class ChangeSecurityQuestionScreenKt$ScreenImpl$2$1 extends SuspendLambda implements Function2<ChangeSecurityQuestions.Effect.Main, Continuation<? super Unit>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ AbtSnackbarHostState F;
    public final /* synthetic */ String G;
    public final /* synthetic */ Function0 H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChangeSecurityQuestionScreenKt$ScreenImpl$2$1(AbtSnackbarHostState abtSnackbarHostState, String str, Function0 function0, Continuation continuation) {
        super(2, continuation);
        this.F = abtSnackbarHostState;
        this.G = str;
        this.H = function0;
    }

    /* renamed from: A */
    public final Object m(ChangeSecurityQuestions.Effect.Main main, Continuation continuation) {
        return ((ChangeSecurityQuestionScreenKt$ScreenImpl$2$1) s(main, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        ChangeSecurityQuestionScreenKt$ScreenImpl$2$1 changeSecurityQuestionScreenKt$ScreenImpl$2$1 = new ChangeSecurityQuestionScreenKt$ScreenImpl$2$1(this.F, this.G, this.H, continuation);
        changeSecurityQuestionScreenKt$ScreenImpl$2$1.E = obj;
        return changeSecurityQuestionScreenKt$ScreenImpl$2$1;
    }

    public final Object x(Object obj) {
        IntrinsicsKt.f();
        if (this.D == 0) {
            ResultKt.b(obj);
            ChangeSecurityQuestions.Effect.Main main = (ChangeSecurityQuestions.Effect.Main) this.E;
            if (main instanceof ChangeSecurityQuestions.Effect.Main.Fail) {
                AbtSnackbarHostState.d(this.F, ((ChangeSecurityQuestions.Effect.Main.Fail) main).a(), (SnackbarType) null, (String) null, false, (SnackbarDuration) null, (CoroutineScope) null, 62, (Object) null);
            } else if (Intrinsics.d(main, ChangeSecurityQuestions.Effect.Main.UpdateSuccess.f35369a)) {
                AbtSnackbarHostState.e(this.F, this.G, SnackbarType.POSITIVE, (String) null, false, (SnackbarDuration) null, (CoroutineScope) null, 60, (Object) null);
                this.H.invoke();
            } else {
                throw new NoWhenBranchMatchedException();
            }
            return Unit.f40552a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
