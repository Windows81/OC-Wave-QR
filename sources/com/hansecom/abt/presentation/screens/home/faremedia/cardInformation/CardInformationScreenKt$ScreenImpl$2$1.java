package com.hansecom.abt.presentation.screens.home.faremedia.cardInformation;

import android.content.Context;
import androidx.compose.material3.SnackbarDuration;
import com.hansecom.abt.R;
import com.hansecom.abt.presentation.screens.home.faremedia.cardInformation.CardInformation;
import com.hansecom.abt.ui.components.snackbar.AbtSnackbarHostState;
import com.hansecom.abt.ui.components.snackbar.SnackbarType;
import com.hansecom.abt.util.resourcesResolvers.StyledStringResourceKt;
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
import kotlinx.coroutines.CoroutineScope;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.presentation.screens.home.faremedia.cardInformation.CardInformationScreenKt$ScreenImpl$2$1", f = "CardInformationScreen.kt", l = {}, m = "invokeSuspend")
public final class CardInformationScreenKt$ScreenImpl$2$1 extends SuspendLambda implements Function2<CardInformation.Effect, Continuation<? super Unit>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ AbtSnackbarHostState F;
    public final /* synthetic */ Context G;
    public final /* synthetic */ Function0 H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CardInformationScreenKt$ScreenImpl$2$1(AbtSnackbarHostState abtSnackbarHostState, Context context, Function0 function0, Continuation continuation) {
        super(2, continuation);
        this.F = abtSnackbarHostState;
        this.G = context;
        this.H = function0;
    }

    /* renamed from: A */
    public final Object m(CardInformation.Effect effect, Continuation continuation) {
        return ((CardInformationScreenKt$ScreenImpl$2$1) s(effect, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        CardInformationScreenKt$ScreenImpl$2$1 cardInformationScreenKt$ScreenImpl$2$1 = new CardInformationScreenKt$ScreenImpl$2$1(this.F, this.G, this.H, continuation);
        cardInformationScreenKt$ScreenImpl$2$1.E = obj;
        return cardInformationScreenKt$ScreenImpl$2$1;
    }

    public final Object x(Object obj) {
        IntrinsicsKt.f();
        if (this.D == 0) {
            ResultKt.b(obj);
            CardInformation.Effect effect = (CardInformation.Effect) this.E;
            if (effect instanceof CardInformation.Effect.Error) {
                AbtSnackbarHostState.d(this.F, ((CardInformation.Effect.Error) effect).a(), (SnackbarType) null, (String) null, false, (SnackbarDuration) null, (CoroutineScope) null, 62, (Object) null);
            } else if (effect instanceof CardInformation.Effect.Success) {
                AbtSnackbarHostState.e(this.F, StyledStringResourceKt.d(this.G, R.string.C1, ((CardInformation.Effect.Success) effect).a()), SnackbarType.POSITIVE, (String) null, false, (SnackbarDuration) null, (CoroutineScope) null, 60, (Object) null);
                this.H.invoke();
            } else {
                throw new NoWhenBranchMatchedException();
            }
            return Unit.f40552a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
