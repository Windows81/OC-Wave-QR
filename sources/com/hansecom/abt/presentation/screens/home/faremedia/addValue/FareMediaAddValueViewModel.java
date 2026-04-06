package com.hansecom.abt.presentation.screens.home.faremedia.addValue;

import androidx.lifecycle.ViewModelKt;
import com.google.android.gms.wallet.contract.ApiTaskResult;
import com.hansecom.abt.data.managers.PurchaseManager;
import com.hansecom.abt.data.preferences.AppPreferences;
import com.hansecom.abt.data.repositories.FareMediaConfigRepository;
import com.hansecom.abt.data.repositories.FareMediaRepository;
import com.hansecom.abt.data.useCases.AddBalanceUseCase;
import com.hansecom.abt.data.useCases.AddBalanceWithGooglePayUseCase;
import com.hansecom.abt.data.useCases.paymentMethods.GetDefaultPaymentMethodUseCase;
import com.hansecom.abt.presentation.model.PaymentMethodState;
import com.hansecom.abt.presentation.mvi.MviViewModel;
import com.hansecom.abt.presentation.screens.home.faremedia.addValue.FareMediaAddValue;
import com.hansecom.abt.ui.UiResult;
import com.hansecom.abt.util.BigDecimalExtKt;
import com.hansecom.abt.util.GooglePayClient;
import com.hansecom.mapi.models.FareMedium;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.PersistentList;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

@Metadata
public final class FareMediaAddValueViewModel extends MviViewModel<FareMediaAddValue.Action, FareMediaAddValue.State, FareMediaAddValue.Effect> {

    /* renamed from: s  reason: collision with root package name */
    public static final Companion f36082s = new Companion((DefaultConstructorMarker) null);

    /* renamed from: t  reason: collision with root package name */
    public static final int f36083t = 8;

    /* renamed from: u  reason: collision with root package name */
    public static final BigDecimal f36084u;

    /* renamed from: v  reason: collision with root package name */
    public static final BigDecimal f36085v;

    /* renamed from: w  reason: collision with root package name */
    public static final BigDecimal f36086w;

    /* renamed from: i  reason: collision with root package name */
    public final FareMediaRepository f36087i;

    /* renamed from: j  reason: collision with root package name */
    public final AddBalanceUseCase f36088j;

    /* renamed from: k  reason: collision with root package name */
    public final AddBalanceWithGooglePayUseCase f36089k;

    /* renamed from: l  reason: collision with root package name */
    public final GetDefaultPaymentMethodUseCase f36090l;

    /* renamed from: m  reason: collision with root package name */
    public final FareMediaConfigRepository f36091m;

    /* renamed from: n  reason: collision with root package name */
    public final PurchaseManager f36092n;

    /* renamed from: o  reason: collision with root package name */
    public final GooglePayClient f36093o;

    /* renamed from: p  reason: collision with root package name */
    public final AppPreferences f36094p;

    /* renamed from: q  reason: collision with root package name */
    public final String f36095q;

    /* renamed from: r  reason: collision with root package name */
    public FareMedium f36096r;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    static {
        BigDecimal valueOf = BigDecimal.valueOf(1);
        Intrinsics.h(valueOf, "valueOf(...)");
        f36084u = valueOf;
        long j2 = (long) 100;
        BigDecimal valueOf2 = BigDecimal.valueOf(j2);
        Intrinsics.h(valueOf2, "valueOf(...)");
        f36085v = valueOf2;
        BigDecimal valueOf3 = BigDecimal.valueOf(j2);
        Intrinsics.h(valueOf3, "valueOf(...)");
        f36086w = valueOf3;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public FareMediaAddValueViewModel(androidx.lifecycle.SavedStateHandle r35, com.hansecom.abt.AppFeatures r36, com.hansecom.abt.data.repositories.FareMediaRepository r37, com.hansecom.abt.data.useCases.AddBalanceUseCase r38, com.hansecom.abt.data.useCases.AddBalanceWithGooglePayUseCase r39, com.hansecom.abt.data.useCases.paymentMethods.GetDefaultPaymentMethodUseCase r40, com.hansecom.abt.data.repositories.FareMediaConfigRepository r41, com.hansecom.abt.data.managers.PurchaseManager r42, com.hansecom.abt.util.GooglePayClient r43, com.hansecom.abt.data.preferences.AppPreferences r44) {
        /*
            r34 = this;
            r0 = r34
            r1 = r35
            r2 = r37
            r3 = r38
            r4 = r39
            r5 = r40
            r6 = r41
            r7 = r42
            r8 = r43
            r9 = r44
            java.lang.String r10 = "savedStateHandle"
            kotlin.jvm.internal.Intrinsics.i(r1, r10)
            java.lang.String r10 = "appFeatures"
            r11 = r36
            kotlin.jvm.internal.Intrinsics.i(r11, r10)
            java.lang.String r10 = "fareMediaRepository"
            kotlin.jvm.internal.Intrinsics.i(r2, r10)
            java.lang.String r10 = "addBalanceUseCase"
            kotlin.jvm.internal.Intrinsics.i(r3, r10)
            java.lang.String r10 = "addBalanceWithGooglePayUseCase"
            kotlin.jvm.internal.Intrinsics.i(r4, r10)
            java.lang.String r10 = "getDefaultPaymentMethodUseCase"
            kotlin.jvm.internal.Intrinsics.i(r5, r10)
            java.lang.String r10 = "fareMediaConfigRepository"
            kotlin.jvm.internal.Intrinsics.i(r6, r10)
            java.lang.String r10 = "purchaseManager"
            kotlin.jvm.internal.Intrinsics.i(r7, r10)
            java.lang.String r10 = "googlePayClient"
            kotlin.jvm.internal.Intrinsics.i(r8, r10)
            java.lang.String r10 = "appPreferences"
            kotlin.jvm.internal.Intrinsics.i(r9, r10)
            java.lang.String r10 = "5"
            java.lang.String r12 = "10"
            java.lang.String r13 = "2"
            java.lang.String[] r10 = new java.lang.String[]{r13, r10, r12}
            kotlinx.collections.immutable.PersistentList r19 = kotlinx.collections.immutable.ExtensionsKt.b(r10)
            java.math.BigDecimal r16 = f36084u
            java.math.BigDecimal r17 = f36085v
            java.math.BigDecimal r18 = f36086w
            kotlinx.collections.immutable.PersistentList r21 = r36.x()
            boolean r25 = r36.k()
            com.hansecom.abt.presentation.screens.home.faremedia.addValue.FareMediaAddValue$State r10 = new com.hansecom.abt.presentation.screens.home.faremedia.addValue.FareMediaAddValue$State
            r12 = r10
            r32 = 519813(0x7ee85, float:7.28413E-40)
            r33 = 0
            r13 = 0
            java.lang.String r14 = ""
            r15 = 0
            r20 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            r0.<init>(r1, r10)
            r0.f36087i = r2
            r0.f36088j = r3
            r0.f36089k = r4
            r0.f36090l = r5
            r0.f36091m = r6
            r0.f36092n = r7
            r0.f36093o = r8
            r0.f36094p = r9
            java.util.Map r2 = kotlin.collections.MapsKt.h()
            java.lang.Class<com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.CardOptionsAddValueDestination> r3 = com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.CardOptionsAddValueDestination.class
            kotlin.reflect.KClass r3 = kotlin.jvm.internal.Reflection.b(r3)
            java.lang.Object r1 = androidx.navigation.SavedStateHandleKt.a(r1, r3, r2)
            com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.CardOptionsAddValueDestination r1 = (com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.CardOptionsAddValueDestination) r1
            java.lang.String r1 = r1.a()
            r0.f36095q = r1
            kotlinx.coroutines.CoroutineScope r1 = androidx.lifecycle.ViewModelKt.a(r34)
            com.hansecom.abt.presentation.screens.home.faremedia.addValue.FareMediaAddValueViewModel$1 r2 = new com.hansecom.abt.presentation.screens.home.faremedia.addValue.FareMediaAddValueViewModel$1
            r3 = 0
            r2.<init>(r0, r3)
            r4 = 3
            r5 = 0
            r6 = 0
            r7 = 0
            r35 = r1
            r36 = r6
            r37 = r7
            r38 = r2
            r39 = r4
            r40 = r5
            kotlinx.coroutines.Job unused = kotlinx.coroutines.BuildersKt__Builders_commonKt.d(r35, r36, r37, r38, r39, r40)
            com.hansecom.abt.presentation.screens.home.faremedia.addValue.FareMediaAddValueViewModel$2 r1 = new com.hansecom.abt.presentation.screens.home.faremedia.addValue.FareMediaAddValueViewModel$2
            r1.<init>(r0, r3)
            r2 = 7
            r4 = 0
            r5 = 0
            r6 = 0
            r35 = r34
            r36 = r4
            r37 = r5
            r38 = r6
            r40 = r1
            r41 = r2
            r42 = r3
            com.hansecom.abt.presentation.mvi.MviViewModel.t(r35, r36, r37, r38, r40, r41, r42)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.faremedia.addValue.FareMediaAddValueViewModel.<init>(androidx.lifecycle.SavedStateHandle, com.hansecom.abt.AppFeatures, com.hansecom.abt.data.repositories.FareMediaRepository, com.hansecom.abt.data.useCases.AddBalanceUseCase, com.hansecom.abt.data.useCases.AddBalanceWithGooglePayUseCase, com.hansecom.abt.data.useCases.paymentMethods.GetDefaultPaymentMethodUseCase, com.hansecom.abt.data.repositories.FareMediaConfigRepository, com.hansecom.abt.data.managers.PurchaseManager, com.hansecom.abt.util.GooglePayClient, com.hansecom.abt.data.preferences.AppPreferences):void");
    }

    public static final FareMediaAddValue.State T(FareMediaAddValue.State state) {
        Intrinsics.i(state, "$this$update");
        return FareMediaAddValue.State.b(state, (String) null, (String) null, (FareMediaAddValue.State.ValidationError) null, (BigDecimal) null, (BigDecimal) null, (BigDecimal) null, (PersistentList) null, (PaymentMethodState) null, (PersistentList) null, false, false, false, false, (String) null, (UiResult) null, (Integer) null, (BigDecimal) null, (BigDecimal) null, (BigDecimal) null, 522239, (Object) null);
    }

    public static final FareMediaAddValue.State U(FareMediaAddValue.State state) {
        Intrinsics.i(state, "$this$update");
        return FareMediaAddValue.State.b(state, (String) null, (String) null, FareMediaAddValue.State.ValidationError.MIN_VALUE, (BigDecimal) null, (BigDecimal) null, (BigDecimal) null, (PersistentList) null, (PaymentMethodState) null, (PersistentList) null, false, false, false, false, (String) null, (UiResult) null, (Integer) null, (BigDecimal) null, (BigDecimal) null, (BigDecimal) null, 524283, (Object) null);
    }

    public static final FareMediaAddValue.State V(FareMediaAddValue.State state) {
        Intrinsics.i(state, "$this$update");
        return FareMediaAddValue.State.b(state, (String) null, (String) null, (FareMediaAddValue.State.ValidationError) null, (BigDecimal) null, (BigDecimal) null, (BigDecimal) null, (PersistentList) null, (PaymentMethodState) null, (PersistentList) null, false, false, true, false, (String) null, (UiResult) null, (Integer) null, (BigDecimal) null, (BigDecimal) null, (BigDecimal) null, 522239, (Object) null);
    }

    public static final FareMediaAddValue.State W(FareMediaAddValue.State state) {
        Intrinsics.i(state, "$this$update");
        return FareMediaAddValue.State.b(state, (String) null, (String) null, (FareMediaAddValue.State.ValidationError) null, (BigDecimal) null, (BigDecimal) null, (BigDecimal) null, (PersistentList) null, (PaymentMethodState) null, (PersistentList) null, false, false, false, false, (String) null, (UiResult) null, (Integer) null, (BigDecimal) null, (BigDecimal) null, (BigDecimal) null, 522239, (Object) null);
    }

    public static final FareMediaAddValue.State a0(FareMediaAddValue.Action action, FareMediaAddValue.State state) {
        Intrinsics.i(state, "$this$update");
        return FareMediaAddValue.State.b(state, (String) null, (String) null, (FareMediaAddValue.State.ValidationError) null, (BigDecimal) null, (BigDecimal) null, (BigDecimal) null, (PersistentList) null, (PaymentMethodState) null, (PersistentList) null, false, false, false, false, ((FareMediaAddValue.Action.CouponChange) action).a(), (UiResult) null, (Integer) null, (BigDecimal) null, (BigDecimal) null, (BigDecimal) null, 516095, (Object) null);
    }

    public static final FareMediaAddValue.State d0(PaymentMethodState paymentMethodState, FareMediaAddValue.State state) {
        FareMediaAddValue.State state2 = state;
        Intrinsics.i(state, "$this$update");
        return FareMediaAddValue.State.b(state2, (String) null, (String) null, (FareMediaAddValue.State.ValidationError) null, (BigDecimal) null, (BigDecimal) null, (BigDecimal) null, (PersistentList) null, paymentMethodState, (PersistentList) null, false, false, false, false, (String) null, (UiResult) null, (Integer) null, (BigDecimal) null, (BigDecimal) null, (BigDecimal) null, 524159, (Object) null);
    }

    public static final FareMediaAddValue.State f0(String str, FareMediaAddValueViewModel fareMediaAddValueViewModel, FareMediaAddValue.State state) {
        FareMediaAddValue.State.ValidationError validationError;
        FareMediaAddValueViewModel fareMediaAddValueViewModel2 = fareMediaAddValueViewModel;
        Intrinsics.i(state, "$this$update");
        BigDecimal e2 = BigDecimalExtKt.e(str);
        FareMedium fareMedium = fareMediaAddValueViewModel2.f36096r;
        BigDecimal bigDecimal = fareMedium != null ? new BigDecimal(String.valueOf(fareMedium.c())) : BigDecimal.ZERO;
        if (e2.compareTo(((FareMediaAddValue.State) fareMediaAddValueViewModel.m()).k()) > 0) {
            validationError = FareMediaAddValue.State.ValidationError.MAX_VALUE;
        } else {
            BigDecimal j2 = ((FareMediaAddValue.State) fareMediaAddValueViewModel.m()).j();
            Intrinsics.f(bigDecimal);
            BigDecimal subtract = j2.subtract(bigDecimal);
            Intrinsics.h(subtract, "subtract(...)");
            validationError = e2.compareTo(subtract) > 0 ? FareMediaAddValue.State.ValidationError.MAX_BALANCE : null;
        }
        FareMediaAddValue.State Y = fareMediaAddValueViewModel2.Y(FareMediaAddValue.State.b(state, (String) null, str, validationError, (BigDecimal) null, (BigDecimal) null, (BigDecimal) null, (PersistentList) null, (PaymentMethodState) null, (PersistentList) null, false, false, false, false, (String) null, (UiResult) null, (Integer) null, (BigDecimal) null, (BigDecimal) null, (BigDecimal) null, 524281, (Object) null));
        if (((FareMediaAddValue.State) fareMediaAddValueViewModel.m()).h().c()) {
            fareMediaAddValueViewModel.X();
        }
        return Y;
    }

    public static final FareMediaAddValue.State h0(FareMediaAddValueViewModel fareMediaAddValueViewModel, FareMediaAddValue.State state) {
        Intrinsics.i(state, "$this$update");
        return fareMediaAddValueViewModel.Y(FareMediaAddValue.State.b(state, (String) null, (String) null, (FareMediaAddValue.State.ValidationError) null, (BigDecimal) null, (BigDecimal) null, (BigDecimal) null, (PersistentList) null, (PaymentMethodState) null, (PersistentList) null, false, false, false, false, "", UiResult.Init.f37861z, (Integer) null, (BigDecimal) null, (BigDecimal) null, (BigDecimal) null, 499711, (Object) null));
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object S(kotlin.coroutines.Continuation r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof com.hansecom.abt.presentation.screens.home.faremedia.addValue.FareMediaAddValueViewModel$addBalance$1
            if (r0 == 0) goto L_0x0014
            r0 = r12
            com.hansecom.abt.presentation.screens.home.faremedia.addValue.FareMediaAddValueViewModel$addBalance$1 r0 = (com.hansecom.abt.presentation.screens.home.faremedia.addValue.FareMediaAddValueViewModel$addBalance$1) r0
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
            com.hansecom.abt.presentation.screens.home.faremedia.addValue.FareMediaAddValueViewModel$addBalance$1 r0 = new com.hansecom.abt.presentation.screens.home.faremedia.addValue.FareMediaAddValueViewModel$addBalance$1
            r0.<init>(r11, r12)
            goto L_0x0012
        L_0x001a:
            java.lang.Object r12 = r7.E
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r1 = r7.G
            r8 = 2
            r2 = 1
            r9 = 0
            if (r1 == 0) goto L_0x0044
            if (r1 != r2) goto L_0x003c
            java.lang.Object r0 = r7.D
            java.math.BigDecimal r0 = (java.math.BigDecimal) r0
            java.lang.Object r1 = r7.C
            com.hansecom.abt.presentation.screens.home.faremedia.addValue.FareMediaAddValueViewModel r1 = (com.hansecom.abt.presentation.screens.home.faremedia.addValue.FareMediaAddValueViewModel) r1
            kotlin.ResultKt.b(r12)
            kotlin.Result r12 = (kotlin.Result) r12
            java.lang.Object r12 = r12.j()
            goto L_0x00d5
        L_0x003c:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L_0x0044:
            kotlin.ResultKt.b(r12)
            android.os.Parcelable r12 = r11.m()
            com.hansecom.abt.presentation.screens.home.faremedia.addValue.FareMediaAddValue$State r12 = (com.hansecom.abt.presentation.screens.home.faremedia.addValue.FareMediaAddValue.State) r12
            java.math.BigDecimal r12 = r12.r()
            android.os.Parcelable r1 = r11.m()
            com.hansecom.abt.presentation.screens.home.faremedia.addValue.FareMediaAddValue$State r1 = (com.hansecom.abt.presentation.screens.home.faremedia.addValue.FareMediaAddValue.State) r1
            java.math.BigDecimal r1 = r1.l()
            int r1 = r12.compareTo(r1)
            if (r1 >= 0) goto L_0x006c
            com.hansecom.abt.presentation.screens.home.faremedia.addValue.y r12 = new com.hansecom.abt.presentation.screens.home.faremedia.addValue.y
            r12.<init>()
            r11.r(r12)
            kotlin.Unit r12 = kotlin.Unit.f40552a
            return r12
        L_0x006c:
            android.os.Parcelable r1 = r11.m()
            com.hansecom.abt.presentation.screens.home.faremedia.addValue.FareMediaAddValue$State r1 = (com.hansecom.abt.presentation.screens.home.faremedia.addValue.FareMediaAddValue.State) r1
            com.hansecom.abt.presentation.model.PaymentMethodState r1 = r1.n()
            boolean r3 = r1 instanceof com.hansecom.abt.presentation.model.PaymentMethodState.CreditCard
            if (r3 == 0) goto L_0x0104
            com.hansecom.abt.presentation.model.PaymentMethodState$CreditCard r1 = (com.hansecom.abt.presentation.model.PaymentMethodState.CreditCard) r1
            boolean r3 = r1.g()
            if (r3 == 0) goto L_0x0093
            com.hansecom.abt.presentation.screens.home.faremedia.addValue.FareMediaAddValue$Effect$Error r12 = new com.hansecom.abt.presentation.screens.home.faremedia.addValue.FareMediaAddValue$Effect$Error
            int r0 = com.hansecom.abt.R.string.T3
            com.hansecom.abt.util.resourcesResolvers.StringValue r0 = com.hansecom.abt.util.resourcesResolvers.StringValueKt.c(r0)
            r12.<init>(r0, r9, r8, r9)
            r11.p(r12)
            kotlin.Unit r12 = kotlin.Unit.f40552a
            return r12
        L_0x0093:
            com.hansecom.abt.presentation.screens.home.faremedia.addValue.z r3 = new com.hansecom.abt.presentation.screens.home.faremedia.addValue.z
            r3.<init>()
            r11.r(r3)
            com.hansecom.abt.data.useCases.AddBalanceUseCase r3 = r11.f36088j
            java.lang.String r4 = r11.f36095q
            long r5 = r1.c()
            android.os.Parcelable r1 = r11.m()
            com.hansecom.abt.presentation.screens.home.faremedia.addValue.FareMediaAddValue$State r1 = (com.hansecom.abt.presentation.screens.home.faremedia.addValue.FareMediaAddValue.State) r1
            java.lang.String r1 = r1.e()
            android.os.Parcelable r10 = r11.m()
            com.hansecom.abt.presentation.screens.home.faremedia.addValue.FareMediaAddValue$State r10 = (com.hansecom.abt.presentation.screens.home.faremedia.addValue.FareMediaAddValue.State) r10
            com.hansecom.abt.ui.UiResult r10 = r10.h()
            boolean r10 = r10.c()
            if (r10 == 0) goto L_0x00bf
            r10 = r1
            goto L_0x00c0
        L_0x00bf:
            r10 = r9
        L_0x00c0:
            r7.C = r11
            r7.D = r12
            r7.G = r2
            r1 = r3
            r2 = r4
            r3 = r12
            r4 = r5
            r6 = r10
            java.lang.Object r1 = r1.a(r2, r3, r4, r6, r7)
            if (r1 != r0) goto L_0x00d2
            return r0
        L_0x00d2:
            r0 = r12
            r12 = r1
            r1 = r11
        L_0x00d5:
            java.lang.Throwable r2 = kotlin.Result.e(r12)
            if (r2 != 0) goto L_0x00ef
            kotlin.Unit r12 = (kotlin.Unit) r12
            com.hansecom.abt.presentation.screens.home.faremedia.addValue.A r12 = new com.hansecom.abt.presentation.screens.home.faremedia.addValue.A
            r12.<init>()
            r1.r(r12)
            com.hansecom.abt.presentation.screens.home.faremedia.addValue.FareMediaAddValue$Effect$Success r12 = new com.hansecom.abt.presentation.screens.home.faremedia.addValue.FareMediaAddValue$Effect$Success
            r12.<init>(r0)
            r1.p(r12)
            goto L_0x0175
        L_0x00ef:
            com.hansecom.abt.presentation.screens.home.faremedia.addValue.B r12 = new com.hansecom.abt.presentation.screens.home.faremedia.addValue.B
            r12.<init>()
            r1.r(r12)
            com.hansecom.abt.presentation.screens.home.faremedia.addValue.FareMediaAddValue$Effect$Error r12 = new com.hansecom.abt.presentation.screens.home.faremedia.addValue.FareMediaAddValue$Effect$Error
            com.hansecom.abt.util.resourcesResolvers.StringValue r0 = com.hansecom.abt.api.ApiExceptionsKt.a(r2)
            r12.<init>(r0, r9, r8, r9)
            r1.p(r12)
            goto L_0x0175
        L_0x0104:
            boolean r12 = r1 instanceof com.hansecom.abt.presentation.model.PaymentMethodState.GooglePay
            if (r12 == 0) goto L_0x012a
            com.hansecom.abt.util.GooglePayClient r12 = r11.f36093o
            android.os.Parcelable r0 = r11.m()
            com.hansecom.abt.presentation.screens.home.faremedia.addValue.FareMediaAddValue$State r0 = (com.hansecom.abt.presentation.screens.home.faremedia.addValue.FareMediaAddValue.State) r0
            java.math.BigDecimal r0 = r0.t()
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.h(r0, r1)
            com.google.android.gms.tasks.Task r12 = r12.h(r0)
            com.hansecom.abt.presentation.screens.home.faremedia.addValue.FareMediaAddValue$Effect$GooglePayRequest r0 = new com.hansecom.abt.presentation.screens.home.faremedia.addValue.FareMediaAddValue$Effect$GooglePayRequest
            r0.<init>(r12)
            r11.p(r0)
            goto L_0x0175
        L_0x012a:
            boolean r12 = r1 instanceof com.hansecom.abt.presentation.model.PaymentMethodState.Cash
            if (r12 == 0) goto L_0x0144
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cash payment not possible to add balance"
            r12.<init>(r0)
            com.google.firebase.Firebase r0 = com.google.firebase.Firebase.f29632a
            com.google.firebase.crashlytics.FirebaseCrashlytics r0 = com.google.firebase.crashlytics.FirebaseCrashlyticsKt.a(r0)
            r0.c(r12)
            timber.log.Timber$Forest r0 = timber.log.Timber.f44337a
            r0.c(r12)
            goto L_0x0175
        L_0x0144:
            boolean r12 = r1 instanceof com.hansecom.abt.presentation.model.PaymentMethodState.FareMedia
            if (r12 == 0) goto L_0x015e
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "FareMedia payment not possible to add balance"
            r12.<init>(r0)
            com.google.firebase.Firebase r0 = com.google.firebase.Firebase.f29632a
            com.google.firebase.crashlytics.FirebaseCrashlytics r0 = com.google.firebase.crashlytics.FirebaseCrashlyticsKt.a(r0)
            r0.c(r12)
            timber.log.Timber$Forest r0 = timber.log.Timber.f44337a
            r0.c(r12)
            goto L_0x0175
        L_0x015e:
            if (r1 != 0) goto L_0x0178
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "No payment method selected"
            r12.<init>(r0)
            com.google.firebase.Firebase r0 = com.google.firebase.Firebase.f29632a
            com.google.firebase.crashlytics.FirebaseCrashlytics r0 = com.google.firebase.crashlytics.FirebaseCrashlyticsKt.a(r0)
            r0.c(r12)
            timber.log.Timber$Forest r0 = timber.log.Timber.f44337a
            r0.c(r12)
        L_0x0175:
            kotlin.Unit r12 = kotlin.Unit.f40552a
            return r12
        L_0x0178:
            kotlin.NoWhenBranchMatchedException r12 = new kotlin.NoWhenBranchMatchedException
            r12.<init>()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.faremedia.addValue.FareMediaAddValueViewModel.S(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void X() {
        Job unused = BuildersKt__Builders_commonKt.d(ViewModelKt.a(this), (CoroutineContext) null, (CoroutineStart) null, new FareMediaAddValueViewModel$applyCoupon$1(this, (Continuation) null), 3, (Object) null);
    }

    public final FareMediaAddValue.State Y(FareMediaAddValue.State state) {
        BigDecimal e2 = state.i() == null ? BigDecimalExtKt.e(state.u()) : BigDecimal.ZERO;
        Intrinsics.f(e2);
        return FareMediaAddValue.State.b(state, (String) null, (String) null, (FareMediaAddValue.State.ValidationError) null, (BigDecimal) null, (BigDecimal) null, (BigDecimal) null, (PersistentList) null, (PaymentMethodState) null, (PersistentList) null, false, false, false, false, (String) null, (UiResult) null, (Integer) null, (BigDecimal) null, e2, e2, 65535, (Object) null);
    }

    /* renamed from: Z */
    public Object o(FareMediaAddValue.Action action, Continuation continuation) {
        if (action instanceof FareMediaAddValue.Action.ValueChange) {
            e0(((FareMediaAddValue.Action.ValueChange) action).a());
        } else if (Intrinsics.d(action, FareMediaAddValue.Action.Confirm.f36057a)) {
            Object S = S(continuation);
            return S == IntrinsicsKt.f() ? S : Unit.f40552a;
        } else if (action instanceof FareMediaAddValue.Action.PaymentMethodChange) {
            c0(((FareMediaAddValue.Action.PaymentMethodChange) action).a());
        } else if (action instanceof FareMediaAddValue.Action.CouponChange) {
            r(new C(action));
        } else if (Intrinsics.d(action, FareMediaAddValue.Action.CouponApply.f36058a)) {
            X();
        } else if (Intrinsics.d(action, FareMediaAddValue.Action.CouponReset.f36060a)) {
            g0();
        } else if (action instanceof FareMediaAddValue.Action.GooglePayResult) {
            b0(((FareMediaAddValue.Action.GooglePayResult) action).a());
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.f40552a;
    }

    public final void b0(ApiTaskResult apiTaskResult) {
        Job unused = BuildersKt__Builders_commonKt.d(ViewModelKt.a(this), (CoroutineContext) null, (CoroutineStart) null, new FareMediaAddValueViewModel$onGooglePayResult$1(apiTaskResult, this, (Continuation) null), 3, (Object) null);
    }

    public final void c0(PaymentMethodState paymentMethodState) {
        r(new E(paymentMethodState));
        if (paymentMethodState instanceof PaymentMethodState.Cash) {
            e0("");
        }
    }

    public final void e0(String str) {
        r(new F(str, this));
    }

    public final void g0() {
        r(new D(this));
        p(FareMediaAddValue.Effect.CouponReset.f36065a);
    }
}
