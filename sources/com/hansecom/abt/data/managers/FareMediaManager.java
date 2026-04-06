package com.hansecom.abt.data.managers;

import com.hansecom.abt.data.deviceInfo.DeviceInfo;
import com.hansecom.mapi.apis.AnonymousFareMediaApi;
import com.hansecom.mapi.apis.UserFareMediaApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class FareMediaManager {

    /* renamed from: a  reason: collision with root package name */
    public final DeviceInfo f33292a;

    /* renamed from: b  reason: collision with root package name */
    public final UserFareMediaApi f33293b;

    /* renamed from: c  reason: collision with root package name */
    public final AnonymousFareMediaApi f33294c;

    public FareMediaManager(DeviceInfo deviceInfo, UserFareMediaApi userFareMediaApi, AnonymousFareMediaApi anonymousFareMediaApi) {
        Intrinsics.i(deviceInfo, "deviceInfo");
        Intrinsics.i(userFareMediaApi, "userFareMediaApi");
        Intrinsics.i(anonymousFareMediaApi, "anonymousFareMediaApi");
        this.f33292a = deviceInfo;
        this.f33293b = userFareMediaApi;
        this.f33294c = anonymousFareMediaApi;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object d(java.lang.String r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.hansecom.abt.data.managers.FareMediaManager$convertToVirtual$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.hansecom.abt.data.managers.FareMediaManager$convertToVirtual$1 r0 = (com.hansecom.abt.data.managers.FareMediaManager$convertToVirtual$1) r0
            int r1 = r0.E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.E = r1
            goto L_0x0018
        L_0x0013:
            com.hansecom.abt.data.managers.FareMediaManager$convertToVirtual$1 r0 = new com.hansecom.abt.data.managers.FareMediaManager$convertToVirtual$1
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
            com.hansecom.abt.data.managers.FareMediaManager$convertToVirtual-gIAlu-s$$inlined$retrofit$default$1 r4 = new com.hansecom.abt.data.managers.FareMediaManager$convertToVirtual-gIAlu-s$$inlined$retrofit$default$1
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
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.managers.FareMediaManager.d(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object e(java.lang.String r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.hansecom.abt.data.managers.FareMediaManager$createCard$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.hansecom.abt.data.managers.FareMediaManager$createCard$1 r0 = (com.hansecom.abt.data.managers.FareMediaManager$createCard$1) r0
            int r1 = r0.E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.E = r1
            goto L_0x0018
        L_0x0013:
            com.hansecom.abt.data.managers.FareMediaManager$createCard$1 r0 = new com.hansecom.abt.data.managers.FareMediaManager$createCard$1
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
            com.hansecom.abt.data.managers.FareMediaManager$createCard-gIAlu-s$$inlined$retrofit$default$1 r4 = new com.hansecom.abt.data.managers.FareMediaManager$createCard-gIAlu-s$$inlined$retrofit$default$1
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
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.managers.FareMediaManager.e(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object f(java.lang.String r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.hansecom.abt.data.managers.FareMediaManager$createCashBarcode$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.hansecom.abt.data.managers.FareMediaManager$createCashBarcode$1 r0 = (com.hansecom.abt.data.managers.FareMediaManager$createCashBarcode$1) r0
            int r1 = r0.E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.E = r1
            goto L_0x0018
        L_0x0013:
            com.hansecom.abt.data.managers.FareMediaManager$createCashBarcode$1 r0 = new com.hansecom.abt.data.managers.FareMediaManager$createCashBarcode$1
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
            com.hansecom.abt.data.managers.FareMediaManager$createCashBarcode-gIAlu-s$$inlined$retrofit$default$1 r4 = new com.hansecom.abt.data.managers.FareMediaManager$createCashBarcode-gIAlu-s$$inlined$retrofit$default$1
            r5 = 0
            r4.<init>(r8, r5, r6, r7)
            r0.E = r3
            java.lang.Object r8 = kotlinx.coroutines.BuildersKt.g(r2, r4, r0)
            if (r8 != r1) goto L_0x004d
            return r1
        L_0x004d:
            kotlin.Result r8 = (kotlin.Result) r8
            java.lang.Object r7 = r8.j()
            boolean r8 = kotlin.Result.h(r7)
            if (r8 == 0) goto L_0x005f
            com.hansecom.mapi.models.FareMedium r7 = (com.hansecom.mapi.models.FareMedium) r7
            java.lang.String r7 = r7.l()
        L_0x005f:
            java.lang.Object r7 = kotlin.Result.b(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.managers.FareMediaManager.f(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object g(java.lang.String r11, com.hansecom.mapi.models.FareMediumUsagePermission r12, kotlin.coroutines.Continuation r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof com.hansecom.abt.data.managers.FareMediaManager$getAnonymousCardDetails$1
            if (r0 == 0) goto L_0x0013
            r0 = r13
            com.hansecom.abt.data.managers.FareMediaManager$getAnonymousCardDetails$1 r0 = (com.hansecom.abt.data.managers.FareMediaManager$getAnonymousCardDetails$1) r0
            int r1 = r0.E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.E = r1
            goto L_0x0018
        L_0x0013:
            com.hansecom.abt.data.managers.FareMediaManager$getAnonymousCardDetails$1 r0 = new com.hansecom.abt.data.managers.FareMediaManager$getAnonymousCardDetails$1
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
            com.hansecom.abt.data.managers.FareMediaManager$getAnonymousCardDetails-0E7RQCE$$inlined$retrofit$default$1 r2 = new com.hansecom.abt.data.managers.FareMediaManager$getAnonymousCardDetails-0E7RQCE$$inlined$retrofit$default$1
            r6 = 0
            r4 = r2
            r7 = r10
            r8 = r12
            r9 = r11
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
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.managers.FareMediaManager.g(java.lang.String, com.hansecom.mapi.models.FareMediumUsagePermission, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object h(java.lang.String r11, java.lang.String r12, kotlin.coroutines.Continuation r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof com.hansecom.abt.data.managers.FareMediaManager$getAnonymousUsagePermission$1
            if (r0 == 0) goto L_0x0013
            r0 = r13
            com.hansecom.abt.data.managers.FareMediaManager$getAnonymousUsagePermission$1 r0 = (com.hansecom.abt.data.managers.FareMediaManager$getAnonymousUsagePermission$1) r0
            int r1 = r0.E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.E = r1
            goto L_0x0018
        L_0x0013:
            com.hansecom.abt.data.managers.FareMediaManager$getAnonymousUsagePermission$1 r0 = new com.hansecom.abt.data.managers.FareMediaManager$getAnonymousUsagePermission$1
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
            com.hansecom.abt.data.managers.FareMediaManager$getAnonymousUsagePermission-0E7RQCE$$inlined$retrofit$default$1 r2 = new com.hansecom.abt.data.managers.FareMediaManager$getAnonymousUsagePermission-0E7RQCE$$inlined$retrofit$default$1
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
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.managers.FareMediaManager.h(java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object i(java.lang.String r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.hansecom.abt.data.managers.FareMediaManager$getGoogleWalletProvisioningLink$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.hansecom.abt.data.managers.FareMediaManager$getGoogleWalletProvisioningLink$1 r0 = (com.hansecom.abt.data.managers.FareMediaManager$getGoogleWalletProvisioningLink$1) r0
            int r1 = r0.E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.E = r1
            goto L_0x0018
        L_0x0013:
            com.hansecom.abt.data.managers.FareMediaManager$getGoogleWalletProvisioningLink$1 r0 = new com.hansecom.abt.data.managers.FareMediaManager$getGoogleWalletProvisioningLink$1
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
            com.hansecom.abt.data.managers.FareMediaManager$getGoogleWalletProvisioningLink-gIAlu-s$$inlined$retrofit$default$1 r4 = new com.hansecom.abt.data.managers.FareMediaManager$getGoogleWalletProvisioningLink-gIAlu-s$$inlined$retrofit$default$1
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
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.managers.FareMediaManager.i(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object j(java.lang.String r12, java.lang.String r13, java.lang.String r14, kotlin.coroutines.Continuation r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof com.hansecom.abt.data.managers.FareMediaManager$linkCard$1
            if (r0 == 0) goto L_0x0013
            r0 = r15
            com.hansecom.abt.data.managers.FareMediaManager$linkCard$1 r0 = (com.hansecom.abt.data.managers.FareMediaManager$linkCard$1) r0
            int r1 = r0.E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.E = r1
            goto L_0x0018
        L_0x0013:
            com.hansecom.abt.data.managers.FareMediaManager$linkCard$1 r0 = new com.hansecom.abt.data.managers.FareMediaManager$linkCard$1
            r0.<init>(r11, r15)
        L_0x0018:
            java.lang.Object r15 = r0.C
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.E
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.ResultKt.b(r15)
            goto L_0x0052
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
            com.hansecom.abt.data.managers.FareMediaManager$linkCard-BWLJW6A$$inlined$retrofit$default$1 r2 = new com.hansecom.abt.data.managers.FareMediaManager$linkCard-BWLJW6A$$inlined$retrofit$default$1
            r6 = 0
            r4 = r2
            r7 = r11
            r8 = r12
            r9 = r13
            r10 = r14
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r0.E = r3
            java.lang.Object r15 = kotlinx.coroutines.BuildersKt.g(r15, r2, r0)
            if (r15 != r1) goto L_0x0052
            return r1
        L_0x0052:
            kotlin.Result r15 = (kotlin.Result) r15
            java.lang.Object r12 = r15.j()
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.managers.FareMediaManager.j(java.lang.String, java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object k(java.lang.String r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.hansecom.abt.data.managers.FareMediaManager$lockCard$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.hansecom.abt.data.managers.FareMediaManager$lockCard$1 r0 = (com.hansecom.abt.data.managers.FareMediaManager$lockCard$1) r0
            int r1 = r0.E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.E = r1
            goto L_0x0018
        L_0x0013:
            com.hansecom.abt.data.managers.FareMediaManager$lockCard$1 r0 = new com.hansecom.abt.data.managers.FareMediaManager$lockCard$1
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
            com.hansecom.abt.data.managers.FareMediaManager$lockCard-gIAlu-s$$inlined$retrofit$default$1 r4 = new com.hansecom.abt.data.managers.FareMediaManager$lockCard-gIAlu-s$$inlined$retrofit$default$1
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
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.managers.FareMediaManager.k(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object l(java.lang.String r15, java.lang.Integer r16, java.lang.Long r17, java.math.BigDecimal r18, kotlin.coroutines.Continuation r19) {
        /*
            r14 = this;
            r0 = r19
            boolean r1 = r0 instanceof com.hansecom.abt.data.managers.FareMediaManager$purchaseVirtualCard$1
            if (r1 == 0) goto L_0x0016
            r1 = r0
            com.hansecom.abt.data.managers.FareMediaManager$purchaseVirtualCard$1 r1 = (com.hansecom.abt.data.managers.FareMediaManager$purchaseVirtualCard$1) r1
            int r2 = r1.E
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0016
            int r2 = r2 - r3
            r1.E = r2
            r10 = r14
            goto L_0x001c
        L_0x0016:
            com.hansecom.abt.data.managers.FareMediaManager$purchaseVirtualCard$1 r1 = new com.hansecom.abt.data.managers.FareMediaManager$purchaseVirtualCard$1
            r10 = r14
            r1.<init>(r14, r0)
        L_0x001c:
            java.lang.Object r0 = r1.C
            java.lang.Object r11 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r1.E
            r12 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r12) goto L_0x002d
            kotlin.ResultKt.b(r0)
            goto L_0x005a
        L_0x002d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0035:
            kotlin.ResultKt.b(r0)
            com.hansecom.abt.api.JsonParser r0 = com.hansecom.abt.api.JsonParser.f33114a
            kotlinx.serialization.json.Json r3 = r0.c()
            kotlinx.coroutines.CoroutineDispatcher r0 = kotlinx.coroutines.Dispatchers.b()
            com.hansecom.abt.data.managers.FareMediaManager$purchaseVirtualCard-yxL6bBk$$inlined$retrofit$default$1 r13 = new com.hansecom.abt.data.managers.FareMediaManager$purchaseVirtualCard-yxL6bBk$$inlined$retrofit$default$1
            r4 = 0
            r2 = r13
            r5 = r14
            r6 = r18
            r7 = r16
            r8 = r15
            r9 = r17
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r1.E = r12
            java.lang.Object r0 = kotlinx.coroutines.BuildersKt.g(r0, r13, r1)
            if (r0 != r11) goto L_0x005a
            return r11
        L_0x005a:
            kotlin.Result r0 = (kotlin.Result) r0
            java.lang.Object r0 = r0.j()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.managers.FareMediaManager.l(java.lang.String, java.lang.Integer, java.lang.Long, java.math.BigDecimal, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m(java.lang.String r12, java.lang.String r13, java.math.BigDecimal r14, kotlin.coroutines.Continuation r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof com.hansecom.abt.data.managers.FareMediaManager$transferBalance$1
            if (r0 == 0) goto L_0x0013
            r0 = r15
            com.hansecom.abt.data.managers.FareMediaManager$transferBalance$1 r0 = (com.hansecom.abt.data.managers.FareMediaManager$transferBalance$1) r0
            int r1 = r0.E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.E = r1
            goto L_0x0018
        L_0x0013:
            com.hansecom.abt.data.managers.FareMediaManager$transferBalance$1 r0 = new com.hansecom.abt.data.managers.FareMediaManager$transferBalance$1
            r0.<init>(r11, r15)
        L_0x0018:
            java.lang.Object r15 = r0.C
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.E
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.ResultKt.b(r15)
            goto L_0x0052
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
            com.hansecom.abt.data.managers.FareMediaManager$transferBalance-BWLJW6A$$inlined$retrofit$default$1 r2 = new com.hansecom.abt.data.managers.FareMediaManager$transferBalance-BWLJW6A$$inlined$retrofit$default$1
            r6 = 0
            r4 = r2
            r7 = r11
            r8 = r12
            r9 = r13
            r10 = r14
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r0.E = r3
            java.lang.Object r15 = kotlinx.coroutines.BuildersKt.g(r15, r2, r0)
            if (r15 != r1) goto L_0x0052
            return r1
        L_0x0052:
            kotlin.Result r15 = (kotlin.Result) r15
            java.lang.Object r12 = r15.j()
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.managers.FareMediaManager.m(java.lang.String, java.lang.String, java.math.BigDecimal, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object n(kotlin.coroutines.Continuation r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.hansecom.abt.data.managers.FareMediaManager$transferCard$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.hansecom.abt.data.managers.FareMediaManager$transferCard$1 r0 = (com.hansecom.abt.data.managers.FareMediaManager$transferCard$1) r0
            int r1 = r0.E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.E = r1
            goto L_0x0018
        L_0x0013:
            com.hansecom.abt.data.managers.FareMediaManager$transferCard$1 r0 = new com.hansecom.abt.data.managers.FareMediaManager$transferCard$1
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.C
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.E
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.ResultKt.b(r7)
            goto L_0x004d
        L_0x0029:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0031:
            kotlin.ResultKt.b(r7)
            com.hansecom.abt.api.JsonParser r7 = com.hansecom.abt.api.JsonParser.f33114a
            kotlinx.serialization.json.Json r7 = r7.c()
            kotlinx.coroutines.CoroutineDispatcher r2 = kotlinx.coroutines.Dispatchers.b()
            com.hansecom.abt.data.managers.FareMediaManager$transferCard-IoAF18A$$inlined$retrofit$default$1 r4 = new com.hansecom.abt.data.managers.FareMediaManager$transferCard-IoAF18A$$inlined$retrofit$default$1
            r5 = 0
            r4.<init>(r7, r5, r6)
            r0.E = r3
            java.lang.Object r7 = kotlinx.coroutines.BuildersKt.g(r2, r4, r0)
            if (r7 != r1) goto L_0x004d
            return r1
        L_0x004d:
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r7 = r7.j()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.managers.FareMediaManager.n(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.String r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.hansecom.abt.data.managers.FareMediaManager$unlinkCard$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.hansecom.abt.data.managers.FareMediaManager$unlinkCard$1 r0 = (com.hansecom.abt.data.managers.FareMediaManager$unlinkCard$1) r0
            int r1 = r0.E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.E = r1
            goto L_0x0018
        L_0x0013:
            com.hansecom.abt.data.managers.FareMediaManager$unlinkCard$1 r0 = new com.hansecom.abt.data.managers.FareMediaManager$unlinkCard$1
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
            com.hansecom.abt.data.managers.FareMediaManager$unlinkCard-gIAlu-s$$inlined$retrofit$default$1 r4 = new com.hansecom.abt.data.managers.FareMediaManager$unlinkCard-gIAlu-s$$inlined$retrofit$default$1
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
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.managers.FareMediaManager.o(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object p(java.lang.String r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.hansecom.abt.data.managers.FareMediaManager$unlockCard$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.hansecom.abt.data.managers.FareMediaManager$unlockCard$1 r0 = (com.hansecom.abt.data.managers.FareMediaManager$unlockCard$1) r0
            int r1 = r0.E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.E = r1
            goto L_0x0018
        L_0x0013:
            com.hansecom.abt.data.managers.FareMediaManager$unlockCard$1 r0 = new com.hansecom.abt.data.managers.FareMediaManager$unlockCard$1
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
            com.hansecom.abt.data.managers.FareMediaManager$unlockCard-gIAlu-s$$inlined$retrofit$default$1 r4 = new com.hansecom.abt.data.managers.FareMediaManager$unlockCard-gIAlu-s$$inlined$retrofit$default$1
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
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.managers.FareMediaManager.p(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object q(java.lang.String r11, java.lang.String r12, kotlin.coroutines.Continuation r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof com.hansecom.abt.data.managers.FareMediaManager$updateNickname$1
            if (r0 == 0) goto L_0x0013
            r0 = r13
            com.hansecom.abt.data.managers.FareMediaManager$updateNickname$1 r0 = (com.hansecom.abt.data.managers.FareMediaManager$updateNickname$1) r0
            int r1 = r0.E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.E = r1
            goto L_0x0018
        L_0x0013:
            com.hansecom.abt.data.managers.FareMediaManager$updateNickname$1 r0 = new com.hansecom.abt.data.managers.FareMediaManager$updateNickname$1
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
            com.hansecom.abt.data.managers.FareMediaManager$updateNickname-0E7RQCE$$inlined$retrofit$default$1 r2 = new com.hansecom.abt.data.managers.FareMediaManager$updateNickname-0E7RQCE$$inlined$retrofit$default$1
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
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.managers.FareMediaManager.q(java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
