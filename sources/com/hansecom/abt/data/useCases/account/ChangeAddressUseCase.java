package com.hansecom.abt.data.useCases.account;

import com.hansecom.abt.data.repositories.UserRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class ChangeAddressUseCase {

    /* renamed from: a  reason: collision with root package name */
    public final UserRepository f33765a;

    public ChangeAddressUseCase(UserRepository userRepository) {
        Intrinsics.i(userRepository, "userRepository");
        this.f33765a = userRepository;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x008b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(com.hansecom.mapi.models.UserAddress r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.hansecom.abt.data.useCases.account.ChangeAddressUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.hansecom.abt.data.useCases.account.ChangeAddressUseCase$invoke$1 r0 = (com.hansecom.abt.data.useCases.account.ChangeAddressUseCase$invoke$1) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.G = r1
            goto L_0x0018
        L_0x0013:
            com.hansecom.abt.data.useCases.account.ChangeAddressUseCase$invoke$1 r0 = new com.hansecom.abt.data.useCases.account.ChangeAddressUseCase$invoke$1
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.E
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.G
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0052
            if (r2 == r5) goto L_0x0043
            if (r2 == r4) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r7 = r0.C
            kotlin.ResultKt.b(r8)
            goto L_0x008c
        L_0x0031:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0039:
            java.lang.Object r7 = r0.D
            java.lang.Object r2 = r0.C
            com.hansecom.abt.data.useCases.account.ChangeAddressUseCase r2 = (com.hansecom.abt.data.useCases.account.ChangeAddressUseCase) r2
            kotlin.ResultKt.b(r8)
            goto L_0x007c
        L_0x0043:
            java.lang.Object r7 = r0.C
            com.hansecom.abt.data.useCases.account.ChangeAddressUseCase r7 = (com.hansecom.abt.data.useCases.account.ChangeAddressUseCase) r7
            kotlin.ResultKt.b(r8)
            kotlin.Result r8 = (kotlin.Result) r8
            java.lang.Object r8 = r8.j()
            r2 = r7
            goto L_0x0063
        L_0x0052:
            kotlin.ResultKt.b(r8)
            com.hansecom.abt.data.repositories.UserRepository r8 = r6.f33765a
            r0.C = r6
            r0.G = r5
            java.lang.Object r8 = r8.Q(r7, r0)
            if (r8 != r1) goto L_0x0062
            return r1
        L_0x0062:
            r2 = r6
        L_0x0063:
            boolean r7 = kotlin.Result.h(r8)
            if (r7 == 0) goto L_0x008d
            r7 = r8
            com.hansecom.mapi.models.UserAddress r7 = (com.hansecom.mapi.models.UserAddress) r7
            com.hansecom.abt.data.repositories.UserRepository r7 = r2.f33765a
            r0.C = r2
            r0.D = r8
            r0.G = r4
            java.lang.Object r7 = r7.D(r0)
            if (r7 != r1) goto L_0x007b
            return r1
        L_0x007b:
            r7 = r8
        L_0x007c:
            com.hansecom.abt.data.repositories.UserRepository r8 = r2.f33765a
            r0.C = r7
            r2 = 0
            r0.D = r2
            r0.G = r3
            java.lang.Object r8 = r8.H(r0)
            if (r8 != r1) goto L_0x008c
            return r1
        L_0x008c:
            r8 = r7
        L_0x008d:
            boolean r7 = kotlin.Result.h(r8)
            if (r7 == 0) goto L_0x009c
            com.hansecom.mapi.models.UserAddress r8 = (com.hansecom.mapi.models.UserAddress) r8
            kotlin.Unit r7 = kotlin.Unit.f40552a
            java.lang.Object r7 = kotlin.Result.b(r7)
            goto L_0x00a0
        L_0x009c:
            java.lang.Object r7 = kotlin.Result.b(r8)
        L_0x00a0:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.useCases.account.ChangeAddressUseCase.a(com.hansecom.mapi.models.UserAddress, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
