package com.hansecom.abt.data.useCases.autoload;

import com.hansecom.abt.data.managers.AutoloadManager;
import com.hansecom.abt.data.repositories.AutoloadRepository;
import com.hansecom.abt.data.repositories.FareMediaRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class CreateAutoloadUseCase {

    /* renamed from: a  reason: collision with root package name */
    public final AutoloadRepository f33828a;

    /* renamed from: b  reason: collision with root package name */
    public final FareMediaRepository f33829b;

    /* renamed from: c  reason: collision with root package name */
    public final AutoloadManager f33830c;

    public CreateAutoloadUseCase(AutoloadRepository autoloadRepository, FareMediaRepository fareMediaRepository, AutoloadManager autoloadManager) {
        Intrinsics.i(autoloadRepository, "autoloadRepository");
        Intrinsics.i(fareMediaRepository, "fareMediaRepository");
        Intrinsics.i(autoloadManager, "autoloadManager");
        this.f33828a = autoloadRepository;
        this.f33829b = fareMediaRepository;
        this.f33830c = autoloadManager;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00d4 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e5 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00f5 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.String r18, java.math.BigDecimal r19, java.math.BigDecimal r20, long r21, java.lang.Long r23, kotlin.coroutines.Continuation r24) {
        /*
            r17 = this;
            r0 = r17
            r1 = r24
            boolean r2 = r1 instanceof com.hansecom.abt.data.useCases.autoload.CreateAutoloadUseCase$invoke$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.hansecom.abt.data.useCases.autoload.CreateAutoloadUseCase$invoke$1 r2 = (com.hansecom.abt.data.useCases.autoload.CreateAutoloadUseCase$invoke$1) r2
            int r3 = r2.H
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.H = r3
            goto L_0x001c
        L_0x0017:
            com.hansecom.abt.data.useCases.autoload.CreateAutoloadUseCase$invoke$1 r2 = new com.hansecom.abt.data.useCases.autoload.CreateAutoloadUseCase$invoke$1
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.F
            java.lang.Object r11 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r3 = r2.H
            r12 = 0
            r13 = 5
            r14 = 4
            r15 = 3
            r10 = 2
            r4 = 1
            if (r3 == 0) goto L_0x0088
            if (r3 == r4) goto L_0x006f
            if (r3 == r10) goto L_0x0061
            if (r3 == r15) goto L_0x0050
            if (r3 == r14) goto L_0x0045
            if (r3 != r13) goto L_0x003d
            java.lang.Object r2 = r2.C
            kotlin.ResultKt.b(r1)
            goto L_0x00f7
        L_0x003d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0045:
            java.lang.Object r3 = r2.D
            java.lang.Object r4 = r2.C
            com.hansecom.abt.data.useCases.autoload.CreateAutoloadUseCase r4 = (com.hansecom.abt.data.useCases.autoload.CreateAutoloadUseCase) r4
            kotlin.ResultKt.b(r1)
            goto L_0x00e6
        L_0x0050:
            java.lang.Object r3 = r2.E
            java.lang.Object r4 = r2.D
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r2.C
            com.hansecom.abt.data.useCases.autoload.CreateAutoloadUseCase r5 = (com.hansecom.abt.data.useCases.autoload.CreateAutoloadUseCase) r5
            kotlin.ResultKt.b(r1)
        L_0x005d:
            r1 = r4
            r4 = r5
            goto L_0x00d5
        L_0x0061:
            java.lang.Object r3 = r2.E
            java.lang.Object r4 = r2.D
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r2.C
            com.hansecom.abt.data.useCases.autoload.CreateAutoloadUseCase r5 = (com.hansecom.abt.data.useCases.autoload.CreateAutoloadUseCase) r5
            kotlin.ResultKt.b(r1)
            goto L_0x00c4
        L_0x006f:
            java.lang.Object r3 = r2.D
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r2.C
            com.hansecom.abt.data.useCases.autoload.CreateAutoloadUseCase r4 = (com.hansecom.abt.data.useCases.autoload.CreateAutoloadUseCase) r4
            kotlin.ResultKt.b(r1)
            kotlin.Result r1 = (kotlin.Result) r1
            java.lang.Object r1 = r1.j()
            r5 = r4
            r13 = r10
            r16 = r3
            r3 = r1
            r1 = r16
            goto L_0x00a9
        L_0x0088:
            kotlin.ResultKt.b(r1)
            com.hansecom.abt.data.managers.AutoloadManager r3 = r0.f33830c
            r2.C = r0
            r1 = r18
            r2.D = r1
            r2.H = r4
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r9 = r23
            r13 = r10
            r10 = r2
            java.lang.Object r3 = r3.c(r4, r5, r6, r7, r9, r10)
            if (r3 != r11) goto L_0x00a8
            return r11
        L_0x00a8:
            r5 = r0
        L_0x00a9:
            boolean r4 = kotlin.Result.h(r3)
            if (r4 == 0) goto L_0x00f8
            r4 = r3
            com.hansecom.mapi.models.FareMediaAutoload r4 = (com.hansecom.mapi.models.FareMediaAutoload) r4
            com.hansecom.abt.data.repositories.AutoloadRepository r4 = r5.f33828a
            r2.C = r5
            r2.D = r1
            r2.E = r3
            r2.H = r13
            java.lang.Object r4 = r4.n(r1, r2)
            if (r4 != r11) goto L_0x00c3
            return r11
        L_0x00c3:
            r4 = r1
        L_0x00c4:
            com.hansecom.abt.data.repositories.FareMediaRepository r1 = r5.f33829b
            r2.C = r5
            r2.D = r4
            r2.E = r3
            r2.H = r15
            java.lang.Object r1 = r1.D(r2)
            if (r1 != r11) goto L_0x005d
            return r11
        L_0x00d5:
            com.hansecom.abt.data.repositories.AutoloadRepository r5 = r4.f33828a
            r2.C = r4
            r2.D = r3
            r2.E = r12
            r2.H = r14
            java.lang.Object r1 = r5.o(r1, r2)
            if (r1 != r11) goto L_0x00e6
            return r11
        L_0x00e6:
            com.hansecom.abt.data.repositories.FareMediaRepository r1 = r4.f33829b
            r2.C = r3
            r2.D = r12
            r4 = 5
            r2.H = r4
            java.lang.Object r1 = r1.H(r2)
            if (r1 != r11) goto L_0x00f6
            return r11
        L_0x00f6:
            r2 = r3
        L_0x00f7:
            r3 = r2
        L_0x00f8:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.useCases.autoload.CreateAutoloadUseCase.a(java.lang.String, java.math.BigDecimal, java.math.BigDecimal, long, java.lang.Long, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
