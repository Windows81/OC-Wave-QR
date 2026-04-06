package com.hansecom.abt.presentation.screens.home.faremedia.instituitions.addInstituiton;

import com.hansecom.abt.api.ApiExceptionsKt;
import com.hansecom.abt.data.useCases.institution.LinkInstitutionUseCase;
import com.hansecom.abt.presentation.model.InstitutionState;
import com.hansecom.abt.presentation.screens.home.faremedia.instituitions.addInstituiton.AddInstitution;
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
@DebugMetadata(c = "com.hansecom.abt.presentation.screens.home.faremedia.instituitions.addInstituiton.AddInstitutionViewModel$handle$2", f = "AddInstitutionViewModel.kt", l = {59}, m = "invokeSuspend")
public final class AddInstitutionViewModel$handle$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int D;
    public final /* synthetic */ AddInstitutionViewModel E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddInstitutionViewModel$handle$2(AddInstitutionViewModel addInstitutionViewModel, Continuation continuation) {
        super(2, continuation);
        this.E = addInstitutionViewModel;
    }

    public static final AddInstitution.State E(AddInstitution.State state) {
        return AddInstitution.State.b(state, (InstitutionState) null, true, false, false, 13, (Object) null);
    }

    public static final AddInstitution.State F(AddInstitution.State state) {
        return AddInstitution.State.b(state, (InstitutionState) null, false, false, false, 13, (Object) null);
    }

    public static final AddInstitution.State G(AddInstitution.State state) {
        return AddInstitution.State.b(state, (InstitutionState) null, false, false, false, 13, (Object) null);
    }

    /* renamed from: D */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((AddInstitutionViewModel$handle$2) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new AddInstitutionViewModel$handle$2(this.E, continuation);
    }

    public final Object x(Object obj) {
        Object obj2;
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            this.E.r(new g());
            LinkInstitutionUseCase u2 = this.E.f36802i;
            String a2 = this.E.f36803j.a();
            int b2 = this.E.f36803j.b();
            this.D = 1;
            obj2 = u2.a(a2, b2, this);
            if (obj2 == f2) {
                return f2;
            }
        } else if (i2 == 1) {
            ResultKt.b(obj);
            obj2 = ((Result) obj).j();
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AddInstitutionViewModel addInstitutionViewModel = this.E;
        Throwable e2 = Result.e(obj2);
        if (e2 == null) {
            Unit unit = (Unit) obj2;
            addInstitutionViewModel.r(new h());
            addInstitutionViewModel.p(AddInstitution.Effect.Success.f36795a);
        } else {
            addInstitutionViewModel.r(new i());
            addInstitutionViewModel.p(new AddInstitution.Effect.Error(ApiExceptionsKt.a(e2)));
        }
        return Unit.f40552a;
    }
}
