package com.hansecom.abt.presentation.screens.home.faremedia;

import androidx.compose.foundation.pager.PagerState;
import androidx.compose.material3.SnackbarDuration;
import com.hansecom.abt.presentation.screens.home.faremedia.FareMedia;
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
@DebugMetadata(c = "com.hansecom.abt.presentation.screens.home.faremedia.FareMediaScreenKt$ScreenImpl$2$1", f = "FareMediaScreen.kt", l = {220}, m = "invokeSuspend")
public final class FareMediaScreenKt$ScreenImpl$2$1 extends SuspendLambda implements Function2<FareMedia.Effect, Continuation<? super Unit>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ AbtSnackbarHostState F;
    public final /* synthetic */ Function0 G;
    public final /* synthetic */ Function0 H;
    public final /* synthetic */ PagerState I;
    public final /* synthetic */ Function1 J;
    public final /* synthetic */ Function1 K;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FareMediaScreenKt$ScreenImpl$2$1(AbtSnackbarHostState abtSnackbarHostState, Function0 function0, Function0 function02, PagerState pagerState, Function1 function1, Function1 function12, Continuation continuation) {
        super(2, continuation);
        this.F = abtSnackbarHostState;
        this.G = function0;
        this.H = function02;
        this.I = pagerState;
        this.J = function1;
        this.K = function12;
    }

    /* renamed from: A */
    public final Object m(FareMedia.Effect effect, Continuation continuation) {
        return ((FareMediaScreenKt$ScreenImpl$2$1) s(effect, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        FareMediaScreenKt$ScreenImpl$2$1 fareMediaScreenKt$ScreenImpl$2$1 = new FareMediaScreenKt$ScreenImpl$2$1(this.F, this.G, this.H, this.I, this.J, this.K, continuation);
        fareMediaScreenKt$ScreenImpl$2$1.E = obj;
        return fareMediaScreenKt$ScreenImpl$2$1;
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            FareMedia.Effect effect = (FareMedia.Effect) this.E;
            if (effect instanceof FareMedia.Effect.Error) {
                AbtSnackbarHostState.d(this.F, ((FareMedia.Effect.Error) effect).a(), (SnackbarType) null, (String) null, false, (SnackbarDuration) null, (CoroutineScope) null, 62, (Object) null);
            } else if (Intrinsics.d(effect, FareMedia.Effect.GoToCreateCard.f35912a)) {
                this.G.invoke();
            } else if (Intrinsics.d(effect, FareMedia.Effect.GoToLinkCard.f35913a)) {
                this.H.invoke();
            } else if (Intrinsics.d(effect, FareMedia.Effect.ScrollToCarouselStart.f35916a)) {
                PagerState pagerState = this.I;
                this.D = 1;
                if (PagerState.d0(pagerState, 0, 0.0f, this, 2, (Object) null) == f2) {
                    return f2;
                }
            } else if (effect instanceof FareMedia.Effect.LaunchGoogleWalletWithLink) {
                this.J.invoke(((FareMedia.Effect.LaunchGoogleWalletWithLink) effect).a());
            } else if (effect instanceof FareMedia.Effect.LaunchGoogleWalletWithJwt) {
                this.K.invoke(((FareMedia.Effect.LaunchGoogleWalletWithJwt) effect).a());
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else if (i2 == 1) {
            ResultKt.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.f40552a;
    }
}
