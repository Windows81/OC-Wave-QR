package com.hansecom.abt.data.useCases.passes;

import com.hansecom.abt.data.managers.PurchaseManager;
import com.hansecom.abt.data.repositories.CardHistoryRepository;
import com.hansecom.abt.data.repositories.FareMediaPassesRepository;
import com.hansecom.abt.data.repositories.generalData.FareMediaPassesToOfferRepository;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class PurchasePassWithFareMediaUseCase {

    /* renamed from: a  reason: collision with root package name */
    public final PurchaseManager f34010a;

    /* renamed from: b  reason: collision with root package name */
    public final CardHistoryRepository f34011b;

    /* renamed from: c  reason: collision with root package name */
    public final FareMediaPassesRepository f34012c;

    /* renamed from: d  reason: collision with root package name */
    public final FareMediaPassesToOfferRepository f34013d;

    public PurchasePassWithFareMediaUseCase(PurchaseManager purchaseManager, CardHistoryRepository cardHistoryRepository, FareMediaPassesRepository fareMediaPassesRepository, FareMediaPassesToOfferRepository fareMediaPassesToOfferRepository) {
        Intrinsics.i(purchaseManager, "purchaseManager");
        Intrinsics.i(cardHistoryRepository, "cardHistoryRepository");
        Intrinsics.i(fareMediaPassesRepository, "passesRepository");
        Intrinsics.i(fareMediaPassesToOfferRepository, "fareMediaPassesToOfferRepository");
        this.f34010a = purchaseManager;
        this.f34011b = cardHistoryRepository;
        this.f34012c = fareMediaPassesRepository;
        this.f34013d = fareMediaPassesToOfferRepository;
    }

    public static /* synthetic */ Object b(PurchasePassWithFareMediaUseCase purchasePassWithFareMediaUseCase, String str, String str2, Long l2, Integer num, String str3, Continuation continuation, int i2, Object obj) {
        return purchasePassWithFareMediaUseCase.a(str, str2, (i2 & 4) != 0 ? null : l2, (i2 & 8) != 0 ? null : num, (i2 & 16) != 0 ? null : str3, continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00cf A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00e0 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00f2 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.String r17, java.lang.String r18, java.lang.Long r19, java.lang.Integer r20, java.lang.String r21, kotlin.coroutines.Continuation r22) {
        /*
            r16 = this;
            r0 = r16
            r1 = r22
            boolean r2 = r1 instanceof com.hansecom.abt.data.useCases.passes.PurchasePassWithFareMediaUseCase$invoke$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.hansecom.abt.data.useCases.passes.PurchasePassWithFareMediaUseCase$invoke$1 r2 = (com.hansecom.abt.data.useCases.passes.PurchasePassWithFareMediaUseCase$invoke$1) r2
            int r3 = r2.H
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.H = r3
            goto L_0x001c
        L_0x0017:
            com.hansecom.abt.data.useCases.passes.PurchasePassWithFareMediaUseCase$invoke$1 r2 = new com.hansecom.abt.data.useCases.passes.PurchasePassWithFareMediaUseCase$invoke$1
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.F
            java.lang.Object r10 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r3 = r2.H
            r11 = 5
            r12 = 4
            r13 = 3
            r14 = 2
            r4 = 1
            if (r3 == 0) goto L_0x0086
            if (r3 == r4) goto L_0x0070
            if (r3 == r14) goto L_0x0062
            if (r3 == r13) goto L_0x0053
            if (r3 == r12) goto L_0x0044
            if (r3 != r11) goto L_0x003c
            java.lang.Object r2 = r2.C
            kotlin.ResultKt.b(r1)
            goto L_0x00f4
        L_0x003c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0044:
            java.lang.Object r3 = r2.E
            java.lang.Object r4 = r2.D
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r2.C
            com.hansecom.abt.data.useCases.passes.PurchasePassWithFareMediaUseCase r5 = (com.hansecom.abt.data.useCases.passes.PurchasePassWithFareMediaUseCase) r5
            kotlin.ResultKt.b(r1)
            goto L_0x00e1
        L_0x0053:
            java.lang.Object r3 = r2.E
            java.lang.Object r4 = r2.D
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r2.C
            com.hansecom.abt.data.useCases.passes.PurchasePassWithFareMediaUseCase r5 = (com.hansecom.abt.data.useCases.passes.PurchasePassWithFareMediaUseCase) r5
            kotlin.ResultKt.b(r1)
            goto L_0x00d0
        L_0x0062:
            java.lang.Object r3 = r2.E
            java.lang.Object r4 = r2.D
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r2.C
            com.hansecom.abt.data.useCases.passes.PurchasePassWithFareMediaUseCase r5 = (com.hansecom.abt.data.useCases.passes.PurchasePassWithFareMediaUseCase) r5
            kotlin.ResultKt.b(r1)
            goto L_0x00bf
        L_0x0070:
            java.lang.Object r3 = r2.D
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r2.C
            com.hansecom.abt.data.useCases.passes.PurchasePassWithFareMediaUseCase r4 = (com.hansecom.abt.data.useCases.passes.PurchasePassWithFareMediaUseCase) r4
            kotlin.ResultKt.b(r1)
            kotlin.Result r1 = (kotlin.Result) r1
            java.lang.Object r1 = r1.j()
            r5 = r4
            r15 = r3
            r3 = r1
            r1 = r15
            goto L_0x00a4
        L_0x0086:
            kotlin.ResultKt.b(r1)
            com.hansecom.abt.data.managers.PurchaseManager r3 = r0.f34010a
            r2.C = r0
            r1 = r17
            r2.D = r1
            r2.H = r4
            r5 = 0
            r6 = 1
            r4 = r18
            r7 = r20
            r8 = r21
            r9 = r2
            java.lang.Object r3 = r3.f(r4, r5, r6, r7, r8, r9)
            if (r3 != r10) goto L_0x00a3
            return r10
        L_0x00a3:
            r5 = r0
        L_0x00a4:
            boolean r4 = kotlin.Result.h(r3)
            if (r4 == 0) goto L_0x00f5
            r4 = r3
            kotlin.Unit r4 = (kotlin.Unit) r4
            com.hansecom.abt.data.repositories.FareMediaPassesRepository r4 = r5.f34012c
            r2.C = r5
            r2.D = r1
            r2.E = r3
            r2.H = r14
            java.lang.Object r4 = r4.a(r1, r2)
            if (r4 != r10) goto L_0x00be
            return r10
        L_0x00be:
            r4 = r1
        L_0x00bf:
            com.hansecom.abt.data.repositories.FareMediaPassesRepository r1 = r5.f34012c
            r2.C = r5
            r2.D = r4
            r2.E = r3
            r2.H = r13
            java.lang.Object r1 = r1.p(r4, r2)
            if (r1 != r10) goto L_0x00d0
            return r10
        L_0x00d0:
            com.hansecom.abt.data.repositories.CardHistoryRepository r1 = r5.f34011b
            r2.C = r5
            r2.D = r4
            r2.E = r3
            r2.H = r12
            java.lang.Object r1 = r1.n(r4, r2)
            if (r1 != r10) goto L_0x00e1
            return r10
        L_0x00e1:
            com.hansecom.abt.data.repositories.generalData.FareMediaPassesToOfferRepository r1 = r5.f34013d
            r2.C = r3
            r5 = 0
            r2.D = r5
            r2.E = r5
            r2.H = r11
            java.lang.Object r1 = r1.n(r4, r2)
            if (r1 != r10) goto L_0x00f3
            return r10
        L_0x00f3:
            r2 = r3
        L_0x00f4:
            r3 = r2
        L_0x00f5:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.useCases.passes.PurchasePassWithFareMediaUseCase.a(java.lang.String, java.lang.String, java.lang.Long, java.lang.Integer, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
