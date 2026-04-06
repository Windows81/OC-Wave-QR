package com.hansecom.abt.data.useCases.lock;

import com.hansecom.abt.data.preferences.LockPreferences;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class SetIsBiometricsAvailableUseCase {

    /* renamed from: a  reason: collision with root package name */
    public final LockPreferences f33988a;

    public SetIsBiometricsAvailableUseCase(LockPreferences lockPreferences) {
        Intrinsics.i(lockPreferences, "lockPreferences");
        this.f33988a = lockPreferences;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(boolean r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.hansecom.abt.data.useCases.lock.SetIsBiometricsAvailableUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.hansecom.abt.data.useCases.lock.SetIsBiometricsAvailableUseCase$invoke$1 r0 = (com.hansecom.abt.data.useCases.lock.SetIsBiometricsAvailableUseCase$invoke$1) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.H = r1
            goto L_0x0018
        L_0x0013:
            com.hansecom.abt.data.useCases.lock.SetIsBiometricsAvailableUseCase$invoke$1 r0 = new com.hansecom.abt.data.useCases.lock.SetIsBiometricsAvailableUseCase$invoke$1
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.F
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.H
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0040
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            kotlin.ResultKt.b(r7)
            goto L_0x006c
        L_0x002c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0034:
            boolean r6 = r0.E
            boolean r2 = r0.D
            java.lang.Object r4 = r0.C
            com.hansecom.abt.data.useCases.lock.SetIsBiometricsAvailableUseCase r4 = (com.hansecom.abt.data.useCases.lock.SetIsBiometricsAvailableUseCase) r4
            kotlin.ResultKt.b(r7)
            goto L_0x0056
        L_0x0040:
            kotlin.ResultKt.b(r7)
            com.hansecom.abt.data.preferences.LockPreferences r7 = r5.f33988a
            r0.C = r5
            r0.D = r6
            r0.E = r6
            r0.H = r4
            java.lang.Object r7 = r7.d(r0)
            if (r7 != r1) goto L_0x0054
            return r1
        L_0x0054:
            r4 = r5
            r2 = r6
        L_0x0056:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r6 == r7) goto L_0x006f
            com.hansecom.abt.data.preferences.LockPreferences r6 = r4.f33988a
            r7 = 0
            r0.C = r7
            r0.H = r3
            java.lang.Object r6 = r6.k(r2, r0)
            if (r6 != r1) goto L_0x006c
            return r1
        L_0x006c:
            kotlin.Unit r6 = kotlin.Unit.f40552a
            return r6
        L_0x006f:
            kotlin.Unit r6 = kotlin.Unit.f40552a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.useCases.lock.SetIsBiometricsAvailableUseCase.a(boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
