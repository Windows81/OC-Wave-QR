package com.hansecom.abt.data.useCases;

import com.hansecom.abt.data.managers.PurchaseManager;
import com.hansecom.abt.data.preferences.AppPreferences;
import com.hansecom.abt.data.repositories.CardHistoryRepository;
import com.hansecom.abt.data.repositories.FareMediaRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class AddBalanceWithGooglePayUseCase {

    /* renamed from: a  reason: collision with root package name */
    public final PurchaseManager f33692a;

    /* renamed from: b  reason: collision with root package name */
    public final CardHistoryRepository f33693b;

    /* renamed from: c  reason: collision with root package name */
    public final FareMediaRepository f33694c;

    /* renamed from: d  reason: collision with root package name */
    public final AppPreferences f33695d;

    public AddBalanceWithGooglePayUseCase(PurchaseManager purchaseManager, CardHistoryRepository cardHistoryRepository, FareMediaRepository fareMediaRepository, AppPreferences appPreferences) {
        Intrinsics.i(purchaseManager, "purchaseManager");
        Intrinsics.i(cardHistoryRepository, "cardHistoryRepository");
        Intrinsics.i(fareMediaRepository, "fareMediaRepository");
        Intrinsics.i(appPreferences, "appPreferences");
        this.f33692a = purchaseManager;
        this.f33693b = cardHistoryRepository;
        this.f33694c = fareMediaRepository;
        this.f33695d = appPreferences;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004b, code lost:
        r9 = r13;
        r13 = r12;
        r12 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00a3, code lost:
        if (kotlin.Result.h(r11) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00a5, code lost:
        r14 = (kotlin.Unit) r11;
        r14 = r13.f33694c;
        r0.C = r13;
        r0.D = r12;
        r0.E = r11;
        r0.H = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00b7, code lost:
        if (r14.D(r0) != r7) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00b9, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00ba, code lost:
        r14 = r13.f33694c;
        r0.C = r13;
        r0.D = r12;
        r0.E = r11;
        r0.H = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00c9, code lost:
        if (r14.H(r0) != r7) goto L_0x00cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00cb, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00cc, code lost:
        r14 = r13.f33693b;
        r0.C = r13;
        r0.D = r12;
        r0.E = r11;
        r0.H = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00db, code lost:
        if (r14.n(r12, r0) != r7) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00dd, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00de, code lost:
        r14 = r12.f33693b;
        r0.C = r12;
        r0.D = r11;
        r0.E = null;
        r0.H = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ed, code lost:
        if (r14.p(r13, r0) != r7) goto L_0x00f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ef, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00f0, code lost:
        r12 = r12.f33695d;
        r13 = com.hansecom.abt.data.localDomain.PaymentMethodType.GOOGLE_PAY;
        r0.C = r11;
        r0.D = null;
        r0.H = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ff, code lost:
        if (r12.g(r13, r0) != r7) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0101, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        return r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        return r11;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.String r11, java.math.BigDecimal r12, com.google.android.gms.wallet.PaymentData r13, java.lang.String r14, kotlin.coroutines.Continuation r15) {
        /*
            r10 = this;
            boolean r0 = r15 instanceof com.hansecom.abt.data.useCases.AddBalanceWithGooglePayUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r15
            com.hansecom.abt.data.useCases.AddBalanceWithGooglePayUseCase$invoke$1 r0 = (com.hansecom.abt.data.useCases.AddBalanceWithGooglePayUseCase$invoke$1) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.H = r1
            goto L_0x0018
        L_0x0013:
            com.hansecom.abt.data.useCases.AddBalanceWithGooglePayUseCase$invoke$1 r0 = new com.hansecom.abt.data.useCases.AddBalanceWithGooglePayUseCase$invoke$1
            r0.<init>(r10, r15)
        L_0x0018:
            java.lang.Object r15 = r0.F
            java.lang.Object r7 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r1 = r0.H
            r8 = 0
            switch(r1) {
                case 0: goto L_0x0083;
                case 1: goto L_0x006d;
                case 2: goto L_0x005f;
                case 3: goto L_0x0050;
                case 4: goto L_0x003e;
                case 5: goto L_0x0033;
                case 6: goto L_0x002c;
                default: goto L_0x0024;
            }
        L_0x0024:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x002c:
            java.lang.Object r11 = r0.C
            kotlin.ResultKt.b(r15)
            goto L_0x0102
        L_0x0033:
            java.lang.Object r11 = r0.D
            java.lang.Object r12 = r0.C
            com.hansecom.abt.data.useCases.AddBalanceWithGooglePayUseCase r12 = (com.hansecom.abt.data.useCases.AddBalanceWithGooglePayUseCase) r12
            kotlin.ResultKt.b(r15)
            goto L_0x00f0
        L_0x003e:
            java.lang.Object r11 = r0.E
            java.lang.Object r12 = r0.D
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r13 = r0.C
            com.hansecom.abt.data.useCases.AddBalanceWithGooglePayUseCase r13 = (com.hansecom.abt.data.useCases.AddBalanceWithGooglePayUseCase) r13
            kotlin.ResultKt.b(r15)
        L_0x004b:
            r9 = r13
            r13 = r12
            r12 = r9
            goto L_0x00de
        L_0x0050:
            java.lang.Object r11 = r0.E
            java.lang.Object r12 = r0.D
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r13 = r0.C
            com.hansecom.abt.data.useCases.AddBalanceWithGooglePayUseCase r13 = (com.hansecom.abt.data.useCases.AddBalanceWithGooglePayUseCase) r13
            kotlin.ResultKt.b(r15)
            goto L_0x00cc
        L_0x005f:
            java.lang.Object r11 = r0.E
            java.lang.Object r12 = r0.D
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r13 = r0.C
            com.hansecom.abt.data.useCases.AddBalanceWithGooglePayUseCase r13 = (com.hansecom.abt.data.useCases.AddBalanceWithGooglePayUseCase) r13
            kotlin.ResultKt.b(r15)
            goto L_0x00ba
        L_0x006d:
            java.lang.Object r11 = r0.D
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r12 = r0.C
            com.hansecom.abt.data.useCases.AddBalanceWithGooglePayUseCase r12 = (com.hansecom.abt.data.useCases.AddBalanceWithGooglePayUseCase) r12
            kotlin.ResultKt.b(r15)
            kotlin.Result r15 = (kotlin.Result) r15
            java.lang.Object r13 = r15.j()
            r9 = r12
            r12 = r11
            r11 = r13
            r13 = r9
            goto L_0x009f
        L_0x0083:
            kotlin.ResultKt.b(r15)
            com.hansecom.abt.data.managers.PurchaseManager r1 = r10.f33692a
            r0.C = r10
            r0.D = r11
            r15 = 1
            r0.H = r15
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r0
            java.lang.Object r12 = r1.c(r2, r3, r4, r5, r6)
            if (r12 != r7) goto L_0x009b
            return r7
        L_0x009b:
            r13 = r10
            r9 = r12
            r12 = r11
            r11 = r9
        L_0x009f:
            boolean r14 = kotlin.Result.h(r11)
            if (r14 == 0) goto L_0x0102
            r14 = r11
            kotlin.Unit r14 = (kotlin.Unit) r14
            com.hansecom.abt.data.repositories.FareMediaRepository r14 = r13.f33694c
            r0.C = r13
            r0.D = r12
            r0.E = r11
            r15 = 2
            r0.H = r15
            java.lang.Object r14 = r14.D(r0)
            if (r14 != r7) goto L_0x00ba
            return r7
        L_0x00ba:
            com.hansecom.abt.data.repositories.FareMediaRepository r14 = r13.f33694c
            r0.C = r13
            r0.D = r12
            r0.E = r11
            r15 = 3
            r0.H = r15
            java.lang.Object r14 = r14.H(r0)
            if (r14 != r7) goto L_0x00cc
            return r7
        L_0x00cc:
            com.hansecom.abt.data.repositories.CardHistoryRepository r14 = r13.f33693b
            r0.C = r13
            r0.D = r12
            r0.E = r11
            r15 = 4
            r0.H = r15
            java.lang.Object r14 = r14.n(r12, r0)
            if (r14 != r7) goto L_0x004b
            return r7
        L_0x00de:
            com.hansecom.abt.data.repositories.CardHistoryRepository r14 = r12.f33693b
            r0.C = r12
            r0.D = r11
            r0.E = r8
            r15 = 5
            r0.H = r15
            java.lang.Object r13 = r14.p(r13, r0)
            if (r13 != r7) goto L_0x00f0
            return r7
        L_0x00f0:
            com.hansecom.abt.data.preferences.AppPreferences r12 = r12.f33695d
            com.hansecom.abt.data.localDomain.PaymentMethodType r13 = com.hansecom.abt.data.localDomain.PaymentMethodType.GOOGLE_PAY
            r0.C = r11
            r0.D = r8
            r14 = 6
            r0.H = r14
            java.lang.Object r12 = r12.g(r13, r0)
            if (r12 != r7) goto L_0x0102
            return r7
        L_0x0102:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.useCases.AddBalanceWithGooglePayUseCase.a(java.lang.String, java.math.BigDecimal, com.google.android.gms.wallet.PaymentData, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
