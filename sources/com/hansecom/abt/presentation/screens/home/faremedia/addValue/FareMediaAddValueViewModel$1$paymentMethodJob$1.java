package com.hansecom.abt.presentation.screens.home.faremedia.addValue;

import com.hansecom.abt.api.ApiExceptionsKt;
import com.hansecom.abt.data.useCases.paymentMethods.GetDefaultPaymentMethodUseCase;
import com.hansecom.abt.presentation.model.PaymentMethodState;
import com.hansecom.abt.presentation.model.PaymentMethodStateKt;
import com.hansecom.abt.presentation.screens.home.faremedia.addValue.FareMediaAddValue;
import com.hansecom.abt.ui.UiResult;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.PersistentList;
import kotlinx.coroutines.CoroutineScope;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.presentation.screens.home.faremedia.addValue.FareMediaAddValueViewModel$1$paymentMethodJob$1", f = "FareMediaAddValueViewModel.kt", l = {106}, m = "invokeSuspend")
public final class FareMediaAddValueViewModel$1$paymentMethodJob$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int D;
    public final /* synthetic */ FareMediaAddValueViewModel E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FareMediaAddValueViewModel$1$paymentMethodJob$1(FareMediaAddValueViewModel fareMediaAddValueViewModel, Continuation continuation) {
        super(2, continuation);
        this.E = fareMediaAddValueViewModel;
    }

    public static final FareMediaAddValue.State C(GetDefaultPaymentMethodUseCase.Response response, FareMediaAddValueViewModel fareMediaAddValueViewModel, FareMediaAddValue.State state) {
        PaymentMethodState paymentMethodState;
        GetDefaultPaymentMethodUseCase.Response response2 = response;
        if (response2 instanceof GetDefaultPaymentMethodUseCase.Response.CreditCard) {
            paymentMethodState = PaymentMethodStateKt.a(((GetDefaultPaymentMethodUseCase.Response.CreditCard) response2).a());
        } else if (Intrinsics.d(response2, GetDefaultPaymentMethodUseCase.Response.GooglePay.f34046a)) {
            String jSONArray = fareMediaAddValueViewModel.f36093o.f().toString();
            Intrinsics.h(jSONArray, "toString(...)");
            paymentMethodState = new PaymentMethodState.GooglePay(jSONArray);
        } else if (Intrinsics.d(response2, GetDefaultPaymentMethodUseCase.Response.Undefined.f34047a)) {
            paymentMethodState = null;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return FareMediaAddValue.State.b(state, (String) null, (String) null, (FareMediaAddValue.State.ValidationError) null, (BigDecimal) null, (BigDecimal) null, (BigDecimal) null, (PersistentList) null, paymentMethodState, (PersistentList) null, false, false, false, false, (String) null, (UiResult) null, (Integer) null, (BigDecimal) null, (BigDecimal) null, (BigDecimal) null, 524159, (Object) null);
    }

    /* renamed from: B */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((FareMediaAddValueViewModel$1$paymentMethodJob$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new FareMediaAddValueViewModel$1$paymentMethodJob$1(this.E, continuation);
    }

    public final Object x(Object obj) {
        Object obj2;
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            GetDefaultPaymentMethodUseCase M = this.E.f36090l;
            PersistentList o2 = ((FareMediaAddValue.State) this.E.m()).o();
            this.D = 1;
            obj2 = M.c(o2, this);
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
            fareMediaAddValueViewModel.r(new K((GetDefaultPaymentMethodUseCase.Response) obj2, fareMediaAddValueViewModel));
        } else {
            fareMediaAddValueViewModel.p(new FareMediaAddValue.Effect.Error(ApiExceptionsKt.a(e2), (List) null, 2, (DefaultConstructorMarker) null));
        }
        return Unit.f40552a;
    }
}
