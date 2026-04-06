package com.hansecom.abt.data.useCases.institution;

import com.hansecom.abt.data.managers.InstitutionManager;
import com.hansecom.abt.data.repositories.FareMediaInstitutionsRepository;
import com.hansecom.abt.data.repositories.FareMediaPassesRepository;
import com.hansecom.abt.data.repositories.generalData.FareMediaPassesToOfferRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class LinkInstitutionUseCase {

    /* renamed from: a  reason: collision with root package name */
    public final InstitutionManager f33950a;

    /* renamed from: b  reason: collision with root package name */
    public final FareMediaInstitutionsRepository f33951b;

    /* renamed from: c  reason: collision with root package name */
    public final FareMediaPassesRepository f33952c;

    /* renamed from: d  reason: collision with root package name */
    public final FareMediaPassesToOfferRepository f33953d;

    public LinkInstitutionUseCase(InstitutionManager institutionManager, FareMediaInstitutionsRepository fareMediaInstitutionsRepository, FareMediaPassesRepository fareMediaPassesRepository, FareMediaPassesToOfferRepository fareMediaPassesToOfferRepository) {
        Intrinsics.i(institutionManager, "institutionManager");
        Intrinsics.i(fareMediaInstitutionsRepository, "fareMediaInstitutionsRepository");
        Intrinsics.i(fareMediaPassesRepository, "fareMediaPassesRepository");
        Intrinsics.i(fareMediaPassesToOfferRepository, "fareMediaPassesToOfferRepository");
        this.f33950a = institutionManager;
        this.f33951b = fareMediaInstitutionsRepository;
        this.f33952c = fareMediaPassesRepository;
        this.f33953d = fareMediaPassesToOfferRepository;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00a6, code lost:
        if (kotlin.Result.h(r7) == false) goto L_0x011b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00a8, code lost:
        r6 = (com.hansecom.mapi.models.FareMedium) r7;
        r6 = r2.f33953d;
        r0.C = r2;
        r0.D = r5;
        r0.E = r7;
        r0.H = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00ba, code lost:
        if (r6.n(r5, r0) != r1) goto L_0x00bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00bc, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00bd, code lost:
        r6 = r5;
        r5 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00bf, code lost:
        r7 = r2.f33953d;
        r0.C = r2;
        r0.D = r6;
        r0.E = r5;
        r0.H = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00ce, code lost:
        if (r7.p(r6, r0) != r1) goto L_0x00d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00d0, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00d1, code lost:
        r7 = r2.f33952c;
        r0.C = r2;
        r0.D = r6;
        r0.E = r5;
        r0.H = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00e0, code lost:
        if (r7.n(r6, r0) != r1) goto L_0x00e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00e2, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00e3, code lost:
        r7 = r2.f33952c;
        r0.C = r2;
        r0.D = r6;
        r0.E = r5;
        r0.H = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00f2, code lost:
        if (r7.p(r6, r0) != r1) goto L_0x00f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00f4, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00f5, code lost:
        r7 = r2.f33951b;
        r0.C = r2;
        r0.D = r6;
        r0.E = r5;
        r0.H = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0104, code lost:
        if (r7.n(r6, r0) != r1) goto L_0x0107;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0106, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0107, code lost:
        r7 = r2.f33951b;
        r0.C = r5;
        r0.D = null;
        r0.E = null;
        r0.H = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0117, code lost:
        if (r7.o(r6, r0) != r1) goto L_0x011a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0119, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x011a, code lost:
        r7 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x011f, code lost:
        return com.hansecom.abt.util.ResultExtKt.b(r7);
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.String r5, int r6, kotlin.coroutines.Continuation r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.hansecom.abt.data.useCases.institution.LinkInstitutionUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.hansecom.abt.data.useCases.institution.LinkInstitutionUseCase$invoke$1 r0 = (com.hansecom.abt.data.useCases.institution.LinkInstitutionUseCase$invoke$1) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.H = r1
            goto L_0x0018
        L_0x0013:
            com.hansecom.abt.data.useCases.institution.LinkInstitutionUseCase$invoke$1 r0 = new com.hansecom.abt.data.useCases.institution.LinkInstitutionUseCase$invoke$1
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.F
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.H
            switch(r2) {
                case 0: goto L_0x008e;
                case 1: goto L_0x007b;
                case 2: goto L_0x006d;
                case 3: goto L_0x005f;
                case 4: goto L_0x0050;
                case 5: goto L_0x0041;
                case 6: goto L_0x0032;
                case 7: goto L_0x002b;
                default: goto L_0x0023;
            }
        L_0x0023:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x002b:
            java.lang.Object r5 = r0.C
            kotlin.ResultKt.b(r7)
            goto L_0x011a
        L_0x0032:
            java.lang.Object r5 = r0.E
            java.lang.Object r6 = r0.D
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r2 = r0.C
            com.hansecom.abt.data.useCases.institution.LinkInstitutionUseCase r2 = (com.hansecom.abt.data.useCases.institution.LinkInstitutionUseCase) r2
            kotlin.ResultKt.b(r7)
            goto L_0x0107
        L_0x0041:
            java.lang.Object r5 = r0.E
            java.lang.Object r6 = r0.D
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r2 = r0.C
            com.hansecom.abt.data.useCases.institution.LinkInstitutionUseCase r2 = (com.hansecom.abt.data.useCases.institution.LinkInstitutionUseCase) r2
            kotlin.ResultKt.b(r7)
            goto L_0x00f5
        L_0x0050:
            java.lang.Object r5 = r0.E
            java.lang.Object r6 = r0.D
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r2 = r0.C
            com.hansecom.abt.data.useCases.institution.LinkInstitutionUseCase r2 = (com.hansecom.abt.data.useCases.institution.LinkInstitutionUseCase) r2
            kotlin.ResultKt.b(r7)
            goto L_0x00e3
        L_0x005f:
            java.lang.Object r5 = r0.E
            java.lang.Object r6 = r0.D
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r2 = r0.C
            com.hansecom.abt.data.useCases.institution.LinkInstitutionUseCase r2 = (com.hansecom.abt.data.useCases.institution.LinkInstitutionUseCase) r2
            kotlin.ResultKt.b(r7)
            goto L_0x00d1
        L_0x006d:
            java.lang.Object r5 = r0.E
            java.lang.Object r6 = r0.D
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r2 = r0.C
            com.hansecom.abt.data.useCases.institution.LinkInstitutionUseCase r2 = (com.hansecom.abt.data.useCases.institution.LinkInstitutionUseCase) r2
            kotlin.ResultKt.b(r7)
            goto L_0x00bf
        L_0x007b:
            java.lang.Object r5 = r0.D
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r0.C
            com.hansecom.abt.data.useCases.institution.LinkInstitutionUseCase r6 = (com.hansecom.abt.data.useCases.institution.LinkInstitutionUseCase) r6
            kotlin.ResultKt.b(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r7 = r7.j()
            r2 = r6
            goto L_0x00a2
        L_0x008e:
            kotlin.ResultKt.b(r7)
            com.hansecom.abt.data.managers.InstitutionManager r7 = r4.f33950a
            r0.C = r4
            r0.D = r5
            r2 = 1
            r0.H = r2
            java.lang.Object r7 = r7.b(r5, r6, r0)
            if (r7 != r1) goto L_0x00a1
            return r1
        L_0x00a1:
            r2 = r4
        L_0x00a2:
            boolean r6 = kotlin.Result.h(r7)
            if (r6 == 0) goto L_0x011b
            r6 = r7
            com.hansecom.mapi.models.FareMedium r6 = (com.hansecom.mapi.models.FareMedium) r6
            com.hansecom.abt.data.repositories.generalData.FareMediaPassesToOfferRepository r6 = r2.f33953d
            r0.C = r2
            r0.D = r5
            r0.E = r7
            r3 = 2
            r0.H = r3
            java.lang.Object r6 = r6.n(r5, r0)
            if (r6 != r1) goto L_0x00bd
            return r1
        L_0x00bd:
            r6 = r5
            r5 = r7
        L_0x00bf:
            com.hansecom.abt.data.repositories.generalData.FareMediaPassesToOfferRepository r7 = r2.f33953d
            r0.C = r2
            r0.D = r6
            r0.E = r5
            r3 = 3
            r0.H = r3
            java.lang.Object r7 = r7.p(r6, r0)
            if (r7 != r1) goto L_0x00d1
            return r1
        L_0x00d1:
            com.hansecom.abt.data.repositories.FareMediaPassesRepository r7 = r2.f33952c
            r0.C = r2
            r0.D = r6
            r0.E = r5
            r3 = 4
            r0.H = r3
            java.lang.Object r7 = r7.n(r6, r0)
            if (r7 != r1) goto L_0x00e3
            return r1
        L_0x00e3:
            com.hansecom.abt.data.repositories.FareMediaPassesRepository r7 = r2.f33952c
            r0.C = r2
            r0.D = r6
            r0.E = r5
            r3 = 5
            r0.H = r3
            java.lang.Object r7 = r7.p(r6, r0)
            if (r7 != r1) goto L_0x00f5
            return r1
        L_0x00f5:
            com.hansecom.abt.data.repositories.FareMediaInstitutionsRepository r7 = r2.f33951b
            r0.C = r2
            r0.D = r6
            r0.E = r5
            r3 = 6
            r0.H = r3
            java.lang.Object r7 = r7.n(r6, r0)
            if (r7 != r1) goto L_0x0107
            return r1
        L_0x0107:
            com.hansecom.abt.data.repositories.FareMediaInstitutionsRepository r7 = r2.f33951b
            r0.C = r5
            r2 = 0
            r0.D = r2
            r0.E = r2
            r2 = 7
            r0.H = r2
            java.lang.Object r6 = r7.o(r6, r0)
            if (r6 != r1) goto L_0x011a
            return r1
        L_0x011a:
            r7 = r5
        L_0x011b:
            java.lang.Object r5 = com.hansecom.abt.util.ResultExtKt.b(r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.useCases.institution.LinkInstitutionUseCase.a(java.lang.String, int, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
