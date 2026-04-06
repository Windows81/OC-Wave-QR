package com.hansecom.abt.data.useCases.lock;

import androidx.lifecycle.Lifecycle;
import java.time.LocalDateTime;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.data.useCases.lock.AutoLockAfterInactivityUseCase$invoke$2", f = "AutoLockAfterInactivityUseCase.kt", l = {34, 35, 37, 40, 44}, m = "invokeSuspend")
public final class AutoLockAfterInactivityUseCase$invoke$2 extends SuspendLambda implements Function2<LocalDateTime, Continuation<? super Unit>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ AutoLockAfterInactivityUseCase F;
    public final /* synthetic */ Lifecycle G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AutoLockAfterInactivityUseCase$invoke$2(AutoLockAfterInactivityUseCase autoLockAfterInactivityUseCase, Lifecycle lifecycle, Continuation continuation) {
        super(2, continuation);
        this.F = autoLockAfterInactivityUseCase;
        this.G = lifecycle;
    }

    /* renamed from: A */
    public final Object m(LocalDateTime localDateTime, Continuation continuation) {
        return ((AutoLockAfterInactivityUseCase$invoke$2) s(localDateTime, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        AutoLockAfterInactivityUseCase$invoke$2 autoLockAfterInactivityUseCase$invoke$2 = new AutoLockAfterInactivityUseCase$invoke$2(this.F, this.G, continuation);
        autoLockAfterInactivityUseCase$invoke$2.E = obj;
        return autoLockAfterInactivityUseCase$invoke$2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00d7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object x(java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r16
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.D
            r3 = 5
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 0
            java.lang.String r8 = "LOCK"
            r9 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 == r9) goto L_0x002f
            if (r2 == r6) goto L_0x002a
            if (r2 == r5) goto L_0x0025
            if (r2 == r4) goto L_0x002a
            if (r2 != r3) goto L_0x001d
            goto L_0x002a
        L_0x001d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0025:
            kotlin.ResultKt.b(r17)
            goto L_0x00bd
        L_0x002a:
            kotlin.ResultKt.b(r17)
            goto L_0x0107
        L_0x002f:
            kotlin.ResultKt.b(r17)
            goto L_0x00a4
        L_0x0033:
            kotlin.ResultKt.b(r17)
            java.lang.Object r2 = r0.E
            java.time.LocalDateTime r2 = (java.time.LocalDateTime) r2
            r10 = 0
            java.time.LocalDateTime r12 = java.time.LocalDateTime.now()     // Catch:{ Exception -> 0x0047 }
            java.time.temporal.ChronoUnit r13 = java.time.temporal.ChronoUnit.MILLIS     // Catch:{ Exception -> 0x0047 }
            long r12 = r12.until(r2, r13)     // Catch:{ Exception -> 0x0047 }
            goto L_0x0048
        L_0x0047:
            r12 = r10
        L_0x0048:
            timber.log.Timber$Forest r14 = timber.log.Timber.f44337a
            timber.log.Timber$Tree r15 = r14.p(r8)
            java.time.LocalDateTime r3 = java.time.LocalDateTime.now()
            java.time.temporal.ChronoUnit r4 = java.time.temporal.ChronoUnit.SECONDS
            long r2 = r3.until(r2, r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Time difference to lock: "
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = "s"
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            java.lang.Object[] r3 = new java.lang.Object[r7]
            r15.a(r2, r3)
            int r2 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r2 > 0) goto L_0x00b3
            timber.log.Timber$Tree r2 = r14.p(r8)
            java.time.LocalTime r3 = java.time.LocalTime.now()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Time exceeded after resume "
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.lang.Object[] r4 = new java.lang.Object[r7]
            r2.a(r3, r4)
            com.hansecom.abt.data.useCases.lock.AutoLockAfterInactivityUseCase r2 = r0.F
            com.hansecom.abt.data.useCases.lock.SetIsLockedFlowUseCase r2 = r2.f33968c
            r0.D = r9
            java.lang.Object r2 = r2.a(r9, r0)
            if (r2 != r1) goto L_0x00a4
            return r1
        L_0x00a4:
            com.hansecom.abt.data.useCases.lock.AutoLockAfterInactivityUseCase r2 = r0.F
            com.hansecom.abt.data.useCases.lock.ResetUnlockEndDateTimeUseCase r2 = r2.f33967b
            r0.D = r6
            java.lang.Object r2 = r2.a(r0)
            if (r2 != r1) goto L_0x0107
            return r1
        L_0x00b3:
            r2 = 3
            r0.D = r2
            java.lang.Object r2 = kotlinx.coroutines.DelayKt.b(r12, r0)
            if (r2 != r1) goto L_0x00bd
            return r1
        L_0x00bd:
            androidx.lifecycle.Lifecycle r2 = r0.G
            androidx.lifecycle.Lifecycle$State r2 = r2.b()
            androidx.lifecycle.Lifecycle$State r3 = androidx.lifecycle.Lifecycle.State.RESUMED
            if (r2 != r3) goto L_0x00d7
            com.hansecom.abt.data.useCases.lock.AutoLockAfterInactivityUseCase r2 = r0.F
            com.hansecom.abt.data.useCases.lock.ResetUnlockEndDateTimeUseCase r2 = r2.f33967b
            r3 = 4
            r0.D = r3
            java.lang.Object r2 = r2.a(r0)
            if (r2 != r1) goto L_0x0107
            return r1
        L_0x00d7:
            timber.log.Timber$Forest r2 = timber.log.Timber.f44337a
            timber.log.Timber$Tree r2 = r2.p(r8)
            java.time.LocalTime r3 = java.time.LocalTime.now()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Time exceeded and app is on pause "
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.lang.Object[] r4 = new java.lang.Object[r7]
            r2.a(r3, r4)
            com.hansecom.abt.data.useCases.lock.AutoLockAfterInactivityUseCase r2 = r0.F
            com.hansecom.abt.data.useCases.lock.SetIsLockedFlowUseCase r2 = r2.f33968c
            r3 = 5
            r0.D = r3
            java.lang.Object r2 = r2.a(r9, r0)
            if (r2 != r1) goto L_0x0107
            return r1
        L_0x0107:
            kotlin.Unit r1 = kotlin.Unit.f40552a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.useCases.lock.AutoLockAfterInactivityUseCase$invoke$2.x(java.lang.Object):java.lang.Object");
    }
}
