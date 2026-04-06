package com.hansecom.abt.presentation.screens.home.account.payment.detalis;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import androidx.navigation.SavedStateHandleKt;
import com.hansecom.abt.AppFeatures;
import com.hansecom.abt.data.exceptions.FieldErrorsException;
import com.hansecom.abt.data.repositories.PaymentMethodsRepository;
import com.hansecom.abt.presentation.model.PaymentMethodState;
import com.hansecom.abt.presentation.mvi.MviViewModel;
import com.hansecom.abt.presentation.screens.home.account.AccountPaymentMethodDetailsDestination;
import com.hansecom.abt.presentation.screens.home.account.payment.detalis.PaymentMethodDetails;
import com.hansecom.abt.util.resourcesResolvers.StringValue;
import com.hansecom.abt.util.resourcesResolvers.StringValueKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

@Metadata
public final class PaymentMethodDetailsViewModel extends MviViewModel<PaymentMethodDetails.Action, PaymentMethodDetails.State, PaymentMethodDetails.Effect> {

    /* renamed from: i  reason: collision with root package name */
    public final PaymentMethodsRepository f35779i;

    /* renamed from: j  reason: collision with root package name */
    public final long f35780j;

    @Metadata
    @DebugMetadata(c = "com.hansecom.abt.presentation.screens.home.account.payment.detalis.PaymentMethodDetailsViewModel$1", f = "PaymentMethodDetailsViewModel.kt", l = {34}, m = "invokeSuspend")
    /* renamed from: com.hansecom.abt.presentation.screens.home.account.payment.detalis.PaymentMethodDetailsViewModel$1  reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int D;
        public final /* synthetic */ PaymentMethodDetailsViewModel E;

        {
            this.E = r1;
        }

        /* renamed from: A */
        public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass1) s(coroutineScope, continuation)).x(Unit.f40552a);
        }

        public final Continuation s(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.E, continuation);
        }

        public final Object x(Object obj) {
            Object f2 = IntrinsicsKt.f();
            int i2 = this.D;
            if (i2 == 0) {
                ResultKt.b(obj);
                PaymentMethodDetailsViewModel paymentMethodDetailsViewModel = this.E;
                long F = paymentMethodDetailsViewModel.f35780j;
                this.D = 1;
                if (paymentMethodDetailsViewModel.L(F, this) == f2) {
                    return f2;
                }
            } else if (i2 == 1) {
                ResultKt.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return Unit.f40552a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaymentMethodDetailsViewModel(SavedStateHandle savedStateHandle, PaymentMethodsRepository paymentMethodsRepository, AppFeatures appFeatures) {
        super(savedStateHandle, new PaymentMethodDetails.State(false, false, false, (PaymentMethodState.CreditCard) null, (String) null, (StringValue) null, false, appFeatures.d(), 127, (DefaultConstructorMarker) null));
        Intrinsics.i(savedStateHandle, "savedStateHandle");
        Intrinsics.i(paymentMethodsRepository, "paymentMethodsRepository");
        Intrinsics.i(appFeatures, "appFeatures");
        this.f35779i = paymentMethodsRepository;
        this.f35780j = ((AccountPaymentMethodDetailsDestination) SavedStateHandleKt.a(savedStateHandle, Reflection.b(AccountPaymentMethodDetailsDestination.class), MapsKt.h())).a();
        Job unused = BuildersKt__Builders_commonKt.d(ViewModelKt.a(this), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, (Continuation) null), 3, (Object) null);
    }

    public static final PaymentMethodDetails.State K(PaymentMethodDetails.Action action, PaymentMethodDetails.State state) {
        Intrinsics.i(state, "$this$update");
        return PaymentMethodDetails.State.b(state, false, false, false, (PaymentMethodState.CreditCard) null, (String) null, (StringValue) null, ((PaymentMethodDetails.Action.DeleteDialog) action).a(), false, 191, (Object) null);
    }

    public static final PaymentMethodDetails.State M(PaymentMethodDetails.State state) {
        Intrinsics.i(state, "$this$update");
        return PaymentMethodDetails.State.b(state, true, false, false, (PaymentMethodState.CreditCard) null, (String) null, (StringValue) null, false, false, 254, (Object) null);
    }

    public static final PaymentMethodDetails.State N(PaymentMethodDetails.State state) {
        Intrinsics.i(state, "$this$update");
        return PaymentMethodDetails.State.b(state, false, false, false, (PaymentMethodState.CreditCard) null, (String) null, (StringValue) null, false, false, 254, (Object) null);
    }

    public static final PaymentMethodDetails.State O(PaymentMethodState.CreditCard creditCard, PaymentMethodDetails.State state) {
        Intrinsics.i(state, "$this$update");
        String e2 = creditCard.e();
        if (e2 == null) {
            e2 = "";
        }
        return PaymentMethodDetails.State.b(state, false, false, false, creditCard, e2, (StringValue) null, false, false, 230, (Object) null);
    }

    public static final PaymentMethodDetails.State P(PaymentMethodDetails.State state) {
        Intrinsics.i(state, "$this$update");
        return PaymentMethodDetails.State.b(state, false, false, false, (PaymentMethodState.CreditCard) null, (String) null, (StringValue) null, false, false, 254, (Object) null);
    }

    private final void Q(String str) {
        r(new q(str));
    }

    public static final PaymentMethodDetails.State R(String str, PaymentMethodDetails.State state) {
        Intrinsics.i(state, "$this$update");
        return PaymentMethodDetails.State.b(state, false, false, false, (PaymentMethodState.CreditCard) null, str, (StringValue) null, false, false, 239, (Object) null);
    }

    public static final PaymentMethodDetails.State T(PaymentMethodDetails.State state) {
        Intrinsics.i(state, "$this$update");
        return PaymentMethodDetails.State.b(state, false, false, true, (PaymentMethodState.CreditCard) null, (String) null, (StringValue) null, false, false, 251, (Object) null);
    }

    public static final PaymentMethodDetails.State U(PaymentMethodDetails.State state) {
        Intrinsics.i(state, "$this$update");
        return PaymentMethodDetails.State.b(state, false, false, false, (PaymentMethodState.CreditCard) null, (String) null, (StringValue) null, false, false, 251, (Object) null);
    }

    public static final PaymentMethodDetails.State W(PaymentMethodDetails.State state) {
        Intrinsics.i(state, "$this$update");
        return PaymentMethodDetails.State.b(state, false, true, false, (PaymentMethodState.CreditCard) null, (String) null, (StringValue) null, false, false, 253, (Object) null);
    }

    public static final PaymentMethodDetails.State X(Throwable th, PaymentMethodDetails.State state) {
        Intrinsics.i(state, "$this$update");
        return PaymentMethodDetails.State.b(state, false, false, false, (PaymentMethodState.CreditCard) null, (String) null, StringValueKt.b(((FieldErrorsException) th).j()), false, false, 221, (Object) null);
    }

    public static final PaymentMethodDetails.State Y(PaymentMethodDetails.State state) {
        Intrinsics.i(state, "$this$update");
        return PaymentMethodDetails.State.b(state, false, false, false, (PaymentMethodState.CreditCard) null, (String) null, (StringValue) null, false, false, 253, (Object) null);
    }

    /* renamed from: J */
    public Object o(PaymentMethodDetails.Action action, Continuation continuation) {
        if (Intrinsics.d(action, PaymentMethodDetails.Action.Delete.f35764a)) {
            Object S = S(continuation);
            return S == IntrinsicsKt.f() ? S : Unit.f40552a;
        }
        if (action instanceof PaymentMethodDetails.Action.NickNameChange) {
            Q(((PaymentMethodDetails.Action.NickNameChange) action).a());
        } else if (Intrinsics.d(action, PaymentMethodDetails.Action.Save.f35767a)) {
            Object V = V(continuation);
            return V == IntrinsicsKt.f() ? V : Unit.f40552a;
        } else if (action instanceof PaymentMethodDetails.Action.DeleteDialog) {
            r(new x(action));
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.f40552a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0078 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object L(long r7, kotlin.coroutines.Continuation r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.hansecom.abt.presentation.screens.home.account.payment.detalis.PaymentMethodDetailsViewModel$loadPaymentMethod$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.hansecom.abt.presentation.screens.home.account.payment.detalis.PaymentMethodDetailsViewModel$loadPaymentMethod$1 r0 = (com.hansecom.abt.presentation.screens.home.account.payment.detalis.PaymentMethodDetailsViewModel$loadPaymentMethod$1) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.G = r1
            goto L_0x0018
        L_0x0013:
            com.hansecom.abt.presentation.screens.home.account.payment.detalis.PaymentMethodDetailsViewModel$loadPaymentMethod$1 r0 = new com.hansecom.abt.presentation.screens.home.account.payment.detalis.PaymentMethodDetailsViewModel$loadPaymentMethod$1
            r0.<init>(r6, r9)
        L_0x0018:
            java.lang.Object r9 = r0.E
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.G
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0051
            if (r2 == r4) goto L_0x0040
            if (r2 != r3) goto L_0x0038
            java.lang.Object r7 = r0.D
            java.lang.Object r8 = r0.C
            com.hansecom.abt.presentation.screens.home.account.payment.detalis.PaymentMethodDetailsViewModel r8 = (com.hansecom.abt.presentation.screens.home.account.payment.detalis.PaymentMethodDetailsViewModel) r8
            kotlin.ResultKt.b(r9)
            kotlin.Result r9 = (kotlin.Result) r9
            java.lang.Object r9 = r9.j()
            goto L_0x0079
        L_0x0038:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0040:
            java.lang.Object r7 = r0.C
            com.hansecom.abt.presentation.screens.home.account.payment.detalis.PaymentMethodDetailsViewModel r7 = (com.hansecom.abt.presentation.screens.home.account.payment.detalis.PaymentMethodDetailsViewModel) r7
            kotlin.ResultKt.b(r9)
            kotlin.Result r9 = (kotlin.Result) r9
            java.lang.Object r8 = r9.j()
            r5 = r8
            r8 = r7
            r7 = r5
            goto L_0x006a
        L_0x0051:
            kotlin.ResultKt.b(r9)
            com.hansecom.abt.presentation.screens.home.account.payment.detalis.t r9 = new com.hansecom.abt.presentation.screens.home.account.payment.detalis.t
            r9.<init>()
            r6.r(r9)
            com.hansecom.abt.data.repositories.PaymentMethodsRepository r9 = r6.f35779i
            r0.C = r6
            r0.G = r4
            java.lang.Object r7 = r9.O(r7, r0)
            if (r7 != r1) goto L_0x0069
            return r1
        L_0x0069:
            r8 = r6
        L_0x006a:
            com.hansecom.abt.data.repositories.PaymentMethodsRepository r9 = r8.f35779i
            r0.C = r8
            r0.D = r7
            r0.G = r3
            java.lang.Object r9 = r9.i(r0)
            if (r9 != r1) goto L_0x0079
            return r1
        L_0x0079:
            boolean r0 = kotlin.Result.h(r9)
            if (r0 == 0) goto L_0x0089
            java.util.List r9 = (java.util.List) r9
            int r9 = r9.size()
            java.lang.Integer r9 = kotlin.coroutines.jvm.internal.Boxing.c(r9)
        L_0x0089:
            java.lang.Object r9 = kotlin.Result.b(r9)
            java.lang.Throwable r9 = kotlin.Result.e(r9)
            if (r9 == 0) goto L_0x00a7
            com.hansecom.abt.presentation.screens.home.account.payment.detalis.u r0 = new com.hansecom.abt.presentation.screens.home.account.payment.detalis.u
            r0.<init>()
            r8.r(r0)
            com.hansecom.abt.presentation.screens.home.account.payment.detalis.PaymentMethodDetails$Effect$InitialLoadingError r0 = new com.hansecom.abt.presentation.screens.home.account.payment.detalis.PaymentMethodDetails$Effect$InitialLoadingError
            com.hansecom.abt.util.resourcesResolvers.StringValue r9 = com.hansecom.abt.api.ApiExceptionsKt.a(r9)
            r0.<init>(r9)
            r8.p(r0)
        L_0x00a7:
            java.lang.Throwable r9 = kotlin.Result.e(r7)
            if (r9 != 0) goto L_0x00bc
            com.hansecom.mapi.models.PaymentMethod r7 = (com.hansecom.mapi.models.PaymentMethod) r7
            com.hansecom.abt.presentation.model.PaymentMethodState$CreditCard r7 = com.hansecom.abt.presentation.model.PaymentMethodStateKt.a(r7)
            com.hansecom.abt.presentation.screens.home.account.payment.detalis.v r9 = new com.hansecom.abt.presentation.screens.home.account.payment.detalis.v
            r9.<init>(r7)
            r8.r(r9)
            goto L_0x00d0
        L_0x00bc:
            com.hansecom.abt.presentation.screens.home.account.payment.detalis.w r7 = new com.hansecom.abt.presentation.screens.home.account.payment.detalis.w
            r7.<init>()
            r8.r(r7)
            com.hansecom.abt.presentation.screens.home.account.payment.detalis.PaymentMethodDetails$Effect$InitialLoadingError r7 = new com.hansecom.abt.presentation.screens.home.account.payment.detalis.PaymentMethodDetails$Effect$InitialLoadingError
            com.hansecom.abt.util.resourcesResolvers.StringValue r9 = com.hansecom.abt.api.ApiExceptionsKt.a(r9)
            r7.<init>(r9)
            r8.p(r7)
        L_0x00d0:
            kotlin.Unit r7 = kotlin.Unit.f40552a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.account.payment.detalis.PaymentMethodDetailsViewModel.L(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object S(kotlin.coroutines.Continuation r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.hansecom.abt.presentation.screens.home.account.payment.detalis.PaymentMethodDetailsViewModel$removePaymentMethod$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.hansecom.abt.presentation.screens.home.account.payment.detalis.PaymentMethodDetailsViewModel$removePaymentMethod$1 r0 = (com.hansecom.abt.presentation.screens.home.account.payment.detalis.PaymentMethodDetailsViewModel$removePaymentMethod$1) r0
            int r1 = r0.F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.F = r1
            goto L_0x0018
        L_0x0013:
            com.hansecom.abt.presentation.screens.home.account.payment.detalis.PaymentMethodDetailsViewModel$removePaymentMethod$1 r0 = new com.hansecom.abt.presentation.screens.home.account.payment.detalis.PaymentMethodDetailsViewModel$removePaymentMethod$1
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.D
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.F
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r0 = r0.C
            com.hansecom.abt.presentation.screens.home.account.payment.detalis.PaymentMethodDetailsViewModel r0 = (com.hansecom.abt.presentation.screens.home.account.payment.detalis.PaymentMethodDetailsViewModel) r0
            kotlin.ResultKt.b(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r7 = r7.j()
            goto L_0x0056
        L_0x0033:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x003b:
            kotlin.ResultKt.b(r7)
            com.hansecom.abt.presentation.screens.home.account.payment.detalis.y r7 = new com.hansecom.abt.presentation.screens.home.account.payment.detalis.y
            r7.<init>()
            r6.r(r7)
            com.hansecom.abt.data.repositories.PaymentMethodsRepository r7 = r6.f35779i
            long r4 = r6.f35780j
            r0.C = r6
            r0.F = r3
            java.lang.Object r7 = r7.P(r4, r0)
            if (r7 != r1) goto L_0x0055
            return r1
        L_0x0055:
            r0 = r6
        L_0x0056:
            java.lang.Throwable r1 = kotlin.Result.e(r7)
            if (r1 != 0) goto L_0x0064
            kotlin.Unit r7 = (kotlin.Unit) r7
            com.hansecom.abt.presentation.screens.home.account.payment.detalis.PaymentMethodDetails$Effect$DeleteSuccess r7 = com.hansecom.abt.presentation.screens.home.account.payment.detalis.PaymentMethodDetails.Effect.DeleteSuccess.f35768a
            r0.p(r7)
            goto L_0x0078
        L_0x0064:
            com.hansecom.abt.presentation.screens.home.account.payment.detalis.z r7 = new com.hansecom.abt.presentation.screens.home.account.payment.detalis.z
            r7.<init>()
            r0.r(r7)
            com.hansecom.abt.presentation.screens.home.account.payment.detalis.PaymentMethodDetails$Effect$Error r7 = new com.hansecom.abt.presentation.screens.home.account.payment.detalis.PaymentMethodDetails$Effect$Error
            com.hansecom.abt.util.resourcesResolvers.StringValue r1 = com.hansecom.abt.api.ApiExceptionsKt.a(r1)
            r7.<init>(r1)
            r0.p(r7)
        L_0x0078:
            kotlin.Unit r7 = kotlin.Unit.f40552a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.account.payment.detalis.PaymentMethodDetailsViewModel.S(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object V(kotlin.coroutines.Continuation r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.hansecom.abt.presentation.screens.home.account.payment.detalis.PaymentMethodDetailsViewModel$savePaymentMethod$1
            if (r0 == 0) goto L_0x0014
            r0 = r8
            com.hansecom.abt.presentation.screens.home.account.payment.detalis.PaymentMethodDetailsViewModel$savePaymentMethod$1 r0 = (com.hansecom.abt.presentation.screens.home.account.payment.detalis.PaymentMethodDetailsViewModel$savePaymentMethod$1) r0
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
            com.hansecom.abt.presentation.screens.home.account.payment.detalis.PaymentMethodDetailsViewModel$savePaymentMethod$1 r0 = new com.hansecom.abt.presentation.screens.home.account.payment.detalis.PaymentMethodDetailsViewModel$savePaymentMethod$1
            r0.<init>(r7, r8)
            goto L_0x0012
        L_0x001a:
            java.lang.Object r8 = r6.D
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r1 = r6.F
            r2 = 1
            if (r1 == 0) goto L_0x003d
            if (r1 != r2) goto L_0x0035
            java.lang.Object r0 = r6.C
            com.hansecom.abt.presentation.screens.home.account.payment.detalis.PaymentMethodDetailsViewModel r0 = (com.hansecom.abt.presentation.screens.home.account.payment.detalis.PaymentMethodDetailsViewModel) r0
            kotlin.ResultKt.b(r8)
            kotlin.Result r8 = (kotlin.Result) r8
            java.lang.Object r8 = r8.j()
            goto L_0x0076
        L_0x0035:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x003d:
            kotlin.ResultKt.b(r8)
            com.hansecom.abt.presentation.screens.home.account.payment.detalis.p r8 = new com.hansecom.abt.presentation.screens.home.account.payment.detalis.p
            r8.<init>()
            r7.r(r8)
            com.hansecom.abt.data.repositories.PaymentMethodsRepository r1 = r7.f35779i
            long r3 = r7.f35780j
            android.os.Parcelable r8 = r7.m()
            com.hansecom.abt.presentation.screens.home.account.payment.detalis.PaymentMethodDetails$State r8 = (com.hansecom.abt.presentation.screens.home.account.payment.detalis.PaymentMethodDetails.State) r8
            java.lang.String r8 = r8.g()
            android.os.Parcelable r5 = r7.m()
            com.hansecom.abt.presentation.screens.home.account.payment.detalis.PaymentMethodDetails$State r5 = (com.hansecom.abt.presentation.screens.home.account.payment.detalis.PaymentMethodDetails.State) r5
            com.hansecom.abt.presentation.model.PaymentMethodState$CreditCard r5 = r5.i()
            if (r5 == 0) goto L_0x0067
            boolean r5 = r5.f()
            goto L_0x0068
        L_0x0067:
            r5 = 0
        L_0x0068:
            r6.C = r7
            r6.F = r2
            r2 = r3
            r4 = r8
            java.lang.Object r8 = r1.M(r2, r4, r5, r6)
            if (r8 != r0) goto L_0x0075
            return r0
        L_0x0075:
            r0 = r7
        L_0x0076:
            java.lang.Throwable r1 = kotlin.Result.e(r8)
            if (r1 != 0) goto L_0x0084
            com.hansecom.mapi.models.PaymentMethod r8 = (com.hansecom.mapi.models.PaymentMethod) r8
            com.hansecom.abt.presentation.screens.home.account.payment.detalis.PaymentMethodDetails$Effect$SaveSuccess r8 = com.hansecom.abt.presentation.screens.home.account.payment.detalis.PaymentMethodDetails.Effect.SaveSuccess.f35771a
            r0.p(r8)
            goto L_0x00a5
        L_0x0084:
            boolean r8 = r1 instanceof com.hansecom.abt.data.exceptions.FieldErrorsException
            if (r8 == 0) goto L_0x0091
            com.hansecom.abt.presentation.screens.home.account.payment.detalis.r r8 = new com.hansecom.abt.presentation.screens.home.account.payment.detalis.r
            r8.<init>(r1)
            r0.r(r8)
            goto L_0x00a5
        L_0x0091:
            com.hansecom.abt.presentation.screens.home.account.payment.detalis.s r8 = new com.hansecom.abt.presentation.screens.home.account.payment.detalis.s
            r8.<init>()
            r0.r(r8)
            com.hansecom.abt.presentation.screens.home.account.payment.detalis.PaymentMethodDetails$Effect$Error r8 = new com.hansecom.abt.presentation.screens.home.account.payment.detalis.PaymentMethodDetails$Effect$Error
            com.hansecom.abt.util.resourcesResolvers.StringValue r1 = com.hansecom.abt.api.ApiExceptionsKt.a(r1)
            r8.<init>(r1)
            r0.p(r8)
        L_0x00a5:
            kotlin.Unit r8 = kotlin.Unit.f40552a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.account.payment.detalis.PaymentMethodDetailsViewModel.V(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
