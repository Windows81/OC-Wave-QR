package com.hansecom.abt.data.useCases.lock;

import com.hansecom.abt.data.preferences.LockPreferences;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class SetIsBiometricLockedUseCase {

    /* renamed from: a  reason: collision with root package name */
    public final LockPreferences f33982a;

    /* renamed from: b  reason: collision with root package name */
    public final SetIsLockedFlowUseCase f33983b;

    /* renamed from: c  reason: collision with root package name */
    public final ResetUnlockEndDateTimeUseCase f33984c;

    public SetIsBiometricLockedUseCase(LockPreferences lockPreferences, SetIsLockedFlowUseCase setIsLockedFlowUseCase, ResetUnlockEndDateTimeUseCase resetUnlockEndDateTimeUseCase) {
        Intrinsics.i(lockPreferences, "lockPreferences");
        Intrinsics.i(setIsLockedFlowUseCase, "setIsLockedFlowUseCase");
        Intrinsics.i(resetUnlockEndDateTimeUseCase, "resetUnlockEndDateTimeUseCase");
        this.f33982a = lockPreferences;
        this.f33983b = setIsLockedFlowUseCase;
        this.f33984c = resetUnlockEndDateTimeUseCase;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(boolean r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.hansecom.abt.data.useCases.lock.SetIsBiometricLockedUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.hansecom.abt.data.useCases.lock.SetIsBiometricLockedUseCase$invoke$1 r0 = (com.hansecom.abt.data.useCases.lock.SetIsBiometricLockedUseCase$invoke$1) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.G = r1
            goto L_0x0018
        L_0x0013:
            com.hansecom.abt.data.useCases.lock.SetIsBiometricLockedUseCase$invoke$1 r0 = new com.hansecom.abt.data.useCases.lock.SetIsBiometricLockedUseCase$invoke$1
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.E
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.G
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x004b
            if (r2 == r5) goto L_0x0041
            if (r2 == r4) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            kotlin.ResultKt.b(r8)
            goto L_0x007c
        L_0x002f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0037:
            boolean r7 = r0.D
            java.lang.Object r2 = r0.C
            com.hansecom.abt.data.useCases.lock.SetIsBiometricLockedUseCase r2 = (com.hansecom.abt.data.useCases.lock.SetIsBiometricLockedUseCase) r2
            kotlin.ResultKt.b(r8)
            goto L_0x006e
        L_0x0041:
            boolean r7 = r0.D
            java.lang.Object r2 = r0.C
            com.hansecom.abt.data.useCases.lock.SetIsBiometricLockedUseCase r2 = (com.hansecom.abt.data.useCases.lock.SetIsBiometricLockedUseCase) r2
            kotlin.ResultKt.b(r8)
            goto L_0x005f
        L_0x004b:
            kotlin.ResultKt.b(r8)
            com.hansecom.abt.data.useCases.lock.SetIsLockedFlowUseCase r8 = r6.f33983b
            r0.C = r6
            r0.D = r7
            r0.G = r5
            r2 = 0
            java.lang.Object r8 = r8.a(r2, r0)
            if (r8 != r1) goto L_0x005e
            return r1
        L_0x005e:
            r2 = r6
        L_0x005f:
            com.hansecom.abt.data.useCases.lock.ResetUnlockEndDateTimeUseCase r8 = r2.f33984c
            r0.C = r2
            r0.D = r7
            r0.G = r4
            java.lang.Object r8 = r8.a(r0)
            if (r8 != r1) goto L_0x006e
            return r1
        L_0x006e:
            com.hansecom.abt.data.preferences.LockPreferences r8 = r2.f33982a
            r2 = 0
            r0.C = r2
            r0.G = r3
            java.lang.Object r7 = r8.l(r7, r0)
            if (r7 != r1) goto L_0x007c
            return r1
        L_0x007c:
            kotlin.Unit r7 = kotlin.Unit.f40552a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.useCases.lock.SetIsBiometricLockedUseCase.a(boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
