package com.hansecom.abt.presentation.screens.home.faremedia.unlockCard;

import androidx.compose.material3.SnackbarDuration;
import com.hansecom.abt.R;
import com.hansecom.abt.presentation.screens.home.faremedia.unlockCard.FareMediaUnlockCard;
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
@DebugMetadata(c = "com.hansecom.abt.presentation.screens.home.faremedia.unlockCard.FareMediaUnlockCardDialogKt$DialogImpl$2$1", f = "FareMediaUnlockCardDialog.kt", l = {}, m = "invokeSuspend")
public final class FareMediaUnlockCardDialogKt$DialogImpl$2$1 extends SuspendLambda implements Function2<FareMediaUnlockCard.Effect, Continuation<? super Unit>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ AbtSnackbarHostState F;
    public final /* synthetic */ Function0 G;
    public final /* synthetic */ Function0 H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FareMediaUnlockCardDialogKt$DialogImpl$2$1(AbtSnackbarHostState abtSnackbarHostState, Function0 function0, Function0 function02, Continuation continuation) {
        super(2, continuation);
        this.F = abtSnackbarHostState;
        this.G = function0;
        this.H = function02;
    }

    /* renamed from: A */
    public final Object m(FareMediaUnlockCard.Effect effect, Continuation continuation) {
        return ((FareMediaUnlockCardDialogKt$DialogImpl$2$1) s(effect, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        FareMediaUnlockCardDialogKt$DialogImpl$2$1 fareMediaUnlockCardDialogKt$DialogImpl$2$1 = new FareMediaUnlockCardDialogKt$DialogImpl$2$1(this.F, this.G, this.H, continuation);
        fareMediaUnlockCardDialogKt$DialogImpl$2$1.E = obj;
        return fareMediaUnlockCardDialogKt$DialogImpl$2$1;
    }

    public final Object x(Object obj) {
        IntrinsicsKt.f();
        if (this.D == 0) {
            ResultKt.b(obj);
            FareMediaUnlockCard.Effect effect = (FareMediaUnlockCard.Effect) this.E;
            if (effect instanceof FareMediaUnlockCard.Effect.Error) {
                AbtSnackbarHostState.d(this.F, ((FareMediaUnlockCard.Effect.Error) effect).a(), (SnackbarType) null, (String) null, false, (SnackbarDuration) null, (CoroutineScope) null, 62, (Object) null);
                this.G.invoke();
            } else if (Intrinsics.d(effect, FareMediaUnlockCard.Effect.Success.f37373a)) {
                AbtSnackbarHostState.d(this.F, StringValueKt.c(R.string.C5), SnackbarType.POSITIVE, (String) null, false, (SnackbarDuration) null, (CoroutineScope) null, 60, (Object) null);
                this.H.invoke();
            } else {
                throw new NoWhenBranchMatchedException();
            }
            return Unit.f40552a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
