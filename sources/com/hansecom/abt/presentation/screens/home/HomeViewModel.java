package com.hansecom.abt.presentation.screens.home;

import com.hansecom.abt.data.useCases.lock.GetShowUserBiometricDialogUseCase;
import com.hansecom.abt.data.useCases.lock.SetIsBiometricLockedUseCase;
import com.hansecom.abt.data.useCases.lock.SetShownUserBiometricDialogUseCase;
import com.hansecom.abt.presentation.mvi.MviViewModel;
import com.hansecom.abt.presentation.screens.home.Home;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class HomeViewModel extends MviViewModel<Home.Action, Home.State, Home.Effect> {

    /* renamed from: i  reason: collision with root package name */
    public final GetShowUserBiometricDialogUseCase f34996i;

    /* renamed from: j  reason: collision with root package name */
    public final SetShownUserBiometricDialogUseCase f34997j;

    /* renamed from: k  reason: collision with root package name */
    public final SetIsBiometricLockedUseCase f34998k;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public HomeViewModel(androidx.lifecycle.SavedStateHandle r18, com.hansecom.abt.data.useCases.GetVirtualCardFlowUseCase r19, com.hansecom.abt.AppFeatures r20, com.hansecom.abt.data.useCases.lock.GetShowUserBiometricDialogUseCase r21, com.hansecom.abt.data.useCases.lock.SetShownUserBiometricDialogUseCase r22, com.hansecom.abt.data.useCases.lock.SetIsBiometricLockedUseCase r23) {
        /*
            r17 = this;
            r8 = r17
            r0 = r18
            r1 = r19
            r9 = r20
            r2 = r21
            r3 = r22
            r4 = r23
            java.lang.String r5 = "savedStateHandle"
            kotlin.jvm.internal.Intrinsics.i(r0, r5)
            java.lang.String r5 = "getVirtualCardFlowUseCase"
            kotlin.jvm.internal.Intrinsics.i(r1, r5)
            java.lang.String r5 = "appFeatures"
            kotlin.jvm.internal.Intrinsics.i(r9, r5)
            java.lang.String r5 = "getShowUserBiometricDialogUseCase"
            kotlin.jvm.internal.Intrinsics.i(r2, r5)
            java.lang.String r5 = "setShownUserBiometricDialogUseCase"
            kotlin.jvm.internal.Intrinsics.i(r3, r5)
            java.lang.String r5 = "setIsBiometricLockedUseCase"
            kotlin.jvm.internal.Intrinsics.i(r4, r5)
            com.hansecom.abt.presentation.screens.home.Home$State r5 = new com.hansecom.abt.presentation.screens.home.Home$State
            boolean r12 = r20.s()
            boolean r13 = r20.g()
            r15 = 9
            r16 = 0
            r11 = 0
            r14 = 0
            r10 = r5
            r10.<init>(r11, r12, r13, r14, r15, r16)
            r8.<init>(r0, r5)
            r8.f34996i = r2
            r8.f34997j = r3
            r8.f34998k = r4
            boolean r0 = r20.s()
            r10 = 0
            if (r0 == 0) goto L_0x0060
            com.hansecom.abt.presentation.screens.home.HomeViewModel$1 r5 = new com.hansecom.abt.presentation.screens.home.HomeViewModel$1
            r5.<init>(r1, r8, r10)
            r6 = 7
            r7 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r0 = r17
            com.hansecom.abt.presentation.mvi.MviViewModel.t(r0, r1, r2, r3, r5, r6, r7)
        L_0x0060:
            kotlinx.coroutines.CoroutineScope r0 = androidx.lifecycle.ViewModelKt.a(r17)
            com.hansecom.abt.presentation.screens.home.HomeViewModel$2 r1 = new com.hansecom.abt.presentation.screens.home.HomeViewModel$2
            r1.<init>(r9, r8, r10)
            r2 = 3
            r3 = 0
            r4 = 0
            r5 = 0
            r18 = r0
            r19 = r4
            r20 = r5
            r21 = r1
            r22 = r2
            r23 = r3
            kotlinx.coroutines.Job unused = kotlinx.coroutines.BuildersKt__Builders_commonKt.d(r18, r19, r20, r21, r22, r23)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.HomeViewModel.<init>(androidx.lifecycle.SavedStateHandle, com.hansecom.abt.data.useCases.GetVirtualCardFlowUseCase, com.hansecom.abt.AppFeatures, com.hansecom.abt.data.useCases.lock.GetShowUserBiometricDialogUseCase, com.hansecom.abt.data.useCases.lock.SetShownUserBiometricDialogUseCase, com.hansecom.abt.data.useCases.lock.SetIsBiometricLockedUseCase):void");
    }

    public static final Home.State A(Home.State state) {
        Intrinsics.i(state, "$this$update");
        return Home.State.b(state, false, false, false, false, 7, (Object) null);
    }

    public static final Home.State z(Home.State state) {
        Intrinsics.i(state, "$this$update");
        return Home.State.b(state, false, false, false, false, 7, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a9 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object o(com.hansecom.abt.presentation.screens.home.Home.Action r9, kotlin.coroutines.Continuation r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.hansecom.abt.presentation.screens.home.HomeViewModel$handle$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.hansecom.abt.presentation.screens.home.HomeViewModel$handle$1 r0 = (com.hansecom.abt.presentation.screens.home.HomeViewModel$handle$1) r0
            int r1 = r0.F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.F = r1
            goto L_0x0018
        L_0x0013:
            com.hansecom.abt.presentation.screens.home.HomeViewModel$handle$1 r0 = new com.hansecom.abt.presentation.screens.home.HomeViewModel$handle$1
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.D
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.F
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 0
            r7 = 1
            if (r2 == 0) goto L_0x0058
            if (r2 == r7) goto L_0x0050
            if (r2 == r5) goto L_0x0048
            if (r2 == r4) goto L_0x0040
            if (r2 != r3) goto L_0x0038
            java.lang.Object r9 = r0.C
            com.hansecom.abt.presentation.screens.home.HomeViewModel r9 = (com.hansecom.abt.presentation.screens.home.HomeViewModel) r9
            kotlin.ResultKt.b(r10)
            goto L_0x00aa
        L_0x0038:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0040:
            java.lang.Object r9 = r0.C
            com.hansecom.abt.presentation.screens.home.HomeViewModel r9 = (com.hansecom.abt.presentation.screens.home.HomeViewModel) r9
            kotlin.ResultKt.b(r10)
            goto L_0x009d
        L_0x0048:
            java.lang.Object r9 = r0.C
            com.hansecom.abt.presentation.screens.home.HomeViewModel r9 = (com.hansecom.abt.presentation.screens.home.HomeViewModel) r9
            kotlin.ResultKt.b(r10)
            goto L_0x007e
        L_0x0050:
            java.lang.Object r9 = r0.C
            com.hansecom.abt.presentation.screens.home.HomeViewModel r9 = (com.hansecom.abt.presentation.screens.home.HomeViewModel) r9
            kotlin.ResultKt.b(r10)
            goto L_0x0071
        L_0x0058:
            kotlin.ResultKt.b(r10)
            com.hansecom.abt.presentation.screens.home.Home$Action$ActivateBiometricLock r10 = com.hansecom.abt.presentation.screens.home.Home.Action.ActivateBiometricLock.f34965a
            boolean r10 = kotlin.jvm.internal.Intrinsics.d(r9, r10)
            if (r10 == 0) goto L_0x0087
            com.hansecom.abt.data.useCases.lock.SetIsBiometricLockedUseCase r9 = r8.f34998k
            r0.C = r8
            r0.F = r7
            java.lang.Object r9 = r9.a(r7, r0)
            if (r9 != r1) goto L_0x0070
            return r1
        L_0x0070:
            r9 = r8
        L_0x0071:
            com.hansecom.abt.data.useCases.lock.SetShownUserBiometricDialogUseCase r10 = r9.f34997j
            r0.C = r9
            r0.F = r5
            java.lang.Object r10 = r10.a(r6, r0)
            if (r10 != r1) goto L_0x007e
            return r1
        L_0x007e:
            com.hansecom.abt.presentation.screens.home.A r10 = new com.hansecom.abt.presentation.screens.home.A
            r10.<init>()
            r9.r(r10)
            goto L_0x00b2
        L_0x0087:
            com.hansecom.abt.presentation.screens.home.Home$Action$DismissBiometricLockActivation r10 = com.hansecom.abt.presentation.screens.home.Home.Action.DismissBiometricLockActivation.f34966a
            boolean r9 = kotlin.jvm.internal.Intrinsics.d(r9, r10)
            if (r9 == 0) goto L_0x00b5
            com.hansecom.abt.data.useCases.lock.SetIsBiometricLockedUseCase r9 = r8.f34998k
            r0.C = r8
            r0.F = r4
            java.lang.Object r9 = r9.a(r6, r0)
            if (r9 != r1) goto L_0x009c
            return r1
        L_0x009c:
            r9 = r8
        L_0x009d:
            com.hansecom.abt.data.useCases.lock.SetShownUserBiometricDialogUseCase r10 = r9.f34997j
            r0.C = r9
            r0.F = r3
            java.lang.Object r10 = r10.a(r6, r0)
            if (r10 != r1) goto L_0x00aa
            return r1
        L_0x00aa:
            com.hansecom.abt.presentation.screens.home.B r10 = new com.hansecom.abt.presentation.screens.home.B
            r10.<init>()
            r9.r(r10)
        L_0x00b2:
            kotlin.Unit r9 = kotlin.Unit.f40552a
            return r9
        L_0x00b5:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.HomeViewModel.o(com.hansecom.abt.presentation.screens.home.Home$Action, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
