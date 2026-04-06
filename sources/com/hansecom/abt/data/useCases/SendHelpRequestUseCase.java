package com.hansecom.abt.data.useCases;

import com.hansecom.mapi.apis.FeedbackApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class SendHelpRequestUseCase {

    /* renamed from: a  reason: collision with root package name */
    public final FeedbackApi f33755a;

    public SendHelpRequestUseCase(FeedbackApi feedbackApi) {
        Intrinsics.i(feedbackApi, "api");
        this.f33755a = feedbackApi;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, kotlin.coroutines.Continuation r27) {
        /*
            r17 = this;
            r0 = r27
            boolean r1 = r0 instanceof com.hansecom.abt.data.useCases.SendHelpRequestUseCase$invoke$1
            if (r1 == 0) goto L_0x0017
            r1 = r0
            com.hansecom.abt.data.useCases.SendHelpRequestUseCase$invoke$1 r1 = (com.hansecom.abt.data.useCases.SendHelpRequestUseCase$invoke$1) r1
            int r2 = r1.E
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0017
            int r2 = r2 - r3
            r1.E = r2
            r15 = r17
            goto L_0x001e
        L_0x0017:
            com.hansecom.abt.data.useCases.SendHelpRequestUseCase$invoke$1 r1 = new com.hansecom.abt.data.useCases.SendHelpRequestUseCase$invoke$1
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
            goto L_0x006e
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
            com.hansecom.abt.data.useCases.SendHelpRequestUseCase$invoke-LiYkppA$$inlined$retrofit$default$1 r12 = new com.hansecom.abt.data.useCases.SendHelpRequestUseCase$invoke-LiYkppA$$inlined$retrofit$default$1
            r4 = 0
            r2 = r12
            r5 = r17
            r6 = r21
            r7 = r18
            r8 = r22
            r9 = r19
            r10 = r23
            r11 = r20
            r16 = r12
            r12 = r24
            r13 = r25
            r15 = r14
            r14 = r26
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r2 = 1
            r1.E = r2
            r2 = r16
            java.lang.Object r0 = kotlinx.coroutines.BuildersKt.g(r0, r2, r1)
            if (r0 != r15) goto L_0x006e
            return r15
        L_0x006e:
            kotlin.Result r0 = (kotlin.Result) r0
            java.lang.Object r0 = r0.j()
            java.lang.Object r0 = com.hansecom.abt.util.ResultExtKt.c(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.useCases.SendHelpRequestUseCase.b(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
