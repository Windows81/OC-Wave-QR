package com.hansecom.abt.presentation.screens.home.faremedia.createCard;

import androidx.compose.material3.SnackbarDuration;
import com.hansecom.abt.presentation.screens.home.faremedia.createCard.FareMediaCreateCard;
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
@DebugMetadata(c = "com.hansecom.abt.presentation.screens.home.faremedia.createCard.FareMediaCreateCardScreenKt$ScreenImpl$1$2$1", f = "FareMediaCreateCardScreen.kt", l = {}, m = "invokeSuspend")
public final class FareMediaCreateCardScreenKt$ScreenImpl$1$2$1 extends SuspendLambda implements Function2<FareMediaCreateCard.Effect, Continuation<? super Unit>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ AbtSnackbarHostState F;
    public final /* synthetic */ Function0 G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FareMediaCreateCardScreenKt$ScreenImpl$1$2$1(AbtSnackbarHostState abtSnackbarHostState, Function0 function0, Continuation continuation) {
        super(2, continuation);
        this.F = abtSnackbarHostState;
        this.G = function0;
    }

    /* renamed from: A */
    public final Object m(FareMediaCreateCard.Effect effect, Continuation continuation) {
        return ((FareMediaCreateCardScreenKt$ScreenImpl$1$2$1) s(effect, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        FareMediaCreateCardScreenKt$ScreenImpl$1$2$1 fareMediaCreateCardScreenKt$ScreenImpl$1$2$1 = new FareMediaCreateCardScreenKt$ScreenImpl$1$2$1(this.F, this.G, continuation);
        fareMediaCreateCardScreenKt$ScreenImpl$1$2$1.E = obj;
        return fareMediaCreateCardScreenKt$ScreenImpl$1$2$1;
    }

    public final Object x(Object obj) {
        IntrinsicsKt.f();
        if (this.D == 0) {
            ResultKt.b(obj);
            FareMediaCreateCard.Effect effect = (FareMediaCreateCard.Effect) this.E;
            if (effect instanceof FareMediaCreateCard.Effect.Error) {
                AbtSnackbarHostState.d(this.F, ((FareMediaCreateCard.Effect.Error) effect).a(), (SnackbarType) null, (String) null, false, (SnackbarDuration) null, (CoroutineScope) null, 62, (Object) null);
            } else if (Intrinsics.d(effect, FareMediaCreateCard.Effect.Success.f36679a)) {
                this.G.invoke();
            } else {
                throw new NoWhenBranchMatchedException();
            }
            return Unit.f40552a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
