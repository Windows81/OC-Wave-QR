package com.hansecom.abt.presentation.screens.home.faremedia.transferBalance;

import android.content.Context;
import androidx.compose.material3.SnackbarDuration;
import com.hansecom.abt.R;
import com.hansecom.abt.presentation.screens.home.faremedia.transferBalance.TransferBalance;
import com.hansecom.abt.ui.components.snackbar.AbtSnackbarHostState;
import com.hansecom.abt.ui.components.snackbar.SnackbarType;
import com.hansecom.abt.util.resourcesResolvers.StringResourceKt;
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
@DebugMetadata(c = "com.hansecom.abt.presentation.screens.home.faremedia.transferBalance.TransferBalanceScreenKt$ScreenImpl$2$1", f = "TransferBalanceScreen.kt", l = {}, m = "invokeSuspend")
public final class TransferBalanceScreenKt$ScreenImpl$2$1 extends SuspendLambda implements Function2<TransferBalance.Effect, Continuation<? super Unit>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ AbtSnackbarHostState F;
    public final /* synthetic */ Context G;
    public final /* synthetic */ Function0 H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TransferBalanceScreenKt$ScreenImpl$2$1(AbtSnackbarHostState abtSnackbarHostState, Context context, Function0 function0, Continuation continuation) {
        super(2, continuation);
        this.F = abtSnackbarHostState;
        this.G = context;
        this.H = function0;
    }

    /* renamed from: A */
    public final Object m(TransferBalance.Effect effect, Continuation continuation) {
        return ((TransferBalanceScreenKt$ScreenImpl$2$1) s(effect, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        TransferBalanceScreenKt$ScreenImpl$2$1 transferBalanceScreenKt$ScreenImpl$2$1 = new TransferBalanceScreenKt$ScreenImpl$2$1(this.F, this.G, this.H, continuation);
        transferBalanceScreenKt$ScreenImpl$2$1.E = obj;
        return transferBalanceScreenKt$ScreenImpl$2$1;
    }

    public final Object x(Object obj) {
        IntrinsicsKt.f();
        if (this.D == 0) {
            ResultKt.b(obj);
            TransferBalance.Effect effect = (TransferBalance.Effect) this.E;
            if (effect instanceof TransferBalance.Effect.Error) {
                AbtSnackbarHostState.d(this.F, ((TransferBalance.Effect.Error) effect).a(), (SnackbarType) null, (String) null, false, (SnackbarDuration) null, (CoroutineScope) null, 62, (Object) null);
            } else if (effect instanceof TransferBalance.Effect.Success) {
                AbtSnackbarHostState abtSnackbarHostState = this.F;
                Context context = this.G;
                String string = context.getString(R.string.aa, new Object[]{StringResourceKt.b(context, ((TransferBalance.Effect.Success) effect).a(), new Object[0])});
                Intrinsics.h(string, "getString(...)");
                AbtSnackbarHostState.e(abtSnackbarHostState, string, SnackbarType.POSITIVE, (String) null, false, (SnackbarDuration) null, (CoroutineScope) null, 60, (Object) null);
                this.H.invoke();
            } else {
                throw new NoWhenBranchMatchedException();
            }
            return Unit.f40552a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
