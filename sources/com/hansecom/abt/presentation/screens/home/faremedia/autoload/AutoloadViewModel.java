package com.hansecom.abt.presentation.screens.home.faremedia.autoload;

import androidx.lifecycle.ViewModelKt;
import com.hansecom.abt.data.repositories.PaymentMethodsRepository;
import com.hansecom.abt.data.useCases.autoload.ChangeAutoloadUseCase;
import com.hansecom.abt.data.useCases.autoload.DeleteAutoloadUseCase;
import com.hansecom.abt.presentation.model.PaymentMethodState;
import com.hansecom.abt.presentation.mvi.MviViewModel;
import com.hansecom.abt.presentation.screens.home.faremedia.autoload.Autoload;
import com.hansecom.mapi.models.FareMediaAutoload;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

@Metadata
public final class AutoloadViewModel extends MviViewModel<Autoload.Action, Autoload.State, Autoload.Effect> {

    /* renamed from: m  reason: collision with root package name */
    public static final Companion f36241m = new Companion((DefaultConstructorMarker) null);

    /* renamed from: n  reason: collision with root package name */
    public static final int f36242n = 8;

    /* renamed from: o  reason: collision with root package name */
    public static final BigDecimal f36243o;

    /* renamed from: i  reason: collision with root package name */
    public final PaymentMethodsRepository f36244i;

    /* renamed from: j  reason: collision with root package name */
    public final ChangeAutoloadUseCase f36245j;

    /* renamed from: k  reason: collision with root package name */
    public final DeleteAutoloadUseCase f36246k;

    /* renamed from: l  reason: collision with root package name */
    public final String f36247l;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    static {
        BigDecimal valueOf = BigDecimal.valueOf((long) 5);
        Intrinsics.h(valueOf, "valueOf(...)");
        f36243o = valueOf;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AutoloadViewModel(androidx.lifecycle.SavedStateHandle r18, com.hansecom.abt.data.repositories.FareMediaRepository r19, com.hansecom.abt.data.repositories.FareMediaConfigRepository r20, com.hansecom.abt.data.repositories.AutoloadRepository r21, com.hansecom.abt.data.repositories.PaymentMethodsRepository r22, com.hansecom.abt.data.useCases.autoload.ChangeAutoloadUseCase r23, com.hansecom.abt.data.useCases.autoload.DeleteAutoloadUseCase r24) {
        /*
            r17 = this;
            r8 = r17
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r22
            r5 = r23
            r6 = r24
            java.lang.String r7 = "savedStateHandle"
            kotlin.jvm.internal.Intrinsics.i(r0, r7)
            java.lang.String r7 = "fareMediaRepository"
            kotlin.jvm.internal.Intrinsics.i(r1, r7)
            java.lang.String r7 = "fareMediaConfigRepository"
            kotlin.jvm.internal.Intrinsics.i(r2, r7)
            java.lang.String r7 = "autoloadRepository"
            kotlin.jvm.internal.Intrinsics.i(r3, r7)
            java.lang.String r7 = "paymentMethodsRepository"
            kotlin.jvm.internal.Intrinsics.i(r4, r7)
            java.lang.String r7 = "changeAutoloadUseCase"
            kotlin.jvm.internal.Intrinsics.i(r5, r7)
            java.lang.String r7 = "deleteAutoloadUseCase"
            kotlin.jvm.internal.Intrinsics.i(r6, r7)
            com.hansecom.abt.presentation.screens.home.faremedia.autoload.Autoload$State r7 = new com.hansecom.abt.presentation.screens.home.faremedia.autoload.Autoload$State
            r15 = 31
            r16 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r9 = r7
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            r8.<init>(r0, r7)
            r8.f36244i = r4
            r8.f36245j = r5
            r8.f36246k = r6
            java.util.Map r4 = kotlin.collections.MapsKt.h()
            java.lang.Class<com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.CardOptionsAutoloadDestination> r5 = com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.CardOptionsAutoloadDestination.class
            kotlin.reflect.KClass r5 = kotlin.jvm.internal.Reflection.b(r5)
            java.lang.Object r0 = androidx.navigation.SavedStateHandleKt.a(r0, r5, r4)
            com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.CardOptionsAutoloadDestination r0 = (com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.CardOptionsAutoloadDestination) r0
            java.lang.String r0 = r0.a()
            r8.f36247l = r0
            kotlinx.coroutines.CoroutineScope r9 = androidx.lifecycle.ViewModelKt.a(r17)
            com.hansecom.abt.presentation.screens.home.faremedia.autoload.AutoloadViewModel$1 r12 = new com.hansecom.abt.presentation.screens.home.faremedia.autoload.AutoloadViewModel$1
            r0 = 0
            r12.<init>(r8, r1, r2, r0)
            r13 = 3
            r14 = 0
            kotlinx.coroutines.Job unused = kotlinx.coroutines.BuildersKt__Builders_commonKt.d(r9, r10, r11, r12, r13, r14)
            com.hansecom.abt.presentation.screens.home.faremedia.autoload.AutoloadViewModel$2 r5 = new com.hansecom.abt.presentation.screens.home.faremedia.autoload.AutoloadViewModel$2
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
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.faremedia.autoload.AutoloadViewModel.<init>(androidx.lifecycle.SavedStateHandle, com.hansecom.abt.data.repositories.FareMediaRepository, com.hansecom.abt.data.repositories.FareMediaConfigRepository, com.hansecom.abt.data.repositories.AutoloadRepository, com.hansecom.abt.data.repositories.PaymentMethodsRepository, com.hansecom.abt.data.useCases.autoload.ChangeAutoloadUseCase, com.hansecom.abt.data.useCases.autoload.DeleteAutoloadUseCase):void");
    }

    public static final Autoload.State G(Autoload.Action action, Autoload.State state) {
        Intrinsics.i(state, "$this$update");
        return Autoload.State.b(state, (String) null, (AutoloadState) null, (BigDecimal) null, (Autoload.State.LoadState) null, ((Autoload.Action.ShowDeleteDialog) action).a(), 15, (Object) null);
    }

    public static final Autoload.State J(Autoload.State state) {
        Intrinsics.i(state, "$this$update");
        return Autoload.State.b(state, (String) null, (AutoloadState) null, (BigDecimal) null, (Autoload.State.LoadState) null, false, 29, (Object) null);
    }

    public static final Autoload.State K(FareMediaAutoload fareMediaAutoload, PaymentMethodState.CreditCard creditCard, PaymentMethodState.CreditCard creditCard2, Autoload.State state) {
        Intrinsics.i(state, "$this$update");
        return Autoload.State.b(state, (String) null, AutoloadState.b(AutoloadStateKt.a(fareMediaAutoload), 0, (BigDecimal) null, (BigDecimal) null, false, creditCard, creditCard2, 15, (Object) null), (BigDecimal) null, (Autoload.State.LoadState) null, false, 29, (Object) null);
    }

    public final void E() {
        Job unused = BuildersKt__Builders_commonKt.d(ViewModelKt.a(this), (CoroutineContext) null, (CoroutineStart) null, new AutoloadViewModel$deleteAutoload$1(this, (Continuation) null), 3, (Object) null);
    }

    /* renamed from: F */
    public Object o(Autoload.Action action, Continuation continuation) {
        if (Intrinsics.d(action, Autoload.Action.Activate.f36221a)) {
            H(false);
        } else if (Intrinsics.d(action, Autoload.Action.Pause.f36223a)) {
            H(true);
        } else if (Intrinsics.d(action, Autoload.Action.Delete.f36222a)) {
            E();
        } else if (action instanceof Autoload.Action.ShowDeleteDialog) {
            r(new p(action));
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.f40552a;
    }

    public final void H(boolean z2) {
        Job unused = BuildersKt__Builders_commonKt.d(ViewModelKt.a(this), (CoroutineContext) null, (CoroutineStart) null, new AutoloadViewModel$setAutoloadPaused$1(this, z2, (Continuation) null), 3, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object I(com.hansecom.mapi.models.FareMediaAutoload r10, kotlin.coroutines.Continuation r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.hansecom.abt.presentation.screens.home.faremedia.autoload.AutoloadViewModel$setAutoloadState$1
            if (r0 == 0) goto L_0x0013
            r0 = r11
            com.hansecom.abt.presentation.screens.home.faremedia.autoload.AutoloadViewModel$setAutoloadState$1 r0 = (com.hansecom.abt.presentation.screens.home.faremedia.autoload.AutoloadViewModel$setAutoloadState$1) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.H = r1
            goto L_0x0018
        L_0x0013:
            com.hansecom.abt.presentation.screens.home.faremedia.autoload.AutoloadViewModel$setAutoloadState$1 r0 = new com.hansecom.abt.presentation.screens.home.faremedia.autoload.AutoloadViewModel$setAutoloadState$1
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
            com.hansecom.abt.presentation.screens.home.faremedia.autoload.AutoloadViewModel r0 = (com.hansecom.abt.presentation.screens.home.faremedia.autoload.AutoloadViewModel) r0
            kotlin.ResultKt.b(r11)
            kotlin.Result r11 = (kotlin.Result) r11
            java.lang.Object r11 = r11.j()
            goto L_0x00ba
        L_0x0040:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0048:
            java.lang.Object r10 = r0.D
            com.hansecom.mapi.models.FareMediaAutoload r10 = (com.hansecom.mapi.models.FareMediaAutoload) r10
            java.lang.Object r2 = r0.C
            com.hansecom.abt.presentation.screens.home.faremedia.autoload.AutoloadViewModel r2 = (com.hansecom.abt.presentation.screens.home.faremedia.autoload.AutoloadViewModel) r2
            kotlin.ResultKt.b(r11)
            kotlin.Result r11 = (kotlin.Result) r11
            java.lang.Object r11 = r11.j()
            goto L_0x0084
        L_0x005a:
            kotlin.ResultKt.b(r11)
            if (r10 != 0) goto L_0x006a
            com.hansecom.abt.presentation.screens.home.faremedia.autoload.n r10 = new com.hansecom.abt.presentation.screens.home.faremedia.autoload.n
            r10.<init>()
            r9.r(r10)
            kotlin.Unit r10 = kotlin.Unit.f40552a
            return r10
        L_0x006a:
            java.lang.Long r11 = r10.f()
            if (r11 == 0) goto L_0x0099
            long r6 = r11.longValue()
            com.hansecom.abt.data.repositories.PaymentMethodsRepository r11 = r9.f36244i
            r0.C = r9
            r0.D = r10
            r0.H = r4
            java.lang.Object r11 = r11.O(r6, r0)
            if (r11 != r1) goto L_0x0083
            return r1
        L_0x0083:
            r2 = r9
        L_0x0084:
            boolean r4 = kotlin.Result.g(r11)
            if (r4 == 0) goto L_0x008b
            r11 = r5
        L_0x008b:
            com.hansecom.mapi.models.PaymentMethod r11 = (com.hansecom.mapi.models.PaymentMethod) r11
            if (r11 == 0) goto L_0x0094
            com.hansecom.abt.presentation.model.PaymentMethodState$CreditCard r11 = com.hansecom.abt.presentation.model.PaymentMethodStateKt.a(r11)
            goto L_0x0095
        L_0x0094:
            r11 = r5
        L_0x0095:
            r8 = r11
            r11 = r10
            r10 = r8
            goto L_0x009c
        L_0x0099:
            r2 = r9
            r11 = r10
            r10 = r5
        L_0x009c:
            java.lang.Long r4 = r11.d()
            if (r4 == 0) goto L_0x00cb
            long r6 = r4.longValue()
            com.hansecom.abt.data.repositories.PaymentMethodsRepository r4 = r2.f36244i
            r0.C = r2
            r0.D = r11
            r0.E = r10
            r0.H = r3
            java.lang.Object r0 = r4.O(r6, r0)
            if (r0 != r1) goto L_0x00b7
            return r1
        L_0x00b7:
            r1 = r11
            r11 = r0
            r0 = r2
        L_0x00ba:
            boolean r2 = kotlin.Result.g(r11)
            if (r2 == 0) goto L_0x00c1
            r11 = r5
        L_0x00c1:
            com.hansecom.mapi.models.PaymentMethod r11 = (com.hansecom.mapi.models.PaymentMethod) r11
            if (r11 == 0) goto L_0x00c9
            com.hansecom.abt.presentation.model.PaymentMethodState$CreditCard r5 = com.hansecom.abt.presentation.model.PaymentMethodStateKt.a(r11)
        L_0x00c9:
            r2 = r0
            r11 = r1
        L_0x00cb:
            com.hansecom.abt.presentation.screens.home.faremedia.autoload.o r0 = new com.hansecom.abt.presentation.screens.home.faremedia.autoload.o
            r0.<init>(r11, r10, r5)
            r2.r(r0)
            kotlin.Unit r10 = kotlin.Unit.f40552a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.faremedia.autoload.AutoloadViewModel.I(com.hansecom.mapi.models.FareMediaAutoload, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
