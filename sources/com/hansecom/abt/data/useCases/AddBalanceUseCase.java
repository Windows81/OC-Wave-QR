package com.hansecom.abt.data.useCases;

import com.hansecom.abt.data.managers.PurchaseManager;
import com.hansecom.abt.data.repositories.CardHistoryRepository;
import com.hansecom.abt.data.repositories.FareMediaRepository;
import com.hansecom.abt.data.useCases.paymentMethods.SaveCreditCardAsDefaultPaymentMethodUseCase;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class AddBalanceUseCase {

    /* renamed from: a  reason: collision with root package name */
    public final PurchaseManager f33684a;

    /* renamed from: b  reason: collision with root package name */
    public final CardHistoryRepository f33685b;

    /* renamed from: c  reason: collision with root package name */
    public final FareMediaRepository f33686c;

    /* renamed from: d  reason: collision with root package name */
    public final SaveCreditCardAsDefaultPaymentMethodUseCase f33687d;

    public AddBalanceUseCase(PurchaseManager purchaseManager, CardHistoryRepository cardHistoryRepository, FareMediaRepository fareMediaRepository, SaveCreditCardAsDefaultPaymentMethodUseCase saveCreditCardAsDefaultPaymentMethodUseCase) {
        Intrinsics.i(purchaseManager, "purchaseManager");
        Intrinsics.i(cardHistoryRepository, "cardHistoryRepository");
        Intrinsics.i(fareMediaRepository, "fareMediaRepository");
        Intrinsics.i(saveCreditCardAsDefaultPaymentMethodUseCase, "saveCreditCardAsDefaultPaymentMethodUseCase");
        this.f33684a = purchaseManager;
        this.f33685b = cardHistoryRepository;
        this.f33686c = fareMediaRepository;
        this.f33687d = saveCreditCardAsDefaultPaymentMethodUseCase;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0052, code lost:
        r1 = r6;
        r6 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00b7, code lost:
        if (kotlin.Result.h(r5) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00b9, code lost:
        r3 = (kotlin.Unit) r5;
        r3 = r6.f33686c;
        r2.C = r6;
        r2.D = r1;
        r2.E = r5;
        r2.F = r12;
        r2.I = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00cd, code lost:
        if (r3.D(r2) != r10) goto L_0x00d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00cf, code lost:
        return r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00d0, code lost:
        r7 = r6;
        r3 = r12;
        r6 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00d3, code lost:
        r1 = r7.f33686c;
        r2.C = r7;
        r2.D = r6;
        r2.E = r5;
        r2.F = r3;
        r2.I = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00e4, code lost:
        if (r1.H(r2) != r10) goto L_0x00e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00e6, code lost:
        return r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00e7, code lost:
        r1 = r7.f33685b;
        r2.C = r7;
        r2.D = r6;
        r2.E = r5;
        r2.F = r3;
        r2.I = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00f8, code lost:
        if (r1.n(r6, r2) != r10) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00fa, code lost:
        return r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00fb, code lost:
        r7 = r6.f33685b;
        r2.C = r6;
        r2.D = r5;
        r2.E = null;
        r2.F = r3;
        r2.I = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x010c, code lost:
        if (r7.p(r1, r2) != r10) goto L_0x010f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x010e, code lost:
        return r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x010f, code lost:
        r1 = r6.f33687d;
        r2.C = r5;
        r2.D = null;
        r2.I = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x011c, code lost:
        if (r1.a(r3, r2) != r10) goto L_0x011f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x011e, code lost:
        return r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x011f, code lost:
        r2 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        return r5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.String r16, java.math.BigDecimal r17, long r18, java.lang.String r20, kotlin.coroutines.Continuation r21) {
        /*
            r15 = this;
            r0 = r15
            r1 = r21
            boolean r2 = r1 instanceof com.hansecom.abt.data.useCases.AddBalanceUseCase$invoke$1
            if (r2 == 0) goto L_0x0016
            r2 = r1
            com.hansecom.abt.data.useCases.AddBalanceUseCase$invoke$1 r2 = (com.hansecom.abt.data.useCases.AddBalanceUseCase$invoke$1) r2
            int r3 = r2.I
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0016
            int r3 = r3 - r4
            r2.I = r3
            goto L_0x001b
        L_0x0016:
            com.hansecom.abt.data.useCases.AddBalanceUseCase$invoke$1 r2 = new com.hansecom.abt.data.useCases.AddBalanceUseCase$invoke$1
            r2.<init>(r15, r1)
        L_0x001b:
            java.lang.Object r1 = r2.G
            java.lang.Object r10 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r3 = r2.I
            r11 = 0
            switch(r3) {
                case 0: goto L_0x008f;
                case 1: goto L_0x0077;
                case 2: goto L_0x0067;
                case 3: goto L_0x0056;
                case 4: goto L_0x0043;
                case 5: goto L_0x0036;
                case 6: goto L_0x002f;
                default: goto L_0x0027;
            }
        L_0x0027:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x002f:
            java.lang.Object r2 = r2.C
            kotlin.ResultKt.b(r1)
            goto L_0x0120
        L_0x0036:
            long r3 = r2.F
            java.lang.Object r5 = r2.D
            java.lang.Object r6 = r2.C
            com.hansecom.abt.data.useCases.AddBalanceUseCase r6 = (com.hansecom.abt.data.useCases.AddBalanceUseCase) r6
            kotlin.ResultKt.b(r1)
            goto L_0x010f
        L_0x0043:
            long r3 = r2.F
            java.lang.Object r5 = r2.E
            java.lang.Object r6 = r2.D
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r2.C
            com.hansecom.abt.data.useCases.AddBalanceUseCase r7 = (com.hansecom.abt.data.useCases.AddBalanceUseCase) r7
            kotlin.ResultKt.b(r1)
        L_0x0052:
            r1 = r6
            r6 = r7
            goto L_0x00fb
        L_0x0056:
            long r3 = r2.F
            java.lang.Object r5 = r2.E
            java.lang.Object r6 = r2.D
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r2.C
            com.hansecom.abt.data.useCases.AddBalanceUseCase r7 = (com.hansecom.abt.data.useCases.AddBalanceUseCase) r7
            kotlin.ResultKt.b(r1)
            goto L_0x00e7
        L_0x0067:
            long r3 = r2.F
            java.lang.Object r5 = r2.E
            java.lang.Object r6 = r2.D
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r2.C
            com.hansecom.abt.data.useCases.AddBalanceUseCase r7 = (com.hansecom.abt.data.useCases.AddBalanceUseCase) r7
            kotlin.ResultKt.b(r1)
            goto L_0x00d3
        L_0x0077:
            long r3 = r2.F
            java.lang.Object r5 = r2.D
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r2.C
            com.hansecom.abt.data.useCases.AddBalanceUseCase r6 = (com.hansecom.abt.data.useCases.AddBalanceUseCase) r6
            kotlin.ResultKt.b(r1)
            kotlin.Result r1 = (kotlin.Result) r1
            java.lang.Object r1 = r1.j()
            r12 = r3
            r14 = r5
            r5 = r1
            r1 = r14
            goto L_0x00b3
        L_0x008f:
            kotlin.ResultKt.b(r1)
            com.hansecom.abt.data.managers.PurchaseManager r3 = r0.f33684a
            r2.C = r0
            r1 = r16
            r2.D = r1
            r12 = r18
            r2.F = r12
            r4 = 1
            r2.I = r4
            r4 = r16
            r5 = r17
            r6 = r18
            r8 = r20
            r9 = r2
            java.lang.Object r3 = r3.b(r4, r5, r6, r8, r9)
            if (r3 != r10) goto L_0x00b1
            return r10
        L_0x00b1:
            r6 = r0
            r5 = r3
        L_0x00b3:
            boolean r3 = kotlin.Result.h(r5)
            if (r3 == 0) goto L_0x0121
            r3 = r5
            kotlin.Unit r3 = (kotlin.Unit) r3
            com.hansecom.abt.data.repositories.FareMediaRepository r3 = r6.f33686c
            r2.C = r6
            r2.D = r1
            r2.E = r5
            r2.F = r12
            r4 = 2
            r2.I = r4
            java.lang.Object r3 = r3.D(r2)
            if (r3 != r10) goto L_0x00d0
            return r10
        L_0x00d0:
            r7 = r6
            r3 = r12
            r6 = r1
        L_0x00d3:
            com.hansecom.abt.data.repositories.FareMediaRepository r1 = r7.f33686c
            r2.C = r7
            r2.D = r6
            r2.E = r5
            r2.F = r3
            r8 = 3
            r2.I = r8
            java.lang.Object r1 = r1.H(r2)
            if (r1 != r10) goto L_0x00e7
            return r10
        L_0x00e7:
            com.hansecom.abt.data.repositories.CardHistoryRepository r1 = r7.f33685b
            r2.C = r7
            r2.D = r6
            r2.E = r5
            r2.F = r3
            r8 = 4
            r2.I = r8
            java.lang.Object r1 = r1.n(r6, r2)
            if (r1 != r10) goto L_0x0052
            return r10
        L_0x00fb:
            com.hansecom.abt.data.repositories.CardHistoryRepository r7 = r6.f33685b
            r2.C = r6
            r2.D = r5
            r2.E = r11
            r2.F = r3
            r8 = 5
            r2.I = r8
            java.lang.Object r1 = r7.p(r1, r2)
            if (r1 != r10) goto L_0x010f
            return r10
        L_0x010f:
            com.hansecom.abt.data.useCases.paymentMethods.SaveCreditCardAsDefaultPaymentMethodUseCase r1 = r6.f33687d
            r2.C = r5
            r2.D = r11
            r6 = 6
            r2.I = r6
            java.lang.Object r1 = r1.a(r3, r2)
            if (r1 != r10) goto L_0x011f
            return r10
        L_0x011f:
            r2 = r5
        L_0x0120:
            r5 = r2
        L_0x0121:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.useCases.AddBalanceUseCase.a(java.lang.String, java.math.BigDecimal, long, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
