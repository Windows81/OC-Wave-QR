package com.hansecom.abt.data.useCases.auth;

import com.hansecom.mapi.apis.UserDataApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class ResendActivationEmailUseCase {

    /* renamed from: a  reason: collision with root package name */
    public final UserDataApi f33820a;

    public ResendActivationEmailUseCase(UserDataApi userDataApi) {
        Intrinsics.i(userDataApi, "api");
        this.f33820a = userDataApi;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(java.lang.String r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.hansecom.abt.data.useCases.auth.ResendActivationEmailUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.hansecom.abt.data.useCases.auth.ResendActivationEmailUseCase$invoke$1 r0 = (com.hansecom.abt.data.useCases.auth.ResendActivationEmailUseCase$invoke$1) r0
            int r1 = r0.E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.E = r1
            goto L_0x0018
        L_0x0013:
            com.hansecom.abt.data.useCases.auth.ResendActivationEmailUseCase$invoke$1 r0 = new com.hansecom.abt.data.useCases.auth.ResendActivationEmailUseCase$invoke$1
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.C
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.E
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.ResultKt.b(r8)
            goto L_0x004d
        L_0x0029:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0031:
            kotlin.ResultKt.b(r8)
            com.hansecom.abt.api.JsonParser r8 = com.hansecom.abt.api.JsonParser.f33114a
            kotlinx.serialization.json.Json r8 = r8.c()
            kotlinx.coroutines.CoroutineDispatcher r2 = kotlinx.coroutines.Dispatchers.b()
            com.hansecom.abt.data.useCases.auth.ResendActivationEmailUseCase$invoke-gIAlu-s$$inlined$retrofit$default$1 r4 = new com.hansecom.abt.data.useCases.auth.ResendActivationEmailUseCase$invoke-gIAlu-s$$inlined$retrofit$default$1
            r5 = 0
            r4.<init>(r8, r5, r6, r7)
            r0.E = r3
            java.lang.Object r8 = kotlinx.coroutines.BuildersKt.g(r2, r4, r0)
            if (r8 != r1) goto L_0x004d
            return r1
        L_0x004d:
            kotlin.Result r8 = (kotlin.Result) r8
            java.lang.Object r7 = r8.j()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.useCases.auth.ResendActivationEmailUseCase.b(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
