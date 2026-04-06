package com.hansecom.abt.data.useCases.autoload;

import com.hansecom.abt.data.managers.AutoloadManager;
import com.hansecom.abt.data.repositories.AutoloadRepository;
import com.hansecom.abt.data.repositories.FareMediaRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class ChangeAutoloadUseCase {

    /* renamed from: a  reason: collision with root package name */
    public final AutoloadRepository f33822a;

    /* renamed from: b  reason: collision with root package name */
    public final FareMediaRepository f33823b;

    /* renamed from: c  reason: collision with root package name */
    public final AutoloadManager f33824c;

    public ChangeAutoloadUseCase(AutoloadRepository autoloadRepository, FareMediaRepository fareMediaRepository, AutoloadManager autoloadManager) {
        Intrinsics.i(autoloadRepository, "autoloadRepository");
        Intrinsics.i(fareMediaRepository, "fareMediaRepository");
        Intrinsics.i(autoloadManager, "autoloadManager");
        this.f33822a = autoloadRepository;
        this.f33823b = fareMediaRepository;
        this.f33824c = autoloadManager;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00d9 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ec A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00fc A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.String r18, long r19, boolean r21, java.math.BigDecimal r22, java.math.BigDecimal r23, long r24, java.lang.Long r26, kotlin.coroutines.Continuation r27) {
        /*
            r17 = this;
            r0 = r17
            r1 = r27
            boolean r2 = r1 instanceof com.hansecom.abt.data.useCases.autoload.ChangeAutoloadUseCase$invoke$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.hansecom.abt.data.useCases.autoload.ChangeAutoloadUseCase$invoke$1 r2 = (com.hansecom.abt.data.useCases.autoload.ChangeAutoloadUseCase$invoke$1) r2
            int r3 = r2.H
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.H = r3
            goto L_0x001c
        L_0x0017:
            com.hansecom.abt.data.useCases.autoload.ChangeAutoloadUseCase$invoke$1 r2 = new com.hansecom.abt.data.useCases.autoload.ChangeAutoloadUseCase$invoke$1
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.F
            java.lang.Object r14 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r3 = r2.H
            r13 = 5
            r12 = 4
            r10 = 3
            r11 = 2
            r4 = 1
            if (r3 == 0) goto L_0x0088
            if (r3 == r4) goto L_0x006f
            if (r3 == r11) goto L_0x0061
            if (r3 == r10) goto L_0x0050
            if (r3 == r12) goto L_0x0044
            if (r3 != r13) goto L_0x003c
            java.lang.Object r2 = r2.C
            kotlin.ResultKt.b(r1)
            goto L_0x00fe
        L_0x003c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0044:
            java.lang.Object r3 = r2.D
            java.lang.Object r4 = r2.C
            com.hansecom.abt.data.useCases.autoload.ChangeAutoloadUseCase r4 = (com.hansecom.abt.data.useCases.autoload.ChangeAutoloadUseCase) r4
            kotlin.ResultKt.b(r1)
            r6 = 0
            goto L_0x00ed
        L_0x0050:
            java.lang.Object r3 = r2.E
            java.lang.Object r4 = r2.D
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r2.C
            com.hansecom.abt.data.useCases.autoload.ChangeAutoloadUseCase r5 = (com.hansecom.abt.data.useCases.autoload.ChangeAutoloadUseCase) r5
            kotlin.ResultKt.b(r1)
        L_0x005d:
            r1 = r4
            r4 = r5
            goto L_0x00da
        L_0x0061:
            java.lang.Object r3 = r2.E
            java.lang.Object r4 = r2.D
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r2.C
            com.hansecom.abt.data.useCases.autoload.ChangeAutoloadUseCase r5 = (com.hansecom.abt.data.useCases.autoload.ChangeAutoloadUseCase) r5
            kotlin.ResultKt.b(r1)
            goto L_0x00c8
        L_0x006f:
            java.lang.Object r3 = r2.D
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r2.C
            com.hansecom.abt.data.useCases.autoload.ChangeAutoloadUseCase r4 = (com.hansecom.abt.data.useCases.autoload.ChangeAutoloadUseCase) r4
            kotlin.ResultKt.b(r1)
            kotlin.Result r1 = (kotlin.Result) r1
            java.lang.Object r1 = r1.j()
            r5 = r4
            r15 = r11
            r16 = r3
            r3 = r1
            r1 = r16
            goto L_0x00ad
        L_0x0088:
            kotlin.ResultKt.b(r1)
            com.hansecom.abt.data.managers.AutoloadManager r3 = r0.f33824c
            r2.C = r0
            r1 = r18
            r2.D = r1
            r2.H = r4
            r4 = r18
            r5 = r19
            r7 = r21
            r8 = r22
            r9 = r23
            r15 = r11
            r10 = r24
            r12 = r26
            r13 = r2
            java.lang.Object r3 = r3.b(r4, r5, r7, r8, r9, r10, r12, r13)
            if (r3 != r14) goto L_0x00ac
            return r14
        L_0x00ac:
            r5 = r0
        L_0x00ad:
            boolean r4 = kotlin.Result.h(r3)
            if (r4 == 0) goto L_0x00ff
            r4 = r3
            com.hansecom.mapi.models.FareMediaAutoload r4 = (com.hansecom.mapi.models.FareMediaAutoload) r4
            com.hansecom.abt.data.repositories.AutoloadRepository r4 = r5.f33822a
            r2.C = r5
            r2.D = r1
            r2.E = r3
            r2.H = r15
            java.lang.Object r4 = r4.n(r1, r2)
            if (r4 != r14) goto L_0x00c7
            return r14
        L_0x00c7:
            r4 = r1
        L_0x00c8:
            com.hansecom.abt.data.repositories.FareMediaRepository r1 = r5.f33823b
            r2.C = r5
            r2.D = r4
            r2.E = r3
            r6 = 3
            r2.H = r6
            java.lang.Object r1 = r1.D(r2)
            if (r1 != r14) goto L_0x005d
            return r14
        L_0x00da:
            com.hansecom.abt.data.repositories.AutoloadRepository r5 = r4.f33822a
            r2.C = r4
            r2.D = r3
            r6 = 0
            r2.E = r6
            r7 = 4
            r2.H = r7
            java.lang.Object r1 = r5.o(r1, r2)
            if (r1 != r14) goto L_0x00ed
            return r14
        L_0x00ed:
            com.hansecom.abt.data.repositories.FareMediaRepository r1 = r4.f33823b
            r2.C = r3
            r2.D = r6
            r4 = 5
            r2.H = r4
            java.lang.Object r1 = r1.H(r2)
            if (r1 != r14) goto L_0x00fd
            return r14
        L_0x00fd:
            r2 = r3
        L_0x00fe:
            r3 = r2
        L_0x00ff:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.useCases.autoload.ChangeAutoloadUseCase.a(java.lang.String, long, boolean, java.math.BigDecimal, java.math.BigDecimal, long, java.lang.Long, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
