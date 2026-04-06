package com.hansecom.abt.data.preferences.base;

import com.hansecom.abt.data.preferences.base.CacheValue;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

@Metadata
public abstract class BaseLocalDataProvider<T> {
    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object f(kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.hansecom.abt.data.preferences.base.BaseLocalDataProvider$getRefreshDate$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.hansecom.abt.data.preferences.base.BaseLocalDataProvider$getRefreshDate$1 r0 = (com.hansecom.abt.data.preferences.base.BaseLocalDataProvider$getRefreshDate$1) r0
            int r1 = r0.E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.E = r1
            goto L_0x0018
        L_0x0013:
            com.hansecom.abt.data.preferences.base.BaseLocalDataProvider$getRefreshDate$1 r0 = new com.hansecom.abt.data.preferences.base.BaseLocalDataProvider$getRefreshDate$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.C
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.E
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.ResultKt.b(r5)
            goto L_0x003d
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0031:
            kotlin.ResultKt.b(r5)
            r0.E = r3
            java.lang.Object r5 = r4.c(r0)
            if (r5 != r1) goto L_0x003d
            return r1
        L_0x003d:
            com.hansecom.abt.data.preferences.base.CacheValue r5 = (com.hansecom.abt.data.preferences.base.CacheValue) r5
            if (r5 == 0) goto L_0x0047
            java.time.LocalDateTime r5 = r5.d()
            if (r5 != 0) goto L_0x004e
        L_0x0047:
            java.time.LocalDateTime r5 = java.time.LocalDateTime.MIN
            java.lang.String r0 = "MIN"
            kotlin.jvm.internal.Intrinsics.h(r5, r0)
        L_0x004e:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.preferences.base.BaseLocalDataProvider.f(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object b(Continuation continuation) {
        Object j2 = j((CacheValue) null, continuation);
        return j2 == IntrinsicsKt.f() ? j2 : Unit.f40552a;
    }

    public final Object c(Continuation continuation) {
        return FlowKt.D(d(), continuation);
    }

    public abstract Flow d();

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object e(com.hansecom.abt.data.preferences.base.Seconds r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.hansecom.abt.data.preferences.base.BaseLocalDataProvider$getLastSyncDateTime$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.hansecom.abt.data.preferences.base.BaseLocalDataProvider$getLastSyncDateTime$1 r0 = (com.hansecom.abt.data.preferences.base.BaseLocalDataProvider$getLastSyncDateTime$1) r0
            int r1 = r0.F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.F = r1
            goto L_0x0018
        L_0x0013:
            com.hansecom.abt.data.preferences.base.BaseLocalDataProvider$getLastSyncDateTime$1 r0 = new com.hansecom.abt.data.preferences.base.BaseLocalDataProvider$getLastSyncDateTime$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.D
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.F
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r5 = r0.C
            com.hansecom.abt.data.preferences.base.Seconds r5 = (com.hansecom.abt.data.preferences.base.Seconds) r5
            kotlin.ResultKt.b(r6)
            goto L_0x0043
        L_0x002d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0035:
            kotlin.ResultKt.b(r6)
            r0.C = r5
            r0.F = r3
            java.lang.Object r6 = r4.c(r0)
            if (r6 != r1) goto L_0x0043
            return r1
        L_0x0043:
            com.hansecom.abt.data.preferences.base.CacheValue r6 = (com.hansecom.abt.data.preferences.base.CacheValue) r6
            if (r6 != 0) goto L_0x004f
            java.time.LocalDateTime r5 = java.time.LocalDateTime.MIN
            java.lang.String r6 = "MIN"
            kotlin.jvm.internal.Intrinsics.h(r5, r6)
            return r5
        L_0x004f:
            java.time.LocalDateTime r0 = r6.c()
            java.time.LocalDateTime r1 = java.time.LocalDateTime.MIN
            boolean r0 = kotlin.jvm.internal.Intrinsics.d(r0, r1)
            if (r0 != 0) goto L_0x006b
            java.time.LocalDateTime r6 = r6.c()
            long r0 = r5.a()
            java.time.LocalDateTime r5 = r6.minusSeconds(r0)
            kotlin.jvm.internal.Intrinsics.f(r5)
            goto L_0x006f
        L_0x006b:
            java.time.LocalDateTime r5 = r6.c()
        L_0x006f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.preferences.base.BaseLocalDataProvider.e(com.hansecom.abt.data.preferences.base.Seconds, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object g(kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.hansecom.abt.data.preferences.base.BaseLocalDataProvider$hasValidValue$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.hansecom.abt.data.preferences.base.BaseLocalDataProvider$hasValidValue$1 r0 = (com.hansecom.abt.data.preferences.base.BaseLocalDataProvider$hasValidValue$1) r0
            int r1 = r0.E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.E = r1
            goto L_0x0018
        L_0x0013:
            com.hansecom.abt.data.preferences.base.BaseLocalDataProvider$hasValidValue$1 r0 = new com.hansecom.abt.data.preferences.base.BaseLocalDataProvider$hasValidValue$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.C
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.E
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.ResultKt.b(r5)
            goto L_0x003d
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0031:
            kotlin.ResultKt.b(r5)
            r0.E = r3
            java.lang.Object r5 = r4.c(r0)
            if (r5 != r1) goto L_0x003d
            return r1
        L_0x003d:
            com.hansecom.abt.data.preferences.base.CacheValue r5 = (com.hansecom.abt.data.preferences.base.CacheValue) r5
            if (r5 != 0) goto L_0x0047
            r5 = 0
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.Boxing.a(r5)
            return r5
        L_0x0047:
            boolean r5 = r5.f()
            r5 = r5 ^ r3
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.Boxing.a(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.preferences.base.BaseLocalDataProvider.g(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object h(kotlin.coroutines.Continuation r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof com.hansecom.abt.data.preferences.base.BaseLocalDataProvider$markAsExpired$1
            if (r0 == 0) goto L_0x0013
            r0 = r13
            com.hansecom.abt.data.preferences.base.BaseLocalDataProvider$markAsExpired$1 r0 = (com.hansecom.abt.data.preferences.base.BaseLocalDataProvider$markAsExpired$1) r0
            int r1 = r0.F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.F = r1
            goto L_0x0018
        L_0x0013:
            com.hansecom.abt.data.preferences.base.BaseLocalDataProvider$markAsExpired$1 r0 = new com.hansecom.abt.data.preferences.base.BaseLocalDataProvider$markAsExpired$1
            r0.<init>(r12, r13)
        L_0x0018:
            java.lang.Object r13 = r0.D
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.F
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            kotlin.ResultKt.b(r13)
            goto L_0x006f
        L_0x002c:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L_0x0034:
            java.lang.Object r2 = r0.C
            com.hansecom.abt.data.preferences.base.BaseLocalDataProvider r2 = (com.hansecom.abt.data.preferences.base.BaseLocalDataProvider) r2
            kotlin.ResultKt.b(r13)
            goto L_0x004b
        L_0x003c:
            kotlin.ResultKt.b(r13)
            r0.C = r12
            r0.F = r4
            java.lang.Object r13 = r12.c(r0)
            if (r13 != r1) goto L_0x004a
            return r1
        L_0x004a:
            r2 = r12
        L_0x004b:
            r4 = r13
            com.hansecom.abt.data.preferences.base.CacheValue r4 = (com.hansecom.abt.data.preferences.base.CacheValue) r4
            if (r4 == 0) goto L_0x006f
            java.time.LocalDateTime r13 = java.time.LocalDateTime.MIN
            java.time.ZoneOffset r5 = java.time.ZoneOffset.UTC
            long r6 = r13.toEpochSecond(r5)
            long r8 = r13.toEpochSecond(r5)
            r10 = 1
            r11 = 0
            r5 = 0
            com.hansecom.abt.data.preferences.base.CacheValue r13 = com.hansecom.abt.data.preferences.base.CacheValue.b(r4, r5, r6, r8, r10, r11)
            r4 = 0
            r0.C = r4
            r0.F = r3
            java.lang.Object r13 = r2.j(r13, r0)
            if (r13 != r1) goto L_0x006f
            return r1
        L_0x006f:
            kotlin.Unit r13 = kotlin.Unit.f40552a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.preferences.base.BaseLocalDataProvider.h(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object i(kotlin.coroutines.Continuation r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof com.hansecom.abt.data.preferences.base.BaseLocalDataProvider$markAsNotFresh$1
            if (r0 == 0) goto L_0x0013
            r0 = r13
            com.hansecom.abt.data.preferences.base.BaseLocalDataProvider$markAsNotFresh$1 r0 = (com.hansecom.abt.data.preferences.base.BaseLocalDataProvider$markAsNotFresh$1) r0
            int r1 = r0.F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.F = r1
            goto L_0x0018
        L_0x0013:
            com.hansecom.abt.data.preferences.base.BaseLocalDataProvider$markAsNotFresh$1 r0 = new com.hansecom.abt.data.preferences.base.BaseLocalDataProvider$markAsNotFresh$1
            r0.<init>(r12, r13)
        L_0x0018:
            java.lang.Object r13 = r0.D
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.F
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            kotlin.ResultKt.b(r13)
            goto L_0x006d
        L_0x002c:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L_0x0034:
            java.lang.Object r2 = r0.C
            com.hansecom.abt.data.preferences.base.BaseLocalDataProvider r2 = (com.hansecom.abt.data.preferences.base.BaseLocalDataProvider) r2
            kotlin.ResultKt.b(r13)
            goto L_0x004b
        L_0x003c:
            kotlin.ResultKt.b(r13)
            r0.C = r12
            r0.F = r4
            java.lang.Object r13 = r12.c(r0)
            if (r13 != r1) goto L_0x004a
            return r1
        L_0x004a:
            r2 = r12
        L_0x004b:
            r4 = r13
            com.hansecom.abt.data.preferences.base.CacheValue r4 = (com.hansecom.abt.data.preferences.base.CacheValue) r4
            if (r4 == 0) goto L_0x006d
            java.time.LocalDateTime r13 = java.time.LocalDateTime.MIN
            java.time.ZoneOffset r5 = java.time.ZoneOffset.UTC
            long r8 = r13.toEpochSecond(r5)
            r10 = 3
            r11 = 0
            r5 = 0
            r6 = 0
            com.hansecom.abt.data.preferences.base.CacheValue r13 = com.hansecom.abt.data.preferences.base.CacheValue.b(r4, r5, r6, r8, r10, r11)
            r4 = 0
            r0.C = r4
            r0.F = r3
            java.lang.Object r13 = r2.j(r13, r0)
            if (r13 != r1) goto L_0x006d
            return r1
        L_0x006d:
            kotlin.Unit r13 = kotlin.Unit.f40552a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.preferences.base.BaseLocalDataProvider.i(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public abstract Object j(CacheValue cacheValue, Continuation continuation);

    public final Object k(Object obj, Seconds seconds, Seconds seconds2, Continuation continuation) {
        CacheValue.Companion companion = CacheValue.Companion;
        LocalDateTime plusSeconds = LocalDateTime.now().plusSeconds(seconds2.a());
        ZoneOffset zoneOffset = ZoneOffset.UTC;
        Object j2 = j(companion.a(obj, plusSeconds.toEpochSecond(zoneOffset), LocalDateTime.now().plusSeconds(seconds.a()).toEpochSecond(zoneOffset)), continuation);
        return j2 == IntrinsicsKt.f() ? j2 : Unit.f40552a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object l(kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.hansecom.abt.data.preferences.base.BaseLocalDataProvider$shouldRefresh$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.hansecom.abt.data.preferences.base.BaseLocalDataProvider$shouldRefresh$1 r0 = (com.hansecom.abt.data.preferences.base.BaseLocalDataProvider$shouldRefresh$1) r0
            int r1 = r0.E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.E = r1
            goto L_0x0018
        L_0x0013:
            com.hansecom.abt.data.preferences.base.BaseLocalDataProvider$shouldRefresh$1 r0 = new com.hansecom.abt.data.preferences.base.BaseLocalDataProvider$shouldRefresh$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.C
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.E
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.ResultKt.b(r5)
            goto L_0x003d
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0031:
            kotlin.ResultKt.b(r5)
            r0.E = r3
            java.lang.Object r5 = r4.c(r0)
            if (r5 != r1) goto L_0x003d
            return r1
        L_0x003d:
            com.hansecom.abt.data.preferences.base.CacheValue r5 = (com.hansecom.abt.data.preferences.base.CacheValue) r5
            if (r5 != 0) goto L_0x0046
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.Boxing.a(r3)
            return r5
        L_0x0046:
            boolean r5 = r5.g()
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.Boxing.a(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.preferences.base.BaseLocalDataProvider.l(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
