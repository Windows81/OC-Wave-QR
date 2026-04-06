package com.hansecom.abt.presentation.screens.home.faremedia.fareCapping;

import androidx.compose.material3.SnackbarDuration;
import com.hansecom.abt.presentation.screens.home.faremedia.fareCapping.FareCapping;
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
@DebugMetadata(c = "com.hansecom.abt.presentation.screens.home.faremedia.fareCapping.FareCappingScreenKt$ScreenImpl$2$1", f = "FareCappingScreen.kt", l = {}, m = "invokeSuspend")
public final class FareCappingScreenKt$ScreenImpl$2$1 extends SuspendLambda implements Function2<FareCapping.Effect, Continuation<? super Unit>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ AbtSnackbarHostState F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FareCappingScreenKt$ScreenImpl$2$1(AbtSnackbarHostState abtSnackbarHostState, Continuation continuation) {
        super(2, continuation);
        this.F = abtSnackbarHostState;
    }

    /* renamed from: A */
    public final Object m(FareCapping.Effect effect, Continuation continuation) {
        return ((FareCappingScreenKt$ScreenImpl$2$1) s(effect, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        FareCappingScreenKt$ScreenImpl$2$1 fareCappingScreenKt$ScreenImpl$2$1 = new FareCappingScreenKt$ScreenImpl$2$1(this.F, continuation);
        fareCappingScreenKt$ScreenImpl$2$1.E = obj;
        return fareCappingScreenKt$ScreenImpl$2$1;
    }

    public final Object x(Object obj) {
        IntrinsicsKt.f();
        if (this.D == 0) {
            ResultKt.b(obj);
            FareCapping.Effect effect = (FareCapping.Effect) this.E;
            if (effect instanceof FareCapping.Effect.Error) {
                AbtSnackbarHostState.d(this.F, ((FareCapping.Effect.Error) effect).a(), (SnackbarType) null, (String) null, false, (SnackbarDuration) null, (CoroutineScope) null, 62, (Object) null);
                return Unit.f40552a;
            }
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
