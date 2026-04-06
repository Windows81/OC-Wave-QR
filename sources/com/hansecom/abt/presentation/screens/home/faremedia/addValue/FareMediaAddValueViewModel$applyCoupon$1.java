package com.hansecom.abt.presentation.screens.home.faremedia.addValue;

import com.hansecom.abt.api.ApiExceptionsKt;
import com.hansecom.abt.data.managers.PurchaseManager;
import com.hansecom.abt.presentation.model.PaymentMethodState;
import com.hansecom.abt.presentation.screens.home.faremedia.addValue.FareMediaAddValue;
import com.hansecom.abt.ui.UiResult;
import com.hansecom.abt.util.BigDecimalExtKt;
import com.hansecom.mapi.models.PrePurchaseWithPromoCodeResponse;
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
@DebugMetadata(c = "com.hansecom.abt.presentation.screens.home.faremedia.addValue.FareMediaAddValueViewModel$applyCoupon$1", f = "FareMediaAddValueViewModel.kt", l = {299}, m = "invokeSuspend")
public final class FareMediaAddValueViewModel$applyCoupon$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int D;
    public final /* synthetic */ FareMediaAddValueViewModel E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FareMediaAddValueViewModel$applyCoupon$1(FareMediaAddValueViewModel fareMediaAddValueViewModel, Continuation continuation) {
        super(2, continuation);
        this.E = fareMediaAddValueViewModel;
    }

    /* access modifiers changed from: private */
    public static final FareMediaAddValue.State E(FareMediaAddValue.State state) {
        return FareMediaAddValue.State.b(state, (String) null, (String) null, (FareMediaAddValue.State.ValidationError) null, (BigDecimal) null, (BigDecimal) null, (BigDecimal) null, (PersistentList) null, (PaymentMethodState) null, (PersistentList) null, false, false, false, false, (String) null, UiResult.Loading.f37862z, (Integer) null, (BigDecimal) null, (BigDecimal) null, (BigDecimal) null, 507903, (Object) null);
    }

    public static final FareMediaAddValue.State F(PrePurchaseWithPromoCodeResponse prePurchaseWithPromoCodeResponse, FareMediaAddValue.State state) {
        return FareMediaAddValue.State.b(state, (String) null, (String) null, (FareMediaAddValue.State.ValidationError) null, (BigDecimal) null, (BigDecimal) null, (BigDecimal) null, (PersistentList) null, (PaymentMethodState) null, (PersistentList) null, false, false, false, false, (String) null, UiResult.Success.f37863z, prePurchaseWithPromoCodeResponse.a(), BigDecimalExtKt.c(prePurchaseWithPromoCodeResponse.b()), BigDecimalExtKt.c(prePurchaseWithPromoCodeResponse.c()), BigDecimalExtKt.c(prePurchaseWithPromoCodeResponse.d()), 16383, (Object) null);
    }

    public static final FareMediaAddValue.State G(FareMediaAddValueViewModel fareMediaAddValueViewModel, Throwable th, FareMediaAddValue.State state) {
        UiResult.Error error = r1;
        UiResult.Error error2 = new UiResult.Error(ApiExceptionsKt.a(th));
        return fareMediaAddValueViewModel.Y(FareMediaAddValue.State.b(state, (String) null, (String) null, (FareMediaAddValue.State.ValidationError) null, (BigDecimal) null, (BigDecimal) null, (BigDecimal) null, (PersistentList) null, (PaymentMethodState) null, (PersistentList) null, false, false, false, false, (String) null, error, (Integer) null, (BigDecimal) null, (BigDecimal) null, (BigDecimal) null, 507903, (Object) null));
    }

    /* renamed from: D */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((FareMediaAddValueViewModel$applyCoupon$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new FareMediaAddValueViewModel$applyCoupon$1(this.E, continuation);
    }

    public final Object x(Object obj) {
        Object obj2;
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            if (((FareMediaAddValue.State) this.E.m()).e().length() > 0 && ((FareMediaAddValue.State) this.E.m()).i() == null && ((FareMediaAddValue.State) this.E.m()).r().compareTo(BigDecimal.ZERO) > 0) {
                this.E.r(new M());
                PurchaseManager O = this.E.f36092n;
                BigDecimal r2 = ((FareMediaAddValue.State) this.E.m()).r();
                String e2 = ((FareMediaAddValue.State) this.E.m()).e();
                this.D = 1;
                obj2 = O.d(r2, e2, this);
                if (obj2 == f2) {
                    return f2;
                }
            }
            return Unit.f40552a;
        } else if (i2 == 1) {
            ResultKt.b(obj);
            obj2 = ((Result) obj).j();
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        FareMediaAddValueViewModel fareMediaAddValueViewModel = this.E;
        Throwable e3 = Result.e(obj2);
        if (e3 == null) {
            fareMediaAddValueViewModel.r(new N((PrePurchaseWithPromoCodeResponse) obj2));
            fareMediaAddValueViewModel.p(FareMediaAddValue.Effect.CouponApplied.f36064a);
        } else {
            fareMediaAddValueViewModel.r(new O(fareMediaAddValueViewModel, e3));
        }
        return Unit.f40552a;
    }
}
