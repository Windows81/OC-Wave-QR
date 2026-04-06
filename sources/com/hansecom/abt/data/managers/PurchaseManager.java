package com.hansecom.abt.data.managers;

import com.hansecom.mapi.apis.PurchaseOperationsApi;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class PurchaseManager {

    /* renamed from: a  reason: collision with root package name */
    public final PurchaseOperationsApi f33302a;

    public PurchaseManager(PurchaseOperationsApi purchaseOperationsApi) {
        Intrinsics.i(purchaseOperationsApi, "purchaseOperationsApi");
        this.f33302a = purchaseOperationsApi;
    }

    public static /* synthetic */ Object g(PurchaseManager purchaseManager, String str, Long l2, boolean z2, Integer num, String str2, Continuation continuation, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        return purchaseManager.f(str, l2, z2, (i2 & 8) != 0 ? null : num, (i2 & 16) != 0 ? null : str2, continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(java.lang.String r16, java.math.BigDecimal r17, long r18, java.lang.String r20, kotlin.coroutines.Continuation r21) {
        /*
            r15 = this;
            r0 = r21
            boolean r1 = r0 instanceof com.hansecom.abt.data.managers.PurchaseManager$addBalance$1
            if (r1 == 0) goto L_0x0016
            r1 = r0
            com.hansecom.abt.data.managers.PurchaseManager$addBalance$1 r1 = (com.hansecom.abt.data.managers.PurchaseManager$addBalance$1) r1
            int r2 = r1.E
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0016
            int r2 = r2 - r3
            r1.E = r2
            r11 = r15
            goto L_0x001c
        L_0x0016:
            com.hansecom.abt.data.managers.PurchaseManager$addBalance$1 r1 = new com.hansecom.abt.data.managers.PurchaseManager$addBalance$1
            r11 = r15
            r1.<init>(r15, r0)
        L_0x001c:
            java.lang.Object r0 = r1.C
            java.lang.Object r12 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r1.E
            r13 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r13) goto L_0x002d
            kotlin.ResultKt.b(r0)
            goto L_0x005b
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
            com.hansecom.abt.data.managers.PurchaseManager$addBalance-yxL6bBk$$inlined$retrofit$default$1 r14 = new com.hansecom.abt.data.managers.PurchaseManager$addBalance-yxL6bBk$$inlined$retrofit$default$1
            r4 = 0
            r2 = r14
            r5 = r15
            r6 = r18
            r8 = r20
            r9 = r16
            r10 = r17
            r2.<init>(r3, r4, r5, r6, r8, r9, r10)
            r1.E = r13
            java.lang.Object r0 = kotlinx.coroutines.BuildersKt.g(r0, r14, r1)
            if (r0 != r12) goto L_0x005b
            return r12
        L_0x005b:
            kotlin.Result r0 = (kotlin.Result) r0
            java.lang.Object r0 = r0.j()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.managers.PurchaseManager.b(java.lang.String, java.math.BigDecimal, long, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(java.lang.String r15, java.math.BigDecimal r16, com.google.android.gms.wallet.PaymentData r17, java.lang.String r18, kotlin.coroutines.Continuation r19) {
        /*
            r14 = this;
            r0 = r19
            boolean r1 = r0 instanceof com.hansecom.abt.data.managers.PurchaseManager$addBalanceWithGooglePay$1
            if (r1 == 0) goto L_0x0016
            r1 = r0
            com.hansecom.abt.data.managers.PurchaseManager$addBalanceWithGooglePay$1 r1 = (com.hansecom.abt.data.managers.PurchaseManager$addBalanceWithGooglePay$1) r1
            int r2 = r1.E
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0016
            int r2 = r2 - r3
            r1.E = r2
            r10 = r14
            goto L_0x001c
        L_0x0016:
            com.hansecom.abt.data.managers.PurchaseManager$addBalanceWithGooglePay$1 r1 = new com.hansecom.abt.data.managers.PurchaseManager$addBalanceWithGooglePay$1
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
            com.hansecom.abt.data.managers.PurchaseManager$addBalanceWithGooglePay-yxL6bBk$$inlined$retrofit$default$1 r13 = new com.hansecom.abt.data.managers.PurchaseManager$addBalanceWithGooglePay-yxL6bBk$$inlined$retrofit$default$1
            r4 = 0
            r2 = r13
            r5 = r14
            r6 = r17
            r7 = r18
            r8 = r15
            r9 = r16
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
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.managers.PurchaseManager.c(java.lang.String, java.math.BigDecimal, com.google.android.gms.wallet.PaymentData, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object d(java.math.BigDecimal r11, java.lang.String r12, kotlin.coroutines.Continuation r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof com.hansecom.abt.data.managers.PurchaseManager$applyCouponForAddValue$1
            if (r0 == 0) goto L_0x0013
            r0 = r13
            com.hansecom.abt.data.managers.PurchaseManager$applyCouponForAddValue$1 r0 = (com.hansecom.abt.data.managers.PurchaseManager$applyCouponForAddValue$1) r0
            int r1 = r0.E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.E = r1
            goto L_0x0018
        L_0x0013:
            com.hansecom.abt.data.managers.PurchaseManager$applyCouponForAddValue$1 r0 = new com.hansecom.abt.data.managers.PurchaseManager$applyCouponForAddValue$1
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
            com.hansecom.abt.data.managers.PurchaseManager$applyCouponForAddValue-0E7RQCE$$inlined$retrofit$default$1 r2 = new com.hansecom.abt.data.managers.PurchaseManager$applyCouponForAddValue-0E7RQCE$$inlined$retrofit$default$1
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
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.managers.PurchaseManager.d(java.math.BigDecimal, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object e(java.lang.String r12, java.lang.String r13, java.lang.Integer r14, kotlin.coroutines.Continuation r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof com.hansecom.abt.data.managers.PurchaseManager$applyCouponForPurchase$1
            if (r0 == 0) goto L_0x0013
            r0 = r15
            com.hansecom.abt.data.managers.PurchaseManager$applyCouponForPurchase$1 r0 = (com.hansecom.abt.data.managers.PurchaseManager$applyCouponForPurchase$1) r0
            int r1 = r0.E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.E = r1
            goto L_0x0018
        L_0x0013:
            com.hansecom.abt.data.managers.PurchaseManager$applyCouponForPurchase$1 r0 = new com.hansecom.abt.data.managers.PurchaseManager$applyCouponForPurchase$1
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
            com.hansecom.abt.data.managers.PurchaseManager$applyCouponForPurchase-BWLJW6A$$inlined$retrofit$default$1 r2 = new com.hansecom.abt.data.managers.PurchaseManager$applyCouponForPurchase-BWLJW6A$$inlined$retrofit$default$1
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
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.managers.PurchaseManager.e(java.lang.String, java.lang.String, java.lang.Integer, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object f(java.lang.String r16, java.lang.Long r17, boolean r18, java.lang.Integer r19, java.lang.String r20, kotlin.coroutines.Continuation r21) {
        /*
            r15 = this;
            r0 = r21
            boolean r1 = r0 instanceof com.hansecom.abt.data.managers.PurchaseManager$purchasePass$1
            if (r1 == 0) goto L_0x0016
            r1 = r0
            com.hansecom.abt.data.managers.PurchaseManager$purchasePass$1 r1 = (com.hansecom.abt.data.managers.PurchaseManager$purchasePass$1) r1
            int r2 = r1.E
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0016
            int r2 = r2 - r3
            r1.E = r2
            r11 = r15
            goto L_0x001c
        L_0x0016:
            com.hansecom.abt.data.managers.PurchaseManager$purchasePass$1 r1 = new com.hansecom.abt.data.managers.PurchaseManager$purchasePass$1
            r11 = r15
            r1.<init>(r15, r0)
        L_0x001c:
            java.lang.Object r0 = r1.C
            java.lang.Object r12 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r1.E
            r13 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r13) goto L_0x002d
            kotlin.ResultKt.b(r0)
            goto L_0x005d
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
            com.hansecom.abt.data.managers.PurchaseManager$purchasePass-hUnOzRk$$inlined$retrofit$default$1 r14 = new com.hansecom.abt.data.managers.PurchaseManager$purchasePass-hUnOzRk$$inlined$retrofit$default$1
            r4 = 0
            r2 = r14
            r5 = r15
            r6 = r17
            r7 = r20
            r8 = r18
            r9 = r16
            r10 = r19
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            r1.E = r13
            java.lang.Object r0 = kotlinx.coroutines.BuildersKt.g(r0, r14, r1)
            if (r0 != r12) goto L_0x005d
            return r12
        L_0x005d:
            kotlin.Result r0 = (kotlin.Result) r0
            java.lang.Object r0 = r0.j()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.managers.PurchaseManager.f(java.lang.String, java.lang.Long, boolean, java.lang.Integer, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object h(java.lang.String r15, com.google.android.gms.wallet.PaymentData r16, java.lang.Integer r17, java.lang.String r18, kotlin.coroutines.Continuation r19) {
        /*
            r14 = this;
            r0 = r19
            boolean r1 = r0 instanceof com.hansecom.abt.data.managers.PurchaseManager$purchasePassWithGooglePay$1
            if (r1 == 0) goto L_0x0016
            r1 = r0
            com.hansecom.abt.data.managers.PurchaseManager$purchasePassWithGooglePay$1 r1 = (com.hansecom.abt.data.managers.PurchaseManager$purchasePassWithGooglePay$1) r1
            int r2 = r1.E
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0016
            int r2 = r2 - r3
            r1.E = r2
            r10 = r14
            goto L_0x001c
        L_0x0016:
            com.hansecom.abt.data.managers.PurchaseManager$purchasePassWithGooglePay$1 r1 = new com.hansecom.abt.data.managers.PurchaseManager$purchasePassWithGooglePay$1
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
            com.hansecom.abt.data.managers.PurchaseManager$purchasePassWithGooglePay-yxL6bBk$$inlined$retrofit$default$1 r13 = new com.hansecom.abt.data.managers.PurchaseManager$purchasePassWithGooglePay-yxL6bBk$$inlined$retrofit$default$1
            r4 = 0
            r2 = r13
            r5 = r14
            r6 = r16
            r7 = r18
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
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.managers.PurchaseManager.h(java.lang.String, com.google.android.gms.wallet.PaymentData, java.lang.Integer, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
