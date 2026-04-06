package com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup;

import android.content.Context;
import androidx.compose.material3.SnackbarDuration;
import com.hansecom.abt.R;
import com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup.AutoloadSetup;
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
@DebugMetadata(c = "com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup.AutoloadSetupScreenKt$ScreenImpl$2$1", f = "AutoloadSetupScreen.kt", l = {}, m = "invokeSuspend")
public final class AutoloadSetupScreenKt$ScreenImpl$2$1 extends SuspendLambda implements Function2<AutoloadSetup.Effect, Continuation<? super Unit>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ AbtSnackbarHostState F;
    public final /* synthetic */ Function0 G;
    public final /* synthetic */ Context H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AutoloadSetupScreenKt$ScreenImpl$2$1(AbtSnackbarHostState abtSnackbarHostState, Function0 function0, Context context, Continuation continuation) {
        super(2, continuation);
        this.F = abtSnackbarHostState;
        this.G = function0;
        this.H = context;
    }

    /* renamed from: A */
    public final Object m(AutoloadSetup.Effect effect, Continuation continuation) {
        return ((AutoloadSetupScreenKt$ScreenImpl$2$1) s(effect, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        AutoloadSetupScreenKt$ScreenImpl$2$1 autoloadSetupScreenKt$ScreenImpl$2$1 = new AutoloadSetupScreenKt$ScreenImpl$2$1(this.F, this.G, this.H, continuation);
        autoloadSetupScreenKt$ScreenImpl$2$1.E = obj;
        return autoloadSetupScreenKt$ScreenImpl$2$1;
    }

    public final Object x(Object obj) {
        IntrinsicsKt.f();
        if (this.D == 0) {
            ResultKt.b(obj);
            AutoloadSetup.Effect effect = (AutoloadSetup.Effect) this.E;
            if (effect instanceof AutoloadSetup.Effect.Error) {
                AbtSnackbarHostState.d(this.F, ((AutoloadSetup.Effect.Error) effect).a(), (SnackbarType) null, (String) null, false, (SnackbarDuration) null, (CoroutineScope) null, 62, (Object) null);
            } else if (effect instanceof AutoloadSetup.Effect.InitialLoadingError) {
                AbtSnackbarHostState.d(this.F, ((AutoloadSetup.Effect.InitialLoadingError) effect).a(), (SnackbarType) null, (String) null, false, (SnackbarDuration) null, (CoroutineScope) null, 62, (Object) null);
                this.G.invoke();
            } else if (Intrinsics.d(effect, AutoloadSetup.Effect.Success.f36297a)) {
                AbtSnackbarHostState abtSnackbarHostState = this.F;
                String string = this.H.getString(R.string.n1);
                Intrinsics.h(string, "getString(...)");
                AbtSnackbarHostState.e(abtSnackbarHostState, string, SnackbarType.POSITIVE, (String) null, false, (SnackbarDuration) null, (CoroutineScope) null, 60, (Object) null);
                this.G.invoke();
            } else {
                throw new NoWhenBranchMatchedException();
            }
            return Unit.f40552a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
