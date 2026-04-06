package com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup;

import androidx.lifecycle.ViewModelKt;
import com.hansecom.abt.data.repositories.PaymentMethodsRepository;
import com.hansecom.abt.data.useCases.autoload.ChangeAutoloadUseCase;
import com.hansecom.abt.data.useCases.autoload.CreateAutoloadUseCase;
import com.hansecom.abt.data.useCases.autoload.GetAutoloadConfigurationsUseCase;
import com.hansecom.abt.presentation.model.PaymentMethodState;
import com.hansecom.abt.presentation.mvi.MviViewModel;
import com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup.AutoloadSetup;
import com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.CardOptionsAutoloadSetupDestination;
import com.hansecom.abt.util.BigDecimalExtKt;
import com.hansecom.mapi.models.FareMediaAutoload;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.PersistentList;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import timber.log.Timber;

@Metadata
public final class AutoloadSetupViewModel extends MviViewModel<AutoloadSetup.Action, AutoloadSetup.State, AutoloadSetup.Effect> {

    /* renamed from: i  reason: collision with root package name */
    public final PaymentMethodsRepository f36315i;

    /* renamed from: j  reason: collision with root package name */
    public final GetAutoloadConfigurationsUseCase f36316j;

    /* renamed from: k  reason: collision with root package name */
    public final CreateAutoloadUseCase f36317k;

    /* renamed from: l  reason: collision with root package name */
    public final ChangeAutoloadUseCase f36318l;

    /* renamed from: m  reason: collision with root package name */
    public final CardOptionsAutoloadSetupDestination f36319m;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AutoloadSetupViewModel(androidx.lifecycle.SavedStateHandle r33, com.hansecom.abt.data.repositories.FareMediaRepository r34, com.hansecom.abt.data.repositories.AutoloadRepository r35, com.hansecom.abt.data.repositories.PaymentMethodsRepository r36, com.hansecom.abt.data.useCases.autoload.GetAutoloadConfigurationsUseCase r37, com.hansecom.abt.data.useCases.autoload.CreateAutoloadUseCase r38, com.hansecom.abt.data.useCases.autoload.ChangeAutoloadUseCase r39, com.hansecom.abt.AppFeatures r40) {
        /*
            r32 = this;
            r0 = r32
            r1 = r33
            r2 = r34
            r3 = r35
            r4 = r36
            r5 = r37
            r6 = r38
            r7 = r39
            java.lang.String r8 = "savedStateHandle"
            kotlin.jvm.internal.Intrinsics.i(r1, r8)
            java.lang.String r8 = "fareMediaRepository"
            kotlin.jvm.internal.Intrinsics.i(r2, r8)
            java.lang.String r8 = "autoloadRepository"
            kotlin.jvm.internal.Intrinsics.i(r3, r8)
            java.lang.String r8 = "paymentMethodsRepository"
            kotlin.jvm.internal.Intrinsics.i(r4, r8)
            java.lang.String r8 = "getAutoloadConfigurationsUseCase"
            kotlin.jvm.internal.Intrinsics.i(r5, r8)
            java.lang.String r8 = "createAutoloadUseCase"
            kotlin.jvm.internal.Intrinsics.i(r6, r8)
            java.lang.String r8 = "changeAutoloadUseCase"
            kotlin.jvm.internal.Intrinsics.i(r7, r8)
            java.lang.String r8 = "appFeatures"
            r9 = r40
            kotlin.jvm.internal.Intrinsics.i(r9, r8)
            com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup.AutoloadSetup$State r8 = new com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup.AutoloadSetup$State
            r10 = r8
            kotlinx.collections.immutable.PersistentList r25 = r40.y()
            boolean r26 = r40.A()
            r30 = 475135(0x73fff, float:6.65806E-40)
            r31 = 0
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
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r0.<init>(r1, r8)
            r0.f36315i = r4
            r0.f36316j = r5
            r0.f36317k = r6
            r0.f36318l = r7
            java.util.Map r4 = kotlin.collections.MapsKt.h()
            java.lang.Class<com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.CardOptionsAutoloadSetupDestination> r5 = com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.CardOptionsAutoloadSetupDestination.class
            kotlin.reflect.KClass r5 = kotlin.jvm.internal.Reflection.b(r5)
            java.lang.Object r1 = androidx.navigation.SavedStateHandleKt.a(r1, r5, r4)
            com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.CardOptionsAutoloadSetupDestination r1 = (com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.CardOptionsAutoloadSetupDestination) r1
            r0.f36319m = r1
            kotlinx.coroutines.CoroutineScope r1 = androidx.lifecycle.ViewModelKt.a(r32)
            com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup.AutoloadSetupViewModel$1 r4 = new com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup.AutoloadSetupViewModel$1
            r5 = 0
            r4.<init>(r0, r2, r3, r5)
            r2 = 3
            r3 = 0
            r6 = 0
            r33 = r1
            r34 = r5
            r35 = r6
            r36 = r4
            r37 = r2
            r38 = r3
            kotlinx.coroutines.Job unused = kotlinx.coroutines.BuildersKt__Builders_commonKt.d(r33, r34, r35, r36, r37, r38)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup.AutoloadSetupViewModel.<init>(androidx.lifecycle.SavedStateHandle, com.hansecom.abt.data.repositories.FareMediaRepository, com.hansecom.abt.data.repositories.AutoloadRepository, com.hansecom.abt.data.repositories.PaymentMethodsRepository, com.hansecom.abt.data.useCases.autoload.GetAutoloadConfigurationsUseCase, com.hansecom.abt.data.useCases.autoload.CreateAutoloadUseCase, com.hansecom.abt.data.useCases.autoload.ChangeAutoloadUseCase, com.hansecom.abt.AppFeatures):void");
    }

    public static final AutoloadSetup.State K(AutoloadSetup.State.BalanceValidationError balanceValidationError, AutoloadSetup.State.TopUpValidationError topUpValidationError, AutoloadSetup.State state) {
        AutoloadSetup.State state2 = state;
        Intrinsics.i(state, "$this$update");
        return AutoloadSetup.State.b(state2, (String) null, (String) null, balanceValidationError, (BigDecimal) null, (BigDecimal) null, (String) null, topUpValidationError, (BigDecimal) null, (BigDecimal) null, (BigDecimal) null, (PersistentList) null, false, false, (PaymentMethodState.CreditCard) null, (PersistentList) null, false, (PaymentMethodState.CreditCard) null, false, false, 524219, (Object) null);
    }

    public static final AutoloadSetup.State O(AutoloadSetup.Action action, AutoloadSetup.State state) {
        Intrinsics.i(state, "$this$update");
        return AutoloadSetup.State.b(state, (String) null, (String) null, (AutoloadSetup.State.BalanceValidationError) null, (BigDecimal) null, (BigDecimal) null, (String) null, (AutoloadSetup.State.TopUpValidationError) null, (BigDecimal) null, (BigDecimal) null, (BigDecimal) null, (PersistentList) null, false, false, (PaymentMethodState.CreditCard) ((AutoloadSetup.Action.PaymentMethodChange) action).a(), (PersistentList) null, false, (PaymentMethodState.CreditCard) null, false, false, 516095, (Object) null);
    }

    public static final AutoloadSetup.State P(AutoloadSetup.Action action, AutoloadSetup.State state) {
        Intrinsics.i(state, "$this$update");
        return AutoloadSetup.State.b(state, (String) null, (String) null, (AutoloadSetup.State.BalanceValidationError) null, (BigDecimal) null, (BigDecimal) null, (String) null, (AutoloadSetup.State.TopUpValidationError) null, (BigDecimal) null, (BigDecimal) null, (BigDecimal) null, (PersistentList) null, false, false, (PaymentMethodState.CreditCard) null, (PersistentList) null, false, (PaymentMethodState.CreditCard) ((AutoloadSetup.Action.BackupPaymentMethodChange) action).a(), false, false, 458751, (Object) null);
    }

    public static final AutoloadSetup.State R(AutoloadSetupViewModel autoloadSetupViewModel, String str, AutoloadSetup.State state) {
        AutoloadSetup.State.TopUpValidationError topUpValidationError;
        Intrinsics.i(state, "$this$update");
        BigDecimal e2 = BigDecimalExtKt.e(((AutoloadSetup.State) autoloadSetupViewModel.m()).r());
        BigDecimal e3 = BigDecimalExtKt.e(str);
        AutoloadSetup.State.BalanceValidationError balanceValidationError = e3.compareTo(((AutoloadSetup.State) autoloadSetupViewModel.m()).h()) > 0 ? AutoloadSetup.State.BalanceValidationError.MAX_VALUE : null;
        if (((AutoloadSetup.State) autoloadSetupViewModel.m()).s() == null || ((AutoloadSetup.State) autoloadSetupViewModel.m()).s() == AutoloadSetup.State.TopUpValidationError.MAX_BALANCE) {
            if (balanceValidationError == null) {
                BigDecimal subtract = ((AutoloadSetup.State) autoloadSetupViewModel.m()).g().subtract(e3);
                Intrinsics.h(subtract, "subtract(...)");
                if (e2.compareTo(subtract) > 0) {
                    topUpValidationError = AutoloadSetup.State.TopUpValidationError.MAX_BALANCE;
                }
            }
            topUpValidationError = null;
        } else {
            topUpValidationError = ((AutoloadSetup.State) autoloadSetupViewModel.m()).s();
        }
        return AutoloadSetup.State.b(state, (String) null, str, balanceValidationError, (BigDecimal) null, (BigDecimal) null, (String) null, topUpValidationError, (BigDecimal) null, (BigDecimal) null, (BigDecimal) null, (PersistentList) null, false, false, (PaymentMethodState.CreditCard) null, (PersistentList) null, false, (PaymentMethodState.CreditCard) null, false, false, 524217, (Object) null);
    }

    public static final AutoloadSetup.State T(AutoloadSetupViewModel autoloadSetupViewModel, String str, AutoloadSetup.State state) {
        AutoloadSetup.State.TopUpValidationError topUpValidationError;
        Intrinsics.i(state, "$this$update");
        BigDecimal e2 = BigDecimalExtKt.e(((AutoloadSetup.State) autoloadSetupViewModel.m()).d());
        BigDecimal e3 = BigDecimalExtKt.e(str);
        if (e3.compareTo(((AutoloadSetup.State) autoloadSetupViewModel.m()).i()) > 0) {
            topUpValidationError = AutoloadSetup.State.TopUpValidationError.MAX_VALUE;
        } else {
            if (((AutoloadSetup.State) autoloadSetupViewModel.m()).e() == null) {
                BigDecimal subtract = ((AutoloadSetup.State) autoloadSetupViewModel.m()).g().subtract(e2);
                Intrinsics.h(subtract, "subtract(...)");
                if (e3.compareTo(subtract) > 0) {
                    topUpValidationError = AutoloadSetup.State.TopUpValidationError.MAX_BALANCE;
                }
            }
            topUpValidationError = null;
        }
        return AutoloadSetup.State.b(state, (String) null, (String) null, (AutoloadSetup.State.BalanceValidationError) null, (BigDecimal) null, (BigDecimal) null, str, topUpValidationError, (BigDecimal) null, (BigDecimal) null, (BigDecimal) null, (PersistentList) null, false, false, (PaymentMethodState.CreditCard) null, (PersistentList) null, false, (PaymentMethodState.CreditCard) null, false, false, 524191, (Object) null);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object U(com.hansecom.mapi.models.FareMediaAutoload r10, kotlin.coroutines.Continuation r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup.AutoloadSetupViewModel$setAutoloadState$1
            if (r0 == 0) goto L_0x0013
            r0 = r11
            com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup.AutoloadSetupViewModel$setAutoloadState$1 r0 = (com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup.AutoloadSetupViewModel$setAutoloadState$1) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.H = r1
            goto L_0x0018
        L_0x0013:
            com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup.AutoloadSetupViewModel$setAutoloadState$1 r0 = new com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup.AutoloadSetupViewModel$setAutoloadState$1
            r0.<init>(r9, r11)
        L_0x0018:
            java.lang.Object r11 = r0.F
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.H
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x005a
            if (r2 == r4) goto L_0x0048
            if (r2 != r3) goto L_0x0040
            java.lang.Object r10 = r0.E
            com.hansecom.abt.presentation.model.PaymentMethodState$CreditCard r10 = (com.hansecom.abt.presentation.model.PaymentMethodState.CreditCard) r10
            java.lang.Object r1 = r0.D
            com.hansecom.mapi.models.FareMediaAutoload r1 = (com.hansecom.mapi.models.FareMediaAutoload) r1
            java.lang.Object r0 = r0.C
            com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup.AutoloadSetupViewModel r0 = (com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup.AutoloadSetupViewModel) r0
            kotlin.ResultKt.b(r11)
            kotlin.Result r11 = (kotlin.Result) r11
            java.lang.Object r11 = r11.j()
            goto L_0x00ad
        L_0x0040:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0048:
            java.lang.Object r10 = r0.D
            com.hansecom.mapi.models.FareMediaAutoload r10 = (com.hansecom.mapi.models.FareMediaAutoload) r10
            java.lang.Object r2 = r0.C
            com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup.AutoloadSetupViewModel r2 = (com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup.AutoloadSetupViewModel) r2
            kotlin.ResultKt.b(r11)
            kotlin.Result r11 = (kotlin.Result) r11
            java.lang.Object r11 = r11.j()
            goto L_0x0077
        L_0x005a:
            kotlin.ResultKt.b(r11)
            java.lang.Long r11 = r10.f()
            if (r11 == 0) goto L_0x008c
            long r6 = r11.longValue()
            com.hansecom.abt.data.repositories.PaymentMethodsRepository r11 = r9.f36315i
            r0.C = r9
            r0.D = r10
            r0.H = r4
            java.lang.Object r11 = r11.O(r6, r0)
            if (r11 != r1) goto L_0x0076
            return r1
        L_0x0076:
            r2 = r9
        L_0x0077:
            boolean r4 = kotlin.Result.g(r11)
            if (r4 == 0) goto L_0x007e
            r11 = r5
        L_0x007e:
            com.hansecom.mapi.models.PaymentMethod r11 = (com.hansecom.mapi.models.PaymentMethod) r11
            if (r11 == 0) goto L_0x0087
            com.hansecom.abt.presentation.model.PaymentMethodState$CreditCard r11 = com.hansecom.abt.presentation.model.PaymentMethodStateKt.a(r11)
            goto L_0x0088
        L_0x0087:
            r11 = r5
        L_0x0088:
            r8 = r11
            r11 = r10
            r10 = r8
            goto L_0x008f
        L_0x008c:
            r2 = r9
            r11 = r10
            r10 = r5
        L_0x008f:
            java.lang.Long r4 = r11.d()
            if (r4 == 0) goto L_0x00be
            long r6 = r4.longValue()
            com.hansecom.abt.data.repositories.PaymentMethodsRepository r4 = r2.f36315i
            r0.C = r2
            r0.D = r11
            r0.E = r10
            r0.H = r3
            java.lang.Object r0 = r4.O(r6, r0)
            if (r0 != r1) goto L_0x00aa
            return r1
        L_0x00aa:
            r1 = r11
            r11 = r0
            r0 = r2
        L_0x00ad:
            boolean r2 = kotlin.Result.g(r11)
            if (r2 == 0) goto L_0x00b4
            r11 = r5
        L_0x00b4:
            com.hansecom.mapi.models.PaymentMethod r11 = (com.hansecom.mapi.models.PaymentMethod) r11
            if (r11 == 0) goto L_0x00bc
            com.hansecom.abt.presentation.model.PaymentMethodState$CreditCard r5 = com.hansecom.abt.presentation.model.PaymentMethodStateKt.a(r11)
        L_0x00bc:
            r2 = r0
            r11 = r1
        L_0x00be:
            com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup.o r0 = new com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup.o
            r0.<init>(r11, r10, r5)
            r2.r(r0)
            kotlin.Unit r10 = kotlin.Unit.f40552a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup.AutoloadSetupViewModel.U(com.hansecom.mapi.models.FareMediaAutoload, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final AutoloadSetup.State V(FareMediaAutoload fareMediaAutoload, PaymentMethodState.CreditCard creditCard, PaymentMethodState.CreditCard creditCard2, AutoloadSetup.State state) {
        Intrinsics.i(state, "$this$update");
        BigDecimal d2 = BigDecimalExtKt.d(fareMediaAutoload.b());
        BigDecimal d3 = BigDecimalExtKt.d(fareMediaAutoload.e());
        String bigDecimal = d2.toString();
        Intrinsics.h(bigDecimal, "toString(...)");
        Boolean g2 = fareMediaAutoload.g();
        boolean booleanValue = g2 != null ? g2.booleanValue() : false;
        String bigDecimal2 = d3.toString();
        Intrinsics.h(bigDecimal2, "toString(...)");
        return AutoloadSetup.State.b(state, (String) null, bigDecimal2, (AutoloadSetup.State.BalanceValidationError) null, (BigDecimal) null, (BigDecimal) null, bigDecimal, (AutoloadSetup.State.TopUpValidationError) null, (BigDecimal) null, (BigDecimal) null, (BigDecimal) null, (PersistentList) null, booleanValue, false, creditCard, (PersistentList) null, false, creditCard2, false, false, 448477, (Object) null);
    }

    public final boolean J(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        AutoloadSetup.State.TopUpValidationError s2 = bigDecimal.compareTo(((AutoloadSetup.State) m()).k()) < 0 ? AutoloadSetup.State.TopUpValidationError.MIN_VALUE : ((AutoloadSetup.State) m()).s();
        AutoloadSetup.State.BalanceValidationError e2 = bigDecimal2.compareTo(((AutoloadSetup.State) m()).j()) < 0 ? AutoloadSetup.State.BalanceValidationError.MIN_VALUE : ((AutoloadSetup.State) m()).e();
        if (s2 == null && e2 == null) {
            return true;
        }
        r(new p(e2, s2));
        return false;
    }

    public final void L() {
        Job unused = BuildersKt__Builders_commonKt.d(ViewModelKt.a(this), (CoroutineContext) null, (CoroutineStart) null, new AutoloadSetupViewModel$changeAutoload$1(this, (Continuation) null), 3, (Object) null);
    }

    public final void M() {
        Job unused = BuildersKt__Builders_commonKt.d(ViewModelKt.a(this), (CoroutineContext) null, (CoroutineStart) null, new AutoloadSetupViewModel$createAutoload$1(this, (Continuation) null), 3, (Object) null);
    }

    /* renamed from: N */
    public Object o(AutoloadSetup.Action action, Continuation continuation) {
        if (action instanceof AutoloadSetup.Action.PaymentMethodChange) {
            if (((AutoloadSetup.Action.PaymentMethodChange) action).a() instanceof PaymentMethodState.CreditCard) {
                r(new m(action));
            } else {
                Timber.f44337a.b("Unsupported payment type", new Object[0]);
            }
        } else if (action instanceof AutoloadSetup.Action.BackupPaymentMethodChange) {
            PaymentMethodState a2 = ((AutoloadSetup.Action.BackupPaymentMethodChange) action).a();
            if (a2 == null ? true : a2 instanceof PaymentMethodState.CreditCard) {
                r(new n(action));
            } else {
                Timber.f44337a.b("Unsupported payment type", new Object[0]);
            }
        } else if (action instanceof AutoloadSetup.Action.TopUpValueChange) {
            S(((AutoloadSetup.Action.TopUpValueChange) action).a());
        } else if (Intrinsics.d(action, AutoloadSetup.Action.Confirm.f36292a)) {
            if (this.f36319m.a() == null) {
                M();
            } else {
                L();
            }
        } else if (action instanceof AutoloadSetup.Action.BalanceThresholdChange) {
            Q(((AutoloadSetup.Action.BalanceThresholdChange) action).a());
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.f40552a;
    }

    public final void Q(String str) {
        r(new r(this, str));
    }

    public final void S(String str) {
        r(new q(this, str));
    }
}
