package com.hansecom.abt.presentation.screens.home.faremedia.instituitions;

import androidx.compose.material3.SnackbarDuration;
import com.hansecom.abt.presentation.screens.home.faremedia.instituitions.Institutions;
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
@DebugMetadata(c = "com.hansecom.abt.presentation.screens.home.faremedia.instituitions.InstitutionsScreenKt$ScreenImpl$2$1", f = "InstitutionsScreen.kt", l = {}, m = "invokeSuspend")
public final class InstitutionsScreenKt$ScreenImpl$2$1 extends SuspendLambda implements Function2<Institutions.Effect, Continuation<? super Unit>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ AbtSnackbarHostState F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InstitutionsScreenKt$ScreenImpl$2$1(AbtSnackbarHostState abtSnackbarHostState, Continuation continuation) {
        super(2, continuation);
        this.F = abtSnackbarHostState;
    }

    /* renamed from: A */
    public final Object m(Institutions.Effect effect, Continuation continuation) {
        return ((InstitutionsScreenKt$ScreenImpl$2$1) s(effect, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        InstitutionsScreenKt$ScreenImpl$2$1 institutionsScreenKt$ScreenImpl$2$1 = new InstitutionsScreenKt$ScreenImpl$2$1(this.F, continuation);
        institutionsScreenKt$ScreenImpl$2$1.E = obj;
        return institutionsScreenKt$ScreenImpl$2$1;
    }

    public final Object x(Object obj) {
        IntrinsicsKt.f();
        if (this.D == 0) {
            ResultKt.b(obj);
            Institutions.Effect effect = (Institutions.Effect) this.E;
            if (effect instanceof Institutions.Effect.Error) {
                AbtSnackbarHostState.d(this.F, ((Institutions.Effect.Error) effect).a(), (SnackbarType) null, (String) null, false, (SnackbarDuration) null, (CoroutineScope) null, 62, (Object) null);
                return Unit.f40552a;
            }
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
