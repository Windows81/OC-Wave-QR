package com.hansecom.abt.presentation.screens.home.account.changeAccountPin;

import androidx.compose.material3.SnackbarDuration;
import com.hansecom.abt.R;
import com.hansecom.abt.presentation.screens.home.account.changeAccountPin.ChangeAccountPin;
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
@DebugMetadata(c = "com.hansecom.abt.presentation.screens.home.account.changeAccountPin.ChangeAccountPinScreenKt$ScreenImpl$3$1", f = "ChangeAccountPinScreen.kt", l = {}, m = "invokeSuspend")
public final class ChangeAccountPinScreenKt$ScreenImpl$3$1 extends SuspendLambda implements Function2<ChangeAccountPin.Effect, Continuation<? super Unit>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ AbtSnackbarHostState F;
    public final /* synthetic */ Function0 G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChangeAccountPinScreenKt$ScreenImpl$3$1(AbtSnackbarHostState abtSnackbarHostState, Function0 function0, Continuation continuation) {
        super(2, continuation);
        this.F = abtSnackbarHostState;
        this.G = function0;
    }

    /* renamed from: A */
    public final Object m(ChangeAccountPin.Effect effect, Continuation continuation) {
        return ((ChangeAccountPinScreenKt$ScreenImpl$3$1) s(effect, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        ChangeAccountPinScreenKt$ScreenImpl$3$1 changeAccountPinScreenKt$ScreenImpl$3$1 = new ChangeAccountPinScreenKt$ScreenImpl$3$1(this.F, this.G, continuation);
        changeAccountPinScreenKt$ScreenImpl$3$1.E = obj;
        return changeAccountPinScreenKt$ScreenImpl$3$1;
    }

    public final Object x(Object obj) {
        IntrinsicsKt.f();
        if (this.D == 0) {
            ResultKt.b(obj);
            ChangeAccountPin.Effect effect = (ChangeAccountPin.Effect) this.E;
            if (effect instanceof ChangeAccountPin.Effect.Error) {
                AbtSnackbarHostState.d(this.F, ((ChangeAccountPin.Effect.Error) effect).a(), (SnackbarType) null, (String) null, false, (SnackbarDuration) null, (CoroutineScope) null, 62, (Object) null);
            } else if (Intrinsics.d(effect, ChangeAccountPin.Effect.Success.f35237a)) {
                AbtSnackbarHostState.d(this.F, StringValueKt.c(R.string.l2), SnackbarType.POSITIVE, (String) null, false, (SnackbarDuration) null, (CoroutineScope) null, 60, (Object) null);
                this.G.invoke();
            } else {
                throw new NoWhenBranchMatchedException();
            }
            return Unit.f40552a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
