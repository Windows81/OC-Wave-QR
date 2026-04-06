package com.hansecom.abt.presentation.screens.home.faremedia.convertToVirtual;

import androidx.compose.material3.SnackbarDuration;
import com.hansecom.abt.R;
import com.hansecom.abt.presentation.screens.home.faremedia.convertToVirtual.ConvertToVirtual;
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
@DebugMetadata(c = "com.hansecom.abt.presentation.screens.home.faremedia.convertToVirtual.ConvertToVirtualCardDialogKt$DialogImpl$3$1", f = "ConvertToVirtualCardDialog.kt", l = {}, m = "invokeSuspend")
public final class ConvertToVirtualCardDialogKt$DialogImpl$3$1 extends SuspendLambda implements Function2<ConvertToVirtual.Effect, Continuation<? super Unit>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ AbtSnackbarHostState F;
    public final /* synthetic */ Function0 G;
    public final /* synthetic */ Function0 H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConvertToVirtualCardDialogKt$DialogImpl$3$1(AbtSnackbarHostState abtSnackbarHostState, Function0 function0, Function0 function02, Continuation continuation) {
        super(2, continuation);
        this.F = abtSnackbarHostState;
        this.G = function0;
        this.H = function02;
    }

    /* renamed from: A */
    public final Object m(ConvertToVirtual.Effect effect, Continuation continuation) {
        return ((ConvertToVirtualCardDialogKt$DialogImpl$3$1) s(effect, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        ConvertToVirtualCardDialogKt$DialogImpl$3$1 convertToVirtualCardDialogKt$DialogImpl$3$1 = new ConvertToVirtualCardDialogKt$DialogImpl$3$1(this.F, this.G, this.H, continuation);
        convertToVirtualCardDialogKt$DialogImpl$3$1.E = obj;
        return convertToVirtualCardDialogKt$DialogImpl$3$1;
    }

    public final Object x(Object obj) {
        IntrinsicsKt.f();
        if (this.D == 0) {
            ResultKt.b(obj);
            ConvertToVirtual.Effect effect = (ConvertToVirtual.Effect) this.E;
            if (effect instanceof ConvertToVirtual.Effect.Error) {
                AbtSnackbarHostState.d(this.F, ((ConvertToVirtual.Effect.Error) effect).a(), (SnackbarType) null, (String) null, false, (SnackbarDuration) null, (CoroutineScope) null, 62, (Object) null);
                this.G.invoke();
            } else if (Intrinsics.d(effect, ConvertToVirtual.Effect.Success.f36655a)) {
                AbtSnackbarHostState.d(this.F, StringValueKt.c(R.string.m3), SnackbarType.POSITIVE, (String) null, false, (SnackbarDuration) null, (CoroutineScope) null, 60, (Object) null);
                this.H.invoke();
            } else {
                throw new NoWhenBranchMatchedException();
            }
            return Unit.f40552a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
