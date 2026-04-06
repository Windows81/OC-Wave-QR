package com.hansecom.abt.presentation.screens.home.faremedia.autoload;

import android.content.Context;
import androidx.compose.material3.SnackbarDuration;
import com.hansecom.abt.R;
import com.hansecom.abt.presentation.screens.home.faremedia.autoload.Autoload;
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
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.presentation.screens.home.faremedia.autoload.AutoloadScreenKt$ScreenImpl$2$1", f = "AutoloadScreen.kt", l = {}, m = "invokeSuspend")
public final class AutoloadScreenKt$ScreenImpl$2$1 extends SuspendLambda implements Function2<Autoload.Effect, Continuation<? super Unit>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ AbtSnackbarHostState F;
    public final /* synthetic */ Context G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AutoloadScreenKt$ScreenImpl$2$1(AbtSnackbarHostState abtSnackbarHostState, Context context, Continuation continuation) {
        super(2, continuation);
        this.F = abtSnackbarHostState;
        this.G = context;
    }

    /* renamed from: A */
    public final Object m(Autoload.Effect effect, Continuation continuation) {
        return ((AutoloadScreenKt$ScreenImpl$2$1) s(effect, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        AutoloadScreenKt$ScreenImpl$2$1 autoloadScreenKt$ScreenImpl$2$1 = new AutoloadScreenKt$ScreenImpl$2$1(this.F, this.G, continuation);
        autoloadScreenKt$ScreenImpl$2$1.E = obj;
        return autoloadScreenKt$ScreenImpl$2$1;
    }

    public final Object x(Object obj) {
        IntrinsicsKt.f();
        if (this.D == 0) {
            ResultKt.b(obj);
            Autoload.Effect effect = (Autoload.Effect) this.E;
            if (effect instanceof Autoload.Effect.Error) {
                AbtSnackbarHostState.d(this.F, ((Autoload.Effect.Error) effect).a(), (SnackbarType) null, (String) null, false, (SnackbarDuration) null, (CoroutineScope) null, 62, (Object) null);
            } else if (Intrinsics.d(effect, Autoload.Effect.DeleteSuccess.f36225a)) {
                AbtSnackbarHostState abtSnackbarHostState = this.F;
                String string = this.G.getString(R.string.H0);
                Intrinsics.h(string, "getString(...)");
                AbtSnackbarHostState.e(abtSnackbarHostState, string, SnackbarType.INFO, (String) null, false, (SnackbarDuration) null, (CoroutineScope) null, 60, (Object) null);
            } else {
                throw new NoWhenBranchMatchedException();
            }
            return Unit.f40552a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
