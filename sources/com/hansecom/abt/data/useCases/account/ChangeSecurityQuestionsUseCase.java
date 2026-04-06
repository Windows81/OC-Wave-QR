package com.hansecom.abt.data.useCases.account;

import com.hansecom.abt.data.repositories.UserSecurityQuestionsRepository;
import com.hansecom.mapi.apis.UserDataApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class ChangeSecurityQuestionsUseCase {

    /* renamed from: a  reason: collision with root package name */
    public final UserDataApi f33769a;

    /* renamed from: b  reason: collision with root package name */
    public final UserSecurityQuestionsRepository f33770b;

    public ChangeSecurityQuestionsUseCase(UserDataApi userDataApi, UserSecurityQuestionsRepository userSecurityQuestionsRepository) {
        Intrinsics.i(userDataApi, "userDataApi");
        Intrinsics.i(userSecurityQuestionsRepository, "userSecurityQuestionsRepository");
        this.f33769a = userDataApi;
        this.f33770b = userSecurityQuestionsRepository;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x009f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(java.util.List r12, kotlin.coroutines.Continuation r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof com.hansecom.abt.data.useCases.account.ChangeSecurityQuestionsUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r13
            com.hansecom.abt.data.useCases.account.ChangeSecurityQuestionsUseCase$invoke$1 r0 = (com.hansecom.abt.data.useCases.account.ChangeSecurityQuestionsUseCase$invoke$1) r0
            int r1 = r0.F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.F = r1
            goto L_0x0018
        L_0x0013:
            com.hansecom.abt.data.useCases.account.ChangeSecurityQuestionsUseCase$invoke$1 r0 = new com.hansecom.abt.data.useCases.account.ChangeSecurityQuestionsUseCase$invoke$1
            r0.<init>(r11, r13)
        L_0x0018:
            java.lang.Object r13 = r0.D
            java.lang.Object r8 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r1 = r0.F
            r9 = 0
            r2 = 4
            r10 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L_0x0054
            if (r1 == r4) goto L_0x004c
            if (r1 == r3) goto L_0x0044
            if (r1 == r10) goto L_0x0040
            if (r1 != r2) goto L_0x0038
            java.lang.Object r12 = r0.C
            java.lang.Throwable r12 = (java.lang.Throwable) r12
            kotlin.ResultKt.b(r13)
            goto L_0x00b7
        L_0x0038:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0040:
            kotlin.ResultKt.b(r13)
            goto L_0x00a0
        L_0x0044:
            java.lang.Object r12 = r0.C
            com.hansecom.abt.data.useCases.account.ChangeSecurityQuestionsUseCase r12 = (com.hansecom.abt.data.useCases.account.ChangeSecurityQuestionsUseCase) r12
            kotlin.ResultKt.b(r13)
            goto L_0x0093
        L_0x004c:
            java.lang.Object r12 = r0.C
            com.hansecom.abt.data.useCases.account.ChangeSecurityQuestionsUseCase r12 = (com.hansecom.abt.data.useCases.account.ChangeSecurityQuestionsUseCase) r12
            kotlin.ResultKt.b(r13)
            goto L_0x0072
        L_0x0054:
            kotlin.ResultKt.b(r13)
            com.hansecom.abt.api.JsonParser r13 = com.hansecom.abt.api.JsonParser.f33114a
            kotlinx.serialization.json.Json r13 = r13.c()
            kotlinx.coroutines.CoroutineDispatcher r1 = kotlinx.coroutines.Dispatchers.b()
            com.hansecom.abt.data.useCases.account.ChangeSecurityQuestionsUseCase$invoke-gIAlu-s$$inlined$retrofit$default$1 r5 = new com.hansecom.abt.data.useCases.account.ChangeSecurityQuestionsUseCase$invoke-gIAlu-s$$inlined$retrofit$default$1
            r5.<init>(r13, r9, r11, r12)
            r0.C = r11
            r0.F = r4
            java.lang.Object r13 = kotlinx.coroutines.BuildersKt.g(r1, r5, r0)
            if (r13 != r8) goto L_0x0071
            return r8
        L_0x0071:
            r12 = r11
        L_0x0072:
            kotlin.Result r13 = (kotlin.Result) r13
            java.lang.Object r13 = r13.j()
            java.lang.Throwable r1 = kotlin.Result.e(r13)
            if (r1 != 0) goto L_0x00a9
            r2 = r13
            java.util.List r2 = (java.util.List) r2
            com.hansecom.abt.data.repositories.UserSecurityQuestionsRepository r1 = r12.f33770b
            r0.C = r12
            r0.F = r3
            r3 = 0
            r4 = 0
            r6 = 6
            r7 = 0
            r5 = r0
            java.lang.Object r13 = com.hansecom.abt.data.repositories.base.BaseRepository.K(r1, r2, r3, r4, r5, r6, r7)
            if (r13 != r8) goto L_0x0093
            return r8
        L_0x0093:
            com.hansecom.abt.data.repositories.UserSecurityQuestionsRepository r12 = r12.f33770b
            r0.C = r9
            r0.F = r10
            java.lang.Object r12 = r12.D(r0)
            if (r12 != r8) goto L_0x00a0
            return r8
        L_0x00a0:
            kotlin.Result$Companion r12 = kotlin.Result.f40519A
            kotlin.Unit r12 = kotlin.Unit.f40552a
            java.lang.Object r12 = kotlin.Result.b(r12)
            return r12
        L_0x00a9:
            com.hansecom.abt.data.repositories.UserSecurityQuestionsRepository r12 = r12.f33770b
            r0.C = r1
            r0.F = r2
            java.lang.Object r12 = r12.D(r0)
            if (r12 != r8) goto L_0x00b6
            return r8
        L_0x00b6:
            r12 = r1
        L_0x00b7:
            kotlin.Result$Companion r13 = kotlin.Result.f40519A
            java.lang.Object r12 = kotlin.ResultKt.a(r12)
            java.lang.Object r12 = kotlin.Result.b(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.useCases.account.ChangeSecurityQuestionsUseCase.b(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
