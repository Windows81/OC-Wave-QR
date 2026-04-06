package com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout;

import com.google.android.gms.wallet.PaymentData;
import com.google.android.gms.wallet.contract.ApiTaskResult;
import com.hansecom.abt.R;
import com.hansecom.abt.api.ApiExceptionsKt;
import com.hansecom.abt.data.useCases.passes.PurchasePassWithGooglePayUseCase;
import com.hansecom.abt.presentation.model.PaymentMethodState;
import com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.PassCheckout;
import com.hansecom.abt.ui.UiResult;
import com.hansecom.abt.ui.components.passCard.PassOfferCardState;
import com.hansecom.abt.util.resourcesResolvers.StringValue;
import com.hansecom.abt.util.resourcesResolvers.StringValueKt;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import timber.log.Timber;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.PassCheckoutViewModel$onGooglePayResult$1", f = "PassCheckoutViewModel.kt", l = {225}, m = "invokeSuspend")
public final class PassCheckoutViewModel$onGooglePayResult$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public Object D;
    public int E;
    public final /* synthetic */ ApiTaskResult F;
    public final /* synthetic */ PassCheckoutViewModel G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PassCheckoutViewModel$onGooglePayResult$1(ApiTaskResult apiTaskResult, PassCheckoutViewModel passCheckoutViewModel, Continuation continuation) {
        super(2, continuation);
        this.F = apiTaskResult;
        this.G = passCheckoutViewModel;
    }

    /* access modifiers changed from: private */
    public static final PassCheckout.State E(PassCheckout.State state) {
        return PassCheckout.State.b(state, (String) null, (String) null, (PassOfferCardState) null, (BigDecimal) null, (BigDecimal) null, false, true, (List) null, (PaymentMethodState) null, (StringValue) null, false, (String) null, (UiResult) null, (Integer) null, (BigDecimal) null, 32703, (Object) null);
    }

    public static final PassCheckout.State F(PassCheckout.State state) {
        return PassCheckout.State.b(state, (String) null, (String) null, (PassOfferCardState) null, (BigDecimal) null, (BigDecimal) null, false, false, (List) null, (PaymentMethodState) null, (StringValue) null, false, (String) null, (UiResult) null, (Integer) null, (BigDecimal) null, 32703, (Object) null);
    }

    public static final PassCheckout.State G(PassCheckout.State state) {
        return PassCheckout.State.b(state, (String) null, (String) null, (PassOfferCardState) null, (BigDecimal) null, (BigDecimal) null, false, false, (List) null, (PaymentMethodState) null, (StringValue) null, false, (String) null, (UiResult) null, (Integer) null, (BigDecimal) null, 32703, (Object) null);
    }

    /* renamed from: D */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((PassCheckoutViewModel$onGooglePayResult$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new PassCheckoutViewModel$onGooglePayResult$1(this.F, this.G, continuation);
    }

    public final Object x(Object obj) {
        Object obj2;
        PassOfferCardState passOfferCardState;
        Object f2 = IntrinsicsKt.f();
        int i2 = this.E;
        if (i2 == 0) {
            ResultKt.b(obj);
            if (this.F.b().S() != 0 || this.F.a() == null) {
                if (this.F.b().S() != 16) {
                    Timber.Forest forest = Timber.f44337a;
                    int S = this.F.b().S();
                    String X = this.F.b().X();
                    forest.b("Google Pay error [" + S + "] " + X, new Object[0]);
                    PassCheckoutViewModel passCheckoutViewModel = this.G;
                    StringValue c2 = StringValueKt.c(R.string.Q3);
                    String X2 = this.F.b().X();
                    if (X2 == null) {
                        X2 = String.valueOf(this.F.b().S());
                    }
                    passCheckoutViewModel.p(new PassCheckout.Effect.Error(c2, CollectionsKt.e(X2)));
                }
                return Unit.f40552a;
            }
            PassOfferCardState j2 = ((PassCheckout.State) this.G.m()).j();
            if (j2 == null) {
                return Unit.f40552a;
            }
            this.G.r(new K());
            PurchasePassWithGooglePayUseCase L = this.G.f37107l;
            String a2 = this.G.f37111p.a();
            String i3 = j2.i();
            Object a3 = this.F.a();
            Intrinsics.f(a3);
            PaymentData paymentData = (PaymentData) a3;
            Integer c3 = Boxing.c(j2.d());
            c3.intValue();
            Integer num = j2.n() ? c3 : null;
            String d2 = ((PassCheckout.State) this.G.m()).g().c() ? ((PassCheckout.State) this.G.m()).d() : null;
            this.D = j2;
            this.E = 1;
            Object a4 = L.a(a2, i3, paymentData, num, d2, this);
            if (a4 == f2) {
                return f2;
            }
            passOfferCardState = j2;
            obj2 = a4;
        } else if (i2 == 1) {
            passOfferCardState = (PassOfferCardState) this.D;
            ResultKt.b(obj);
            obj2 = ((Result) obj).j();
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        PassCheckoutViewModel passCheckoutViewModel2 = this.G;
        Throwable e2 = Result.e(obj2);
        if (e2 == null) {
            Unit unit = (Unit) obj2;
            passCheckoutViewModel2.r(new L());
            passCheckoutViewModel2.p(new PassCheckout.Effect.Success(passOfferCardState.h()));
        } else {
            passCheckoutViewModel2.r(new M());
            passCheckoutViewModel2.p(new PassCheckout.Effect.Error(ApiExceptionsKt.a(e2), (List) null, 2, (DefaultConstructorMarker) null));
        }
        return Unit.f40552a;
    }
}
