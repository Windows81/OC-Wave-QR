package com.hansecom.abt.presentation.screens.home.faremedia.purchaseCard;

import com.hansecom.abt.data.exceptions.FieldErrorsException;
import com.hansecom.abt.data.useCases.GetAllVirtualFareMediaUseCase;
import com.hansecom.abt.data.useCases.GetEnvironmentConfigurationUseCase;
import com.hansecom.abt.data.useCases.fareMedia.PurchaseVirtualCardUseCase;
import com.hansecom.abt.presentation.model.PaymentMethodState;
import com.hansecom.abt.presentation.mvi.MviViewModel;
import com.hansecom.abt.presentation.screens.home.faremedia.purchaseCard.FareMediaPurchaseCard;
import com.hansecom.abt.util.resourcesResolvers.StringValue;
import com.hansecom.abt.util.resourcesResolvers.StringValueKt;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.PersistentList;

@Metadata
public final class FareMediaPurchaseCardViewModel extends MviViewModel<FareMediaPurchaseCard.Action, FareMediaPurchaseCard.State, FareMediaPurchaseCard.Effect> {

    /* renamed from: l  reason: collision with root package name */
    public static final int f37188l = ((GetEnvironmentConfigurationUseCase.f33729b | GetAllVirtualFareMediaUseCase.f33724b) | PurchaseVirtualCardUseCase.f33921c);

    /* renamed from: i  reason: collision with root package name */
    public final PurchaseVirtualCardUseCase f37189i;

    /* renamed from: j  reason: collision with root package name */
    public final GetAllVirtualFareMediaUseCase f37190j;

    /* renamed from: k  reason: collision with root package name */
    public final GetEnvironmentConfigurationUseCase f37191k;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public FareMediaPurchaseCardViewModel(androidx.lifecycle.SavedStateHandle r25, com.hansecom.abt.AppFeatures r26, com.hansecom.abt.presentation.wallet.GoogleWalletHelper r27, com.hansecom.abt.data.useCases.fareMedia.PurchaseVirtualCardUseCase r28, com.hansecom.abt.data.useCases.GetAllVirtualFareMediaUseCase r29, com.hansecom.abt.data.useCases.GetEnvironmentConfigurationUseCase r30) {
        /*
            r24 = this;
            r8 = r24
            r0 = r25
            r1 = r26
            r2 = r27
            r3 = r28
            r4 = r29
            r5 = r30
            java.lang.String r6 = "savedStateHandle"
            kotlin.jvm.internal.Intrinsics.i(r0, r6)
            java.lang.String r6 = "appFeatures"
            kotlin.jvm.internal.Intrinsics.i(r1, r6)
            java.lang.String r6 = "googleWalletHelper"
            kotlin.jvm.internal.Intrinsics.i(r2, r6)
            java.lang.String r6 = "purchaseVirtualCardUseCase"
            kotlin.jvm.internal.Intrinsics.i(r3, r6)
            java.lang.String r6 = "getAllVirtualFareMediaUseCase"
            kotlin.jvm.internal.Intrinsics.i(r4, r6)
            java.lang.String r6 = "getEnvironmentConfigurationUseCase"
            kotlin.jvm.internal.Intrinsics.i(r5, r6)
            com.hansecom.abt.presentation.screens.home.faremedia.purchaseCard.FareMediaPurchaseCard$State r6 = new com.hansecom.abt.presentation.screens.home.faremedia.purchaseCard.FareMediaPurchaseCard$State
            kotlinx.collections.immutable.PersistentList r20 = r26.p()
            r22 = 3067(0xbfb, float:4.298E-42)
            r23 = 0
            r10 = 0
            r11 = 0
            r12 = 1
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r21 = 0
            r9 = r6
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r8.<init>(r0, r6)
            r8.f37189i = r3
            r8.f37190j = r4
            r8.f37191k = r5
            com.hansecom.abt.presentation.screens.home.faremedia.purchaseCard.FareMediaPurchaseCardViewModel$1 r5 = new com.hansecom.abt.presentation.screens.home.faremedia.purchaseCard.FareMediaPurchaseCardViewModel$1
            r0 = 0
            r5.<init>(r1, r2, r8, r0)
            r6 = 7
            r7 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r0 = r24
            com.hansecom.abt.presentation.mvi.MviViewModel.t(r0, r1, r2, r3, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.faremedia.purchaseCard.FareMediaPurchaseCardViewModel.<init>(androidx.lifecycle.SavedStateHandle, com.hansecom.abt.AppFeatures, com.hansecom.abt.presentation.wallet.GoogleWalletHelper, com.hansecom.abt.data.useCases.fareMedia.PurchaseVirtualCardUseCase, com.hansecom.abt.data.useCases.GetAllVirtualFareMediaUseCase, com.hansecom.abt.data.useCases.GetEnvironmentConfigurationUseCase):void");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object I(kotlin.coroutines.Continuation r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.hansecom.abt.presentation.screens.home.faremedia.purchaseCard.FareMediaPurchaseCardViewModel$createCard$1
            if (r0 == 0) goto L_0x0014
            r0 = r10
            com.hansecom.abt.presentation.screens.home.faremedia.purchaseCard.FareMediaPurchaseCardViewModel$createCard$1 r0 = (com.hansecom.abt.presentation.screens.home.faremedia.purchaseCard.FareMediaPurchaseCardViewModel$createCard$1) r0
            int r1 = r0.F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0014
            int r1 = r1 - r2
            r0.F = r1
        L_0x0012:
            r6 = r0
            goto L_0x001a
        L_0x0014:
            com.hansecom.abt.presentation.screens.home.faremedia.purchaseCard.FareMediaPurchaseCardViewModel$createCard$1 r0 = new com.hansecom.abt.presentation.screens.home.faremedia.purchaseCard.FareMediaPurchaseCardViewModel$createCard$1
            r0.<init>(r9, r10)
            goto L_0x0012
        L_0x001a:
            java.lang.Object r10 = r6.D
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r1 = r6.F
            r2 = 1
            if (r1 == 0) goto L_0x003d
            if (r1 != r2) goto L_0x0035
            java.lang.Object r0 = r6.C
            com.hansecom.abt.presentation.screens.home.faremedia.purchaseCard.FareMediaPurchaseCardViewModel r0 = (com.hansecom.abt.presentation.screens.home.faremedia.purchaseCard.FareMediaPurchaseCardViewModel) r0
            kotlin.ResultKt.b(r10)
            kotlin.Result r10 = (kotlin.Result) r10
            java.lang.Object r10 = r10.j()
            goto L_0x0097
        L_0x0035:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x003d:
            kotlin.ResultKt.b(r10)
            android.os.Parcelable r10 = r9.m()
            com.hansecom.abt.presentation.screens.home.faremedia.purchaseCard.FareMediaPurchaseCard$State r10 = (com.hansecom.abt.presentation.screens.home.faremedia.purchaseCard.FareMediaPurchaseCard.State) r10
            com.hansecom.abt.presentation.model.PaymentMethodState r10 = r10.f()
            boolean r1 = r10 instanceof com.hansecom.abt.presentation.model.PaymentMethodState.CreditCard
            if (r1 == 0) goto L_0x00cf
            com.hansecom.abt.presentation.screens.home.faremedia.purchaseCard.o r1 = new com.hansecom.abt.presentation.screens.home.faremedia.purchaseCard.o
            r1.<init>()
            r9.r(r1)
            com.hansecom.abt.data.useCases.fareMedia.PurchaseVirtualCardUseCase r1 = r9.f37189i
            android.os.Parcelable r3 = r9.m()
            com.hansecom.abt.presentation.screens.home.faremedia.purchaseCard.FareMediaPurchaseCard$State r3 = (com.hansecom.abt.presentation.screens.home.faremedia.purchaseCard.FareMediaPurchaseCard.State) r3
            java.lang.String r3 = r3.d()
            android.os.Parcelable r4 = r9.m()
            com.hansecom.abt.presentation.screens.home.faremedia.purchaseCard.FareMediaPurchaseCard$State r4 = (com.hansecom.abt.presentation.screens.home.faremedia.purchaseCard.FareMediaPurchaseCard.State) r4
            com.hansecom.abt.presentation.screens.home.faremedia.purchaseCard.FareMediaPurchaseCard$RiderType r4 = r4.j()
            if (r4 == 0) goto L_0x0073
            java.lang.Integer r4 = r4.e()
            goto L_0x0074
        L_0x0073:
            r4 = 0
        L_0x0074:
            com.hansecom.abt.presentation.model.PaymentMethodState$CreditCard r10 = (com.hansecom.abt.presentation.model.PaymentMethodState.CreditCard) r10
            long r7 = r10.c()
            java.lang.Long r10 = kotlin.coroutines.jvm.internal.Boxing.d(r7)
            android.os.Parcelable r5 = r9.m()
            com.hansecom.abt.presentation.screens.home.faremedia.purchaseCard.FareMediaPurchaseCard$State r5 = (com.hansecom.abt.presentation.screens.home.faremedia.purchaseCard.FareMediaPurchaseCard.State) r5
            java.math.BigDecimal r5 = r5.l()
            r6.C = r9
            r6.F = r2
            r2 = r3
            r3 = r4
            r4 = r10
            java.lang.Object r10 = r1.a(r2, r3, r4, r5, r6)
            if (r10 != r0) goto L_0x0096
            return r0
        L_0x0096:
            r0 = r9
        L_0x0097:
            java.lang.Throwable r1 = kotlin.Result.e(r10)
            if (r1 != 0) goto L_0x00ad
            com.hansecom.mapi.models.FareMedium r10 = (com.hansecom.mapi.models.FareMedium) r10
            com.hansecom.abt.presentation.screens.home.faremedia.purchaseCard.p r10 = new com.hansecom.abt.presentation.screens.home.faremedia.purchaseCard.p
            r10.<init>()
            r0.r(r10)
            com.hansecom.abt.presentation.screens.home.faremedia.purchaseCard.FareMediaPurchaseCard$Effect$Success r10 = com.hansecom.abt.presentation.screens.home.faremedia.purchaseCard.FareMediaPurchaseCard.Effect.Success.f37177a
            r0.p(r10)
            goto L_0x00d9
        L_0x00ad:
            boolean r10 = r1 instanceof com.hansecom.abt.data.exceptions.FieldErrorsException
            if (r10 == 0) goto L_0x00ba
            com.hansecom.abt.presentation.screens.home.faremedia.purchaseCard.q r10 = new com.hansecom.abt.presentation.screens.home.faremedia.purchaseCard.q
            r10.<init>(r1)
            r0.r(r10)
            goto L_0x00d9
        L_0x00ba:
            com.hansecom.abt.presentation.screens.home.faremedia.purchaseCard.r r10 = new com.hansecom.abt.presentation.screens.home.faremedia.purchaseCard.r
            r10.<init>()
            r0.r(r10)
            com.hansecom.abt.presentation.screens.home.faremedia.purchaseCard.FareMediaPurchaseCard$Effect$Error r10 = new com.hansecom.abt.presentation.screens.home.faremedia.purchaseCard.FareMediaPurchaseCard$Effect$Error
            com.hansecom.abt.util.resourcesResolvers.StringValue r1 = com.hansecom.abt.api.ApiExceptionsKt.a(r1)
            r10.<init>(r1)
            r0.p(r10)
            goto L_0x00d9
        L_0x00cf:
            timber.log.Timber$Forest r10 = timber.log.Timber.f44337a
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "Payment method not supported"
            r10.b(r1, r0)
        L_0x00d9:
            kotlin.Unit r10 = kotlin.Unit.f40552a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.faremedia.purchaseCard.FareMediaPurchaseCardViewModel.I(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final FareMediaPurchaseCard.State J(Throwable th, FareMediaPurchaseCard.State state) {
        FareMediaPurchaseCard.State state2 = state;
        Intrinsics.i(state2, "$this$update");
        return FareMediaPurchaseCard.State.b(state2, (String) null, StringValueKt.b(((FieldErrorsException) th).j()), false, false, false, (PersistentList) null, (BigDecimal) null, (PersistentList) null, (FareMediaPurchaseCard.RiderType) null, (PaymentMethodState) null, (PersistentList) null, false, 4085, (Object) null);
    }

    public static final FareMediaPurchaseCard.State K(FareMediaPurchaseCard.State state) {
        FareMediaPurchaseCard.State state2 = state;
        Intrinsics.i(state2, "$this$update");
        return FareMediaPurchaseCard.State.b(state2, (String) null, (StringValue) null, false, false, false, (PersistentList) null, (BigDecimal) null, (PersistentList) null, (FareMediaPurchaseCard.RiderType) null, (PaymentMethodState) null, (PersistentList) null, false, 4087, (Object) null);
    }

    public static final FareMediaPurchaseCard.State L(FareMediaPurchaseCard.State state) {
        FareMediaPurchaseCard.State state2 = state;
        Intrinsics.i(state2, "$this$update");
        return FareMediaPurchaseCard.State.b(state2, (String) null, (StringValue) null, false, true, false, (PersistentList) null, (BigDecimal) null, (PersistentList) null, (FareMediaPurchaseCard.RiderType) null, (PaymentMethodState) null, (PersistentList) null, false, 4087, (Object) null);
    }

    public static final FareMediaPurchaseCard.State M(FareMediaPurchaseCard.State state) {
        FareMediaPurchaseCard.State state2 = state;
        Intrinsics.i(state2, "$this$update");
        return FareMediaPurchaseCard.State.b(state2, (String) null, (StringValue) null, false, false, false, (PersistentList) null, (BigDecimal) null, (PersistentList) null, (FareMediaPurchaseCard.RiderType) null, (PaymentMethodState) null, (PersistentList) null, false, 4087, (Object) null);
    }

    private final void O(String str) {
        r(new t(str));
    }

    public static final FareMediaPurchaseCard.State P(String str, FareMediaPurchaseCard.State state) {
        FareMediaPurchaseCard.State state2 = state;
        Intrinsics.i(state2, "$this$update");
        return FareMediaPurchaseCard.State.b(state2, str, StringValue.Companion.a(), false, false, false, (PersistentList) null, (BigDecimal) null, (PersistentList) null, (FareMediaPurchaseCard.RiderType) null, (PaymentMethodState) null, (PersistentList) null, false, 4092, (Object) null);
    }

    public static final FareMediaPurchaseCard.State R(boolean z2, FareMediaPurchaseCard.State state) {
        FareMediaPurchaseCard.State state2 = state;
        Intrinsics.i(state2, "$this$update");
        return FareMediaPurchaseCard.State.b(state2, (String) null, (StringValue) null, false, false, z2, (PersistentList) null, (BigDecimal) null, (PersistentList) null, (FareMediaPurchaseCard.RiderType) null, (PaymentMethodState) null, (PersistentList) null, false, 4079, (Object) null);
    }

    private final void S(PaymentMethodState paymentMethodState) {
        r(new s(paymentMethodState));
    }

    public static final FareMediaPurchaseCard.State T(PaymentMethodState paymentMethodState, FareMediaPurchaseCard.State state) {
        FareMediaPurchaseCard.State state2 = state;
        Intrinsics.i(state2, "$this$update");
        return FareMediaPurchaseCard.State.b(state2, (String) null, (StringValue) null, false, false, false, (PersistentList) null, (BigDecimal) null, (PersistentList) null, (FareMediaPurchaseCard.RiderType) null, paymentMethodState, (PersistentList) null, false, 3583, (Object) null);
    }

    public static final FareMediaPurchaseCard.State V(FareMediaPurchaseCard.RiderType riderType, FareMediaPurchaseCard.State state) {
        FareMediaPurchaseCard.State state2 = state;
        Intrinsics.i(state2, "$this$update");
        return FareMediaPurchaseCard.State.b(state2, (String) null, (StringValue) null, false, false, false, (PersistentList) null, (BigDecimal) null, (PersistentList) null, riderType, (PaymentMethodState) null, (PersistentList) null, false, 3839, (Object) null);
    }

    public static final FareMediaPurchaseCard.State X(BigDecimal bigDecimal, FareMediaPurchaseCard.State state) {
        FareMediaPurchaseCard.State state2 = state;
        Intrinsics.i(state2, "$this$update");
        return FareMediaPurchaseCard.State.b(state2, (String) null, (StringValue) null, false, false, false, (PersistentList) null, bigDecimal, (PersistentList) null, (FareMediaPurchaseCard.RiderType) null, (PaymentMethodState) null, (PersistentList) null, false, 4031, (Object) null);
    }

    /* renamed from: N */
    public Object o(FareMediaPurchaseCard.Action action, Continuation continuation) {
        if (action instanceof FareMediaPurchaseCard.Action.NickNameChange) {
            O(((FareMediaPurchaseCard.Action.NickNameChange) action).a());
        } else if (action instanceof FareMediaPurchaseCard.Action.OpenRiderTypeSelector) {
            Q(((FareMediaPurchaseCard.Action.OpenRiderTypeSelector) action).a());
        } else if (action instanceof FareMediaPurchaseCard.Action.RiderTypeChange) {
            U(((FareMediaPurchaseCard.Action.RiderTypeChange) action).a());
        } else if (action instanceof FareMediaPurchaseCard.Action.TopUpAmountChange) {
            W(((FareMediaPurchaseCard.Action.TopUpAmountChange) action).a());
        } else if (action instanceof FareMediaPurchaseCard.Action.PaymentMethodChange) {
            S(((FareMediaPurchaseCard.Action.PaymentMethodChange) action).a());
        } else if (Intrinsics.d(action, FareMediaPurchaseCard.Action.Confirm.f37170a)) {
            Object I = I(continuation);
            return I == IntrinsicsKt.f() ? I : Unit.f40552a;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.f40552a;
    }

    public final void Q(boolean z2) {
        r(new u(z2));
    }

    public final void U(FareMediaPurchaseCard.RiderType riderType) {
        r(new v(riderType));
    }

    public final void W(BigDecimal bigDecimal) {
        r(new w(bigDecimal));
    }
}
