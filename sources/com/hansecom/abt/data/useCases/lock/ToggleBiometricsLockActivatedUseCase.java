package com.hansecom.abt.data.useCases.lock;

import com.hansecom.abt.data.preferences.LockPreferences;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class ToggleBiometricsLockActivatedUseCase {

    /* renamed from: a  reason: collision with root package name */
    public final LockPreferences f33994a;

    /* renamed from: b  reason: collision with root package name */
    public final SetIsLockedFlowUseCase f33995b;

    /* renamed from: c  reason: collision with root package name */
    public final ResetUnlockEndDateTimeUseCase f33996c;

    public ToggleBiometricsLockActivatedUseCase(LockPreferences lockPreferences, SetIsLockedFlowUseCase setIsLockedFlowUseCase, ResetUnlockEndDateTimeUseCase resetUnlockEndDateTimeUseCase) {
        Intrinsics.i(lockPreferences, "lockPreferences");
        Intrinsics.i(setIsLockedFlowUseCase, "setIsLockedFlowUseCase");
        Intrinsics.i(resetUnlockEndDateTimeUseCase, "resetUnlockEndDateTimeUseCase");
        this.f33994a = lockPreferences;
        this.f33995b = setIsLockedFlowUseCase;
        this.f33996c = resetUnlockEndDateTimeUseCase;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0070 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x007d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0090 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(kotlin.coroutines.Continuation r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.hansecom.abt.data.useCases.lock.ToggleBiometricsLockActivatedUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.hansecom.abt.data.useCases.lock.ToggleBiometricsLockActivatedUseCase$invoke$1 r0 = (com.hansecom.abt.data.useCases.lock.ToggleBiometricsLockActivatedUseCase$invoke$1) r0
            int r1 = r0.F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.F = r1
            goto L_0x0018
        L_0x0013:
            com.hansecom.abt.data.useCases.lock.ToggleBiometricsLockActivatedUseCase$invoke$1 r0 = new com.hansecom.abt.data.useCases.lock.ToggleBiometricsLockActivatedUseCase$invoke$1
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r8 = r0.D
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.F
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L_0x0052
            if (r2 == r6) goto L_0x004a
            if (r2 == r5) goto L_0x0042
            if (r2 == r4) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            kotlin.ResultKt.b(r8)
            goto L_0x0091
        L_0x0032:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x003a:
            java.lang.Object r2 = r0.C
            com.hansecom.abt.data.preferences.LockPreferences r2 = (com.hansecom.abt.data.preferences.LockPreferences) r2
            kotlin.ResultKt.b(r8)
            goto L_0x007e
        L_0x0042:
            java.lang.Object r2 = r0.C
            com.hansecom.abt.data.useCases.lock.ToggleBiometricsLockActivatedUseCase r2 = (com.hansecom.abt.data.useCases.lock.ToggleBiometricsLockActivatedUseCase) r2
            kotlin.ResultKt.b(r8)
            goto L_0x0071
        L_0x004a:
            java.lang.Object r2 = r0.C
            com.hansecom.abt.data.useCases.lock.ToggleBiometricsLockActivatedUseCase r2 = (com.hansecom.abt.data.useCases.lock.ToggleBiometricsLockActivatedUseCase) r2
            kotlin.ResultKt.b(r8)
            goto L_0x0064
        L_0x0052:
            kotlin.ResultKt.b(r8)
            com.hansecom.abt.data.useCases.lock.SetIsLockedFlowUseCase r8 = r7.f33995b
            r0.C = r7
            r0.F = r6
            r2 = 0
            java.lang.Object r8 = r8.a(r2, r0)
            if (r8 != r1) goto L_0x0063
            return r1
        L_0x0063:
            r2 = r7
        L_0x0064:
            com.hansecom.abt.data.useCases.lock.ResetUnlockEndDateTimeUseCase r8 = r2.f33996c
            r0.C = r2
            r0.F = r5
            java.lang.Object r8 = r8.a(r0)
            if (r8 != r1) goto L_0x0071
            return r1
        L_0x0071:
            com.hansecom.abt.data.preferences.LockPreferences r2 = r2.f33994a
            r0.C = r2
            r0.F = r4
            java.lang.Object r8 = r2.f(r0)
            if (r8 != r1) goto L_0x007e
            return r1
        L_0x007e:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            r8 = r8 ^ r6
            r4 = 0
            r0.C = r4
            r0.F = r3
            java.lang.Object r8 = r2.l(r8, r0)
            if (r8 != r1) goto L_0x0091
            return r1
        L_0x0091:
            kotlin.Unit r8 = kotlin.Unit.f40552a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.useCases.lock.ToggleBiometricsLockActivatedUseCase.a(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
