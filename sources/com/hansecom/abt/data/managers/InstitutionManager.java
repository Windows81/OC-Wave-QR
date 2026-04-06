package com.hansecom.abt.data.managers;

import com.hansecom.mapi.apis.InstitutionsApi;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Singleton
@Metadata
public final class InstitutionManager {

    /* renamed from: a  reason: collision with root package name */
    public final InstitutionsApi f33298a;

    public InstitutionManager(InstitutionsApi institutionsApi) {
        Intrinsics.i(institutionsApi, "api");
        this.f33298a = institutionsApi;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(java.lang.String r11, int r12, kotlin.coroutines.Continuation r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof com.hansecom.abt.data.managers.InstitutionManager$link$1
            if (r0 == 0) goto L_0x0013
            r0 = r13
            com.hansecom.abt.data.managers.InstitutionManager$link$1 r0 = (com.hansecom.abt.data.managers.InstitutionManager$link$1) r0
            int r1 = r0.E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.E = r1
            goto L_0x0018
        L_0x0013:
            com.hansecom.abt.data.managers.InstitutionManager$link$1 r0 = new com.hansecom.abt.data.managers.InstitutionManager$link$1
            r0.<init>(r10, r13)
        L_0x0018:
            java.lang.Object r13 = r0.C
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.E
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.ResultKt.b(r13)
            goto L_0x0051
        L_0x0029:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0031:
            kotlin.ResultKt.b(r13)
            com.hansecom.abt.api.JsonParser r13 = com.hansecom.abt.api.JsonParser.f33114a
            kotlinx.serialization.json.Json r5 = r13.c()
            kotlinx.coroutines.CoroutineDispatcher r13 = kotlinx.coroutines.Dispatchers.b()
            com.hansecom.abt.data.managers.InstitutionManager$link-0E7RQCE$$inlined$retrofit$default$1 r2 = new com.hansecom.abt.data.managers.InstitutionManager$link-0E7RQCE$$inlined$retrofit$default$1
            r6 = 0
            r4 = r2
            r7 = r10
            r8 = r11
            r9 = r12
            r4.<init>(r5, r6, r7, r8, r9)
            r0.E = r3
            java.lang.Object r13 = kotlinx.coroutines.BuildersKt.g(r13, r2, r0)
            if (r13 != r1) goto L_0x0051
            return r1
        L_0x0051:
            kotlin.Result r13 = (kotlin.Result) r13
            java.lang.Object r11 = r13.j()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.managers.InstitutionManager.b(java.lang.String, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(java.lang.String r11, int r12, kotlin.coroutines.Continuation r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof com.hansecom.abt.data.managers.InstitutionManager$unlink$1
            if (r0 == 0) goto L_0x0013
            r0 = r13
            com.hansecom.abt.data.managers.InstitutionManager$unlink$1 r0 = (com.hansecom.abt.data.managers.InstitutionManager$unlink$1) r0
            int r1 = r0.E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.E = r1
            goto L_0x0018
        L_0x0013:
            com.hansecom.abt.data.managers.InstitutionManager$unlink$1 r0 = new com.hansecom.abt.data.managers.InstitutionManager$unlink$1
            r0.<init>(r10, r13)
        L_0x0018:
            java.lang.Object r13 = r0.C
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.E
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.ResultKt.b(r13)
            goto L_0x0051
        L_0x0029:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0031:
            kotlin.ResultKt.b(r13)
            com.hansecom.abt.api.JsonParser r13 = com.hansecom.abt.api.JsonParser.f33114a
            kotlinx.serialization.json.Json r5 = r13.c()
            kotlinx.coroutines.CoroutineDispatcher r13 = kotlinx.coroutines.Dispatchers.b()
            com.hansecom.abt.data.managers.InstitutionManager$unlink-0E7RQCE$$inlined$retrofit$default$1 r2 = new com.hansecom.abt.data.managers.InstitutionManager$unlink-0E7RQCE$$inlined$retrofit$default$1
            r6 = 0
            r4 = r2
            r7 = r10
            r8 = r11
            r9 = r12
            r4.<init>(r5, r6, r7, r8, r9)
            r0.E = r3
            java.lang.Object r13 = kotlinx.coroutines.BuildersKt.g(r13, r2, r0)
            if (r13 != r1) goto L_0x0051
            return r1
        L_0x0051:
            kotlin.Result r13 = (kotlin.Result) r13
            java.lang.Object r11 = r13.j()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.managers.InstitutionManager.c(java.lang.String, int, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
