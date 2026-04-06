package com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout;

import androidx.lifecycle.ViewModelKt;
import com.google.android.gms.wallet.contract.ApiTaskResult;
import com.hansecom.abt.R;
import com.hansecom.abt.data.managers.PurchaseManager;
import com.hansecom.abt.data.useCases.fareMedia.GetFareMediaUseCase;
import com.hansecom.abt.data.useCases.passes.PurchasePassUseCase;
import com.hansecom.abt.data.useCases.passes.PurchasePassWithFareMediaUseCase;
import com.hansecom.abt.data.useCases.passes.PurchasePassWithGooglePayUseCase;
import com.hansecom.abt.data.useCases.paymentMethods.GetDefaultPaymentMethodUseCase;
import com.hansecom.abt.presentation.model.PaymentMethodState;
import com.hansecom.abt.presentation.mvi.MviViewModel;
import com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.CardOptionsCheckoutDestination;
import com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.PassCheckout;
import com.hansecom.abt.ui.UiResult;
import com.hansecom.abt.ui.components.passCard.PassOfferCardState;
import com.hansecom.abt.util.GooglePayClient;
import com.hansecom.abt.util.resourcesResolvers.StringValue;
import com.hansecom.abt.util.resourcesResolvers.StringValueKt;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

@Metadata
public final class PassCheckoutViewModel extends MviViewModel<PassCheckout.Action, PassCheckout.State, PassCheckout.Effect> {

    /* renamed from: i  reason: collision with root package name */
    public final GetFareMediaUseCase f37104i;

    /* renamed from: j  reason: collision with root package name */
    public final GetDefaultPaymentMethodUseCase f37105j;

    /* renamed from: k  reason: collision with root package name */
    public final PurchasePassUseCase f37106k;

    /* renamed from: l  reason: collision with root package name */
    public final PurchasePassWithGooglePayUseCase f37107l;

    /* renamed from: m  reason: collision with root package name */
    public final PurchasePassWithFareMediaUseCase f37108m;

    /* renamed from: n  reason: collision with root package name */
    public final PurchaseManager f37109n;

    /* renamed from: o  reason: collision with root package name */
    public final GooglePayClient f37110o;

    /* renamed from: p  reason: collision with root package name */
    public final CardOptionsCheckoutDestination f37111p;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public PassCheckoutViewModel(androidx.lifecycle.SavedStateHandle r31, com.hansecom.abt.data.repositories.generalData.FareMediaPassesToOfferRepository r32, com.hansecom.abt.AppFeatures r33, com.hansecom.abt.data.useCases.fareMedia.GetFareMediaUseCase r34, com.hansecom.abt.data.useCases.paymentMethods.GetDefaultPaymentMethodUseCase r35, com.hansecom.abt.data.useCases.passes.PurchasePassUseCase r36, com.hansecom.abt.data.useCases.passes.PurchasePassWithGooglePayUseCase r37, com.hansecom.abt.data.useCases.passes.PurchasePassWithFareMediaUseCase r38, com.hansecom.abt.data.managers.PurchaseManager r39, com.hansecom.abt.util.GooglePayClient r40) {
        /*
            r30 = this;
            r0 = r30
            r1 = r31
            r2 = r32
            r3 = r34
            r4 = r35
            r5 = r36
            r6 = r37
            r7 = r38
            r8 = r39
            r9 = r40
            java.lang.String r10 = "savedStateHandle"
            kotlin.jvm.internal.Intrinsics.i(r1, r10)
            java.lang.String r10 = "fareMediaPassesToOfferRepository"
            kotlin.jvm.internal.Intrinsics.i(r2, r10)
            java.lang.String r10 = "appFeatures"
            r11 = r33
            kotlin.jvm.internal.Intrinsics.i(r11, r10)
            java.lang.String r10 = "getFareMediaUseCase"
            kotlin.jvm.internal.Intrinsics.i(r3, r10)
            java.lang.String r10 = "getDefaultPaymentMethodUseCase"
            kotlin.jvm.internal.Intrinsics.i(r4, r10)
            java.lang.String r10 = "purchasePassUseCase"
            kotlin.jvm.internal.Intrinsics.i(r5, r10)
            java.lang.String r10 = "purchasePassWithGooglePayUseCase"
            kotlin.jvm.internal.Intrinsics.i(r6, r10)
            java.lang.String r10 = "purchasePassWithFareMediaUseCase"
            kotlin.jvm.internal.Intrinsics.i(r7, r10)
            java.lang.String r10 = "purchaseManager"
            kotlin.jvm.internal.Intrinsics.i(r8, r10)
            java.lang.String r10 = "googlePayClient"
            kotlin.jvm.internal.Intrinsics.i(r9, r10)
            boolean r23 = r33.k()
            kotlinx.collections.immutable.PersistentList r20 = r33.t()
            com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.PassCheckout$State r10 = new com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.PassCheckout$State
            r12 = r10
            r28 = 31615(0x7b7f, float:4.4302E-41)
            r29 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r21 = 0
            r22 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r0.<init>(r1, r10)
            r0.f37104i = r3
            r0.f37105j = r4
            r0.f37106k = r5
            r0.f37107l = r6
            r0.f37108m = r7
            r0.f37109n = r8
            r0.f37110o = r9
            java.util.Map r3 = kotlin.collections.MapsKt.h()
            java.lang.Class<com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.CardOptionsCheckoutDestination> r4 = com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.CardOptionsCheckoutDestination.class
            kotlin.reflect.KClass r4 = kotlin.jvm.internal.Reflection.b(r4)
            java.lang.Object r1 = androidx.navigation.SavedStateHandleKt.a(r1, r4, r3)
            com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.CardOptionsCheckoutDestination r1 = (com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.CardOptionsCheckoutDestination) r1
            r0.f37111p = r1
            com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.PassCheckoutViewModel$1 r1 = new com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.PassCheckoutViewModel$1
            r3 = 0
            r1.<init>(r2, r0, r3)
            r2 = 7
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r31 = r30
            r32 = r5
            r33 = r6
            r34 = r7
            r36 = r1
            r37 = r2
            r38 = r4
            com.hansecom.abt.presentation.mvi.MviViewModel.t(r31, r32, r33, r34, r36, r37, r38)
            kotlinx.coroutines.CoroutineScope r1 = androidx.lifecycle.ViewModelKt.a(r30)
            com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.PassCheckoutViewModel$2 r2 = new com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.PassCheckoutViewModel$2
            r2.<init>(r0, r3)
            r3 = 3
            r6 = 0
            r31 = r1
            r33 = r6
            r34 = r2
            r35 = r3
            r36 = r4
            kotlinx.coroutines.Job unused = kotlinx.coroutines.BuildersKt__Builders_commonKt.d(r31, r32, r33, r34, r35, r36)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.PassCheckoutViewModel.<init>(androidx.lifecycle.SavedStateHandle, com.hansecom.abt.data.repositories.generalData.FareMediaPassesToOfferRepository, com.hansecom.abt.AppFeatures, com.hansecom.abt.data.useCases.fareMedia.GetFareMediaUseCase, com.hansecom.abt.data.useCases.paymentMethods.GetDefaultPaymentMethodUseCase, com.hansecom.abt.data.useCases.passes.PurchasePassUseCase, com.hansecom.abt.data.useCases.passes.PurchasePassWithGooglePayUseCase, com.hansecom.abt.data.useCases.passes.PurchasePassWithFareMediaUseCase, com.hansecom.abt.data.managers.PurchaseManager, com.hansecom.abt.util.GooglePayClient):void");
    }

    private final void R() {
        Job unused = BuildersKt__Builders_commonKt.d(ViewModelKt.a(this), (CoroutineContext) null, (CoroutineStart) null, new PassCheckoutViewModel$applyCoupon$1(this, (Continuation) null), 3, (Object) null);
    }

    public static final PassCheckout.State T(PassCheckout.Action action, PassCheckout.State state) {
        Intrinsics.i(state, "$this$update");
        return PassCheckout.State.b(state, (String) null, (String) null, (PassOfferCardState) null, (BigDecimal) null, (BigDecimal) null, false, false, (List) null, ((PassCheckout.Action.PaymentMethodChange) action).a(), (StringValue) null, false, (String) null, (UiResult) null, (Integer) null, (BigDecimal) null, 31999, (Object) null);
    }

    public static final PassCheckout.State U(PassCheckout.Action action, PassCheckout.State state) {
        Intrinsics.i(state, "$this$update");
        return PassCheckout.State.b(state, (String) null, (String) null, (PassOfferCardState) null, (BigDecimal) null, (BigDecimal) null, false, false, (List) null, (PaymentMethodState) null, (StringValue) null, false, ((PassCheckout.Action.CouponChange) action).a(), UiResult.Init.f37861z, (Integer) null, (BigDecimal) null, 26623, (Object) null);
    }

    public static final PassCheckout.State W(PassCheckout.State state) {
        Intrinsics.i(state, "$this$update");
        return PassCheckout.State.b(state, (String) null, (String) null, (PassOfferCardState) null, (BigDecimal) null, (BigDecimal) null, false, false, (List) null, (PaymentMethodState) null, (StringValue) null, false, (String) null, (UiResult) null, (Integer) null, (BigDecimal) null, 32703, (Object) null);
    }

    public static final PassCheckout.State X(PassCheckout.State state) {
        Intrinsics.i(state, "$this$update");
        return PassCheckout.State.b(state, (String) null, (String) null, (PassOfferCardState) null, (BigDecimal) null, (BigDecimal) null, false, false, (List) null, (PaymentMethodState) null, (StringValue) null, false, (String) null, (UiResult) null, (Integer) null, (BigDecimal) null, 32703, (Object) null);
    }

    public static final PassCheckout.State Y(PassCheckout.State state) {
        Intrinsics.i(state, "$this$update");
        return PassCheckout.State.b(state, (String) null, (String) null, (PassOfferCardState) null, (BigDecimal) null, (BigDecimal) null, false, false, (List) null, (PaymentMethodState) null, StringValueKt.c(R.string.S2), false, (String) null, (UiResult) null, (Integer) null, (BigDecimal) null, 32255, (Object) null);
    }

    public static final PassCheckout.State Z(PassCheckout.State state) {
        Intrinsics.i(state, "$this$update");
        return PassCheckout.State.b(state, (String) null, (String) null, (PassOfferCardState) null, (BigDecimal) null, (BigDecimal) null, false, true, (List) null, (PaymentMethodState) null, (StringValue) null, false, (String) null, (UiResult) null, (Integer) null, (BigDecimal) null, 32703, (Object) null);
    }

    public static final PassCheckout.State a0(PassCheckout.State state) {
        Intrinsics.i(state, "$this$update");
        return PassCheckout.State.b(state, (String) null, (String) null, (PassOfferCardState) null, (BigDecimal) null, (BigDecimal) null, false, true, (List) null, (PaymentMethodState) null, (StringValue) null, false, (String) null, (UiResult) null, (Integer) null, (BigDecimal) null, 32703, (Object) null);
    }

    public static final PassCheckout.State b0(PassCheckout.State state) {
        Intrinsics.i(state, "$this$update");
        return PassCheckout.State.b(state, (String) null, (String) null, (PassOfferCardState) null, (BigDecimal) null, (BigDecimal) null, false, false, (List) null, (PaymentMethodState) null, (StringValue) null, false, (String) null, (UiResult) null, (Integer) null, (BigDecimal) null, 32703, (Object) null);
    }

    public static final PassCheckout.State c0(PassCheckout.State state) {
        Intrinsics.i(state, "$this$update");
        return PassCheckout.State.b(state, (String) null, (String) null, (PassOfferCardState) null, (BigDecimal) null, (BigDecimal) null, false, false, (List) null, (PaymentMethodState) null, (StringValue) null, false, (String) null, (UiResult) null, (Integer) null, (BigDecimal) null, 32703, (Object) null);
    }

    public static final PassCheckout.State d0(PassCheckout.State state) {
        Intrinsics.i(state, "$this$update");
        return PassCheckout.State.b(state, (String) null, (String) null, (PassOfferCardState) null, (BigDecimal) null, (BigDecimal) null, false, false, (List) null, (PaymentMethodState) null, (StringValue) null, false, (String) null, (UiResult) null, (Integer) null, (BigDecimal) null, 32703, (Object) null);
    }

    public static final PassCheckout.State e0(PassCheckout.State state) {
        Intrinsics.i(state, "$this$update");
        return PassCheckout.State.b(state, (String) null, (String) null, (PassOfferCardState) null, (BigDecimal) null, (BigDecimal) null, false, false, (List) null, (PaymentMethodState) null, (StringValue) null, false, (String) null, (UiResult) null, (Integer) null, (BigDecimal) null, 32703, (Object) null);
    }

    public static final PassCheckout.State f0(PassCheckout.State state) {
        Intrinsics.i(state, "$this$update");
        return PassCheckout.State.b(state, (String) null, (String) null, (PassOfferCardState) null, (BigDecimal) null, (BigDecimal) null, false, true, (List) null, (PaymentMethodState) null, (StringValue) null, false, (String) null, (UiResult) null, (Integer) null, (BigDecimal) null, 32703, (Object) null);
    }

    private final void g0(ApiTaskResult apiTaskResult) {
        Job unused = BuildersKt__Builders_commonKt.d(ViewModelKt.a(this), (CoroutineContext) null, (CoroutineStart) null, new PassCheckoutViewModel$onGooglePayResult$1(apiTaskResult, this, (Continuation) null), 3, (Object) null);
    }

    private final void h0() {
        r(new u(this));
        p(PassCheckout.Effect.CouponReset.f37093a);
    }

    public static final PassCheckout.State i0(PassCheckoutViewModel passCheckoutViewModel, PassCheckout.State state) {
        Intrinsics.i(state, "$this$update");
        return passCheckoutViewModel.j0(PassCheckout.State.b(state, (String) null, (String) null, (PassOfferCardState) null, (BigDecimal) null, (BigDecimal) null, false, false, (List) null, (PaymentMethodState) null, (StringValue) null, false, "", UiResult.Init.f37861z, (Integer) null, (BigDecimal) null, 9727, (Object) null));
    }

    /* renamed from: S */
    public Object o(PassCheckout.Action action, Continuation continuation) {
        if (action instanceof PassCheckout.Action.PaymentMethodChange) {
            r(new s(action));
        } else if (action instanceof PassCheckout.Action.CouponChange) {
            r(new t(action));
        } else if (Intrinsics.d(action, PassCheckout.Action.Confirm.f37086a)) {
            Object V = V(continuation);
            return V == IntrinsicsKt.f() ? V : Unit.f40552a;
        } else if (Intrinsics.d(action, PassCheckout.Action.CouponApply.f37087a)) {
            R();
        } else if (Intrinsics.d(action, PassCheckout.Action.CouponReset.f37089a)) {
            h0();
        } else if (action instanceof PassCheckout.Action.GooglePayResult) {
            g0(((PassCheckout.Action.GooglePayResult) action).a());
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.f40552a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01aa  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0268  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x027f  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object V(kotlin.coroutines.Continuation r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.PassCheckoutViewModel$makePurchase$1
            if (r0 == 0) goto L_0x0014
            r0 = r14
            com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.PassCheckoutViewModel$makePurchase$1 r0 = (com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.PassCheckoutViewModel$makePurchase$1) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0014
            int r1 = r1 - r2
            r0.G = r1
        L_0x0012:
            r7 = r0
            goto L_0x001a
        L_0x0014:
            com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.PassCheckoutViewModel$makePurchase$1 r0 = new com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.PassCheckoutViewModel$makePurchase$1
            r0.<init>(r13, r14)
            goto L_0x0012
        L_0x001a:
            java.lang.Object r14 = r7.E
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r1 = r7.G
            r2 = 3
            r3 = 1
            r10 = 2
            r11 = 0
            if (r1 == 0) goto L_0x006f
            if (r1 == r3) goto L_0x005c
            if (r1 == r10) goto L_0x0049
            if (r1 != r2) goto L_0x0041
            java.lang.Object r0 = r7.D
            com.hansecom.abt.ui.components.passCard.PassOfferCardState r0 = (com.hansecom.abt.ui.components.passCard.PassOfferCardState) r0
            java.lang.Object r1 = r7.C
            com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.PassCheckoutViewModel r1 = (com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.PassCheckoutViewModel) r1
            kotlin.ResultKt.b(r14)
            kotlin.Result r14 = (kotlin.Result) r14
            java.lang.Object r14 = r14.j()
            goto L_0x0262
        L_0x0041:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L_0x0049:
            java.lang.Object r0 = r7.D
            com.hansecom.abt.ui.components.passCard.PassOfferCardState r0 = (com.hansecom.abt.ui.components.passCard.PassOfferCardState) r0
            java.lang.Object r1 = r7.C
            com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.PassCheckoutViewModel r1 = (com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.PassCheckoutViewModel) r1
            kotlin.ResultKt.b(r14)
            kotlin.Result r14 = (kotlin.Result) r14
            java.lang.Object r14 = r14.j()
            goto L_0x018c
        L_0x005c:
            java.lang.Object r0 = r7.D
            com.hansecom.abt.ui.components.passCard.PassOfferCardState r0 = (com.hansecom.abt.ui.components.passCard.PassOfferCardState) r0
            java.lang.Object r1 = r7.C
            com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.PassCheckoutViewModel r1 = (com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.PassCheckoutViewModel) r1
            kotlin.ResultKt.b(r14)
            kotlin.Result r14 = (kotlin.Result) r14
            java.lang.Object r14 = r14.j()
            goto L_0x00d8
        L_0x006f:
            kotlin.ResultKt.b(r14)
            android.os.Parcelable r14 = r13.m()
            com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.PassCheckout$State r14 = (com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.PassCheckout.State) r14
            com.hansecom.abt.ui.components.passCard.PassOfferCardState r14 = r14.j()
            if (r14 != 0) goto L_0x0081
            kotlin.Unit r14 = kotlin.Unit.f40552a
            return r14
        L_0x0081:
            android.os.Parcelable r1 = r13.m()
            com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.PassCheckout$State r1 = (com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.PassCheckout.State) r1
            com.hansecom.abt.presentation.model.PaymentMethodState r1 = r1.k()
            android.os.Parcelable r4 = r13.m()
            com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.PassCheckout$State r4 = (com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.PassCheckout.State) r4
            boolean r4 = r4.s()
            if (r4 == 0) goto L_0x010c
            com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.r r1 = new com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.r
            r1.<init>()
            r13.r(r1)
            com.hansecom.abt.data.useCases.passes.PurchasePassUseCase r1 = r13.f37106k
            com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.CardOptionsCheckoutDestination r2 = r13.f37111p
            java.lang.String r2 = r2.a()
            java.lang.String r4 = r14.i()
            int r5 = r14.d()
            java.lang.Integer r5 = kotlin.coroutines.jvm.internal.Boxing.c(r5)
            r5.intValue()
            boolean r6 = r14.n()
            if (r6 == 0) goto L_0x00bd
            goto L_0x00be
        L_0x00bd:
            r5 = r11
        L_0x00be:
            r7.C = r13
            r7.D = r14
            r7.G = r3
            r6 = 0
            r8 = 0
            r9 = 20
            r12 = 0
            r3 = r4
            r4 = r6
            r6 = r8
            r8 = r9
            r9 = r12
            java.lang.Object r1 = com.hansecom.abt.data.useCases.passes.PurchasePassUseCase.b(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            if (r1 != r0) goto L_0x00d5
            return r0
        L_0x00d5:
            r0 = r14
            r14 = r1
            r1 = r13
        L_0x00d8:
            java.lang.Throwable r2 = kotlin.Result.e(r14)
            if (r2 != 0) goto L_0x00f6
            kotlin.Unit r14 = (kotlin.Unit) r14
            com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.v r14 = new com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.v
            r14.<init>()
            r1.r(r14)
            com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.PassCheckout$Effect$Success r14 = new com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.PassCheckout$Effect$Success
            java.lang.String r0 = r0.h()
            r14.<init>(r0)
            r1.p(r14)
            goto L_0x029e
        L_0x00f6:
            com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.w r14 = new com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.w
            r14.<init>()
            r1.r(r14)
            com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.PassCheckout$Effect$Error r14 = new com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.PassCheckout$Effect$Error
            com.hansecom.abt.util.resourcesResolvers.StringValue r0 = com.hansecom.abt.api.ApiExceptionsKt.a(r2)
            r14.<init>(r0, r11, r10, r11)
            r1.p(r14)
            goto L_0x029e
        L_0x010c:
            boolean r3 = r1 instanceof com.hansecom.abt.presentation.model.PaymentMethodState.CreditCard
            if (r3 == 0) goto L_0x01c0
            com.hansecom.abt.presentation.model.PaymentMethodState$CreditCard r1 = (com.hansecom.abt.presentation.model.PaymentMethodState.CreditCard) r1
            boolean r2 = r1.g()
            if (r2 == 0) goto L_0x0129
            com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.PassCheckout$Effect$Error r14 = new com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.PassCheckout$Effect$Error
            int r0 = com.hansecom.abt.R.string.T3
            com.hansecom.abt.util.resourcesResolvers.StringValue r0 = com.hansecom.abt.util.resourcesResolvers.StringValueKt.c(r0)
            r14.<init>(r0, r11, r10, r11)
            r13.p(r14)
            kotlin.Unit r14 = kotlin.Unit.f40552a
            return r14
        L_0x0129:
            com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.x r2 = new com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.x
            r2.<init>()
            r13.r(r2)
            com.hansecom.abt.data.useCases.passes.PurchasePassUseCase r2 = r13.f37106k
            com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.CardOptionsCheckoutDestination r3 = r13.f37111p
            java.lang.String r3 = r3.a()
            java.lang.String r4 = r14.i()
            long r5 = r1.c()
            java.lang.Long r5 = kotlin.coroutines.jvm.internal.Boxing.d(r5)
            int r1 = r14.d()
            java.lang.Integer r1 = kotlin.coroutines.jvm.internal.Boxing.c(r1)
            r1.intValue()
            boolean r6 = r14.n()
            if (r6 == 0) goto L_0x0158
            r6 = r1
            goto L_0x0159
        L_0x0158:
            r6 = r11
        L_0x0159:
            android.os.Parcelable r1 = r13.m()
            com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.PassCheckout$State r1 = (com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.PassCheckout.State) r1
            java.lang.String r1 = r1.d()
            android.os.Parcelable r8 = r13.m()
            com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.PassCheckout$State r8 = (com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.PassCheckout.State) r8
            com.hansecom.abt.ui.UiResult r8 = r8.g()
            boolean r8 = r8.c()
            if (r8 == 0) goto L_0x0175
            r8 = r1
            goto L_0x0176
        L_0x0175:
            r8 = r11
        L_0x0176:
            r7.C = r13
            r7.D = r14
            r7.G = r10
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r8
            java.lang.Object r1 = r1.a(r2, r3, r4, r5, r6, r7)
            if (r1 != r0) goto L_0x0189
            return r0
        L_0x0189:
            r0 = r14
            r14 = r1
            r1 = r13
        L_0x018c:
            java.lang.Throwable r2 = kotlin.Result.e(r14)
            if (r2 != 0) goto L_0x01aa
            kotlin.Unit r14 = (kotlin.Unit) r14
            com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.y r14 = new com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.y
            r14.<init>()
            r1.r(r14)
            com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.PassCheckout$Effect$Success r14 = new com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.PassCheckout$Effect$Success
            java.lang.String r0 = r0.h()
            r14.<init>(r0)
            r1.p(r14)
            goto L_0x029e
        L_0x01aa:
            com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.z r14 = new com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.z
            r14.<init>()
            r1.r(r14)
            com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.PassCheckout$Effect$Error r14 = new com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.PassCheckout$Effect$Error
            com.hansecom.abt.util.resourcesResolvers.StringValue r0 = com.hansecom.abt.api.ApiExceptionsKt.a(r2)
            r14.<init>(r0, r11, r10, r11)
            r1.p(r14)
            goto L_0x029e
        L_0x01c0:
            boolean r3 = r1 instanceof com.hansecom.abt.presentation.model.PaymentMethodState.GooglePay
            if (r3 == 0) goto L_0x01e2
            com.hansecom.abt.util.GooglePayClient r14 = r13.f37110o
            android.os.Parcelable r0 = r13.m()
            com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.PassCheckout$State r0 = (com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.PassCheckout.State) r0
            java.math.BigDecimal r0 = r0.q()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            com.google.android.gms.tasks.Task r14 = r14.h(r0)
            com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.PassCheckout$Effect$GooglePayRequest r0 = new com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.PassCheckout$Effect$GooglePayRequest
            r0.<init>(r14)
            r13.p(r0)
            goto L_0x029e
        L_0x01e2:
            boolean r3 = r1 instanceof com.hansecom.abt.presentation.model.PaymentMethodState.FareMedia
            if (r3 == 0) goto L_0x0294
            com.hansecom.abt.presentation.model.PaymentMethodState$FareMedia r1 = (com.hansecom.abt.presentation.model.PaymentMethodState.FareMedia) r1
            java.math.BigDecimal r1 = r1.a()
            android.os.Parcelable r3 = r13.m()
            com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.PassCheckout$State r3 = (com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.PassCheckout.State) r3
            java.math.BigDecimal r3 = r3.q()
            int r1 = r1.compareTo(r3)
            if (r1 >= 0) goto L_0x0207
            com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.A r14 = new com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.A
            r14.<init>()
            r13.r(r14)
            kotlin.Unit r14 = kotlin.Unit.f40552a
            return r14
        L_0x0207:
            com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.B r1 = new com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.B
            r1.<init>()
            r13.r(r1)
            com.hansecom.abt.data.useCases.passes.PurchasePassWithFareMediaUseCase r1 = r13.f37108m
            com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.CardOptionsCheckoutDestination r3 = r13.f37111p
            java.lang.String r3 = r3.a()
            java.lang.String r4 = r14.i()
            int r5 = r14.d()
            java.lang.Integer r5 = kotlin.coroutines.jvm.internal.Boxing.c(r5)
            r5.intValue()
            boolean r6 = r14.n()
            if (r6 == 0) goto L_0x022d
            goto L_0x022e
        L_0x022d:
            r5 = r11
        L_0x022e:
            android.os.Parcelable r6 = r13.m()
            com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.PassCheckout$State r6 = (com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.PassCheckout.State) r6
            java.lang.String r6 = r6.d()
            android.os.Parcelable r8 = r13.m()
            com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.PassCheckout$State r8 = (com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.PassCheckout.State) r8
            com.hansecom.abt.ui.UiResult r8 = r8.g()
            boolean r8 = r8.c()
            if (r8 == 0) goto L_0x0249
            goto L_0x024a
        L_0x0249:
            r6 = r11
        L_0x024a:
            r7.C = r13
            r7.D = r14
            r7.G = r2
            r8 = 0
            r9 = 4
            r12 = 0
            r2 = r3
            r3 = r4
            r4 = r8
            r8 = r9
            r9 = r12
            java.lang.Object r1 = com.hansecom.abt.data.useCases.passes.PurchasePassWithFareMediaUseCase.b(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            if (r1 != r0) goto L_0x025f
            return r0
        L_0x025f:
            r0 = r14
            r14 = r1
            r1 = r13
        L_0x0262:
            java.lang.Throwable r2 = kotlin.Result.e(r14)
            if (r2 != 0) goto L_0x027f
            kotlin.Unit r14 = (kotlin.Unit) r14
            com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.C r14 = new com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.C
            r14.<init>()
            r1.r(r14)
            com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.PassCheckout$Effect$Success r14 = new com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.PassCheckout$Effect$Success
            java.lang.String r0 = r0.h()
            r14.<init>(r0)
            r1.p(r14)
            goto L_0x029e
        L_0x027f:
            com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.D r14 = new com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.D
            r14.<init>()
            r1.r(r14)
            com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.PassCheckout$Effect$Error r14 = new com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.PassCheckout$Effect$Error
            com.hansecom.abt.util.resourcesResolvers.StringValue r0 = com.hansecom.abt.api.ApiExceptionsKt.a(r2)
            r14.<init>(r0, r11, r10, r11)
            r1.p(r14)
            goto L_0x029e
        L_0x0294:
            timber.log.Timber$Forest r14 = timber.log.Timber.f44337a
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "Unsupported payment method"
            r14.b(r1, r0)
        L_0x029e:
            kotlin.Unit r14 = kotlin.Unit.f40552a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.PassCheckoutViewModel.V(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final PassCheckout.State j0(PassCheckout.State state) {
        if (state.j() == null) {
            return state;
        }
        BigDecimal j2 = state.j().j();
        return PassCheckout.State.b(state, (String) null, (String) null, (PassOfferCardState) null, j2, j2, false, false, (List) null, (PaymentMethodState) null, (StringValue) null, false, (String) null, (UiResult) null, (Integer) null, (BigDecimal) null, 32743, (Object) null);
    }
}
