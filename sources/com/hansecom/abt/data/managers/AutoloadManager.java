package com.hansecom.abt.data.managers;

import com.hansecom.mapi.apis.AutoloadsApi;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Singleton
@Metadata
public final class AutoloadManager {

    /* renamed from: a  reason: collision with root package name */
    public final AutoloadsApi f33290a;

    public AutoloadManager(AutoloadsApi autoloadsApi) {
        Intrinsics.i(autoloadsApi, "autoloadsApi");
        this.f33290a = autoloadsApi;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(java.lang.String r18, long r19, boolean r21, java.math.BigDecimal r22, java.math.BigDecimal r23, long r24, java.lang.Long r26, kotlin.coroutines.Continuation r27) {
        /*
            r17 = this;
            r0 = r27
            boolean r1 = r0 instanceof com.hansecom.abt.data.managers.AutoloadManager$changeAutoload$1
            if (r1 == 0) goto L_0x0017
            r1 = r0
            com.hansecom.abt.data.managers.AutoloadManager$changeAutoload$1 r1 = (com.hansecom.abt.data.managers.AutoloadManager$changeAutoload$1) r1
            int r2 = r1.E
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0017
            int r2 = r2 - r3
            r1.E = r2
            r15 = r17
            goto L_0x001e
        L_0x0017:
            com.hansecom.abt.data.managers.AutoloadManager$changeAutoload$1 r1 = new com.hansecom.abt.data.managers.AutoloadManager$changeAutoload$1
            r15 = r17
            r1.<init>(r15, r0)
        L_0x001e:
            java.lang.Object r0 = r1.C
            java.lang.Object r14 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r1.E
            r13 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r13) goto L_0x002f
            kotlin.ResultKt.b(r0)
            goto L_0x006a
        L_0x002f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0037:
            kotlin.ResultKt.b(r0)
            com.hansecom.abt.api.JsonParser r0 = com.hansecom.abt.api.JsonParser.f33114a
            kotlinx.serialization.json.Json r3 = r0.c()
            kotlinx.coroutines.CoroutineDispatcher r0 = kotlinx.coroutines.Dispatchers.b()
            com.hansecom.abt.data.managers.AutoloadManager$changeAutoload-eH_QyT8$$inlined$retrofit$default$1 r11 = new com.hansecom.abt.data.managers.AutoloadManager$changeAutoload-eH_QyT8$$inlined$retrofit$default$1
            r4 = 0
            r2 = r11
            r5 = r17
            r6 = r18
            r7 = r19
            r9 = r22
            r10 = r23
            r16 = r11
            r11 = r24
            r13 = r26
            r15 = r14
            r14 = r21
            r2.<init>(r3, r4, r5, r6, r7, r9, r10, r11, r13, r14)
            r2 = 1
            r1.E = r2
            r2 = r16
            java.lang.Object r0 = kotlinx.coroutines.BuildersKt.g(r0, r2, r1)
            if (r0 != r15) goto L_0x006a
            return r15
        L_0x006a:
            kotlin.Result r0 = (kotlin.Result) r0
            java.lang.Object r0 = r0.j()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.managers.AutoloadManager.b(java.lang.String, long, boolean, java.math.BigDecimal, java.math.BigDecimal, long, java.lang.Long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(java.lang.String r17, java.math.BigDecimal r18, java.math.BigDecimal r19, long r20, java.lang.Long r22, kotlin.coroutines.Continuation r23) {
        /*
            r16 = this;
            r0 = r23
            boolean r1 = r0 instanceof com.hansecom.abt.data.managers.AutoloadManager$createAutoload$1
            if (r1 == 0) goto L_0x0017
            r1 = r0
            com.hansecom.abt.data.managers.AutoloadManager$createAutoload$1 r1 = (com.hansecom.abt.data.managers.AutoloadManager$createAutoload$1) r1
            int r2 = r1.E
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0017
            int r2 = r2 - r3
            r1.E = r2
            r12 = r16
            goto L_0x001e
        L_0x0017:
            com.hansecom.abt.data.managers.AutoloadManager$createAutoload$1 r1 = new com.hansecom.abt.data.managers.AutoloadManager$createAutoload$1
            r12 = r16
            r1.<init>(r12, r0)
        L_0x001e:
            java.lang.Object r0 = r1.C
            java.lang.Object r13 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r1.E
            r14 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r14) goto L_0x002f
            kotlin.ResultKt.b(r0)
            goto L_0x0060
        L_0x002f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0037:
            kotlin.ResultKt.b(r0)
            com.hansecom.abt.api.JsonParser r0 = com.hansecom.abt.api.JsonParser.f33114a
            kotlinx.serialization.json.Json r3 = r0.c()
            kotlinx.coroutines.CoroutineDispatcher r0 = kotlinx.coroutines.Dispatchers.b()
            com.hansecom.abt.data.managers.AutoloadManager$createAutoload-hUnOzRk$$inlined$retrofit$default$1 r15 = new com.hansecom.abt.data.managers.AutoloadManager$createAutoload-hUnOzRk$$inlined$retrofit$default$1
            r4 = 0
            r2 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            r9 = r20
            r11 = r22
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r11)
            r1.E = r14
            java.lang.Object r0 = kotlinx.coroutines.BuildersKt.g(r0, r15, r1)
            if (r0 != r13) goto L_0x0060
            return r13
        L_0x0060:
            kotlin.Result r0 = (kotlin.Result) r0
            java.lang.Object r0 = r0.j()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.managers.AutoloadManager.c(java.lang.String, java.math.BigDecimal, java.math.BigDecimal, long, java.lang.Long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object d(java.lang.String r12, long r13, kotlin.coroutines.Continuation r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof com.hansecom.abt.data.managers.AutoloadManager$deleteAutoload$1
            if (r0 == 0) goto L_0x0013
            r0 = r15
            com.hansecom.abt.data.managers.AutoloadManager$deleteAutoload$1 r0 = (com.hansecom.abt.data.managers.AutoloadManager$deleteAutoload$1) r0
            int r1 = r0.E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.E = r1
            goto L_0x0018
        L_0x0013:
            com.hansecom.abt.data.managers.AutoloadManager$deleteAutoload$1 r0 = new com.hansecom.abt.data.managers.AutoloadManager$deleteAutoload$1
            r0.<init>(r11, r15)
        L_0x0018:
            java.lang.Object r15 = r0.C
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.E
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.ResultKt.b(r15)
            goto L_0x0051
        L_0x0029:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0031:
            kotlin.ResultKt.b(r15)
            com.hansecom.abt.api.JsonParser r15 = com.hansecom.abt.api.JsonParser.f33114a
            kotlinx.serialization.json.Json r5 = r15.c()
            kotlinx.coroutines.CoroutineDispatcher r15 = kotlinx.coroutines.Dispatchers.b()
            com.hansecom.abt.data.managers.AutoloadManager$deleteAutoload-0E7RQCE$$inlined$retrofit$default$1 r2 = new com.hansecom.abt.data.managers.AutoloadManager$deleteAutoload-0E7RQCE$$inlined$retrofit$default$1
            r6 = 0
            r4 = r2
            r7 = r11
            r8 = r12
            r9 = r13
            r4.<init>(r5, r6, r7, r8, r9)
            r0.E = r3
            java.lang.Object r15 = kotlinx.coroutines.BuildersKt.g(r15, r2, r0)
            if (r15 != r1) goto L_0x0051
            return r1
        L_0x0051:
            kotlin.Result r15 = (kotlin.Result) r15
            java.lang.Object r12 = r15.j()
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.managers.AutoloadManager.d(java.lang.String, long, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
