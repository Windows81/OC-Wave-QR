package com.hansecom.abt.data.useCases.passes;

import com.hansecom.abt.data.managers.PurchaseManager;
import com.hansecom.abt.data.preferences.AppPreferences;
import com.hansecom.abt.data.repositories.CardHistoryRepository;
import com.hansecom.abt.data.repositories.FareMediaPassesRepository;
import com.hansecom.abt.data.repositories.generalData.FareMediaPassesToOfferRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class PurchasePassWithGooglePayUseCase {

    /* renamed from: a  reason: collision with root package name */
    public final PurchaseManager f34018a;

    /* renamed from: b  reason: collision with root package name */
    public final CardHistoryRepository f34019b;

    /* renamed from: c  reason: collision with root package name */
    public final FareMediaPassesRepository f34020c;

    /* renamed from: d  reason: collision with root package name */
    public final FareMediaPassesToOfferRepository f34021d;

    /* renamed from: e  reason: collision with root package name */
    public final AppPreferences f34022e;

    public PurchasePassWithGooglePayUseCase(PurchaseManager purchaseManager, CardHistoryRepository cardHistoryRepository, FareMediaPassesRepository fareMediaPassesRepository, FareMediaPassesToOfferRepository fareMediaPassesToOfferRepository, AppPreferences appPreferences) {
        Intrinsics.i(purchaseManager, "purchaseManager");
        Intrinsics.i(cardHistoryRepository, "cardHistoryRepository");
        Intrinsics.i(fareMediaPassesRepository, "passesRepository");
        Intrinsics.i(fareMediaPassesToOfferRepository, "fareMediaPassesToOfferRepository");
        Intrinsics.i(appPreferences, "appPreferences");
        this.f34018a = purchaseManager;
        this.f34019b = cardHistoryRepository;
        this.f34020c = fareMediaPassesRepository;
        this.f34021d = fareMediaPassesToOfferRepository;
        this.f34022e = appPreferences;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004e, code lost:
        r1 = r4;
        r4 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00a4, code lost:
        if (kotlin.Result.h(r3) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00a6, code lost:
        r5 = (kotlin.Unit) r3;
        r5 = r4.f34020c;
        r2.C = r4;
        r2.D = r1;
        r2.E = r3;
        r2.H = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00b8, code lost:
        if (r5.a(r1, r2) != r9) goto L_0x00bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00ba, code lost:
        return r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00bb, code lost:
        r5 = r4;
        r4 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00bd, code lost:
        r1 = r5.f34020c;
        r2.C = r5;
        r2.D = r4;
        r2.E = r3;
        r2.H = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00cc, code lost:
        if (r1.p(r4, r2) != r9) goto L_0x00cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ce, code lost:
        return r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00cf, code lost:
        r1 = r5.f34019b;
        r2.C = r5;
        r2.D = r4;
        r2.E = r3;
        r2.H = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00de, code lost:
        if (r1.n(r4, r2) != r9) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00e0, code lost:
        return r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00e1, code lost:
        r5 = r4.f34021d;
        r2.C = r4;
        r2.D = r3;
        r2.E = null;
        r2.H = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00f0, code lost:
        if (r5.n(r1, r2) != r9) goto L_0x00f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00f2, code lost:
        return r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00f3, code lost:
        r1 = r4.f34022e;
        r4 = com.hansecom.abt.data.localDomain.PaymentMethodType.GOOGLE_PAY;
        r2.C = r3;
        r2.D = null;
        r2.H = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0102, code lost:
        if (r1.g(r4, r2) != r9) goto L_0x0105;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0104, code lost:
        return r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0105, code lost:
        r2 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        return r3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.String r13, java.lang.String r14, com.google.android.gms.wallet.PaymentData r15, java.lang.Integer r16, java.lang.String r17, kotlin.coroutines.Continuation r18) {
        /*
            r12 = this;
            r0 = r12
            r1 = r18
            boolean r2 = r1 instanceof com.hansecom.abt.data.useCases.passes.PurchasePassWithGooglePayUseCase$invoke$1
            if (r2 == 0) goto L_0x0016
            r2 = r1
            com.hansecom.abt.data.useCases.passes.PurchasePassWithGooglePayUseCase$invoke$1 r2 = (com.hansecom.abt.data.useCases.passes.PurchasePassWithGooglePayUseCase$invoke$1) r2
            int r3 = r2.H
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0016
            int r3 = r3 - r4
            r2.H = r3
            goto L_0x001b
        L_0x0016:
            com.hansecom.abt.data.useCases.passes.PurchasePassWithGooglePayUseCase$invoke$1 r2 = new com.hansecom.abt.data.useCases.passes.PurchasePassWithGooglePayUseCase$invoke$1
            r2.<init>(r12, r1)
        L_0x001b:
            java.lang.Object r1 = r2.F
            java.lang.Object r9 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r3 = r2.H
            r10 = 0
            switch(r3) {
                case 0: goto L_0x0084;
                case 1: goto L_0x006f;
                case 2: goto L_0x0061;
                case 3: goto L_0x0052;
                case 4: goto L_0x0041;
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
            goto L_0x0106
        L_0x0036:
            java.lang.Object r3 = r2.D
            java.lang.Object r4 = r2.C
            com.hansecom.abt.data.useCases.passes.PurchasePassWithGooglePayUseCase r4 = (com.hansecom.abt.data.useCases.passes.PurchasePassWithGooglePayUseCase) r4
            kotlin.ResultKt.b(r1)
            goto L_0x00f3
        L_0x0041:
            java.lang.Object r3 = r2.E
            java.lang.Object r4 = r2.D
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r2.C
            com.hansecom.abt.data.useCases.passes.PurchasePassWithGooglePayUseCase r5 = (com.hansecom.abt.data.useCases.passes.PurchasePassWithGooglePayUseCase) r5
            kotlin.ResultKt.b(r1)
        L_0x004e:
            r1 = r4
            r4 = r5
            goto L_0x00e1
        L_0x0052:
            java.lang.Object r3 = r2.E
            java.lang.Object r4 = r2.D
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r2.C
            com.hansecom.abt.data.useCases.passes.PurchasePassWithGooglePayUseCase r5 = (com.hansecom.abt.data.useCases.passes.PurchasePassWithGooglePayUseCase) r5
            kotlin.ResultKt.b(r1)
            goto L_0x00cf
        L_0x0061:
            java.lang.Object r3 = r2.E
            java.lang.Object r4 = r2.D
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r2.C
            com.hansecom.abt.data.useCases.passes.PurchasePassWithGooglePayUseCase r5 = (com.hansecom.abt.data.useCases.passes.PurchasePassWithGooglePayUseCase) r5
            kotlin.ResultKt.b(r1)
            goto L_0x00bd
        L_0x006f:
            java.lang.Object r3 = r2.D
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r2.C
            com.hansecom.abt.data.useCases.passes.PurchasePassWithGooglePayUseCase r4 = (com.hansecom.abt.data.useCases.passes.PurchasePassWithGooglePayUseCase) r4
            kotlin.ResultKt.b(r1)
            kotlin.Result r1 = (kotlin.Result) r1
            java.lang.Object r1 = r1.j()
            r11 = r3
            r3 = r1
            r1 = r11
            goto L_0x00a0
        L_0x0084:
            kotlin.ResultKt.b(r1)
            com.hansecom.abt.data.managers.PurchaseManager r3 = r0.f34018a
            r2.C = r0
            r1 = r13
            r2.D = r1
            r4 = 1
            r2.H = r4
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r2
            java.lang.Object r3 = r3.h(r4, r5, r6, r7, r8)
            if (r3 != r9) goto L_0x009f
            return r9
        L_0x009f:
            r4 = r0
        L_0x00a0:
            boolean r5 = kotlin.Result.h(r3)
            if (r5 == 0) goto L_0x0107
            r5 = r3
            kotlin.Unit r5 = (kotlin.Unit) r5
            com.hansecom.abt.data.repositories.FareMediaPassesRepository r5 = r4.f34020c
            r2.C = r4
            r2.D = r1
            r2.E = r3
            r6 = 2
            r2.H = r6
            java.lang.Object r5 = r5.a(r1, r2)
            if (r5 != r9) goto L_0x00bb
            return r9
        L_0x00bb:
            r5 = r4
            r4 = r1
        L_0x00bd:
            com.hansecom.abt.data.repositories.FareMediaPassesRepository r1 = r5.f34020c
            r2.C = r5
            r2.D = r4
            r2.E = r3
            r6 = 3
            r2.H = r6
            java.lang.Object r1 = r1.p(r4, r2)
            if (r1 != r9) goto L_0x00cf
            return r9
        L_0x00cf:
            com.hansecom.abt.data.repositories.CardHistoryRepository r1 = r5.f34019b
            r2.C = r5
            r2.D = r4
            r2.E = r3
            r6 = 4
            r2.H = r6
            java.lang.Object r1 = r1.n(r4, r2)
            if (r1 != r9) goto L_0x004e
            return r9
        L_0x00e1:
            com.hansecom.abt.data.repositories.generalData.FareMediaPassesToOfferRepository r5 = r4.f34021d
            r2.C = r4
            r2.D = r3
            r2.E = r10
            r6 = 5
            r2.H = r6
            java.lang.Object r1 = r5.n(r1, r2)
            if (r1 != r9) goto L_0x00f3
            return r9
        L_0x00f3:
            com.hansecom.abt.data.preferences.AppPreferences r1 = r4.f34022e
            com.hansecom.abt.data.localDomain.PaymentMethodType r4 = com.hansecom.abt.data.localDomain.PaymentMethodType.GOOGLE_PAY
            r2.C = r3
            r2.D = r10
            r5 = 6
            r2.H = r5
            java.lang.Object r1 = r1.g(r4, r2)
            if (r1 != r9) goto L_0x0105
            return r9
        L_0x0105:
            r2 = r3
        L_0x0106:
            r3 = r2
        L_0x0107:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.useCases.passes.PurchasePassWithGooglePayUseCase.a(java.lang.String, java.lang.String, com.google.android.gms.wallet.PaymentData, java.lang.Integer, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
