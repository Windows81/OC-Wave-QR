package com.hansecom.abt.data.useCases.account;

import com.hansecom.abt.data.repositories.UserRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class ChangeAccountInfoUseCase {

    /* renamed from: a  reason: collision with root package name */
    public final UserRepository f33763a;

    public ChangeAccountInfoUseCase(UserRepository userRepository) {
        Intrinsics.i(userRepository, "userRepository");
        this.f33763a = userRepository;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.String r19, java.lang.String r20, java.lang.String r21, kotlin.coroutines.Continuation r22) {
        /*
            r18 = this;
            r1 = r18
            r0 = r22
            boolean r2 = r0 instanceof com.hansecom.abt.data.useCases.account.ChangeAccountInfoUseCase$invoke$1
            if (r2 == 0) goto L_0x0017
            r2 = r0
            com.hansecom.abt.data.useCases.account.ChangeAccountInfoUseCase$invoke$1 r2 = (com.hansecom.abt.data.useCases.account.ChangeAccountInfoUseCase$invoke$1) r2
            int r3 = r2.I
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.I = r3
            goto L_0x001c
        L_0x0017:
            com.hansecom.abt.data.useCases.account.ChangeAccountInfoUseCase$invoke$1 r2 = new com.hansecom.abt.data.useCases.account.ChangeAccountInfoUseCase$invoke$1
            r2.<init>(r1, r0)
        L_0x001c:
            java.lang.Object r0 = r2.G
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r4 = r2.I
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L_0x0060
            if (r4 == r6) goto L_0x0042
            if (r4 != r5) goto L_0x003a
            kotlin.ResultKt.b(r0)     // Catch:{ all -> 0x0037 }
            kotlin.Result r0 = (kotlin.Result) r0     // Catch:{ all -> 0x0037 }
            java.lang.Object r0 = r0.j()     // Catch:{ all -> 0x0037 }
            goto L_0x00ab
        L_0x0037:
            r0 = move-exception
            goto L_0x00b5
        L_0x003a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0042:
            java.lang.Object r4 = r2.F
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r6 = r2.E
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r2.D
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r8 = r2.C
            com.hansecom.abt.data.useCases.account.ChangeAccountInfoUseCase r8 = (com.hansecom.abt.data.useCases.account.ChangeAccountInfoUseCase) r8
            kotlin.ResultKt.b(r0)
            kotlin.Result r0 = (kotlin.Result) r0
            java.lang.Object r0 = r0.j()
            r12 = r4
            r11 = r6
            r10 = r7
            r4 = r8
            goto L_0x0080
        L_0x0060:
            kotlin.ResultKt.b(r0)
            com.hansecom.abt.data.repositories.UserRepository r0 = r1.f33763a
            r2.C = r1
            r4 = r19
            r2.D = r4
            r7 = r20
            r2.E = r7
            r8 = r21
            r2.F = r8
            r2.I = r6
            java.lang.Object r0 = r0.i(r2)
            if (r0 != r3) goto L_0x007c
            return r3
        L_0x007c:
            r10 = r4
            r11 = r7
            r12 = r8
            r4 = r1
        L_0x0080:
            boolean r6 = kotlin.Result.h(r0)
            if (r6 == 0) goto L_0x00bb
            r6 = r0
            com.hansecom.mapi.models.User r6 = (com.hansecom.mapi.models.User) r6     // Catch:{ all -> 0x0037 }
            r16 = 455(0x1c7, float:6.38E-43)
            r17 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            com.hansecom.mapi.models.User r0 = com.hansecom.mapi.models.User.c(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0037 }
            com.hansecom.abt.data.repositories.UserRepository r4 = r4.f33763a     // Catch:{ all -> 0x0037 }
            r6 = 0
            r2.C = r6     // Catch:{ all -> 0x0037 }
            r2.D = r6     // Catch:{ all -> 0x0037 }
            r2.E = r6     // Catch:{ all -> 0x0037 }
            r2.F = r6     // Catch:{ all -> 0x0037 }
            r2.I = r5     // Catch:{ all -> 0x0037 }
            java.lang.Object r0 = r4.P(r0, r2)     // Catch:{ all -> 0x0037 }
            if (r0 != r3) goto L_0x00ab
            return r3
        L_0x00ab:
            kotlin.ResultKt.b(r0)     // Catch:{ all -> 0x0037 }
            com.hansecom.mapi.models.User r0 = (com.hansecom.mapi.models.User) r0     // Catch:{ all -> 0x0037 }
            java.lang.Object r0 = kotlin.Result.b(r0)     // Catch:{ all -> 0x0037 }
            goto L_0x00bf
        L_0x00b5:
            kotlin.Result$Companion r2 = kotlin.Result.f40519A
            java.lang.Object r0 = kotlin.ResultKt.a(r0)
        L_0x00bb:
            java.lang.Object r0 = kotlin.Result.b(r0)
        L_0x00bf:
            java.lang.Object r0 = com.hansecom.abt.util.ResultExtKt.b(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.useCases.account.ChangeAccountInfoUseCase.a(java.lang.String, java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
