package com.hansecom.abt.presentation.screens.main;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleCoroutineScope;
import com.hansecom.abt.AppFeatures;
import com.hansecom.abt.data.useCases.ClearUserCacheUseCase;
import com.hansecom.abt.data.useCases.appUpdate.GetAppUpdateUseCase;
import com.hansecom.abt.data.useCases.appUpdate.IgnoreAppUpdateUseCase;
import com.hansecom.abt.data.useCases.lock.AutoLockAfterInactivityUseCase;
import com.hansecom.abt.data.useCases.lock.IsLockedFlowUseCase;
import com.hansecom.abt.data.useCases.lock.ResetUnlockEndDateTimeUseCase;
import com.hansecom.abt.data.useCases.lock.SetIsBiometricsAvailableUseCase;
import com.hansecom.abt.presentation.mvi.MviViewModel;
import com.hansecom.abt.presentation.screens.main.Main;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

@Metadata
public final class MainViewModel extends MviViewModel<Main.Action, Main.State, Main.Effect> {

    /* renamed from: q  reason: collision with root package name */
    public static final Companion f37571q = new Companion((DefaultConstructorMarker) null);

    /* renamed from: r  reason: collision with root package name */
    public static final int f37572r = 8;

    /* renamed from: i  reason: collision with root package name */
    public final AppFeatures f37573i;

    /* renamed from: j  reason: collision with root package name */
    public final ClearUserCacheUseCase f37574j;

    /* renamed from: k  reason: collision with root package name */
    public final GetAppUpdateUseCase f37575k;

    /* renamed from: l  reason: collision with root package name */
    public final IgnoreAppUpdateUseCase f37576l;

    /* renamed from: m  reason: collision with root package name */
    public final IsLockedFlowUseCase f37577m;

    /* renamed from: n  reason: collision with root package name */
    public final ResetUnlockEndDateTimeUseCase f37578n;

    /* renamed from: o  reason: collision with root package name */
    public final AutoLockAfterInactivityUseCase f37579o;

    /* renamed from: p  reason: collision with root package name */
    public final SetIsBiometricsAvailableUseCase f37580p;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MainViewModel(androidx.lifecycle.SavedStateHandle r23, com.hansecom.abt.RemoteConfigSetup r24, com.hansecom.abt.data.useCases.auth.IsAccountLoggedInUseCase r25, com.hansecom.abt.AppFeatures r26, com.hansecom.abt.data.useCases.ClearUserCacheUseCase r27, com.hansecom.abt.data.useCases.appUpdate.GetAppUpdateUseCase r28, com.hansecom.abt.data.useCases.appUpdate.IgnoreAppUpdateUseCase r29, com.hansecom.abt.data.useCases.lock.IsLockedFlowUseCase r30, com.hansecom.abt.data.useCases.lock.ResetUnlockEndDateTimeUseCase r31, com.hansecom.abt.data.useCases.lock.AutoLockAfterInactivityUseCase r32, com.hansecom.abt.data.useCases.lock.SetIsBiometricsAvailableUseCase r33) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            r2 = r24
            r3 = r25
            r4 = r26
            r5 = r27
            r6 = r28
            r7 = r29
            r8 = r30
            r9 = r31
            r10 = r32
            r11 = r33
            java.lang.String r12 = "savedStateHandle"
            kotlin.jvm.internal.Intrinsics.i(r1, r12)
            java.lang.String r12 = "remoteConfigSetup"
            kotlin.jvm.internal.Intrinsics.i(r2, r12)
            java.lang.String r12 = "isAccountLoggedInUseCase"
            kotlin.jvm.internal.Intrinsics.i(r3, r12)
            java.lang.String r12 = "appFeatures"
            kotlin.jvm.internal.Intrinsics.i(r4, r12)
            java.lang.String r12 = "clearUserCacheUseCase"
            kotlin.jvm.internal.Intrinsics.i(r5, r12)
            java.lang.String r12 = "getAppUpdateUseCase"
            kotlin.jvm.internal.Intrinsics.i(r6, r12)
            java.lang.String r12 = "ignoreAppUpdateUseCase"
            kotlin.jvm.internal.Intrinsics.i(r7, r12)
            java.lang.String r12 = "isLockedFlowUseCase"
            kotlin.jvm.internal.Intrinsics.i(r8, r12)
            java.lang.String r12 = "resetUnlockEndDateTimeUseCase"
            kotlin.jvm.internal.Intrinsics.i(r9, r12)
            java.lang.String r12 = "autoLockAfterInactivityUseCase"
            kotlin.jvm.internal.Intrinsics.i(r10, r12)
            java.lang.String r12 = "setIsBiometricsAvailableUseCase"
            kotlin.jvm.internal.Intrinsics.i(r11, r12)
            com.hansecom.abt.presentation.screens.main.Main$State r12 = new com.hansecom.abt.presentation.screens.main.Main$State
            boolean r16 = r26.b()
            r20 = 24
            r21 = 0
            r14 = 1
            r15 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r13 = r12
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21)
            r0.<init>(r1, r12)
            r0.f37573i = r4
            r0.f37574j = r5
            r0.f37575k = r6
            r0.f37576l = r7
            r0.f37577m = r8
            r0.f37578n = r9
            r0.f37579o = r10
            r0.f37580p = r11
            kotlinx.coroutines.CoroutineScope r1 = androidx.lifecycle.ViewModelKt.a(r22)
            com.hansecom.abt.presentation.screens.main.MainViewModel$1 r4 = new com.hansecom.abt.presentation.screens.main.MainViewModel$1
            r5 = 0
            r4.<init>(r0, r5)
            r6 = 3
            r7 = 0
            r8 = 0
            r9 = 0
            r26 = r1
            r27 = r8
            r28 = r9
            r29 = r4
            r30 = r6
            r31 = r7
            kotlinx.coroutines.Job unused = kotlinx.coroutines.BuildersKt__Builders_commonKt.d(r26, r27, r28, r29, r30, r31)
            com.hansecom.abt.presentation.screens.main.MainViewModel$2 r1 = new com.hansecom.abt.presentation.screens.main.MainViewModel$2
            r1.<init>(r0, r5)
            r4 = 7
            r6 = 0
            r8 = 0
            r9 = 0
            r26 = r22
            r27 = r7
            r28 = r8
            r29 = r9
            r31 = r1
            r32 = r4
            r33 = r6
            com.hansecom.abt.presentation.mvi.MviViewModel.t(r26, r27, r28, r29, r31, r32, r33)
            kotlinx.coroutines.CoroutineScope r1 = androidx.lifecycle.ViewModelKt.a(r22)
            com.hansecom.abt.presentation.screens.main.MainViewModel$3 r4 = new com.hansecom.abt.presentation.screens.main.MainViewModel$3
            r4.<init>(r3, r2, r0, r5)
            r2 = 3
            r3 = 0
            r23 = r1
            r24 = r5
            r25 = r6
            r26 = r4
            r27 = r2
            r28 = r3
            kotlinx.coroutines.Job unused = kotlinx.coroutines.BuildersKt__Builders_commonKt.d(r23, r24, r25, r26, r27, r28)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.main.MainViewModel.<init>(androidx.lifecycle.SavedStateHandle, com.hansecom.abt.RemoteConfigSetup, com.hansecom.abt.data.useCases.auth.IsAccountLoggedInUseCase, com.hansecom.abt.AppFeatures, com.hansecom.abt.data.useCases.ClearUserCacheUseCase, com.hansecom.abt.data.useCases.appUpdate.GetAppUpdateUseCase, com.hansecom.abt.data.useCases.appUpdate.IgnoreAppUpdateUseCase, com.hansecom.abt.data.useCases.lock.IsLockedFlowUseCase, com.hansecom.abt.data.useCases.lock.ResetUnlockEndDateTimeUseCase, com.hansecom.abt.data.useCases.lock.AutoLockAfterInactivityUseCase, com.hansecom.abt.data.useCases.lock.SetIsBiometricsAvailableUseCase):void");
    }

    /* renamed from: B */
    public Object o(Main.Action action, Continuation continuation) {
        if (Intrinsics.d(action, Main.Action.IgnoreAppUpdate.f37553a)) {
            Object a2 = this.f37576l.a(continuation);
            return a2 == IntrinsicsKt.f() ? a2 : Unit.f40552a;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void C(boolean z2, LifecycleCoroutineScope lifecycleCoroutineScope, Lifecycle lifecycle) {
        Intrinsics.i(lifecycleCoroutineScope, "lifecycleScope");
        Intrinsics.i(lifecycle, "lifecycle");
        if (this.f37573i.E()) {
            Job unused = BuildersKt__Builders_commonKt.d(lifecycleCoroutineScope, (CoroutineContext) null, (CoroutineStart) null, new MainViewModel$startBiometricLockTriggers$1(lifecycle, this, z2, (Continuation) null), 3, (Object) null);
        }
    }
}
