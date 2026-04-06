package com.hansecom.abt.presentation.screens.home.faremedia.instituitions.details;

import com.hansecom.abt.api.ApiExceptionsKt;
import com.hansecom.abt.data.useCases.institution.UnlinkInstitutionUseCase;
import com.hansecom.abt.presentation.model.InstitutionState;
import com.hansecom.abt.presentation.screens.home.faremedia.instituitions.details.InstitutionDetails;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.presentation.screens.home.faremedia.instituitions.details.InstitutionDetailsViewModel$handle$2", f = "InstitutionDetailsViewModel.kt", l = {57}, m = "invokeSuspend")
public final class InstitutionDetailsViewModel$handle$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int D;
    public final /* synthetic */ InstitutionDetailsViewModel E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InstitutionDetailsViewModel$handle$2(InstitutionDetailsViewModel institutionDetailsViewModel, Continuation continuation) {
        super(2, continuation);
        this.E = institutionDetailsViewModel;
    }

    public static final InstitutionDetails.State D(InstitutionDetails.State state) {
        return InstitutionDetails.State.b(state, (InstitutionState) null, false, true, false, false, 27, (Object) null);
    }

    public static final InstitutionDetails.State E(InstitutionDetails.State state) {
        return InstitutionDetails.State.b(state, (InstitutionState) null, false, false, false, false, 25, (Object) null);
    }

    /* renamed from: C */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((InstitutionDetailsViewModel$handle$2) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new InstitutionDetailsViewModel$handle$2(this.E, continuation);
    }

    public final Object x(Object obj) {
        Object obj2;
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            this.E.r(new j());
            UnlinkInstitutionUseCase w2 = this.E.f36835i;
            String a2 = this.E.f36836j.a();
            int b2 = this.E.f36836j.b();
            this.D = 1;
            obj2 = w2.a(a2, b2, this);
            if (obj2 == f2) {
                return f2;
            }
        } else if (i2 == 1) {
            ResultKt.b(obj);
            obj2 = ((Result) obj).j();
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        InstitutionDetailsViewModel institutionDetailsViewModel = this.E;
        Throwable e2 = Result.e(obj2);
        if (e2 == null) {
            Unit unit = (Unit) obj2;
            institutionDetailsViewModel.r(new k());
            institutionDetailsViewModel.p(InstitutionDetails.Effect.Success.f36828a);
        } else {
            institutionDetailsViewModel.p(new InstitutionDetails.Effect.Error(ApiExceptionsKt.a(e2)));
        }
        return Unit.f40552a;
    }
}
