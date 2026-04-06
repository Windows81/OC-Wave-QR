package com.hansecom.abt.presentation.screens.home.account.payment;

import com.hansecom.abt.data.repositories.PaymentMethodsRepository;
import com.hansecom.abt.data.repositories.UserRepository;
import com.hansecom.abt.data.repositories.generalData.EnvironmentConfigurationRepository;
import com.hansecom.abt.presentation.mvi.MviViewModel;
import com.hansecom.abt.presentation.screens.home.account.payment.PaymentMethods;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

@Metadata
public final class PaymentMethodsViewModel extends MviViewModel<PaymentMethods.Action, PaymentMethods.State, PaymentMethods.Effect> {

    /* renamed from: i  reason: collision with root package name */
    public final PaymentMethodsRepository f35517i;

    /* renamed from: j  reason: collision with root package name */
    public final EnvironmentConfigurationRepository f35518j;

    /* renamed from: k  reason: collision with root package name */
    public final UserRepository f35519k;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public PaymentMethodsViewModel(androidx.lifecycle.SavedStateHandle r18, com.hansecom.abt.data.repositories.PaymentMethodsRepository r19, com.hansecom.abt.data.repositories.generalData.EnvironmentConfigurationRepository r20, com.hansecom.abt.data.repositories.UserRepository r21) {
        /*
            r17 = this;
            r8 = r17
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            java.lang.String r4 = "savedStateHandle"
            kotlin.jvm.internal.Intrinsics.i(r0, r4)
            java.lang.String r4 = "paymentMethodsRepository"
            kotlin.jvm.internal.Intrinsics.i(r1, r4)
            java.lang.String r4 = "environmentConfigurationRepository"
            kotlin.jvm.internal.Intrinsics.i(r2, r4)
            java.lang.String r4 = "userRepository"
            kotlin.jvm.internal.Intrinsics.i(r3, r4)
            com.hansecom.abt.presentation.screens.home.account.payment.PaymentMethods$State r4 = new com.hansecom.abt.presentation.screens.home.account.payment.PaymentMethods$State
            r15 = 30
            r16 = 0
            r10 = 1
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r9 = r4
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            r8.<init>(r0, r4)
            r8.f35517i = r1
            r8.f35518j = r2
            r8.f35519k = r3
            com.hansecom.abt.presentation.screens.home.account.payment.PaymentMethodsViewModel$1 r5 = new com.hansecom.abt.presentation.screens.home.account.payment.PaymentMethodsViewModel$1
            r0 = 0
            r5.<init>(r8, r0)
            r6 = 7
            r7 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r0 = r17
            com.hansecom.abt.presentation.mvi.MviViewModel.t(r0, r1, r2, r3, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.account.payment.PaymentMethodsViewModel.<init>(androidx.lifecycle.SavedStateHandle, com.hansecom.abt.data.repositories.PaymentMethodsRepository, com.hansecom.abt.data.repositories.generalData.EnvironmentConfigurationRepository, com.hansecom.abt.data.repositories.UserRepository):void");
    }

    public static final PaymentMethods.State G(PaymentMethods.State state) {
        Intrinsics.i(state, "$this$update");
        return PaymentMethods.State.b(state, false, true, false, (ImmutableList) null, (Integer) null, 29, (Object) null);
    }

    public static final PaymentMethods.State H(PaymentMethods.State state) {
        Intrinsics.i(state, "$this$update");
        return PaymentMethods.State.b(state, false, false, false, (ImmutableList) null, (Integer) null, 29, (Object) null);
    }

    public static final PaymentMethods.State I(PaymentMethods.State state) {
        Intrinsics.i(state, "$this$update");
        return PaymentMethods.State.b(state, false, false, false, (ImmutableList) null, (Integer) null, 29, (Object) null);
    }

    public static final PaymentMethods.State L(PaymentMethods.State state) {
        Intrinsics.i(state, "$this$update");
        return PaymentMethods.State.b(state, false, false, true, (ImmutableList) null, (Integer) null, 26, (Object) null);
    }

    public static final PaymentMethods.State M(PaymentMethods.State state) {
        Intrinsics.i(state, "$this$update");
        return PaymentMethods.State.b(state, false, false, false, (ImmutableList) null, (Integer) null, 26, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object F(kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.hansecom.abt.presentation.screens.home.account.payment.PaymentMethodsViewModel$addPaymentMethod$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.hansecom.abt.presentation.screens.home.account.payment.PaymentMethodsViewModel$addPaymentMethod$1 r0 = (com.hansecom.abt.presentation.screens.home.account.payment.PaymentMethodsViewModel$addPaymentMethod$1) r0
            int r1 = r0.F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.F = r1
            goto L_0x0018
        L_0x0013:
            com.hansecom.abt.presentation.screens.home.account.payment.PaymentMethodsViewModel$addPaymentMethod$1 r0 = new com.hansecom.abt.presentation.screens.home.account.payment.PaymentMethodsViewModel$addPaymentMethod$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.D
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.F
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r0 = r0.C
            com.hansecom.abt.presentation.screens.home.account.payment.PaymentMethodsViewModel r0 = (com.hansecom.abt.presentation.screens.home.account.payment.PaymentMethodsViewModel) r0
            kotlin.ResultKt.b(r5)
            kotlin.Result r5 = (kotlin.Result) r5
            java.lang.Object r5 = r5.j()
            goto L_0x0054
        L_0x0033:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x003b:
            kotlin.ResultKt.b(r5)
            com.hansecom.abt.presentation.screens.home.account.payment.p r5 = new com.hansecom.abt.presentation.screens.home.account.payment.p
            r5.<init>()
            r4.r(r5)
            com.hansecom.abt.data.repositories.UserRepository r5 = r4.f35519k
            r0.C = r4
            r0.F = r3
            java.lang.Object r5 = r5.i(r0)
            if (r5 != r1) goto L_0x0053
            return r1
        L_0x0053:
            r0 = r4
        L_0x0054:
            java.lang.Throwable r1 = kotlin.Result.e(r5)
            if (r1 != 0) goto L_0x006a
            com.hansecom.mapi.models.User r5 = (com.hansecom.mapi.models.User) r5
            com.hansecom.abt.presentation.screens.home.account.payment.q r5 = new com.hansecom.abt.presentation.screens.home.account.payment.q
            r5.<init>()
            r0.r(r5)
            com.hansecom.abt.presentation.screens.home.account.payment.PaymentMethods$Effect$InputCardDetails r5 = com.hansecom.abt.presentation.screens.home.account.payment.PaymentMethods.Effect.InputCardDetails.f35499a
            r0.p(r5)
            goto L_0x007e
        L_0x006a:
            com.hansecom.abt.presentation.screens.home.account.payment.r r5 = new com.hansecom.abt.presentation.screens.home.account.payment.r
            r5.<init>()
            r0.r(r5)
            com.hansecom.abt.presentation.screens.home.account.payment.PaymentMethods$Effect$Error r5 = new com.hansecom.abt.presentation.screens.home.account.payment.PaymentMethods$Effect$Error
            com.hansecom.abt.util.resourcesResolvers.StringValue r1 = com.hansecom.abt.api.ApiExceptionsKt.a(r1)
            r5.<init>(r1)
            r0.p(r5)
        L_0x007e:
            kotlin.Unit r5 = kotlin.Unit.f40552a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.account.payment.PaymentMethodsViewModel.F(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: J */
    public Object o(PaymentMethods.Action action, Continuation continuation) {
        if (action instanceof PaymentMethods.Action.Refresh) {
            Object K = K(continuation);
            return K == IntrinsicsKt.f() ? K : Unit.f40552a;
        } else if (Intrinsics.d(action, PaymentMethods.Action.AddPaymentMethod.f35496a)) {
            Object F = F(continuation);
            return F == IntrinsicsKt.f() ? F : Unit.f40552a;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object K(kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.hansecom.abt.presentation.screens.home.account.payment.PaymentMethodsViewModel$loadPaymentMethods$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.hansecom.abt.presentation.screens.home.account.payment.PaymentMethodsViewModel$loadPaymentMethods$1 r0 = (com.hansecom.abt.presentation.screens.home.account.payment.PaymentMethodsViewModel$loadPaymentMethods$1) r0
            int r1 = r0.F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.F = r1
            goto L_0x0018
        L_0x0013:
            com.hansecom.abt.presentation.screens.home.account.payment.PaymentMethodsViewModel$loadPaymentMethods$1 r0 = new com.hansecom.abt.presentation.screens.home.account.payment.PaymentMethodsViewModel$loadPaymentMethods$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.D
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.F
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r0 = r0.C
            com.hansecom.abt.presentation.screens.home.account.payment.PaymentMethodsViewModel r0 = (com.hansecom.abt.presentation.screens.home.account.payment.PaymentMethodsViewModel) r0
            kotlin.ResultKt.b(r5)
            goto L_0x004e
        L_0x002d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0035:
            kotlin.ResultKt.b(r5)
            com.hansecom.abt.presentation.screens.home.account.payment.n r5 = new com.hansecom.abt.presentation.screens.home.account.payment.n
            r5.<init>()
            r4.r(r5)
            com.hansecom.abt.data.repositories.PaymentMethodsRepository r5 = r4.f35517i
            r0.C = r4
            r0.F = r3
            java.lang.Object r5 = r5.G(r0)
            if (r5 != r1) goto L_0x004d
            return r1
        L_0x004d:
            r0 = r4
        L_0x004e:
            com.hansecom.abt.presentation.screens.home.account.payment.o r5 = new com.hansecom.abt.presentation.screens.home.account.payment.o
            r5.<init>()
            r0.r(r5)
            kotlin.Unit r5 = kotlin.Unit.f40552a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.account.payment.PaymentMethodsViewModel.K(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
