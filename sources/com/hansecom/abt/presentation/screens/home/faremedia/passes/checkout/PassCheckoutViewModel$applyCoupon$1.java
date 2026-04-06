package com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout;

import com.hansecom.abt.api.ApiExceptionsKt;
import com.hansecom.abt.data.managers.PurchaseManager;
import com.hansecom.abt.presentation.model.PaymentMethodState;
import com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.PassCheckout;
import com.hansecom.abt.ui.UiResult;
import com.hansecom.abt.ui.components.passCard.PassOfferCardState;
import com.hansecom.abt.util.BigDecimalExtKt;
import com.hansecom.abt.util.resourcesResolvers.StringValue;
import com.hansecom.mapi.models.PrePurchaseWithPromoCodeResponse;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.PassCheckoutViewModel$applyCoupon$1", f = "PassCheckoutViewModel.kt", l = {261}, m = "invokeSuspend")
public final class PassCheckoutViewModel$applyCoupon$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int D;
    public final /* synthetic */ PassCheckoutViewModel E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PassCheckoutViewModel$applyCoupon$1(PassCheckoutViewModel passCheckoutViewModel, Continuation continuation) {
        super(2, continuation);
        this.E = passCheckoutViewModel;
    }

    public static final PassCheckout.State E(PassCheckout.State state) {
        return PassCheckout.State.b(state, (String) null, (String) null, (PassOfferCardState) null, (BigDecimal) null, (BigDecimal) null, false, false, (List) null, (PaymentMethodState) null, (StringValue) null, false, (String) null, UiResult.Loading.f37862z, (Integer) null, (BigDecimal) null, 28671, (Object) null);
    }

    public static final PassCheckout.State F(PrePurchaseWithPromoCodeResponse prePurchaseWithPromoCodeResponse, PassCheckout.State state) {
        UiResult.Success success = UiResult.Success.f37863z;
        Integer a2 = prePurchaseWithPromoCodeResponse.a();
        return PassCheckout.State.b(state, (String) null, (String) null, (PassOfferCardState) null, BigDecimalExtKt.c(prePurchaseWithPromoCodeResponse.c()), BigDecimalExtKt.c(prePurchaseWithPromoCodeResponse.d()), false, false, (List) null, (PaymentMethodState) null, (StringValue) null, false, (String) null, success, a2, BigDecimalExtKt.c(prePurchaseWithPromoCodeResponse.b()), 3559, (Object) null);
    }

    public static final PassCheckout.State G(PassCheckoutViewModel passCheckoutViewModel, Throwable th, PassCheckout.State state) {
        UiResult.Error error = r1;
        UiResult.Error error2 = new UiResult.Error(ApiExceptionsKt.a(th));
        return passCheckoutViewModel.j0(PassCheckout.State.b(state, (String) null, (String) null, (PassOfferCardState) null, (BigDecimal) null, (BigDecimal) null, false, false, (List) null, (PaymentMethodState) null, (StringValue) null, false, (String) null, error, (Integer) null, (BigDecimal) null, 28671, (Object) null));
    }

    /* renamed from: D */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((PassCheckoutViewModel$applyCoupon$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new PassCheckoutViewModel$applyCoupon$1(this.E, continuation);
    }

    public final Object x(Object obj) {
        Object obj2;
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            PassOfferCardState j2 = ((PassCheckout.State) this.E.m()).j();
            if (j2 == null) {
                return Unit.f40552a;
            }
            if (((PassCheckout.State) this.E.m()).d().length() > 0) {
                this.E.r(new H());
                PurchaseManager K = this.E.f37109n;
                String i3 = j2.i();
                String d2 = ((PassCheckout.State) this.E.m()).d();
                Integer c2 = Boxing.c(j2.d());
                c2.intValue();
                if (!j2.n()) {
                    c2 = null;
                }
                this.D = 1;
                obj2 = K.e(i3, d2, c2, this);
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
        PassCheckoutViewModel passCheckoutViewModel = this.E;
        Throwable e2 = Result.e(obj2);
        if (e2 == null) {
            passCheckoutViewModel.r(new I((PrePurchaseWithPromoCodeResponse) obj2));
            passCheckoutViewModel.p(PassCheckout.Effect.CouponApplied.f37092a);
        } else {
            passCheckoutViewModel.r(new J(passCheckoutViewModel, e2));
        }
        return Unit.f40552a;
    }
}
