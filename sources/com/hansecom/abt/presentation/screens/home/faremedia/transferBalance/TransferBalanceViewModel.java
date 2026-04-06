package com.hansecom.abt.presentation.screens.home.faremedia.transferBalance;

import com.hansecom.abt.data.repositories.FareMediaConfigRepository;
import com.hansecom.abt.data.repositories.FareMediaRepository;
import com.hansecom.abt.data.useCases.TransferBalanceUseCase;
import com.hansecom.abt.presentation.model.PaymentMethodState;
import com.hansecom.abt.presentation.mvi.MviViewModel;
import com.hansecom.abt.presentation.screens.home.faremedia.transferBalance.TransferBalance;
import com.hansecom.abt.util.BigDecimalExtKt;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

@Metadata
public final class TransferBalanceViewModel extends MviViewModel<TransferBalance.Action, TransferBalance.State, TransferBalance.Effect> {

    /* renamed from: i  reason: collision with root package name */
    public final FareMediaRepository f37321i;

    /* renamed from: j  reason: collision with root package name */
    public final TransferBalanceUseCase f37322j;

    /* renamed from: k  reason: collision with root package name */
    public final FareMediaConfigRepository f37323k;

    /* renamed from: l  reason: collision with root package name */
    public final String f37324l;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TransferBalanceViewModel(androidx.lifecycle.SavedStateHandle r24, com.hansecom.abt.data.repositories.FareMediaRepository r25, com.hansecom.abt.data.useCases.TransferBalanceUseCase r26, com.hansecom.abt.data.repositories.FareMediaConfigRepository r27) {
        /*
            r23 = this;
            r8 = r23
            r0 = r24
            r1 = r25
            r2 = r26
            r3 = r27
            java.lang.String r4 = "savedStateHandle"
            kotlin.jvm.internal.Intrinsics.i(r0, r4)
            java.lang.String r4 = "fareMediaRepository"
            kotlin.jvm.internal.Intrinsics.i(r1, r4)
            java.lang.String r4 = "transferBalanceUseCase"
            kotlin.jvm.internal.Intrinsics.i(r2, r4)
            java.lang.String r4 = "fareMediaConfigRepository"
            kotlin.jvm.internal.Intrinsics.i(r3, r4)
            com.hansecom.abt.presentation.screens.home.faremedia.transferBalance.TransferBalance$State r4 = new com.hansecom.abt.presentation.screens.home.faremedia.transferBalance.TransferBalance$State
            r21 = 2047(0x7ff, float:2.868E-42)
            r22 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r9 = r4
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r8.<init>(r0, r4)
            r8.f37321i = r1
            r8.f37322j = r2
            r8.f37323k = r3
            java.util.Map r1 = kotlin.collections.MapsKt.h()
            java.lang.Class<com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.CardOptionsTransferBalanceDestination> r2 = com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.CardOptionsTransferBalanceDestination.class
            kotlin.reflect.KClass r2 = kotlin.jvm.internal.Reflection.b(r2)
            java.lang.Object r0 = androidx.navigation.SavedStateHandleKt.a(r0, r2, r1)
            com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.CardOptionsTransferBalanceDestination r0 = (com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.CardOptionsTransferBalanceDestination) r0
            java.lang.String r0 = r0.a()
            r8.f37324l = r0
            kotlinx.coroutines.CoroutineScope r1 = androidx.lifecycle.ViewModelKt.a(r23)
            com.hansecom.abt.presentation.screens.home.faremedia.transferBalance.TransferBalanceViewModel$1 r4 = new com.hansecom.abt.presentation.screens.home.faremedia.transferBalance.TransferBalanceViewModel$1
            r0 = 0
            r4.<init>(r8, r0)
            r5 = 3
            r6 = 0
            r2 = 0
            r3 = 0
            kotlinx.coroutines.Job unused = kotlinx.coroutines.BuildersKt__Builders_commonKt.d(r1, r2, r3, r4, r5, r6)
            com.hansecom.abt.presentation.screens.home.faremedia.transferBalance.TransferBalanceViewModel$2 r5 = new com.hansecom.abt.presentation.screens.home.faremedia.transferBalance.TransferBalanceViewModel$2
            r5.<init>(r8, r0)
            r6 = 7
            r7 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r0 = r23
            com.hansecom.abt.presentation.mvi.MviViewModel.t(r0, r1, r2, r3, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.faremedia.transferBalance.TransferBalanceViewModel.<init>(androidx.lifecycle.SavedStateHandle, com.hansecom.abt.data.repositories.FareMediaRepository, com.hansecom.abt.data.useCases.TransferBalanceUseCase, com.hansecom.abt.data.repositories.FareMediaConfigRepository):void");
    }

    public static final TransferBalance.State I(PaymentMethodState.FareMedia fareMedia, TransferBalance.State state) {
        TransferBalance.State state2 = state;
        Intrinsics.i(state2, "$this$update");
        return TransferBalance.State.b(state2, (String) null, (TransferBalance.State.ValidationError) null, (BigDecimal) null, false, false, (String) null, (BigDecimal) null, (ImmutableList) null, (ImmutableList) null, fareMedia, (BigDecimal) null, 1535, (Object) null);
    }

    /* access modifiers changed from: private */
    public final void J(String str) {
        r(new C(str, this));
    }

    public static final TransferBalance.State K(String str, TransferBalanceViewModel transferBalanceViewModel, TransferBalance.State state) {
        TransferBalance.State.ValidationError validationError;
        Intrinsics.i(state, "$this$update");
        BigDecimal e2 = BigDecimalExtKt.e(str);
        if (e2.compareTo(((TransferBalance.State) transferBalanceViewModel.m()).c()) > 0) {
            validationError = TransferBalance.State.ValidationError.LOW_BALANCE;
        } else {
            BigDecimal f2 = ((TransferBalance.State) transferBalanceViewModel.m()).f();
            PaymentMethodState.FareMedia i2 = ((TransferBalance.State) transferBalanceViewModel.m()).i();
            Intrinsics.f(i2);
            BigDecimal subtract = f2.subtract(i2.a());
            Intrinsics.h(subtract, "subtract(...)");
            validationError = e2.compareTo(subtract) > 0 ? TransferBalance.State.ValidationError.MAX_BALANCE : null;
        }
        TransferBalance.State.ValidationError validationError2 = validationError;
        if (validationError2 != null) {
            e2 = BigDecimal.ZERO;
        }
        BigDecimal bigDecimal = e2;
        Intrinsics.f(bigDecimal);
        return TransferBalance.State.b(state, str, validationError2, (BigDecimal) null, false, false, (String) null, (BigDecimal) null, (ImmutableList) null, (ImmutableList) null, (PaymentMethodState.FareMedia) null, bigDecimal, 1020, (Object) null);
    }

    public static final TransferBalance.State M(TransferBalance.State state) {
        Intrinsics.i(state, "$this$update");
        return TransferBalance.State.b(state, (String) null, (TransferBalance.State.ValidationError) null, (BigDecimal) null, false, true, (String) null, (BigDecimal) null, (ImmutableList) null, (ImmutableList) null, (PaymentMethodState.FareMedia) null, (BigDecimal) null, 2031, (Object) null);
    }

    public static final TransferBalance.State N(TransferBalance.State state) {
        Intrinsics.i(state, "$this$update");
        return TransferBalance.State.b(state, (String) null, (TransferBalance.State.ValidationError) null, (BigDecimal) null, false, false, (String) null, (BigDecimal) null, (ImmutableList) null, (ImmutableList) null, (PaymentMethodState.FareMedia) null, (BigDecimal) null, 2031, (Object) null);
    }

    public static final TransferBalance.State O(TransferBalance.State state) {
        Intrinsics.i(state, "$this$update");
        return TransferBalance.State.b(state, (String) null, (TransferBalance.State.ValidationError) null, (BigDecimal) null, false, false, (String) null, (BigDecimal) null, (ImmutableList) null, (ImmutableList) null, (PaymentMethodState.FareMedia) null, (BigDecimal) null, 2031, (Object) null);
    }

    /* renamed from: G */
    public Object o(TransferBalance.Action action, Continuation continuation) {
        if (action instanceof TransferBalance.Action.ValueChange) {
            J(((TransferBalance.Action.ValueChange) action).a());
        } else if (action instanceof TransferBalance.Action.TargetFareMediaChange) {
            H(((TransferBalance.Action.TargetFareMediaChange) action).a());
        } else if (Intrinsics.d(action, TransferBalance.Action.Confirm.f37306a)) {
            Object L = L(continuation);
            return L == IntrinsicsKt.f() ? L : Unit.f40552a;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.f40552a;
    }

    public final void H(PaymentMethodState.FareMedia fareMedia) {
        r(new y(fareMedia));
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object L(kotlin.coroutines.Continuation r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.hansecom.abt.presentation.screens.home.faremedia.transferBalance.TransferBalanceViewModel$transferBalance$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.hansecom.abt.presentation.screens.home.faremedia.transferBalance.TransferBalanceViewModel$transferBalance$1 r0 = (com.hansecom.abt.presentation.screens.home.faremedia.transferBalance.TransferBalanceViewModel$transferBalance$1) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.G = r1
            goto L_0x0018
        L_0x0013:
            com.hansecom.abt.presentation.screens.home.faremedia.transferBalance.TransferBalanceViewModel$transferBalance$1 r0 = new com.hansecom.abt.presentation.screens.home.faremedia.transferBalance.TransferBalanceViewModel$transferBalance$1
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r8 = r0.E
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.G
            r3 = 1
            if (r2 == 0) goto L_0x003f
            if (r2 != r3) goto L_0x0037
            java.lang.Object r1 = r0.D
            com.hansecom.abt.presentation.model.PaymentMethodState$FareMedia r1 = (com.hansecom.abt.presentation.model.PaymentMethodState.FareMedia) r1
            java.lang.Object r0 = r0.C
            com.hansecom.abt.presentation.screens.home.faremedia.transferBalance.TransferBalanceViewModel r0 = (com.hansecom.abt.presentation.screens.home.faremedia.transferBalance.TransferBalanceViewModel) r0
            kotlin.ResultKt.b(r8)
            kotlin.Result r8 = (kotlin.Result) r8
            java.lang.Object r8 = r8.j()
            goto L_0x0077
        L_0x0037:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x003f:
            kotlin.ResultKt.b(r8)
            android.os.Parcelable r8 = r7.m()
            com.hansecom.abt.presentation.screens.home.faremedia.transferBalance.TransferBalance$State r8 = (com.hansecom.abt.presentation.screens.home.faremedia.transferBalance.TransferBalance.State) r8
            java.math.BigDecimal r8 = r8.k()
            android.os.Parcelable r2 = r7.m()
            com.hansecom.abt.presentation.screens.home.faremedia.transferBalance.TransferBalance$State r2 = (com.hansecom.abt.presentation.screens.home.faremedia.transferBalance.TransferBalance.State) r2
            com.hansecom.abt.presentation.model.PaymentMethodState$FareMedia r2 = r2.i()
            if (r2 == 0) goto L_0x00a9
            com.hansecom.abt.presentation.screens.home.faremedia.transferBalance.z r4 = new com.hansecom.abt.presentation.screens.home.faremedia.transferBalance.z
            r4.<init>()
            r7.r(r4)
            com.hansecom.abt.data.useCases.TransferBalanceUseCase r4 = r7.f37322j
            java.lang.String r5 = r7.f37324l
            java.lang.String r6 = r2.m()
            r0.C = r7
            r0.D = r2
            r0.G = r3
            java.lang.Object r8 = r4.a(r5, r6, r8, r0)
            if (r8 != r1) goto L_0x0075
            return r1
        L_0x0075:
            r0 = r7
            r1 = r2
        L_0x0077:
            java.lang.Throwable r2 = kotlin.Result.e(r8)
            if (r2 != 0) goto L_0x0094
            kotlin.Unit r8 = (kotlin.Unit) r8
            com.hansecom.abt.presentation.screens.home.faremedia.transferBalance.A r8 = new com.hansecom.abt.presentation.screens.home.faremedia.transferBalance.A
            r8.<init>()
            r0.r(r8)
            com.hansecom.abt.presentation.screens.home.faremedia.transferBalance.TransferBalance$Effect$Success r8 = new com.hansecom.abt.presentation.screens.home.faremedia.transferBalance.TransferBalance$Effect$Success
            com.hansecom.abt.util.resourcesResolvers.StringValue r1 = r1.b()
            r8.<init>(r1)
            r0.p(r8)
            goto L_0x00b3
        L_0x0094:
            com.hansecom.abt.presentation.screens.home.faremedia.transferBalance.B r8 = new com.hansecom.abt.presentation.screens.home.faremedia.transferBalance.B
            r8.<init>()
            r0.r(r8)
            com.hansecom.abt.presentation.screens.home.faremedia.transferBalance.TransferBalance$Effect$Error r8 = new com.hansecom.abt.presentation.screens.home.faremedia.transferBalance.TransferBalance$Effect$Error
            com.hansecom.abt.util.resourcesResolvers.StringValue r1 = com.hansecom.abt.api.ApiExceptionsKt.a(r2)
            r8.<init>(r1)
            r0.p(r8)
            goto L_0x00b3
        L_0x00a9:
            timber.log.Timber$Forest r8 = timber.log.Timber.f44337a
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "Target card is not selected"
            r8.b(r1, r0)
        L_0x00b3:
            kotlin.Unit r8 = kotlin.Unit.f40552a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.faremedia.transferBalance.TransferBalanceViewModel.L(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
