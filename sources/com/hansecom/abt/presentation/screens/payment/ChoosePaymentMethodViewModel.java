package com.hansecom.abt.presentation.screens.payment;

import androidx.lifecycle.ViewModelKt;
import com.hansecom.abt.data.localDomain.PaymentMethodType;
import com.hansecom.abt.data.repositories.UserRepository;
import com.hansecom.abt.data.useCases.fareMedia.GetFareMediaUseCase;
import com.hansecom.abt.data.useCases.paymentMethods.GetCreditCardPaymentMethodsUseCase;
import com.hansecom.abt.data.useCases.paymentMethods.GetMaxNumberOfCardPaymentMethodsUseCase;
import com.hansecom.abt.presentation.model.PaymentMethodStateKt;
import com.hansecom.abt.presentation.mvi.MviViewModel;
import com.hansecom.abt.presentation.screens.payment.ChoosePaymentMethod;
import com.hansecom.abt.util.GooglePayClient;
import com.hansecom.mapi.models.FareMedium;
import com.hansecom.mapi.models.PaymentMethod;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ExtensionsKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

@Metadata
public final class ChoosePaymentMethodViewModel extends MviViewModel<ChoosePaymentMethod.Action, ChoosePaymentMethod.State, ChoosePaymentMethod.Effect> {

    /* renamed from: i  reason: collision with root package name */
    public final GetCreditCardPaymentMethodsUseCase f37766i;

    /* renamed from: j  reason: collision with root package name */
    public final GetMaxNumberOfCardPaymentMethodsUseCase f37767j;

    /* renamed from: k  reason: collision with root package name */
    public final GetFareMediaUseCase f37768k;

    /* renamed from: l  reason: collision with root package name */
    public final UserRepository f37769l;

    /* renamed from: m  reason: collision with root package name */
    public final GooglePayClient f37770m;

    /* renamed from: n  reason: collision with root package name */
    public final ChoosePaymentDestination f37771n;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ChoosePaymentMethodViewModel(androidx.lifecycle.SavedStateHandle r18, com.hansecom.abt.data.useCases.paymentMethods.GetCreditCardPaymentMethodsUseCase r19, com.hansecom.abt.data.useCases.paymentMethods.GetMaxNumberOfCardPaymentMethodsUseCase r20, com.hansecom.abt.data.useCases.fareMedia.GetFareMediaUseCase r21, com.hansecom.abt.data.repositories.UserRepository r22, com.hansecom.abt.util.GooglePayClient r23) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = r21
            r5 = r22
            r6 = r23
            java.lang.String r7 = "savedStateHandle"
            kotlin.jvm.internal.Intrinsics.i(r1, r7)
            java.lang.String r7 = "getCreditCardPaymentMethodsUseCase"
            kotlin.jvm.internal.Intrinsics.i(r2, r7)
            java.lang.String r7 = "getMaxNumberOfCardPaymentMethodsUseCase"
            kotlin.jvm.internal.Intrinsics.i(r3, r7)
            java.lang.String r7 = "getFareMediaUseCase"
            kotlin.jvm.internal.Intrinsics.i(r4, r7)
            java.lang.String r7 = "userRepository"
            kotlin.jvm.internal.Intrinsics.i(r5, r7)
            java.lang.String r7 = "googlePayClient"
            kotlin.jvm.internal.Intrinsics.i(r6, r7)
            com.hansecom.abt.presentation.screens.payment.ChoosePaymentMethod$State r7 = new com.hansecom.abt.presentation.screens.payment.ChoosePaymentMethod$State
            r15 = 63
            r16 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r8 = r7
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            r0.<init>(r1, r7)
            r0.f37766i = r2
            r0.f37767j = r3
            r0.f37768k = r4
            r0.f37769l = r5
            r0.f37770m = r6
            java.util.Map r2 = kotlin.collections.MapsKt.h()
            java.lang.Class<com.hansecom.abt.presentation.screens.payment.ChoosePaymentDestination> r3 = com.hansecom.abt.presentation.screens.payment.ChoosePaymentDestination.class
            kotlin.reflect.KClass r3 = kotlin.jvm.internal.Reflection.b(r3)
            java.lang.Object r1 = androidx.navigation.SavedStateHandleKt.a(r1, r3, r2)
            com.hansecom.abt.presentation.screens.payment.ChoosePaymentDestination r1 = (com.hansecom.abt.presentation.screens.payment.ChoosePaymentDestination) r1
            r0.f37771n = r1
            kotlinx.coroutines.CoroutineScope r1 = androidx.lifecycle.ViewModelKt.a(r17)
            com.hansecom.abt.presentation.screens.payment.ChoosePaymentMethodViewModel$1 r2 = new com.hansecom.abt.presentation.screens.payment.ChoosePaymentMethodViewModel$1
            r3 = 0
            r2.<init>(r0, r3)
            r3 = 3
            r4 = 0
            r5 = 0
            r6 = 0
            r18 = r1
            r19 = r5
            r20 = r6
            r21 = r2
            r22 = r3
            r23 = r4
            kotlinx.coroutines.Job unused = kotlinx.coroutines.BuildersKt__Builders_commonKt.d(r18, r19, r20, r21, r22, r23)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.payment.ChoosePaymentMethodViewModel.<init>(androidx.lifecycle.SavedStateHandle, com.hansecom.abt.data.useCases.paymentMethods.GetCreditCardPaymentMethodsUseCase, com.hansecom.abt.data.useCases.paymentMethods.GetMaxNumberOfCardPaymentMethodsUseCase, com.hansecom.abt.data.useCases.fareMedia.GetFareMediaUseCase, com.hansecom.abt.data.repositories.UserRepository, com.hansecom.abt.util.GooglePayClient):void");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object I(kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.hansecom.abt.presentation.screens.payment.ChoosePaymentMethodViewModel$addPaymentMethod$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.hansecom.abt.presentation.screens.payment.ChoosePaymentMethodViewModel$addPaymentMethod$1 r0 = (com.hansecom.abt.presentation.screens.payment.ChoosePaymentMethodViewModel$addPaymentMethod$1) r0
            int r1 = r0.F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.F = r1
            goto L_0x0018
        L_0x0013:
            com.hansecom.abt.presentation.screens.payment.ChoosePaymentMethodViewModel$addPaymentMethod$1 r0 = new com.hansecom.abt.presentation.screens.payment.ChoosePaymentMethodViewModel$addPaymentMethod$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.D
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.F
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r0 = r0.C
            com.hansecom.abt.presentation.screens.payment.ChoosePaymentMethodViewModel r0 = (com.hansecom.abt.presentation.screens.payment.ChoosePaymentMethodViewModel) r0
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
            com.hansecom.abt.presentation.screens.payment.t r5 = new com.hansecom.abt.presentation.screens.payment.t
            r5.<init>()
            r4.r(r5)
            com.hansecom.abt.data.repositories.UserRepository r5 = r4.f37769l
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
            com.hansecom.abt.presentation.screens.payment.u r5 = new com.hansecom.abt.presentation.screens.payment.u
            r5.<init>()
            r0.r(r5)
            com.hansecom.abt.presentation.screens.payment.ChoosePaymentMethod$Effect$InputCardDetails r5 = com.hansecom.abt.presentation.screens.payment.ChoosePaymentMethod.Effect.InputCardDetails.f37741a
            r0.p(r5)
            goto L_0x007e
        L_0x006a:
            com.hansecom.abt.presentation.screens.payment.v r5 = new com.hansecom.abt.presentation.screens.payment.v
            r5.<init>()
            r0.r(r5)
            com.hansecom.abt.presentation.screens.payment.ChoosePaymentMethod$Effect$Error r5 = new com.hansecom.abt.presentation.screens.payment.ChoosePaymentMethod$Effect$Error
            com.hansecom.abt.util.resourcesResolvers.StringValue r1 = com.hansecom.abt.api.ApiExceptionsKt.a(r1)
            r5.<init>(r1)
            r0.p(r5)
        L_0x007e:
            kotlin.Unit r5 = kotlin.Unit.f40552a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.payment.ChoosePaymentMethodViewModel.I(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final ChoosePaymentMethod.State J(ChoosePaymentMethod.State state) {
        Intrinsics.i(state, "$this$update");
        return ChoosePaymentMethod.State.b(state, false, true, (ImmutableList) null, (ImmutableList) null, (ImmutableList) null, (Integer) null, 61, (Object) null);
    }

    public static final ChoosePaymentMethod.State K(ChoosePaymentMethod.State state) {
        Intrinsics.i(state, "$this$update");
        return ChoosePaymentMethod.State.b(state, false, false, (ImmutableList) null, (ImmutableList) null, (ImmutableList) null, (Integer) null, 61, (Object) null);
    }

    public static final ChoosePaymentMethod.State L(ChoosePaymentMethod.State state) {
        Intrinsics.i(state, "$this$update");
        return ChoosePaymentMethod.State.b(state, false, false, (ImmutableList) null, (ImmutableList) null, (ImmutableList) null, (Integer) null, 61, (Object) null);
    }

    public static final ChoosePaymentMethod.State Q(List list, ChoosePaymentMethodViewModel choosePaymentMethodViewModel, ChoosePaymentMethod.State state) {
        Intrinsics.i(state, "$this$update");
        ArrayList<PaymentMethod> arrayList = new ArrayList<>();
        for (Object next : list) {
            PaymentMethod paymentMethod = (PaymentMethod) next;
            Collection c2 = choosePaymentMethodViewModel.f37771n.c();
            if (c2 == null || c2.isEmpty() || !CollectionsKt.W(choosePaymentMethodViewModel.f37771n.c(), paymentMethod.e())) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.x(arrayList, 10));
        for (PaymentMethod a2 : arrayList) {
            arrayList2.add(PaymentMethodStateKt.a(a2));
        }
        return ChoosePaymentMethod.State.b(state, false, false, (ImmutableList) null, ExtensionsKt.e(arrayList2), (ImmutableList) null, (Integer) null, 55, (Object) null);
    }

    public static final ChoosePaymentMethod.State S(FareMedium fareMedium, ChoosePaymentMethod.State state) {
        Intrinsics.i(state, "$this$update");
        return ChoosePaymentMethod.State.b(state, false, false, ExtensionsKt.b(PaymentMethodStateKt.b(fareMedium)), (ImmutableList) null, (ImmutableList) null, (Integer) null, 59, (Object) null);
    }

    public static final ChoosePaymentMethod.State U(Integer num, ChoosePaymentMethod.State state) {
        Intrinsics.i(state, "$this$update");
        return ChoosePaymentMethod.State.b(state, false, false, (ImmutableList) null, (ImmutableList) null, (ImmutableList) null, num, 31, (Object) null);
    }

    /* renamed from: M */
    public Object o(ChoosePaymentMethod.Action action, Continuation continuation) {
        if (Intrinsics.d(action, ChoosePaymentMethod.Action.AddPaymentMethod.f37737a)) {
            Object I = I(continuation);
            return I == IntrinsicsKt.f() ? I : Unit.f40552a;
        } else if (action instanceof ChoosePaymentMethod.Action.C0009ChoosePaymentMethod) {
            p(new ChoosePaymentMethod.Effect.C0010ChoosePaymentMethod(((ChoosePaymentMethod.Action.C0009ChoosePaymentMethod) action).a()));
            return Unit.f40552a;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final boolean N() {
        return this.f37771n.d().contains(PaymentMethodType.FARE_MEDIA);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object O(kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.hansecom.abt.presentation.screens.payment.ChoosePaymentMethodViewModel$loadCreditCardPaymentMethods$2
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.hansecom.abt.presentation.screens.payment.ChoosePaymentMethodViewModel$loadCreditCardPaymentMethods$2 r0 = (com.hansecom.abt.presentation.screens.payment.ChoosePaymentMethodViewModel$loadCreditCardPaymentMethods$2) r0
            int r1 = r0.F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.F = r1
            goto L_0x0018
        L_0x0013:
            com.hansecom.abt.presentation.screens.payment.ChoosePaymentMethodViewModel$loadCreditCardPaymentMethods$2 r0 = new com.hansecom.abt.presentation.screens.payment.ChoosePaymentMethodViewModel$loadCreditCardPaymentMethods$2
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.D
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.F
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r0 = r0.C
            com.hansecom.abt.presentation.screens.payment.ChoosePaymentMethodViewModel r0 = (com.hansecom.abt.presentation.screens.payment.ChoosePaymentMethodViewModel) r0
            kotlin.ResultKt.b(r5)
            kotlin.Result r5 = (kotlin.Result) r5
            java.lang.Object r5 = r5.j()
            goto L_0x004c
        L_0x0033:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x003b:
            kotlin.ResultKt.b(r5)
            com.hansecom.abt.data.useCases.paymentMethods.GetCreditCardPaymentMethodsUseCase r5 = r4.f37766i
            r0.C = r4
            r0.F = r3
            java.lang.Object r5 = r5.a(r0)
            if (r5 != r1) goto L_0x004b
            return r1
        L_0x004b:
            r0 = r4
        L_0x004c:
            java.lang.Throwable r1 = kotlin.Result.e(r5)
            if (r1 != 0) goto L_0x005d
            java.util.List r5 = (java.util.List) r5
            com.hansecom.abt.presentation.screens.payment.s r1 = new com.hansecom.abt.presentation.screens.payment.s
            r1.<init>(r5, r0)
            r0.r(r1)
            goto L_0x0069
        L_0x005d:
            com.hansecom.abt.presentation.screens.payment.ChoosePaymentMethod$Effect$Error r5 = new com.hansecom.abt.presentation.screens.payment.ChoosePaymentMethod$Effect$Error
            com.hansecom.abt.util.resourcesResolvers.StringValue r1 = com.hansecom.abt.api.ApiExceptionsKt.a(r1)
            r5.<init>(r1)
            r0.p(r5)
        L_0x0069:
            kotlin.Unit r5 = kotlin.Unit.f40552a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.payment.ChoosePaymentMethodViewModel.O(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void P(boolean z2) {
        Job unused = BuildersKt__Builders_commonKt.d(ViewModelKt.a(this), (CoroutineContext) null, (CoroutineStart) null, new ChoosePaymentMethodViewModel$loadCreditCardPaymentMethods$1(this, z2, (Continuation) null), 3, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object R(kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.hansecom.abt.presentation.screens.payment.ChoosePaymentMethodViewModel$loadFareMediaPaymentMethods$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.hansecom.abt.presentation.screens.payment.ChoosePaymentMethodViewModel$loadFareMediaPaymentMethods$1 r0 = (com.hansecom.abt.presentation.screens.payment.ChoosePaymentMethodViewModel$loadFareMediaPaymentMethods$1) r0
            int r1 = r0.F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.F = r1
            goto L_0x0018
        L_0x0013:
            com.hansecom.abt.presentation.screens.payment.ChoosePaymentMethodViewModel$loadFareMediaPaymentMethods$1 r0 = new com.hansecom.abt.presentation.screens.payment.ChoosePaymentMethodViewModel$loadFareMediaPaymentMethods$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.D
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.F
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r0 = r0.C
            com.hansecom.abt.presentation.screens.payment.ChoosePaymentMethodViewModel r0 = (com.hansecom.abt.presentation.screens.payment.ChoosePaymentMethodViewModel) r0
            kotlin.ResultKt.b(r5)
            goto L_0x005b
        L_0x002d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0035:
            kotlin.ResultKt.b(r5)
            com.hansecom.abt.presentation.screens.payment.ChoosePaymentDestination r5 = r4.f37771n
            java.lang.String r5 = r5.b()
            if (r5 != 0) goto L_0x0043
            kotlin.Unit r5 = kotlin.Unit.f40552a
            return r5
        L_0x0043:
            com.hansecom.abt.data.useCases.fareMedia.GetFareMediaUseCase r5 = r4.f37768k
            com.hansecom.abt.presentation.screens.payment.ChoosePaymentDestination r2 = r4.f37771n
            java.lang.String r2 = r2.b()
            kotlinx.coroutines.flow.Flow r5 = r5.a(r2)
            r0.C = r4
            r0.F = r3
            java.lang.Object r5 = kotlinx.coroutines.flow.FlowKt.D(r5, r0)
            if (r5 != r1) goto L_0x005a
            return r1
        L_0x005a:
            r0 = r4
        L_0x005b:
            kotlin.Result r5 = (kotlin.Result) r5
            java.lang.Object r5 = r5.j()
            java.lang.Throwable r1 = kotlin.Result.e(r5)
            if (r1 != 0) goto L_0x0072
            com.hansecom.mapi.models.FareMedium r5 = (com.hansecom.mapi.models.FareMedium) r5
            com.hansecom.abt.presentation.screens.payment.w r1 = new com.hansecom.abt.presentation.screens.payment.w
            r1.<init>(r5)
            r0.r(r1)
            goto L_0x007e
        L_0x0072:
            com.hansecom.abt.presentation.screens.payment.ChoosePaymentMethod$Effect$Error r5 = new com.hansecom.abt.presentation.screens.payment.ChoosePaymentMethod$Effect$Error
            com.hansecom.abt.util.resourcesResolvers.StringValue r1 = com.hansecom.abt.api.ApiExceptionsKt.a(r1)
            r5.<init>(r1)
            r0.p(r5)
        L_0x007e:
            kotlin.Unit r5 = kotlin.Unit.f40552a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.payment.ChoosePaymentMethodViewModel.R(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object T(kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.hansecom.abt.presentation.screens.payment.ChoosePaymentMethodViewModel$loadMaxNumberOfCardPaymentMethods$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.hansecom.abt.presentation.screens.payment.ChoosePaymentMethodViewModel$loadMaxNumberOfCardPaymentMethods$1 r0 = (com.hansecom.abt.presentation.screens.payment.ChoosePaymentMethodViewModel$loadMaxNumberOfCardPaymentMethods$1) r0
            int r1 = r0.F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.F = r1
            goto L_0x0018
        L_0x0013:
            com.hansecom.abt.presentation.screens.payment.ChoosePaymentMethodViewModel$loadMaxNumberOfCardPaymentMethods$1 r0 = new com.hansecom.abt.presentation.screens.payment.ChoosePaymentMethodViewModel$loadMaxNumberOfCardPaymentMethods$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.D
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.F
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r0 = r0.C
            com.hansecom.abt.presentation.screens.payment.ChoosePaymentMethodViewModel r0 = (com.hansecom.abt.presentation.screens.payment.ChoosePaymentMethodViewModel) r0
            kotlin.ResultKt.b(r5)
            kotlin.Result r5 = (kotlin.Result) r5
            java.lang.Object r5 = r5.j()
            goto L_0x004c
        L_0x0033:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x003b:
            kotlin.ResultKt.b(r5)
            com.hansecom.abt.data.useCases.paymentMethods.GetMaxNumberOfCardPaymentMethodsUseCase r5 = r4.f37767j
            r0.C = r4
            r0.F = r3
            java.lang.Object r5 = r5.a(r0)
            if (r5 != r1) goto L_0x004b
            return r1
        L_0x004b:
            r0 = r4
        L_0x004c:
            java.lang.Throwable r1 = kotlin.Result.e(r5)
            if (r1 != 0) goto L_0x005d
            java.lang.Integer r5 = (java.lang.Integer) r5
            com.hansecom.abt.presentation.screens.payment.x r1 = new com.hansecom.abt.presentation.screens.payment.x
            r1.<init>(r5)
            r0.r(r1)
            goto L_0x0069
        L_0x005d:
            com.hansecom.abt.presentation.screens.payment.ChoosePaymentMethod$Effect$Error r5 = new com.hansecom.abt.presentation.screens.payment.ChoosePaymentMethod$Effect$Error
            com.hansecom.abt.util.resourcesResolvers.StringValue r1 = com.hansecom.abt.api.ApiExceptionsKt.a(r1)
            r5.<init>(r1)
            r0.p(r5)
        L_0x0069:
            kotlin.Unit r5 = kotlin.Unit.f40552a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.payment.ChoosePaymentMethodViewModel.T(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
