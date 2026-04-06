package com.hansecom.abt.data.useCases.passes;

import com.hansecom.abt.data.managers.PurchaseManager;
import com.hansecom.abt.data.repositories.CardHistoryRepository;
import com.hansecom.abt.data.repositories.FareMediaPassesRepository;
import com.hansecom.abt.data.repositories.generalData.FareMediaPassesToOfferRepository;
import com.hansecom.abt.data.useCases.paymentMethods.SaveCreditCardAsDefaultPaymentMethodUseCase;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class PurchasePassUseCase {

    /* renamed from: a  reason: collision with root package name */
    public final PurchaseManager f34000a;

    /* renamed from: b  reason: collision with root package name */
    public final CardHistoryRepository f34001b;

    /* renamed from: c  reason: collision with root package name */
    public final FareMediaPassesRepository f34002c;

    /* renamed from: d  reason: collision with root package name */
    public final FareMediaPassesToOfferRepository f34003d;

    /* renamed from: e  reason: collision with root package name */
    public final SaveCreditCardAsDefaultPaymentMethodUseCase f34004e;

    public PurchasePassUseCase(PurchaseManager purchaseManager, CardHistoryRepository cardHistoryRepository, FareMediaPassesRepository fareMediaPassesRepository, FareMediaPassesToOfferRepository fareMediaPassesToOfferRepository, SaveCreditCardAsDefaultPaymentMethodUseCase saveCreditCardAsDefaultPaymentMethodUseCase) {
        Intrinsics.i(purchaseManager, "purchaseManager");
        Intrinsics.i(cardHistoryRepository, "cardHistoryRepository");
        Intrinsics.i(fareMediaPassesRepository, "passesRepository");
        Intrinsics.i(fareMediaPassesToOfferRepository, "fareMediaPassesToOfferRepository");
        Intrinsics.i(saveCreditCardAsDefaultPaymentMethodUseCase, "saveCreditCardAsDefaultPaymentMethodUseCase");
        this.f34000a = purchaseManager;
        this.f34001b = cardHistoryRepository;
        this.f34002c = fareMediaPassesRepository;
        this.f34003d = fareMediaPassesToOfferRepository;
        this.f34004e = saveCreditCardAsDefaultPaymentMethodUseCase;
    }

    public static /* synthetic */ Object b(PurchasePassUseCase purchasePassUseCase, String str, String str2, Long l2, Integer num, String str3, Continuation continuation, int i2, Object obj) {
        return purchasePassUseCase.a(str, str2, (i2 & 4) != 0 ? null : l2, (i2 & 8) != 0 ? null : num, (i2 & 16) != 0 ? null : str3, continuation);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0056, code lost:
        r1 = r5;
        r5 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00c2, code lost:
        if (kotlin.Result.h(r3) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00c4, code lost:
        r4 = (kotlin.Unit) r3;
        r4 = r5.f34002c;
        r2.C = r5;
        r2.D = r1;
        r2.E = r14;
        r2.F = r3;
        r2.I = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00d8, code lost:
        if (r4.a(r1, r2) != r12) goto L_0x00db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00da, code lost:
        return r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00db, code lost:
        r6 = r5;
        r4 = r14;
        r5 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00de, code lost:
        r1 = r6.f34002c;
        r2.C = r6;
        r2.D = r5;
        r2.E = r4;
        r2.F = r3;
        r2.I = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00ef, code lost:
        if (r1.p(r5, r2) != r12) goto L_0x00f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00f1, code lost:
        return r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00f2, code lost:
        r1 = r6.f34001b;
        r2.C = r6;
        r2.D = r5;
        r2.E = r4;
        r2.F = r3;
        r2.I = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0103, code lost:
        if (r1.n(r5, r2) != r12) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0105, code lost:
        return r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0106, code lost:
        r6 = r5.f34003d;
        r2.C = r5;
        r2.D = r4;
        r2.E = r3;
        r2.F = null;
        r2.I = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0117, code lost:
        if (r6.n(r1, r2) != r12) goto L_0x011a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0119, code lost:
        return r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x011a, code lost:
        if (r4 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x011c, code lost:
        r1 = r5.f34004e;
        r4 = r4.longValue();
        r2.C = r3;
        r2.D = null;
        r2.E = null;
        r2.I = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x012f, code lost:
        if (r1.a(r4, r2) != r12) goto L_0x0132;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0131, code lost:
        return r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0132, code lost:
        r2 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        return r3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.String r16, java.lang.String r17, java.lang.Long r18, java.lang.Integer r19, java.lang.String r20, kotlin.coroutines.Continuation r21) {
        /*
            r15 = this;
            r0 = r15
            r1 = r21
            boolean r2 = r1 instanceof com.hansecom.abt.data.useCases.passes.PurchasePassUseCase$invoke$1
            if (r2 == 0) goto L_0x0016
            r2 = r1
            com.hansecom.abt.data.useCases.passes.PurchasePassUseCase$invoke$1 r2 = (com.hansecom.abt.data.useCases.passes.PurchasePassUseCase$invoke$1) r2
            int r3 = r2.I
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0016
            int r3 = r3 - r4
            r2.I = r3
            goto L_0x001b
        L_0x0016:
            com.hansecom.abt.data.useCases.passes.PurchasePassUseCase$invoke$1 r2 = new com.hansecom.abt.data.useCases.passes.PurchasePassUseCase$invoke$1
            r2.<init>(r15, r1)
        L_0x001b:
            java.lang.Object r1 = r2.G
            java.lang.Object r12 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r3 = r2.I
            r13 = 0
            switch(r3) {
                case 0: goto L_0x0098;
                case 1: goto L_0x007f;
                case 2: goto L_0x006d;
                case 3: goto L_0x005a;
                case 4: goto L_0x0045;
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
            goto L_0x0133
        L_0x0036:
            java.lang.Object r3 = r2.E
            java.lang.Object r4 = r2.D
            java.lang.Long r4 = (java.lang.Long) r4
            java.lang.Object r5 = r2.C
            com.hansecom.abt.data.useCases.passes.PurchasePassUseCase r5 = (com.hansecom.abt.data.useCases.passes.PurchasePassUseCase) r5
            kotlin.ResultKt.b(r1)
            goto L_0x011a
        L_0x0045:
            java.lang.Object r3 = r2.F
            java.lang.Object r4 = r2.E
            java.lang.Long r4 = (java.lang.Long) r4
            java.lang.Object r5 = r2.D
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r2.C
            com.hansecom.abt.data.useCases.passes.PurchasePassUseCase r6 = (com.hansecom.abt.data.useCases.passes.PurchasePassUseCase) r6
            kotlin.ResultKt.b(r1)
        L_0x0056:
            r1 = r5
            r5 = r6
            goto L_0x0106
        L_0x005a:
            java.lang.Object r3 = r2.F
            java.lang.Object r4 = r2.E
            java.lang.Long r4 = (java.lang.Long) r4
            java.lang.Object r5 = r2.D
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r2.C
            com.hansecom.abt.data.useCases.passes.PurchasePassUseCase r6 = (com.hansecom.abt.data.useCases.passes.PurchasePassUseCase) r6
            kotlin.ResultKt.b(r1)
            goto L_0x00f2
        L_0x006d:
            java.lang.Object r3 = r2.F
            java.lang.Object r4 = r2.E
            java.lang.Long r4 = (java.lang.Long) r4
            java.lang.Object r5 = r2.D
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r2.C
            com.hansecom.abt.data.useCases.passes.PurchasePassUseCase r6 = (com.hansecom.abt.data.useCases.passes.PurchasePassUseCase) r6
            kotlin.ResultKt.b(r1)
            goto L_0x00de
        L_0x007f:
            java.lang.Object r3 = r2.E
            java.lang.Long r3 = (java.lang.Long) r3
            java.lang.Object r4 = r2.D
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r2.C
            com.hansecom.abt.data.useCases.passes.PurchasePassUseCase r5 = (com.hansecom.abt.data.useCases.passes.PurchasePassUseCase) r5
            kotlin.ResultKt.b(r1)
            kotlin.Result r1 = (kotlin.Result) r1
            java.lang.Object r1 = r1.j()
            r14 = r3
            r3 = r1
            r1 = r4
            goto L_0x00be
        L_0x0098:
            kotlin.ResultKt.b(r1)
            com.hansecom.abt.data.managers.PurchaseManager r3 = r0.f34000a
            r2.C = r0
            r1 = r16
            r2.D = r1
            r14 = r18
            r2.E = r14
            r4 = 1
            r2.I = r4
            r6 = 0
            r10 = 4
            r11 = 0
            r4 = r17
            r5 = r18
            r7 = r19
            r8 = r20
            r9 = r2
            java.lang.Object r3 = com.hansecom.abt.data.managers.PurchaseManager.g(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            if (r3 != r12) goto L_0x00bd
            return r12
        L_0x00bd:
            r5 = r0
        L_0x00be:
            boolean r4 = kotlin.Result.h(r3)
            if (r4 == 0) goto L_0x0134
            r4 = r3
            kotlin.Unit r4 = (kotlin.Unit) r4
            com.hansecom.abt.data.repositories.FareMediaPassesRepository r4 = r5.f34002c
            r2.C = r5
            r2.D = r1
            r2.E = r14
            r2.F = r3
            r6 = 2
            r2.I = r6
            java.lang.Object r4 = r4.a(r1, r2)
            if (r4 != r12) goto L_0x00db
            return r12
        L_0x00db:
            r6 = r5
            r4 = r14
            r5 = r1
        L_0x00de:
            com.hansecom.abt.data.repositories.FareMediaPassesRepository r1 = r6.f34002c
            r2.C = r6
            r2.D = r5
            r2.E = r4
            r2.F = r3
            r7 = 3
            r2.I = r7
            java.lang.Object r1 = r1.p(r5, r2)
            if (r1 != r12) goto L_0x00f2
            return r12
        L_0x00f2:
            com.hansecom.abt.data.repositories.CardHistoryRepository r1 = r6.f34001b
            r2.C = r6
            r2.D = r5
            r2.E = r4
            r2.F = r3
            r7 = 4
            r2.I = r7
            java.lang.Object r1 = r1.n(r5, r2)
            if (r1 != r12) goto L_0x0056
            return r12
        L_0x0106:
            com.hansecom.abt.data.repositories.generalData.FareMediaPassesToOfferRepository r6 = r5.f34003d
            r2.C = r5
            r2.D = r4
            r2.E = r3
            r2.F = r13
            r7 = 5
            r2.I = r7
            java.lang.Object r1 = r6.n(r1, r2)
            if (r1 != r12) goto L_0x011a
            return r12
        L_0x011a:
            if (r4 == 0) goto L_0x0134
            com.hansecom.abt.data.useCases.paymentMethods.SaveCreditCardAsDefaultPaymentMethodUseCase r1 = r5.f34004e
            long r4 = r4.longValue()
            r2.C = r3
            r2.D = r13
            r2.E = r13
            r6 = 6
            r2.I = r6
            java.lang.Object r1 = r1.a(r4, r2)
            if (r1 != r12) goto L_0x0132
            return r12
        L_0x0132:
            r2 = r3
        L_0x0133:
            r3 = r2
        L_0x0134:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.useCases.passes.PurchasePassUseCase.a(java.lang.String, java.lang.String, java.lang.Long, java.lang.Integer, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
