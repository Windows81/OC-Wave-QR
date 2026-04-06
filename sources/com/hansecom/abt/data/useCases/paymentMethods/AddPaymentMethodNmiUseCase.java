package com.hansecom.abt.data.useCases.paymentMethods;

import com.hansecom.abt.data.managers.PaymentMethodsManager;
import com.hansecom.abt.data.repositories.PaymentMethodsRepository;
import com.hansecom.abt.data.repositories.UserRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class AddPaymentMethodNmiUseCase {

    /* renamed from: a  reason: collision with root package name */
    public final PaymentMethodsRepository f34028a;

    /* renamed from: b  reason: collision with root package name */
    public final UserRepository f34029b;

    /* renamed from: c  reason: collision with root package name */
    public final PaymentMethodsManager f34030c;

    public AddPaymentMethodNmiUseCase(PaymentMethodsRepository paymentMethodsRepository, UserRepository userRepository, PaymentMethodsManager paymentMethodsManager) {
        Intrinsics.i(paymentMethodsRepository, "paymentMethodsRepository");
        Intrinsics.i(userRepository, "userRepository");
        Intrinsics.i(paymentMethodsManager, "paymentMethodsManager");
        this.f34028a = paymentMethodsRepository;
        this.f34029b = userRepository;
        this.f34030c = paymentMethodsManager;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v13, resolved type: com.hansecom.mapi.models.UserAddress} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v11, resolved type: com.hansecom.abt.api.networkMerchants.CreditCardInfoNetworkMerchantResponse} */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x009e, code lost:
        kotlin.ResultKt.b(r10);
        r9 = com.hansecom.abt.data.useCases.paymentMethods.AddPaymentMethodNmiUseCaseKt.a(r9, (com.hansecom.mapi.models.User) r10);
        r0.C = r4;
        r0.D = null;
        r0.E = null;
        r0.F = null;
        r0.G = null;
        r0.J = 2;
        r8 = r2.b(r7, r8, r9, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00b8, code lost:
        if (r8 != r1) goto L_0x00bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00ba, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00bb, code lost:
        r7 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00c0, code lost:
        if (kotlin.Result.h(r8) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00c2, code lost:
        r9 = (kotlin.Unit) r8;
        r9 = r7.f34028a;
        r0.C = r7;
        r0.D = r8;
        r0.J = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00d2, code lost:
        if (r9.D(r0) != r1) goto L_0x00d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00d4, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00d5, code lost:
        r5 = r8;
        r8 = r7;
        r7 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00d8, code lost:
        r9 = r8.f34029b;
        r0.C = r8;
        r0.D = r7;
        r0.J = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00e5, code lost:
        if (r9.D(r0) != r1) goto L_0x00e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00e7, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00e8, code lost:
        r9 = r8.f34029b;
        r0.C = r8;
        r0.D = r7;
        r0.J = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00f5, code lost:
        if (r9.H(r0) != r1) goto L_0x00f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00f7, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00f8, code lost:
        r8 = r8.f34028a;
        r0.C = r7;
        r0.D = null;
        r0.J = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0105, code lost:
        if (r8.G(r0) != r1) goto L_0x0108;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0107, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        return r8;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.String r7, com.hansecom.abt.api.networkMerchants.CreditCardInfoNetworkMerchantResponse r8, com.hansecom.mapi.models.UserAddress r9, kotlin.coroutines.Continuation r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof com.hansecom.abt.data.useCases.paymentMethods.AddPaymentMethodNmiUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.hansecom.abt.data.useCases.paymentMethods.AddPaymentMethodNmiUseCase$invoke$1 r0 = (com.hansecom.abt.data.useCases.paymentMethods.AddPaymentMethodNmiUseCase$invoke$1) r0
            int r1 = r0.J
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.J = r1
            goto L_0x0018
        L_0x0013:
            com.hansecom.abt.data.useCases.paymentMethods.AddPaymentMethodNmiUseCase$invoke$1 r0 = new com.hansecom.abt.data.useCases.paymentMethods.AddPaymentMethodNmiUseCase$invoke$1
            r0.<init>(r6, r10)
        L_0x0018:
            java.lang.Object r10 = r0.H
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.J
            r3 = 0
            switch(r2) {
                case 0: goto L_0x0082;
                case 1: goto L_0x0062;
                case 2: goto L_0x0054;
                case 3: goto L_0x0049;
                case 4: goto L_0x003e;
                case 5: goto L_0x0033;
                case 6: goto L_0x002c;
                default: goto L_0x0024;
            }
        L_0x0024:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x002c:
            java.lang.Object r7 = r0.C
            kotlin.ResultKt.b(r10)
            goto L_0x0108
        L_0x0033:
            java.lang.Object r7 = r0.D
            java.lang.Object r8 = r0.C
            com.hansecom.abt.data.useCases.paymentMethods.AddPaymentMethodNmiUseCase r8 = (com.hansecom.abt.data.useCases.paymentMethods.AddPaymentMethodNmiUseCase) r8
            kotlin.ResultKt.b(r10)
            goto L_0x00f8
        L_0x003e:
            java.lang.Object r7 = r0.D
            java.lang.Object r8 = r0.C
            com.hansecom.abt.data.useCases.paymentMethods.AddPaymentMethodNmiUseCase r8 = (com.hansecom.abt.data.useCases.paymentMethods.AddPaymentMethodNmiUseCase) r8
            kotlin.ResultKt.b(r10)
            goto L_0x00e8
        L_0x0049:
            java.lang.Object r7 = r0.D
            java.lang.Object r8 = r0.C
            com.hansecom.abt.data.useCases.paymentMethods.AddPaymentMethodNmiUseCase r8 = (com.hansecom.abt.data.useCases.paymentMethods.AddPaymentMethodNmiUseCase) r8
            kotlin.ResultKt.b(r10)
            goto L_0x00d8
        L_0x0054:
            java.lang.Object r7 = r0.C
            com.hansecom.abt.data.useCases.paymentMethods.AddPaymentMethodNmiUseCase r7 = (com.hansecom.abt.data.useCases.paymentMethods.AddPaymentMethodNmiUseCase) r7
            kotlin.ResultKt.b(r10)
            kotlin.Result r10 = (kotlin.Result) r10
            java.lang.Object r8 = r10.j()
            goto L_0x00bc
        L_0x0062:
            java.lang.Object r7 = r0.G
            r9 = r7
            com.hansecom.mapi.models.UserAddress r9 = (com.hansecom.mapi.models.UserAddress) r9
            java.lang.Object r7 = r0.F
            r8 = r7
            com.hansecom.abt.api.networkMerchants.CreditCardInfoNetworkMerchantResponse r8 = (com.hansecom.abt.api.networkMerchants.CreditCardInfoNetworkMerchantResponse) r8
            java.lang.Object r7 = r0.E
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r2 = r0.D
            com.hansecom.abt.data.managers.PaymentMethodsManager r2 = (com.hansecom.abt.data.managers.PaymentMethodsManager) r2
            java.lang.Object r4 = r0.C
            com.hansecom.abt.data.useCases.paymentMethods.AddPaymentMethodNmiUseCase r4 = (com.hansecom.abt.data.useCases.paymentMethods.AddPaymentMethodNmiUseCase) r4
            kotlin.ResultKt.b(r10)
            kotlin.Result r10 = (kotlin.Result) r10
            java.lang.Object r10 = r10.j()
            goto L_0x009e
        L_0x0082:
            kotlin.ResultKt.b(r10)
            com.hansecom.abt.data.managers.PaymentMethodsManager r2 = r6.f34030c
            com.hansecom.abt.data.repositories.UserRepository r10 = r6.f34029b
            r0.C = r6
            r0.D = r2
            r0.E = r7
            r0.F = r8
            r0.G = r9
            r4 = 1
            r0.J = r4
            java.lang.Object r10 = r10.i(r0)
            if (r10 != r1) goto L_0x009d
            return r1
        L_0x009d:
            r4 = r6
        L_0x009e:
            kotlin.ResultKt.b(r10)
            com.hansecom.mapi.models.User r10 = (com.hansecom.mapi.models.User) r10
            com.hansecom.mapi.models.BillingAddress r9 = com.hansecom.abt.data.useCases.paymentMethods.AddPaymentMethodNmiUseCaseKt.b(r9, r10)
            r0.C = r4
            r0.D = r3
            r0.E = r3
            r0.F = r3
            r0.G = r3
            r10 = 2
            r0.J = r10
            java.lang.Object r8 = r2.b(r7, r8, r9, r0)
            if (r8 != r1) goto L_0x00bb
            return r1
        L_0x00bb:
            r7 = r4
        L_0x00bc:
            boolean r9 = kotlin.Result.h(r8)
            if (r9 == 0) goto L_0x0109
            r9 = r8
            kotlin.Unit r9 = (kotlin.Unit) r9
            com.hansecom.abt.data.repositories.PaymentMethodsRepository r9 = r7.f34028a
            r0.C = r7
            r0.D = r8
            r10 = 3
            r0.J = r10
            java.lang.Object r9 = r9.D(r0)
            if (r9 != r1) goto L_0x00d5
            return r1
        L_0x00d5:
            r5 = r8
            r8 = r7
            r7 = r5
        L_0x00d8:
            com.hansecom.abt.data.repositories.UserRepository r9 = r8.f34029b
            r0.C = r8
            r0.D = r7
            r10 = 4
            r0.J = r10
            java.lang.Object r9 = r9.D(r0)
            if (r9 != r1) goto L_0x00e8
            return r1
        L_0x00e8:
            com.hansecom.abt.data.repositories.UserRepository r9 = r8.f34029b
            r0.C = r8
            r0.D = r7
            r10 = 5
            r0.J = r10
            java.lang.Object r9 = r9.H(r0)
            if (r9 != r1) goto L_0x00f8
            return r1
        L_0x00f8:
            com.hansecom.abt.data.repositories.PaymentMethodsRepository r8 = r8.f34028a
            r0.C = r7
            r0.D = r3
            r9 = 6
            r0.J = r9
            java.lang.Object r8 = r8.G(r0)
            if (r8 != r1) goto L_0x0108
            return r1
        L_0x0108:
            r8 = r7
        L_0x0109:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.useCases.paymentMethods.AddPaymentMethodNmiUseCase.a(java.lang.String, com.hansecom.abt.api.networkMerchants.CreditCardInfoNetworkMerchantResponse, com.hansecom.mapi.models.UserAddress, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
