package com.hansecom.abt.presentation.screens.home.faremedia.instituitions.details;

import androidx.compose.material3.SnackbarDuration;
import com.hansecom.abt.R;
import com.hansecom.abt.presentation.screens.home.faremedia.instituitions.details.InstitutionDetails;
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
@DebugMetadata(c = "com.hansecom.abt.presentation.screens.home.faremedia.instituitions.details.InstitutionDetailsScreenKt$ScreenImpl$2$1", f = "InstitutionDetailsScreen.kt", l = {}, m = "invokeSuspend")
public final class InstitutionDetailsScreenKt$ScreenImpl$2$1 extends SuspendLambda implements Function2<InstitutionDetails.Effect, Continuation<? super Unit>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ AbtSnackbarHostState F;
    public final /* synthetic */ Function0 G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InstitutionDetailsScreenKt$ScreenImpl$2$1(AbtSnackbarHostState abtSnackbarHostState, Function0 function0, Continuation continuation) {
        super(2, continuation);
        this.F = abtSnackbarHostState;
        this.G = function0;
    }

    /* renamed from: A */
    public final Object m(InstitutionDetails.Effect effect, Continuation continuation) {
        return ((InstitutionDetailsScreenKt$ScreenImpl$2$1) s(effect, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        InstitutionDetailsScreenKt$ScreenImpl$2$1 institutionDetailsScreenKt$ScreenImpl$2$1 = new InstitutionDetailsScreenKt$ScreenImpl$2$1(this.F, this.G, continuation);
        institutionDetailsScreenKt$ScreenImpl$2$1.E = obj;
        return institutionDetailsScreenKt$ScreenImpl$2$1;
    }

    public final Object x(Object obj) {
        IntrinsicsKt.f();
        if (this.D == 0) {
            ResultKt.b(obj);
            InstitutionDetails.Effect effect = (InstitutionDetails.Effect) this.E;
            if (effect instanceof InstitutionDetails.Effect.Error) {
                AbtSnackbarHostState.d(this.F, ((InstitutionDetails.Effect.Error) effect).a(), (SnackbarType) null, (String) null, false, (SnackbarDuration) null, (CoroutineScope) null, 62, (Object) null);
            } else if (Intrinsics.d(effect, InstitutionDetails.Effect.Success.f36828a)) {
                AbtSnackbarHostState.d(this.F, StringValueKt.c(R.string.E6), SnackbarType.POSITIVE, (String) null, false, (SnackbarDuration) null, (CoroutineScope) null, 60, (Object) null);
                this.G.invoke();
            } else {
                throw new NoWhenBranchMatchedException();
            }
            return Unit.f40552a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
