package com.hansecom.abt.presentation.screens.home.account.payment.add.addCyberSource;

import com.hansecom.abt.data.useCases.paymentMethods.FetchPaymentMethodsUntilNewOneAppearsUseCase;
import com.hansecom.abt.data.useCases.paymentMethods.GetAddPaymentMethodPageCyberSourceUseCase;
import com.hansecom.abt.presentation.mvi.MviViewModel;
import com.hansecom.abt.presentation.screens.home.account.payment.add.addCyberSource.AddPaymentMethodCyberSource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class AddPaymentMethodCyberSourceViewModel extends MviViewModel<AddPaymentMethodCyberSource.Action, AddPaymentMethodCyberSource.State, AddPaymentMethodCyberSource.Effect> {

    /* renamed from: i  reason: collision with root package name */
    public final FetchPaymentMethodsUntilNewOneAppearsUseCase f35563i;

    /* renamed from: j  reason: collision with root package name */
    public final GetAddPaymentMethodPageCyberSourceUseCase f35564j;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AddPaymentMethodCyberSourceViewModel(androidx.lifecycle.SavedStateHandle r18, com.hansecom.abt.data.useCases.paymentMethods.FetchPaymentMethodsUntilNewOneAppearsUseCase r19, com.hansecom.abt.data.useCases.paymentMethods.GetAddPaymentMethodPageCyberSourceUseCase r20, com.hansecom.abt.AppFeatures r21) {
        /*
            r17 = this;
            r8 = r17
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            java.lang.String r4 = "savedStateHandle"
            kotlin.jvm.internal.Intrinsics.i(r0, r4)
            java.lang.String r4 = "fetchPaymentMethodsUntilNewOneAppearsUseCase"
            kotlin.jvm.internal.Intrinsics.i(r1, r4)
            java.lang.String r4 = "getAddPaymentMethodPageCyberSourceUseCase"
            kotlin.jvm.internal.Intrinsics.i(r2, r4)
            java.lang.String r4 = "appFeatures"
            kotlin.jvm.internal.Intrinsics.i(r3, r4)
            com.hansecom.abt.presentation.screens.home.account.payment.add.addCyberSource.AddPaymentMethodCyberSource$State r4 = new com.hansecom.abt.presentation.screens.home.account.payment.add.addCyberSource.AddPaymentMethodCyberSource$State
            boolean r5 = r21.d()
            r13 = r5 ^ 1
            boolean r5 = r21.d()
            r14 = r5 ^ 1
            r15 = 7
            r16 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r9 = r4
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            r8.<init>(r0, r4)
            r8.f35563i = r1
            r8.f35564j = r2
            com.hansecom.abt.presentation.screens.home.account.payment.add.addCyberSource.AddPaymentMethodCyberSourceViewModel$1 r5 = new com.hansecom.abt.presentation.screens.home.account.payment.add.addCyberSource.AddPaymentMethodCyberSourceViewModel$1
            r0 = 0
            r5.<init>(r3, r8, r0)
            r6 = 7
            r7 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r0 = r17
            com.hansecom.abt.presentation.mvi.MviViewModel.t(r0, r1, r2, r3, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.account.payment.add.addCyberSource.AddPaymentMethodCyberSourceViewModel.<init>(androidx.lifecycle.SavedStateHandle, com.hansecom.abt.data.useCases.paymentMethods.FetchPaymentMethodsUntilNewOneAppearsUseCase, com.hansecom.abt.data.useCases.paymentMethods.GetAddPaymentMethodPageCyberSourceUseCase, com.hansecom.abt.AppFeatures):void");
    }

    public static final AddPaymentMethodCyberSource.State A(AddPaymentMethodCyberSource.State state) {
        Intrinsics.i(state, "$this$update");
        return AddPaymentMethodCyberSource.State.b(state, (String) null, (String) null, (String) null, false, true, 15, (Object) null);
    }

    public static final AddPaymentMethodCyberSource.State B(String str, AddPaymentMethodCyberSource.State state) {
        Intrinsics.i(state, "$this$update");
        return AddPaymentMethodCyberSource.State.b(state, (String) null, (String) null, str, false, false, 27, (Object) null);
    }

    public static final AddPaymentMethodCyberSource.State C(AddPaymentMethodCyberSource.State state) {
        Intrinsics.i(state, "$this$update");
        return AddPaymentMethodCyberSource.State.b(state, (String) null, (String) null, (String) null, false, false, 15, (Object) null);
    }

    public static final AddPaymentMethodCyberSource.State F(String str, AddPaymentMethodCyberSource.State state) {
        Intrinsics.i(state, "$this$update");
        return AddPaymentMethodCyberSource.State.b(state, str, (String) null, (String) null, false, false, 30, (Object) null);
    }

    /* renamed from: D */
    public Object o(AddPaymentMethodCyberSource.Action action, Continuation continuation) {
        if (action instanceof AddPaymentMethodCyberSource.Action.NicknameChange) {
            E(((AddPaymentMethodCyberSource.Action.NicknameChange) action).a());
        } else if (Intrinsics.d(action, AddPaymentMethodCyberSource.Action.Confirm.f35541a)) {
            Object z2 = z(continuation);
            return z2 == IntrinsicsKt.f() ? z2 : Unit.f40552a;
        } else if (action instanceof AddPaymentMethodCyberSource.Action.OnCardAddedInWebView) {
            this.f35563i.b();
            p(AddPaymentMethodCyberSource.Effect.Success.f35546a);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.f40552a;
    }

    public final void E(String str) {
        r(new n(str));
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object z(kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.hansecom.abt.presentation.screens.home.account.payment.add.addCyberSource.AddPaymentMethodCyberSourceViewModel$getWebView$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.hansecom.abt.presentation.screens.home.account.payment.add.addCyberSource.AddPaymentMethodCyberSourceViewModel$getWebView$1 r0 = (com.hansecom.abt.presentation.screens.home.account.payment.add.addCyberSource.AddPaymentMethodCyberSourceViewModel$getWebView$1) r0
            int r1 = r0.F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.F = r1
            goto L_0x0018
        L_0x0013:
            com.hansecom.abt.presentation.screens.home.account.payment.add.addCyberSource.AddPaymentMethodCyberSourceViewModel$getWebView$1 r0 = new com.hansecom.abt.presentation.screens.home.account.payment.add.addCyberSource.AddPaymentMethodCyberSourceViewModel$getWebView$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.D
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.F
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r0 = r0.C
            com.hansecom.abt.presentation.screens.home.account.payment.add.addCyberSource.AddPaymentMethodCyberSourceViewModel r0 = (com.hansecom.abt.presentation.screens.home.account.payment.add.addCyberSource.AddPaymentMethodCyberSourceViewModel) r0
            kotlin.ResultKt.b(r5)
            kotlin.Result r5 = (kotlin.Result) r5
            java.lang.Object r5 = r5.j()
            goto L_0x005f
        L_0x0033:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x003b:
            kotlin.ResultKt.b(r5)
            com.hansecom.abt.presentation.screens.home.account.payment.add.addCyberSource.o r5 = new com.hansecom.abt.presentation.screens.home.account.payment.add.addCyberSource.o
            r5.<init>()
            r4.r(r5)
            com.hansecom.abt.data.useCases.paymentMethods.GetAddPaymentMethodPageCyberSourceUseCase r5 = r4.f35564j
            android.os.Parcelable r2 = r4.m()
            com.hansecom.abt.presentation.screens.home.account.payment.add.addCyberSource.AddPaymentMethodCyberSource$State r2 = (com.hansecom.abt.presentation.screens.home.account.payment.add.addCyberSource.AddPaymentMethodCyberSource.State) r2
            java.lang.String r2 = r2.e()
            r0.C = r4
            r0.F = r3
            r3 = 0
            java.lang.Object r5 = r5.a(r2, r3, r0)
            if (r5 != r1) goto L_0x005e
            return r1
        L_0x005e:
            r0 = r4
        L_0x005f:
            java.lang.Throwable r1 = kotlin.Result.e(r5)
            if (r1 != 0) goto L_0x0070
            java.lang.String r5 = (java.lang.String) r5
            com.hansecom.abt.presentation.screens.home.account.payment.add.addCyberSource.p r1 = new com.hansecom.abt.presentation.screens.home.account.payment.add.addCyberSource.p
            r1.<init>(r5)
            r0.r(r1)
            goto L_0x007c
        L_0x0070:
            com.hansecom.abt.presentation.screens.home.account.payment.add.addCyberSource.AddPaymentMethodCyberSource$Effect$Error r5 = new com.hansecom.abt.presentation.screens.home.account.payment.add.addCyberSource.AddPaymentMethodCyberSource$Effect$Error
            com.hansecom.abt.util.resourcesResolvers.StringValue r1 = com.hansecom.abt.api.ApiExceptionsKt.a(r1)
            r5.<init>(r1)
            r0.p(r5)
        L_0x007c:
            com.hansecom.abt.presentation.screens.home.account.payment.add.addCyberSource.q r5 = new com.hansecom.abt.presentation.screens.home.account.payment.add.addCyberSource.q
            r5.<init>()
            r0.r(r5)
            kotlin.Unit r5 = kotlin.Unit.f40552a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.account.payment.add.addCyberSource.AddPaymentMethodCyberSourceViewModel.z(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
