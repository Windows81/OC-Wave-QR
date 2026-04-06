package com.hansecom.abt.data.useCases;

import com.hansecom.abt.data.managers.FareMediaManager;
import com.hansecom.abt.data.repositories.CardHistoryRepository;
import com.hansecom.abt.data.repositories.FareMediaRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class TransferBalanceUseCase {

    /* renamed from: a  reason: collision with root package name */
    public final FareMediaManager f33757a;

    /* renamed from: b  reason: collision with root package name */
    public final FareMediaRepository f33758b;

    /* renamed from: c  reason: collision with root package name */
    public final CardHistoryRepository f33759c;

    public TransferBalanceUseCase(FareMediaManager fareMediaManager, FareMediaRepository fareMediaRepository, CardHistoryRepository cardHistoryRepository) {
        Intrinsics.i(fareMediaManager, "fareMediaManager");
        Intrinsics.i(fareMediaRepository, "fareMediaRepository");
        Intrinsics.i(cardHistoryRepository, "historyRepository");
        this.f33757a = fareMediaManager;
        this.f33758b = fareMediaRepository;
        this.f33759c = cardHistoryRepository;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v8, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00bb, code lost:
        if (kotlin.Result.h(r9) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00bd, code lost:
        r8 = (kotlin.Unit) r9;
        r8 = r2.f33758b;
        r0.C = r2;
        r0.D = r6;
        r0.E = r7;
        r0.F = r9;
        r0.I = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00d1, code lost:
        if (r8.D(r0) != r1) goto L_0x00d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00d3, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00d4, code lost:
        r8 = r6;
        r6 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00d6, code lost:
        r9 = r2.f33758b;
        r0.C = r2;
        r0.D = r8;
        r0.E = r7;
        r0.F = r6;
        r0.I = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00e7, code lost:
        if (r9.H(r0) != r1) goto L_0x00ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00e9, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ea, code lost:
        r9 = r2.f33759c;
        r0.C = r2;
        r0.D = r8;
        r0.E = r7;
        r0.F = r6;
        r0.I = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00fb, code lost:
        if (r9.n(r8, r0) != r1) goto L_0x00fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00fd, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00fe, code lost:
        r9 = r2.f33759c;
        r0.C = r2;
        r0.D = r7;
        r0.E = r6;
        r0.F = null;
        r0.I = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x010f, code lost:
        if (r9.p(r8, r0) != r1) goto L_0x0112;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0111, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0112, code lost:
        r8 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0113, code lost:
        r9 = r8.f33759c;
        r0.C = r8;
        r0.D = r7;
        r0.E = r6;
        r0.I = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0122, code lost:
        if (r9.n(r7, r0) != r1) goto L_0x0125;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0124, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0125, code lost:
        r8 = r8.f33759c;
        r0.C = r6;
        r0.D = null;
        r0.E = null;
        r0.I = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0134, code lost:
        if (r8.p(r7, r0) != r1) goto L_0x0137;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0136, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        return r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        return r9;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.String r6, java.lang.String r7, java.math.BigDecimal r8, kotlin.coroutines.Continuation r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof com.hansecom.abt.data.useCases.TransferBalanceUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.hansecom.abt.data.useCases.TransferBalanceUseCase$invoke$1 r0 = (com.hansecom.abt.data.useCases.TransferBalanceUseCase$invoke$1) r0
            int r1 = r0.I
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.I = r1
            goto L_0x0018
        L_0x0013:
            com.hansecom.abt.data.useCases.TransferBalanceUseCase$invoke$1 r0 = new com.hansecom.abt.data.useCases.TransferBalanceUseCase$invoke$1
            r0.<init>(r5, r9)
        L_0x0018:
            java.lang.Object r9 = r0.G
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.I
            r3 = 0
            switch(r2) {
                case 0: goto L_0x00a1;
                case 1: goto L_0x0089;
                case 2: goto L_0x0077;
                case 3: goto L_0x0064;
                case 4: goto L_0x0051;
                case 5: goto L_0x0042;
                case 6: goto L_0x0033;
                case 7: goto L_0x002c;
                default: goto L_0x0024;
            }
        L_0x0024:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x002c:
            java.lang.Object r6 = r0.C
            kotlin.ResultKt.b(r9)
            goto L_0x0137
        L_0x0033:
            java.lang.Object r6 = r0.E
            java.lang.Object r7 = r0.D
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r8 = r0.C
            com.hansecom.abt.data.useCases.TransferBalanceUseCase r8 = (com.hansecom.abt.data.useCases.TransferBalanceUseCase) r8
            kotlin.ResultKt.b(r9)
            goto L_0x0125
        L_0x0042:
            java.lang.Object r6 = r0.E
            java.lang.Object r7 = r0.D
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r8 = r0.C
            com.hansecom.abt.data.useCases.TransferBalanceUseCase r8 = (com.hansecom.abt.data.useCases.TransferBalanceUseCase) r8
            kotlin.ResultKt.b(r9)
            goto L_0x0113
        L_0x0051:
            java.lang.Object r6 = r0.F
            java.lang.Object r7 = r0.E
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r8 = r0.D
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r2 = r0.C
            com.hansecom.abt.data.useCases.TransferBalanceUseCase r2 = (com.hansecom.abt.data.useCases.TransferBalanceUseCase) r2
            kotlin.ResultKt.b(r9)
            goto L_0x00fe
        L_0x0064:
            java.lang.Object r6 = r0.F
            java.lang.Object r7 = r0.E
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r8 = r0.D
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r2 = r0.C
            com.hansecom.abt.data.useCases.TransferBalanceUseCase r2 = (com.hansecom.abt.data.useCases.TransferBalanceUseCase) r2
            kotlin.ResultKt.b(r9)
            goto L_0x00ea
        L_0x0077:
            java.lang.Object r6 = r0.F
            java.lang.Object r7 = r0.E
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r8 = r0.D
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r2 = r0.C
            com.hansecom.abt.data.useCases.TransferBalanceUseCase r2 = (com.hansecom.abt.data.useCases.TransferBalanceUseCase) r2
            kotlin.ResultKt.b(r9)
            goto L_0x00d6
        L_0x0089:
            java.lang.Object r6 = r0.E
            r7 = r6
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r6 = r0.D
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r8 = r0.C
            com.hansecom.abt.data.useCases.TransferBalanceUseCase r8 = (com.hansecom.abt.data.useCases.TransferBalanceUseCase) r8
            kotlin.ResultKt.b(r9)
            kotlin.Result r9 = (kotlin.Result) r9
            java.lang.Object r9 = r9.j()
            r2 = r8
            goto L_0x00b7
        L_0x00a1:
            kotlin.ResultKt.b(r9)
            com.hansecom.abt.data.managers.FareMediaManager r9 = r5.f33757a
            r0.C = r5
            r0.D = r6
            r0.E = r7
            r2 = 1
            r0.I = r2
            java.lang.Object r9 = r9.m(r6, r7, r8, r0)
            if (r9 != r1) goto L_0x00b6
            return r1
        L_0x00b6:
            r2 = r5
        L_0x00b7:
            boolean r8 = kotlin.Result.h(r9)
            if (r8 == 0) goto L_0x0138
            r8 = r9
            kotlin.Unit r8 = (kotlin.Unit) r8
            com.hansecom.abt.data.repositories.FareMediaRepository r8 = r2.f33758b
            r0.C = r2
            r0.D = r6
            r0.E = r7
            r0.F = r9
            r4 = 2
            r0.I = r4
            java.lang.Object r8 = r8.D(r0)
            if (r8 != r1) goto L_0x00d4
            return r1
        L_0x00d4:
            r8 = r6
            r6 = r9
        L_0x00d6:
            com.hansecom.abt.data.repositories.FareMediaRepository r9 = r2.f33758b
            r0.C = r2
            r0.D = r8
            r0.E = r7
            r0.F = r6
            r4 = 3
            r0.I = r4
            java.lang.Object r9 = r9.H(r0)
            if (r9 != r1) goto L_0x00ea
            return r1
        L_0x00ea:
            com.hansecom.abt.data.repositories.CardHistoryRepository r9 = r2.f33759c
            r0.C = r2
            r0.D = r8
            r0.E = r7
            r0.F = r6
            r4 = 4
            r0.I = r4
            java.lang.Object r9 = r9.n(r8, r0)
            if (r9 != r1) goto L_0x00fe
            return r1
        L_0x00fe:
            com.hansecom.abt.data.repositories.CardHistoryRepository r9 = r2.f33759c
            r0.C = r2
            r0.D = r7
            r0.E = r6
            r0.F = r3
            r4 = 5
            r0.I = r4
            java.lang.Object r8 = r9.p(r8, r0)
            if (r8 != r1) goto L_0x0112
            return r1
        L_0x0112:
            r8 = r2
        L_0x0113:
            com.hansecom.abt.data.repositories.CardHistoryRepository r9 = r8.f33759c
            r0.C = r8
            r0.D = r7
            r0.E = r6
            r2 = 6
            r0.I = r2
            java.lang.Object r9 = r9.n(r7, r0)
            if (r9 != r1) goto L_0x0125
            return r1
        L_0x0125:
            com.hansecom.abt.data.repositories.CardHistoryRepository r8 = r8.f33759c
            r0.C = r6
            r0.D = r3
            r0.E = r3
            r9 = 7
            r0.I = r9
            java.lang.Object r7 = r8.p(r7, r0)
            if (r7 != r1) goto L_0x0137
            return r1
        L_0x0137:
            r9 = r6
        L_0x0138:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.useCases.TransferBalanceUseCase.a(java.lang.String, java.lang.String, java.math.BigDecimal, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
