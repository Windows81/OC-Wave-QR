package com.hansecom.abt.presentation.screens.home.faremedia.addValue;

import com.hansecom.abt.api.ApiExceptionsKt;
import com.hansecom.abt.data.domainExtensions.FareMediumExtKt;
import com.hansecom.abt.data.repositories.FareMediaRepository;
import com.hansecom.abt.presentation.model.PaymentMethodState;
import com.hansecom.abt.presentation.screens.home.faremedia.addValue.FareMediaAddValue;
import com.hansecom.abt.ui.UiResult;
import com.hansecom.mapi.models.FareMedium;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.collections.immutable.PersistentList;
import kotlinx.coroutines.CoroutineScope;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.presentation.screens.home.faremedia.addValue.FareMediaAddValueViewModel$1$fareMediaJob$1", f = "FareMediaAddValueViewModel.kt", l = {96}, m = "invokeSuspend")
public final class FareMediaAddValueViewModel$1$fareMediaJob$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int D;
    public final /* synthetic */ FareMediaAddValueViewModel E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FareMediaAddValueViewModel$1$fareMediaJob$1(FareMediaAddValueViewModel fareMediaAddValueViewModel, Continuation continuation) {
        super(2, continuation);
        this.E = fareMediaAddValueViewModel;
    }

    public static final FareMediaAddValue.State C(FareMedium fareMedium, FareMediaAddValue.State state) {
        return FareMediaAddValue.State.b(state, FareMediumExtKt.a(fareMedium), (String) null, (FareMediaAddValue.State.ValidationError) null, (BigDecimal) null, (BigDecimal) null, (BigDecimal) null, (PersistentList) null, (PaymentMethodState) null, (PersistentList) null, false, false, false, false, (String) null, (UiResult) null, (Integer) null, (BigDecimal) null, (BigDecimal) null, (BigDecimal) null, 524286, (Object) null);
    }

    /* renamed from: B */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((FareMediaAddValueViewModel$1$fareMediaJob$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new FareMediaAddValueViewModel$1$fareMediaJob$1(this.E, continuation);
    }

    public final Object x(Object obj) {
        Object obj2;
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            FareMediaRepository L = this.E.f36087i;
            String K = this.E.f36095q;
            this.D = 1;
            obj2 = L.N(K, this);
            if (obj2 == f2) {
                return f2;
            }
        } else if (i2 == 1) {
            ResultKt.b(obj);
            obj2 = ((Result) obj).j();
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        FareMediaAddValueViewModel fareMediaAddValueViewModel = this.E;
        Throwable e2 = Result.e(obj2);
        if (e2 == null) {
            FareMedium fareMedium = (FareMedium) obj2;
            fareMediaAddValueViewModel.f36096r = fareMedium;
            fareMediaAddValueViewModel.r(new J(fareMedium));
        } else {
            fareMediaAddValueViewModel.p(new FareMediaAddValue.Effect.InitialLoadingError(ApiExceptionsKt.a(e2)));
        }
        return Unit.f40552a;
    }
}
