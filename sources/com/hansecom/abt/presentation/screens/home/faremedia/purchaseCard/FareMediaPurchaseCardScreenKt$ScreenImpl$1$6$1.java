package com.hansecom.abt.presentation.screens.home.faremedia.purchaseCard;

import androidx.compose.material3.SnackbarDuration;
import com.hansecom.abt.presentation.screens.home.faremedia.purchaseCard.FareMediaPurchaseCard;
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
@DebugMetadata(c = "com.hansecom.abt.presentation.screens.home.faremedia.purchaseCard.FareMediaPurchaseCardScreenKt$ScreenImpl$1$6$1", f = "FareMediaPurchaseCardScreen.kt", l = {}, m = "invokeSuspend")
public final class FareMediaPurchaseCardScreenKt$ScreenImpl$1$6$1 extends SuspendLambda implements Function2<FareMediaPurchaseCard.Effect, Continuation<? super Unit>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ AbtSnackbarHostState F;
    public final /* synthetic */ Function0 G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FareMediaPurchaseCardScreenKt$ScreenImpl$1$6$1(AbtSnackbarHostState abtSnackbarHostState, Function0 function0, Continuation continuation) {
        super(2, continuation);
        this.F = abtSnackbarHostState;
        this.G = function0;
    }

    /* renamed from: A */
    public final Object m(FareMediaPurchaseCard.Effect effect, Continuation continuation) {
        return ((FareMediaPurchaseCardScreenKt$ScreenImpl$1$6$1) s(effect, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        FareMediaPurchaseCardScreenKt$ScreenImpl$1$6$1 fareMediaPurchaseCardScreenKt$ScreenImpl$1$6$1 = new FareMediaPurchaseCardScreenKt$ScreenImpl$1$6$1(this.F, this.G, continuation);
        fareMediaPurchaseCardScreenKt$ScreenImpl$1$6$1.E = obj;
        return fareMediaPurchaseCardScreenKt$ScreenImpl$1$6$1;
    }

    public final Object x(Object obj) {
        IntrinsicsKt.f();
        if (this.D == 0) {
            ResultKt.b(obj);
            FareMediaPurchaseCard.Effect effect = (FareMediaPurchaseCard.Effect) this.E;
            if (effect instanceof FareMediaPurchaseCard.Effect.Error) {
                AbtSnackbarHostState.d(this.F, ((FareMediaPurchaseCard.Effect.Error) effect).a(), (SnackbarType) null, (String) null, false, (SnackbarDuration) null, (CoroutineScope) null, 62, (Object) null);
            } else if (Intrinsics.d(effect, FareMediaPurchaseCard.Effect.Success.f37177a)) {
                this.G.invoke();
            } else {
                throw new NoWhenBranchMatchedException();
            }
            return Unit.f40552a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
