package com.hansecom.abt.presentation.screens.home.faremedia.cardHistory;

import androidx.compose.material3.SnackbarDuration;
import com.hansecom.abt.presentation.screens.home.faremedia.cardHistory.CardHistory;
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
@DebugMetadata(c = "com.hansecom.abt.presentation.screens.home.faremedia.cardHistory.CardHistoryScreenKt$ScreenImpl$2$1", f = "CardHistoryScreen.kt", l = {}, m = "invokeSuspend")
public final class CardHistoryScreenKt$ScreenImpl$2$1 extends SuspendLambda implements Function2<CardHistory.Effect, Continuation<? super Unit>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ AbtSnackbarHostState F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CardHistoryScreenKt$ScreenImpl$2$1(AbtSnackbarHostState abtSnackbarHostState, Continuation continuation) {
        super(2, continuation);
        this.F = abtSnackbarHostState;
    }

    /* renamed from: A */
    public final Object m(CardHistory.Effect effect, Continuation continuation) {
        return ((CardHistoryScreenKt$ScreenImpl$2$1) s(effect, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        CardHistoryScreenKt$ScreenImpl$2$1 cardHistoryScreenKt$ScreenImpl$2$1 = new CardHistoryScreenKt$ScreenImpl$2$1(this.F, continuation);
        cardHistoryScreenKt$ScreenImpl$2$1.E = obj;
        return cardHistoryScreenKt$ScreenImpl$2$1;
    }

    public final Object x(Object obj) {
        IntrinsicsKt.f();
        if (this.D == 0) {
            ResultKt.b(obj);
            CardHistory.Effect effect = (CardHistory.Effect) this.E;
            if (effect instanceof CardHistory.Effect.Error) {
                AbtSnackbarHostState.d(this.F, ((CardHistory.Effect.Error) effect).a(), (SnackbarType) null, (String) null, false, (SnackbarDuration) null, (CoroutineScope) null, 62, (Object) null);
                return Unit.f40552a;
            }
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
