package com.hansecom.abt.data.useCases.lock;

import com.hansecom.abt.data.preferences.LockPreferences;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class GetShowUserBiometricDialogUseCase {

    /* renamed from: a  reason: collision with root package name */
    public final LockPreferences f33972a;

    public GetShowUserBiometricDialogUseCase(LockPreferences lockPreferences) {
        Intrinsics.i(lockPreferences, "lockPreferences");
        this.f33972a = lockPreferences;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(kotlin.coroutines.Continuation r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.hansecom.abt.data.useCases.lock.GetShowUserBiometricDialogUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.hansecom.abt.data.useCases.lock.GetShowUserBiometricDialogUseCase$invoke$1 r0 = (com.hansecom.abt.data.useCases.lock.GetShowUserBiometricDialogUseCase$invoke$1) r0
            int r1 = r0.F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.F = r1
            goto L_0x0018
        L_0x0013:
            com.hansecom.abt.data.useCases.lock.GetShowUserBiometricDialogUseCase$invoke$1 r0 = new com.hansecom.abt.data.useCases.lock.GetShowUserBiometricDialogUseCase$invoke$1
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.D
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.F
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            kotlin.ResultKt.b(r6)
            goto L_0x0063
        L_0x002c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0034:
            java.lang.Object r2 = r0.C
            com.hansecom.abt.data.useCases.lock.GetShowUserBiometricDialogUseCase r2 = (com.hansecom.abt.data.useCases.lock.GetShowUserBiometricDialogUseCase) r2
            kotlin.ResultKt.b(r6)
            goto L_0x004d
        L_0x003c:
            kotlin.ResultKt.b(r6)
            com.hansecom.abt.data.preferences.LockPreferences r6 = r5.f33972a
            r0.C = r5
            r0.F = r4
            java.lang.Object r6 = r6.d(r0)
            if (r6 != r1) goto L_0x004c
            return r1
        L_0x004c:
            r2 = r5
        L_0x004d:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L_0x0064
            com.hansecom.abt.data.preferences.LockPreferences r6 = r2.f33972a
            r2 = 0
            r0.C = r2
            r0.F = r3
            java.lang.Object r6 = r6.c(r0)
            if (r6 != r1) goto L_0x0063
            return r1
        L_0x0063:
            return r6
        L_0x0064:
            r6 = 0
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.Boxing.a(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.useCases.lock.GetShowUserBiometricDialogUseCase.a(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
