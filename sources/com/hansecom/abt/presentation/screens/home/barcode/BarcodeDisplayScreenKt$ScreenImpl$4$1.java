package com.hansecom.abt.presentation.screens.home.barcode;

import androidx.compose.material3.SnackbarDuration;
import com.hansecom.abt.presentation.screens.home.barcode.BarcodeDisplay;
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
import kotlinx.coroutines.CoroutineScope;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.presentation.screens.home.barcode.BarcodeDisplayScreenKt$ScreenImpl$4$1", f = "BarcodeDisplayScreen.kt", l = {}, m = "invokeSuspend")
public final class BarcodeDisplayScreenKt$ScreenImpl$4$1 extends SuspendLambda implements Function2<BarcodeDisplay.Effect, Continuation<? super Unit>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ AbtSnackbarHostState F;
    public final /* synthetic */ Function0 G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BarcodeDisplayScreenKt$ScreenImpl$4$1(AbtSnackbarHostState abtSnackbarHostState, Function0 function0, Continuation continuation) {
        super(2, continuation);
        this.F = abtSnackbarHostState;
        this.G = function0;
    }

    /* renamed from: A */
    public final Object m(BarcodeDisplay.Effect effect, Continuation continuation) {
        return ((BarcodeDisplayScreenKt$ScreenImpl$4$1) s(effect, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        BarcodeDisplayScreenKt$ScreenImpl$4$1 barcodeDisplayScreenKt$ScreenImpl$4$1 = new BarcodeDisplayScreenKt$ScreenImpl$4$1(this.F, this.G, continuation);
        barcodeDisplayScreenKt$ScreenImpl$4$1.E = obj;
        return barcodeDisplayScreenKt$ScreenImpl$4$1;
    }

    public final Object x(Object obj) {
        IntrinsicsKt.f();
        if (this.D == 0) {
            ResultKt.b(obj);
            BarcodeDisplay.Effect effect = (BarcodeDisplay.Effect) this.E;
            if (effect instanceof BarcodeDisplay.Effect.Error) {
                AbtSnackbarHostState.d(this.F, ((BarcodeDisplay.Effect.Error) effect).a(), (SnackbarType) null, (String) null, false, (SnackbarDuration) null, (CoroutineScope) null, 62, (Object) null);
                this.G.invoke();
                return Unit.f40552a;
            }
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
