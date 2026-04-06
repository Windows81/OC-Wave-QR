package com.hansecom.abt.data.useCases.account;

import com.hansecom.abt.data.repositories.UserRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class GetUserUseCase {

    /* renamed from: a  reason: collision with root package name */
    public final UserRepository f33775a;

    public GetUserUseCase(UserRepository userRepository) {
        Intrinsics.i(userRepository, "userRepository");
        this.f33775a = userRepository;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.hansecom.abt.data.useCases.account.GetUserUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.hansecom.abt.data.useCases.account.GetUserUseCase$invoke$1 r0 = (com.hansecom.abt.data.useCases.account.GetUserUseCase$invoke$1) r0
            int r1 = r0.E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.E = r1
            goto L_0x0018
        L_0x0013:
            com.hansecom.abt.data.useCases.account.GetUserUseCase$invoke$1 r0 = new com.hansecom.abt.data.useCases.account.GetUserUseCase$invoke$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.C
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.E
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            kotlin.ResultKt.b(r5)
            kotlin.Result r5 = (kotlin.Result) r5
            java.lang.Object r5 = r5.j()
            goto L_0x0045
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0037:
            kotlin.ResultKt.b(r5)
            com.hansecom.abt.data.repositories.UserRepository r5 = r4.f33775a
            r0.E = r3
            java.lang.Object r5 = r5.i(r0)
            if (r5 != r1) goto L_0x0045
            return r1
        L_0x0045:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.useCases.account.GetUserUseCase.a(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
