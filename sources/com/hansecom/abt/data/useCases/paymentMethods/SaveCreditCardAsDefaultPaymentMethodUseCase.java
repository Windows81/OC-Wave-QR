package com.hansecom.abt.data.useCases.paymentMethods;

import com.hansecom.abt.data.preferences.AppPreferences;
import com.hansecom.abt.data.repositories.PaymentMethodsRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class SaveCreditCardAsDefaultPaymentMethodUseCase {

    /* renamed from: a  reason: collision with root package name */
    public final PaymentMethodsRepository f34054a;

    /* renamed from: b  reason: collision with root package name */
    public final AppPreferences f34055b;

    public SaveCreditCardAsDefaultPaymentMethodUseCase(PaymentMethodsRepository paymentMethodsRepository, AppPreferences appPreferences) {
        Intrinsics.i(paymentMethodsRepository, "paymentMethodRepository");
        Intrinsics.i(appPreferences, "appPreferences");
        this.f34054a = paymentMethodsRepository;
        this.f34055b = appPreferences;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0095 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x010e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x011b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(long r26, kotlin.coroutines.Continuation r28) {
        /*
            r25 = this;
            r0 = r25
            r1 = r28
            boolean r2 = r1 instanceof com.hansecom.abt.data.useCases.paymentMethods.SaveCreditCardAsDefaultPaymentMethodUseCase$invoke$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.hansecom.abt.data.useCases.paymentMethods.SaveCreditCardAsDefaultPaymentMethodUseCase$invoke$1 r2 = (com.hansecom.abt.data.useCases.paymentMethods.SaveCreditCardAsDefaultPaymentMethodUseCase$invoke$1) r2
            int r3 = r2.G
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.G = r3
            goto L_0x001c
        L_0x0017:
            com.hansecom.abt.data.useCases.paymentMethods.SaveCreditCardAsDefaultPaymentMethodUseCase$invoke$1 r2 = new com.hansecom.abt.data.useCases.paymentMethods.SaveCreditCardAsDefaultPaymentMethodUseCase$invoke$1
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.E
            java.lang.Object r10 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r3 = r2.G
            r11 = 0
            r12 = 5
            r13 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L_0x0070
            if (r3 == r6) goto L_0x0066
            if (r3 == r5) goto L_0x0055
            if (r3 == r4) goto L_0x004c
            if (r3 == r13) goto L_0x0043
            if (r3 != r12) goto L_0x003b
            kotlin.ResultKt.b(r1)
            goto L_0x011c
        L_0x003b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0043:
            java.lang.Object r3 = r2.C
            com.hansecom.abt.data.useCases.paymentMethods.SaveCreditCardAsDefaultPaymentMethodUseCase r3 = (com.hansecom.abt.data.useCases.paymentMethods.SaveCreditCardAsDefaultPaymentMethodUseCase) r3
            kotlin.ResultKt.b(r1)
            goto L_0x010f
        L_0x004c:
            java.lang.Object r3 = r2.C
            com.hansecom.abt.data.useCases.paymentMethods.SaveCreditCardAsDefaultPaymentMethodUseCase r3 = (com.hansecom.abt.data.useCases.paymentMethods.SaveCreditCardAsDefaultPaymentMethodUseCase) r3
            kotlin.ResultKt.b(r1)
            goto L_0x0102
        L_0x0055:
            long r7 = r2.D
            java.lang.Object r3 = r2.C
            com.hansecom.abt.data.useCases.paymentMethods.SaveCreditCardAsDefaultPaymentMethodUseCase r3 = (com.hansecom.abt.data.useCases.paymentMethods.SaveCreditCardAsDefaultPaymentMethodUseCase) r3
            kotlin.ResultKt.b(r1)
            kotlin.Result r1 = (kotlin.Result) r1
            java.lang.Object r1 = r1.j()
        L_0x0064:
            r14 = r3
            goto L_0x0096
        L_0x0066:
            long r7 = r2.D
            java.lang.Object r3 = r2.C
            com.hansecom.abt.data.useCases.paymentMethods.SaveCreditCardAsDefaultPaymentMethodUseCase r3 = (com.hansecom.abt.data.useCases.paymentMethods.SaveCreditCardAsDefaultPaymentMethodUseCase) r3
            kotlin.ResultKt.b(r1)
            goto L_0x0087
        L_0x0070:
            kotlin.ResultKt.b(r1)
            com.hansecom.abt.data.preferences.AppPreferences r1 = r0.f34055b
            com.hansecom.abt.data.localDomain.PaymentMethodType r3 = com.hansecom.abt.data.localDomain.PaymentMethodType.CREDIT_CARD
            r2.C = r0
            r7 = r26
            r2.D = r7
            r2.G = r6
            java.lang.Object r1 = r1.g(r3, r2)
            if (r1 != r10) goto L_0x0086
            return r10
        L_0x0086:
            r3 = r0
        L_0x0087:
            com.hansecom.abt.data.repositories.PaymentMethodsRepository r1 = r3.f34054a
            r2.C = r3
            r2.D = r7
            r2.G = r5
            java.lang.Object r1 = r1.i(r2)
            if (r1 != r10) goto L_0x0064
            return r10
        L_0x0096:
            boolean r3 = kotlin.Result.g(r1)
            if (r3 == 0) goto L_0x009d
            r1 = r11
        L_0x009d:
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L_0x0101
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r5 = new java.util.ArrayList
            r3 = 10
            int r3 = kotlin.collections.CollectionsKt.x(r1, r3)
            r5.<init>(r3)
            java.util.Iterator r1 = r1.iterator()
        L_0x00b2:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x00ed
            java.lang.Object r3 = r1.next()
            r15 = r3
            com.hansecom.mapi.models.PaymentMethod r15 = (com.hansecom.mapi.models.PaymentMethod) r15
            java.lang.Long r3 = r15.e()
            if (r3 != 0) goto L_0x00c6
            goto L_0x00d0
        L_0x00c6:
            long r16 = r3.longValue()
            int r3 = (r16 > r7 ? 1 : (r16 == r7 ? 0 : -1))
            if (r3 != 0) goto L_0x00d0
            r3 = r6
            goto L_0x00d1
        L_0x00d0:
            r3 = 0
        L_0x00d1:
            java.lang.Boolean r18 = kotlin.coroutines.jvm.internal.Boxing.a(r3)
            r23 = 123(0x7b, float:1.72E-43)
            r24 = 0
            r16 = 0
            r17 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            com.hansecom.mapi.models.PaymentMethod r3 = com.hansecom.mapi.models.PaymentMethod.b(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r5.add(r3)
            goto L_0x00b2
        L_0x00ed:
            com.hansecom.abt.data.repositories.PaymentMethodsRepository r3 = r14.f34054a
            r2.C = r14
            r2.G = r4
            r1 = 0
            r6 = 0
            r8 = 6
            r9 = 0
            r4 = r5
            r5 = r1
            r7 = r2
            java.lang.Object r1 = com.hansecom.abt.data.repositories.base.BaseRepository.K(r3, r4, r5, r6, r7, r8, r9)
            if (r1 != r10) goto L_0x0101
            return r10
        L_0x0101:
            r3 = r14
        L_0x0102:
            com.hansecom.abt.data.repositories.PaymentMethodsRepository r1 = r3.f34054a
            r2.C = r3
            r2.G = r13
            java.lang.Object r1 = r1.D(r2)
            if (r1 != r10) goto L_0x010f
            return r10
        L_0x010f:
            com.hansecom.abt.data.repositories.PaymentMethodsRepository r1 = r3.f34054a
            r2.C = r11
            r2.G = r12
            java.lang.Object r1 = r1.H(r2)
            if (r1 != r10) goto L_0x011c
            return r10
        L_0x011c:
            kotlin.Unit r1 = kotlin.Unit.f40552a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.useCases.paymentMethods.SaveCreditCardAsDefaultPaymentMethodUseCase.a(long, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
