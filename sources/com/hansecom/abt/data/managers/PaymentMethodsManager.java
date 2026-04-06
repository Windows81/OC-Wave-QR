package com.hansecom.abt.data.managers;

import com.hansecom.mapi.apis.UserDataApi;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Singleton
@Metadata
public final class PaymentMethodsManager {

    /* renamed from: a  reason: collision with root package name */
    public final UserDataApi f33300a;

    public PaymentMethodsManager(UserDataApi userDataApi) {
        Intrinsics.i(userDataApi, "userApi");
        this.f33300a = userDataApi;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005f A[SYNTHETIC, Splitter:B:17:0x005f] */
    /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(java.lang.String r12, com.hansecom.abt.api.networkMerchants.CreditCardInfoNetworkMerchantResponse r13, com.hansecom.mapi.models.BillingAddress r14, kotlin.coroutines.Continuation r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof com.hansecom.abt.data.managers.PaymentMethodsManager$addPaymentMethod$1
            if (r0 == 0) goto L_0x0013
            r0 = r15
            com.hansecom.abt.data.managers.PaymentMethodsManager$addPaymentMethod$1 r0 = (com.hansecom.abt.data.managers.PaymentMethodsManager$addPaymentMethod$1) r0
            int r1 = r0.E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.E = r1
            goto L_0x0018
        L_0x0013:
            com.hansecom.abt.data.managers.PaymentMethodsManager$addPaymentMethod$1 r0 = new com.hansecom.abt.data.managers.PaymentMethodsManager$addPaymentMethod$1
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
            com.hansecom.abt.data.managers.PaymentMethodsManager$addPaymentMethod-BWLJW6A$$inlined$retrofit$default$1 r2 = new com.hansecom.abt.data.managers.PaymentMethodsManager$addPaymentMethod-BWLJW6A$$inlined$retrofit$default$1
            r6 = 0
            r4 = r2
            r7 = r11
            r8 = r13
            r9 = r14
            r10 = r12
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r0.E = r3
            java.lang.Object r15 = kotlinx.coroutines.BuildersKt.g(r15, r2, r0)
            if (r15 != r1) goto L_0x0052
            return r1
        L_0x0052:
            kotlin.Result r15 = (kotlin.Result) r15
            java.lang.Object r12 = r15.j()
            java.lang.Throwable r13 = kotlin.Result.e(r12)
            if (r13 != 0) goto L_0x005f
            goto L_0x0078
        L_0x005f:
            boolean r12 = r13 instanceof com.hansecom.abt.api.ApiValidationException     // Catch:{ all -> 0x006b }
            if (r12 == 0) goto L_0x006d
            com.hansecom.abt.data.exceptions.FieldErrorsException r12 = new com.hansecom.abt.data.exceptions.FieldErrorsException     // Catch:{ all -> 0x006b }
            com.hansecom.abt.api.ApiValidationException r13 = (com.hansecom.abt.api.ApiValidationException) r13     // Catch:{ all -> 0x006b }
            r12.<init>(r13)     // Catch:{ all -> 0x006b }
            throw r12     // Catch:{ all -> 0x006b }
        L_0x006b:
            r12 = move-exception
            goto L_0x006e
        L_0x006d:
            throw r13     // Catch:{ all -> 0x006b }
        L_0x006e:
            kotlin.Result$Companion r13 = kotlin.Result.f40519A
            java.lang.Object r12 = kotlin.ResultKt.a(r12)
            java.lang.Object r12 = kotlin.Result.b(r12)
        L_0x0078:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.managers.PaymentMethodsManager.b(java.lang.String, com.hansecom.abt.api.networkMerchants.CreditCardInfoNetworkMerchantResponse, com.hansecom.mapi.models.BillingAddress, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(boolean r11, java.lang.String r12, kotlin.coroutines.Continuation r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof com.hansecom.abt.data.managers.PaymentMethodsManager$getCyberSourceFormWebPage$1
            if (r0 == 0) goto L_0x0013
            r0 = r13
            com.hansecom.abt.data.managers.PaymentMethodsManager$getCyberSourceFormWebPage$1 r0 = (com.hansecom.abt.data.managers.PaymentMethodsManager$getCyberSourceFormWebPage$1) r0
            int r1 = r0.E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.E = r1
            goto L_0x0018
        L_0x0013:
            com.hansecom.abt.data.managers.PaymentMethodsManager$getCyberSourceFormWebPage$1 r0 = new com.hansecom.abt.data.managers.PaymentMethodsManager$getCyberSourceFormWebPage$1
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
            com.hansecom.abt.data.managers.PaymentMethodsManager$getCyberSourceFormWebPage-0E7RQCE$$inlined$retrofit$default$1 r2 = new com.hansecom.abt.data.managers.PaymentMethodsManager$getCyberSourceFormWebPage-0E7RQCE$$inlined$retrofit$default$1
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
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.managers.PaymentMethodsManager.c(boolean, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
